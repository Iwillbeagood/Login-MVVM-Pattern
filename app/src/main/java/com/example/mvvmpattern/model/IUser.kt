package com.example.mvvmpattern.model

interface IUser {
    fun getEmail(): String?
    fun setEmail(email: String)
    fun getPassword(): String?
    fun setPassword(password: String)
    fun isValid(): Int
}