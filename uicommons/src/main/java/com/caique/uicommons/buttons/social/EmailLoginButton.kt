package com.caique.uicommons.buttons.social

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.R

@Composable
fun EmailLoginButton(onClick: () -> Unit) {
    SocialButtonScaffold(
        title = stringResource(R.string.email_button_title),
        icon = R.drawable.email_icon,
        onClick = onClick
    )
}

@Preview
@Composable
private fun EmailLoginButtonPreview() {
    EmailLoginButton {
    }
}