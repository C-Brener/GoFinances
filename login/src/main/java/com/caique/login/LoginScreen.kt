package com.caique.login

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

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