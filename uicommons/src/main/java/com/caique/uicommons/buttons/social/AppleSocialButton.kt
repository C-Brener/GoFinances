package com.caique.uicommons.buttons.social

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.R

@Composable
fun AppleSocialButton(onClick: () -> Unit) {
    SocialButtonScaffold(
        title = stringResource(R.string.apple_button_title),
        icon = R.drawable.apple_logo,
        onClick = onClick
    )
}

@Preview
@Composable
private fun AppleSocialButtonPreview() {
    AppleSocialButton {
    }
}