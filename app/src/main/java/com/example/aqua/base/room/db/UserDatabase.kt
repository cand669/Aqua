package com.example.aqua.base.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.aqua.UserDao
import com.example.aqua.UserEntity

// UserDatabase represents database and contains the database holder and server the main access point for the underlying connection to your app's persisted, relational data.

@Database(
    entities = [UserEntity::class],
    version = 1,                // <- Database version
    exportSchema = true
)
abstract class UserDatabase: RoomDatabase() { // <- Add 'abstract' keyword and extends RoomDatabase
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()


                INSTANCE = instance
                return instance
            }

        }
    }
}