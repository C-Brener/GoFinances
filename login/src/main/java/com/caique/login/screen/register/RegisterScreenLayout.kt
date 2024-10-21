package com.caique.login.screen.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import com.caique.login.screen.register.data.RegisterScreenAction
import com.caique.login.screen.register.data.RegisterScreenParams
import com.caique.uicommons.buttons.secondary.SecondaryButton
import com.caique.uicommons.textfield.InputField
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.font_size_heading_3
import com.caique.uicommons.theme.orange
import com.caique.uicommons.theme.shape
import com.caique.uicommons.theme.space_forty
import com.caique.uicommons.theme.space_sixteen
import com.caique.uicommons.theme.space_sixty_four
import com.caique.uicommons.theme.space_twenty_four

@Composable
fun RegisterScreenLayout(
    action: RegisterScreenAction,
    params: RegisterScreenParams
) {
    BackgroundLayer {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = space_sixteen),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(R.drawable.logo_go_finances),
                tint = orange,
                contentDescription = stringResource(R.string.content_description_logo)
            )
            Text(
                modifier = Modifier.padding(top = space_sixteen),
                text = stringResource(R.string.sign_up_title),
                textAlign = TextAlign.Center,
                fontSize = font_size_heading_3,
                color = shape
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(space_twenty_four),
                modifier = Modifier.padding(
                    horizontal = space_twenty_four,
                    vertical = space_forty
                )
            ) {
                InputField(
                    textFieldLabel = stringResource(R.string.input_title_name),
                    inputValue = params.name,
                    isPassword = false,
                    placeholderText = stringResource(R.string.input_name_hint),
                    onValueChange = action.onNameChanged
                )
                InputField(
                    textFieldLabel = stringResource(R.string.input_title_email),
                    inputValue = params.email,
                    isPassword = false,
                    placeholderText = stringResource(R.string.input_email_hint),
                    onValueChange = action.onEmailChanged
                )
                InputField(
                    textFieldLabel = stringResource(R.string.input_title_password),
                    inputValue = params.password,
                    isPassword = true,
                    placeholderText = stringResource(R.string.input_password_hint),
                    onValueChange = action.onPasswordChanged
                )
                InputField(
                    textFieldLabel = stringResource(R.string.input_title_re_enter_password),
                    inputValue = params.confirmPassword,
                    isPassword = true,
                    placeholderText = stringResource(R.string.input_re_enter_password_hint),
                    onValueChange = action.onConfirmPasswordChanged
                )
            }
            Row(modifier = Modifier.padding(horizontal = space_sixty_four)) {
                SecondaryButton(
                    title = stringResource(R.string.finish_registration_title_button),
                    enabled = params.registerButtonEnabled,
                    onClick = action.registerAccount
                )
            }
        }
    }
}

@Preview
@Composable
private fun RegisterScreenLayoutPreview() {
    val mockRegisterScreenAction = RegisterScreenAction(
        onNameChanged = { name ->
            println("Name changed: $name")
        },
        onEmailChanged = { email ->
            println("Email changed: $email")
        },
        onPasswordChanged = { password ->
            println("Password changed: $password")
        },
        onConfirmPasswordChanged = { confirmPassword ->
            println("Confirm Password changed: $confirmPassword")
        },
        registerAccount = {
            println("Register account clicked")
        }
    )

    val mockRegisterScreenParams = RegisterScreenParams(
        name = "John Doe",
        email = "johndoe@example.com",
        password = "Password123",
        confirmPassword = "Password123",
        registerButtonEnabled = true
    )

    GoFinancesTheme {
        RegisterScreenLayout(action = mockRegisterScreenAction, params = mockRegisterScreenParams)
    }
}