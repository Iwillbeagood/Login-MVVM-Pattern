package com.example.mvvmpattern

import android.view.View
import com.example.mvvmpattern.view.IView
import com.example.mvvmpattern.viewmodel.LoginViewModel
import org.junit.Test

import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class LoginUnitTest {

//        @Mock
//        private lateinit var view: IView
//
//        private lateinit var viewModel: LoginViewModel
//
//        @Before
//        fun setup() {
//            MockitoAnnotations.initMocks(this)
//            viewModel = LoginViewModel(view)
//        }
//
//        @Test
//        fun `login with empty email`() {
//            // Given
//            val email = ""
//            val password = "123456"
//
//            // When
//            viewModel.user.setEmail(email)
//            viewModel.user.setPassword(password)
//            viewModel.onLogin(mock(View::class.java))
//
//            // Then
//            verify(view).OnLoginError("Please enter Email")
//        }
//
//        @Test
//        fun `login with invalid email`() {
//            // Given
//            val email = "test"
//            val password = "123456"
//
//            // When
//            viewModel.user.setEmail(email)
//            viewModel.user.setPassword(password)
//            viewModel.onLogin(mock(View::class.java))
//
//            // Then
//            verify(view).OnLoginError("Please enter A valid Email")
//        }
//
//        // ... Add more tests for other cases
}