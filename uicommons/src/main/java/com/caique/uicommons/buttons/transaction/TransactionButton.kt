package com.caique.uicommons.buttons.transaction

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.font_size_title
import com.caique.uicommons.theme.heading
import com.caique.uicommons.theme.space_six
import com.caique.uicommons.theme.space_sixteen
import com.caique.uicommons.theme.space_thirty_six
import com.caique.uicommons.utils.enums.TransactionTypeEnum
import com.caique.uicommons.utils.extensions.getBackgroundColor
import com.caique.uicommons.utils.extensions.getButtonTitle
import com.caique.uicommons.utils.extensions.getColor
import com.caique.uicommons.utils.extensions.getIcon

@Composable
fun TransactionButton(
    modifier: Modifier = Modifier,
    buttonType: TransactionTypeEnum,
    isClicked: Boolean,
    onButtonClicked: () -> Unit
) {
    val mutableInteractionSource = remember { MutableInteractionSource() }
    Card(
        colors = CardDefaults.cardColors()
            .copy(containerColor = buttonType.getBackgroundColor(isClicked)),
        modifier = modifier.clickable(
            interactionSource = mutableInteractionSource,
            indication = null,
            onClick = onButtonClicked
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = space_thirty_six
                ),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                tint = buttonType.getColor(),
                modifier = Modifier.padding(vertical = space_sixteen),
                painter = painterResource(buttonType.getIcon()),
                contentDescription = null
            )
            Spacer(Modifier.width(space_six))
            Text(
                text = stringResource(getButtonTitle(buttonType)),
                fontSize = font_size_title,
                color = heading
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TransactionButtonPreview() {
    GoFinancesTheme {
        Column {
            Row {
                TransactionButton(
                    buttonType = TransactionTypeEnum.INCOME,
                    isClicked = true,
                    modifier = Modifier.weight(0.5f)
                ) {
                }
                TransactionButton(
                    buttonType = TransactionTypeEnum.OUTCOME,
                    isClicked = true,
                    modifier = Modifier.weight(0.5f)
                ) {
                }
            }
            TransactionButton(buttonType = TransactionTypeEnum.DEFAULT, isClicked = false) {
            }
        }
    }
}