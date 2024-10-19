package com.caique.login.screen.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.caique.login.R
import com.caique.login.components.BackgroundLayer
import com.caique.uicommons.buttons.social.EmailLoginButton
import com.caique.uicommons.buttons.social.GoogleSocialButton
import com.caique.uicommons.text.ClickableText
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.font_size_heading_1
import com.caique.uicommons.theme.font_size_title_two
import com.caique.uicommons.theme.orange
import com.caique.uicommons.theme.shape
import com.caique.uicommons.theme.space_forty
import com.caique.uicommons.theme.space_sixteen
import com.caique.uicommons.theme.space_thirty_two

@Composable
internal fun LoginScreenLayout(
    googleOnClick: () -> Unit,
    loginWithEmailClick: () -> Unit,
    createAccountButton: () -> Unit
) {
    BackgroundLayer {
        LoginContent(googleOnClick, loginWithEmailClick, createAccountButton)
    }
}

@Composable
private fun LoginContent(
    googleOnClick: () -> Unit,
    loginWithEmailClick: () -> Unit,
    createAccountButton: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(space_forty),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(R.drawable.logo_go_finances),
                contentDescription = stringResource(R.string.content_description_logo),
                tint = orange
            )
            Text(
                text = stringResource(R.string.login_screen_title),
                color = shape,
                fontSize = font_size_heading_1,
                textAlign = TextAlign.Center
            )
        }
        Spacer(Modifier.height(space_forty))
        Text(
            text = stringResource(R.string.login_options),
            color = shape,
            fontSize = font_size_title_two,
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(space_forty))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space_sixteen),
            modifier = Modifier.padding(horizontal = space_thirty_two)
        ) {
            GoogleSocialButton(onClick = googleOnClick)
            EmailLoginButton(onClick = loginWithEmailClick)
            ClickableText(stringResource(R.string.create_account), createAccountButton)
        }
    }
}

@Preview
@Composable
private fun LoginScreenLayoutPreview() {
    GoFinancesTheme {
        LoginScreenLayout({}, {}) {
        }
    }
}