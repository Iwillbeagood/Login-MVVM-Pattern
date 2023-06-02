package com.example.mvvmpattern.viewmodel

import androidx.lifecycle.ViewModel
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.mvvmpattern.model.User
import com.example.mvvmpattern.view.IView


class LoginViewModel(
    private val loginView: IView
): ViewModel(), IViewModel {

    private val user: User = User("", "")

    val emailTextWatcher: TextWatcher
        get()= object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                user.setEmail(s.toString())
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }


    val passwordTextWatcher:TextWatcher
        get()= object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                user.setPassword(s.toString())
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }

    override fun onLogin(view: View) {
        when (user.isValid()) {
            0 -> {
                loginView.onLoginError("Please enter Email");
            }
            1 -> {
                loginView.onLoginError("Please enter A valid Email");
            }
            2 -> {
                loginView.onLoginError("Please enter Password");
            }
            3 -> {
                loginView.onLoginError("Please enter Password greater the 6 char");
            }
            else -> {
                loginView.onLoginSuccess("login Successful");
            }
        }
    }
}