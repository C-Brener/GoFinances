package com.caique.login.screen.register.data

data class RegisterScreenParams(
    val name: String,
    val email: String,
    val password: String,
    val confirmPassword: String,
    val registerButtonEnabled: Boolean
)
