package com.caique.uicommons.buttons.social

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.R
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.background
import com.caique.uicommons.theme.button_radius
import com.caique.uicommons.theme.button_size
import com.caique.uicommons.theme.font_size_title
import com.caique.uicommons.theme.heading
import com.caique.uicommons.theme.shape
import com.caique.uicommons.theme.spacing_sixteen
import com.caique.uicommons.theme.thin_size

@Composable
fun SocialButtonScaffold(
    modifier: Modifier = Modifier,
    title: String,
    @DrawableRes icon: Int,
    onClick: () -> Unit
) {
    val buttonInteractionSource = remember { MutableInteractionSource() }

    Card(
        modifier = modifier
            .background(color = background)
            .height(button_size)
            .clickable(
                interactionSource = buttonInteractionSource,
                indication = null,
                onClick = onClick
            ),
        shape = RoundedCornerShape(button_radius)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Icon(
                modifier = Modifier.padding(spacing_sixteen),
                painter = painterResource(id = icon),
                contentDescription = "Social Icon"
            )
            VerticalDivider(thickness = thin_size, color = shape)
            Text(
                text = title,
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = font_size_title,
                fontWeight = FontWeight.Medium,
                color = heading
            )
        }
    }
}

@Preview
@Composable
private fun SocialButtonScaffoldPreview() {
    GoFinancesTheme {
        SocialButtonScaffold(
            title = stringResource(id = R.string.google_button_title),
            icon = R.drawable.google_logo
        ) {}
    }
}
