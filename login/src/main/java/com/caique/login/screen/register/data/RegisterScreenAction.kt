package com.caique.login.screen.register.data

data class RegisterScreenAction(
    val onNameChanged: (String) -> Unit,
    val onEmailChanged: (String) -> Unit,
    val onPasswordChanged: (String) -> Unit,
    val onConfirmPasswordChanged: (String) -> Unit,
    val registerAccount: () -> Unit
)