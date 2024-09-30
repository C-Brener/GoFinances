package com.caique.uicommons.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.font_size_heading
import com.caique.uicommons.theme.font_size_text
import com.caique.uicommons.theme.font_size_title
import com.caique.uicommons.theme.space_thirty_two
import com.caique.uicommons.theme.space_twenty
import com.caique.uicommons.utils.extensions.getAppearance
import com.caique.uicommons.utils.extensions.handleColorResource

@Composable
fun SummaryFinanceCard(
    modifier: Modifier = Modifier,
    title: String,
    financialValue: String,
    dateOfLastResult: String,
    cardType: SummaryFinanceCardType
) {
    val appearance = cardType.getAppearance()
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors().copy(containerColor = appearance.backgroundColor)
    ) {
        Column(modifier = Modifier.padding(space_twenty)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = title,
                    fontSize = font_size_title,
                    fontWeight = FontWeight.Medium,
                    color = appearance.textColor
                )
                Icon(
                    tint = cardType.handleColorResource(),
                    painter = painterResource(id = appearance.iconRes),
                    contentDescription = cardType.name
                )
            }
            Column(modifier = Modifier.padding(vertical = space_thirty_two)) {
                Text(
                    text = financialValue,
                    textAlign = TextAlign.Center,
                    fontSize = font_size_heading,
                    fontWeight = FontWeight.Medium,
                    color = appearance.textColor
                )
                Text(
                    text = dateOfLastResult,
                    textAlign = TextAlign.Center,
                    fontSize = font_size_text,
                    fontWeight = FontWeight.Medium,
                    color = appearance.textColor
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SummaryFinanceCardPreview() {
    GoFinancesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(15.dp)) {
            SummaryFinanceCard(
                title = "Income",
                financialValue = "R$ 17.400,00",
                dateOfLastResult = "Last entry on April 13th",
                cardType = SummaryFinanceCardType.INCOME
            )
            SummaryFinanceCard(
                title = "Outcome",
                financialValue = "R$ 17.400,00",
                dateOfLastResult = "Last outing on April 13th",
                cardType = SummaryFinanceCardType.OUTCOME
            )
            SummaryFinanceCard(
                title = "Total",
                financialValue = "R$ 17.400,00",
                dateOfLastResult = "April 01 to 16",
                cardType = SummaryFinanceCardType.TOTAL
            )
        }
    }
}