package com.example.aqua

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)