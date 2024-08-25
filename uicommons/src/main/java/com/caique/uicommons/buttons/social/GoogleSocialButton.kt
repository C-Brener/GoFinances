package com.caique.uicommons.buttons.social

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.R

@Composable
fun GoogleSocialButton(onClick: () -> Unit) {
    SocialButtonScaffold(
        title = "Entrar com Google",
        icon = R.drawable.google_logo,
        onClick = onClick
    )
}

@Preview
@Composable
private fun GoogleSocialButtonPreview() {
    GoogleSocialButton {
    }
}