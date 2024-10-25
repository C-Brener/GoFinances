package com.caique.uicommons.buttons.secondary

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.background
import com.caique.uicommons.theme.blue
import com.caique.uicommons.theme.blue_secondary
import com.caique.uicommons.theme.font_size_title_two
import com.caique.uicommons.theme.space_eight
import com.caique.uicommons.theme.space_sixteen

@Composable
fun SecondaryButton(title: String, enabled: Boolean, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors().copy(
            containerColor = blue,
            disabledContainerColor = blue_secondary,
            contentColor = background
        ),
        shape = RoundedCornerShape(space_eight),

        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(vertical = space_sixteen),
            fontSize = font_size_title_two
        )
    }
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    GoFinancesTheme {
        SecondaryButton("Finish Registration", false) { }
    }
}