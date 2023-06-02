package com.example.mvvmpattern.model

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import com.example.mvvmpattern.model.IUser

class User(
    private var email: String?,
    private var password: String?
) : IUser, BaseObservable() {
    override fun getEmail(): String? {
        return email
    }

    override fun setEmail(email: String) {
        this.email = email
    }

    override fun getPassword(): String? {
        return password
    }

    override fun setPassword(password: String) {
        this.password = password
    }

    override fun isValid(): Int {
        return if(TextUtils.isEmpty(getEmail()))
            0
        else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()!!).matches())
            1
        else if(TextUtils.isEmpty(getPassword()))
            2
        else if(getPassword()?.length!! <=6)
            3
        else
            -1;
    }
}