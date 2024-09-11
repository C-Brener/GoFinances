package com.caique.uicommons.utils.extensions

import androidx.compose.ui.graphics.Color
import com.caique.uicommons.R
import com.caique.uicommons.utils.models.CardAppearance
import com.caique.uicommons.cards.FinanceCardType
import com.caique.uicommons.theme.green
import com.caique.uicommons.theme.heading
import com.caique.uicommons.theme.orange
import com.caique.uicommons.theme.red
import com.caique.uicommons.theme.shape

fun FinanceCardType.handleColorResource(): Color {
    return when (this) {
        FinanceCardType.INCOME -> green
        FinanceCardType.OUTCOME -> red
        FinanceCardType.TOTAL -> shape
    }
}


fun FinanceCardType.getAppearance(): CardAppearance {
    return when (this) {
        FinanceCardType.INCOME -> CardAppearance(shape, heading, R.drawable.ic_income_icon)
        FinanceCardType.OUTCOME -> CardAppearance(shape, heading, R.drawable.ic_outcome_icon)
        FinanceCardType.TOTAL -> CardAppearance(orange, shape, R.drawable.ic_result_icon)
    }
} 