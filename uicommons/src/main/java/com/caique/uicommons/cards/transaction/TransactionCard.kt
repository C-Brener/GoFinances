package com.caique.uicommons.cards.transaction

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.font_size_heading_2
import com.caique.uicommons.theme.font_size_title
import com.caique.uicommons.theme.heading
import com.caique.uicommons.theme.paragraph
import com.caique.uicommons.theme.radius_five
import com.caique.uicommons.theme.shape
import com.caique.uicommons.theme.space_eight_teen
import com.caique.uicommons.theme.space_six
import com.caique.uicommons.theme.space_twenty
import com.caique.uicommons.theme.space_twenty_four
import com.caique.uicommons.utils.enums.TransactionCategoryEnum
import com.caique.uicommons.utils.enums.TransactionTypeEnum
import com.caique.uicommons.utils.extensions.getColor
import com.caique.uicommons.utils.extensions.getIcon

@Composable
fun TransactionCard(modifier: Modifier = Modifier, transactionInfo: TransactionInfo) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(radius_five),
        colors = CardDefaults.cardColors().copy(containerColor = shape)
    ) {
        Column(
            modifier = Modifier.padding(
                horizontal = space_twenty_four,
                vertical = space_eight_teen
            )
        ) {
            Text(
                transactionInfo.title,
                fontSize = font_size_title,
                color = heading
            )
            Text(
                transactionInfo.transactionValue,
                fontSize = font_size_heading_2,
                color = transactionInfo.transactionTypeEnum.getColor()
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = space_twenty),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(space_six)
                ) {
                    Icon(
                        tint = paragraph,
                        painter = painterResource(transactionInfo.transactionCategory.getIcon()),
                        contentDescription = ""
                    )
                    Text(transactionInfo.transactionCategory.value, color = paragraph)
                }
                Text(transactionInfo.transactionDate, color = paragraph)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TransactionCardPreview() {
    GoFinancesTheme {
        Column(verticalArrangement = Arrangement.spacedBy(space_twenty)) {
            TransactionCard(
                transactionInfo = TransactionInfo(
                    title = "Website development",
                    transactionValue = "$ 12.000,00",
                    transactionTypeEnum = TransactionTypeEnum.INCOME,
                    transactionCategory = TransactionCategoryEnum.SALES,
                    transactionDate = "12/04/2024"
                )
            )
            TransactionCard(
                transactionInfo = TransactionInfo(
                    title = "Burguer King",
                    transactionValue = "- $ 5,00",
                    transactionTypeEnum = TransactionTypeEnum.OUTCOME,
                    transactionCategory = TransactionCategoryEnum.FOOD,
                    transactionDate = "12/04/2024"
                )
            )
        }
    }
}