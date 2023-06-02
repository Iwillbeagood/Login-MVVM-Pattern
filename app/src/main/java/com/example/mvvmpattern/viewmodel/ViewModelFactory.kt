package com.example.mvvmpattern.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpattern.view.IView

class ViewModelFactory(
    private val loginView: IView
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java))
            return LoginViewModel(loginView) as T
        throw IllegalArgumentException("unKnown ViewModel class")
    }
}