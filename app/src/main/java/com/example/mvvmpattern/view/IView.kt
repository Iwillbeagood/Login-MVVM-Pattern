package com.example.mvvmpattern.view

interface IView {
    fun onLoginSuccess(message: String?)
    fun onLoginError(message: String?)
}