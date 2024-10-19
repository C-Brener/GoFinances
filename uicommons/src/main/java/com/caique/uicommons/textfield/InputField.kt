package com.caique.uicommons.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.background
import com.caique.uicommons.theme.paragraph
import com.caique.uicommons.theme.shape
import com.caique.uicommons.theme.space_eight
import com.caique.uicommons.theme.space_sixteen
import com.caique.uicommons.theme.transparent

@Composable
fun InputField(
    textFieldLabel: String?,
    placeholderText: String,
    inputValue: String,
    isPassword: Boolean,
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(space_sixteen)

    ) {
        textFieldLabel?.let {
            Text(
                text = it,
                color = shape,
                modifier = Modifier.padding(bottom = space_eight)
            )
        }
        Card(
            shape = RoundedCornerShape(space_eight)
        ) {
            TextField(
                value = inputValue,
                visualTransformation = visualTransformation(isPassword),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = paragraph,
                    unfocusedTextColor = paragraph,
                    unfocusedIndicatorColor = transparent,
                    focusedContainerColor = shape,
                    unfocusedContainerColor = shape,
                    focusedIndicatorColor = transparent
                ),
                onValueChange = onValueChange,
                placeholder = { Text(text = placeholderText, color = paragraph) },
                modifier = Modifier
                    .fillMaxWidth()

            )
        }
    }
}

private fun visualTransformation(isPassword: Boolean) = if (isPassword) {
    PasswordVisualTransformation()

} else {
    VisualTransformation.None
}

@Preview(showSystemUi = true)
@Composable
private fun InputFieldPreview() {
    var text by remember { mutableStateOf("") }
    GoFinancesTheme {
        Column(modifier = Modifier.background(color = background)) {
            InputField(
                textFieldLabel = "Name:",
                placeholderText = "Type your full name",
                inputValue = text,
                isPassword = false
            ) {
                text = it
            }
            InputField(
                textFieldLabel = "Name:",
                placeholderText = "Type your full name",
                inputValue = text,
                isPassword = true
            ) {
                text = it
            }
        }
    }
}
