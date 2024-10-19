package com.caique.login.screen.login

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(
    signInWithGoogle: () -> Unit,
    signInWithEmail: () -> Unit,
    navigateToAccountCreation: () -> Unit
) {
    Scaffold { padding ->
        LoginScreenLayout(
            loginWithEmailClick = signInWithEmail,
            googleOnClick = signInWithGoogle,
            createAccountButton = navigateToAccountCreation
        )
    }
}