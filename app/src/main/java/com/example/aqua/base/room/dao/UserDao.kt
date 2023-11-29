package com.example.aqua
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: UserEntity)

    @Update
    suspend fun updateUser(user: UserEntity)

    @Delete
    suspend fun deleteUser(user: UserEntity)

    @Query("DELETE FROM user_table")
    suspend fun deleteAllUsers()

    @Query("SELECT * from user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<UserEntity>>
}