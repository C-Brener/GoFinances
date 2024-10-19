package com.caique.uicommons.text

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import com.caique.uicommons.theme.shape

@Composable
fun ClickableText(title: String, createAccountButton: () -> Unit) {
    val buttonInteractionSource = remember { MutableInteractionSource() }
    Text(
        text = title,
        textDecoration = TextDecoration.Underline,
        color = shape,
        modifier = Modifier.clickable(
            interactionSource = buttonInteractionSource,
            indication = null,
            onClick = createAccountButton
        )
    )
}