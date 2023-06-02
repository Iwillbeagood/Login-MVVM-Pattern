package com.example.mvvmpattern

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpattern.databinding.ActivityMainBinding
import com.example.mvvmpattern.view.IView
import com.example.mvvmpattern.viewmodel.LoginViewModel
import com.example.mvvmpattern.viewmodel.ViewModelFactory


class MainActivity : AppCompatActivity(), IView {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val loginViewModelFactory = ViewModelFactory(this)

        binding.viewModel = ViewModelProvider(this, loginViewModelFactory)[LoginViewModel::class.java]
    }

    override fun onLoginSuccess(message: String?) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }

    override fun onLoginError(message: String?) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }
}