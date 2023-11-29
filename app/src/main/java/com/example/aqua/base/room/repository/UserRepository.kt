package com.example.aqua

import androidx.lifecycle.LiveData

// User Repository abstracts access to multiple data sources. However this is not the part of the Architecture Component libraries.

class UserRepository(private val userDao: UserDao) {
    val readAllData: LiveData<List<UserEntity>> = userDao.readAllData()

    suspend fun addUser(user: UserEntity) {
        userDao.addUser(user)
    }

    suspend fun updateUser(user: UserEntity) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: UserEntity) {
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers() {
        userDao.deleteAllUsers()
    }
}