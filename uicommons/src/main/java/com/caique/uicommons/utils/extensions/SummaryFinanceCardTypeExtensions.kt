package com.caique.uicommons.utils.extensions

import androidx.compose.ui.graphics.Color
import com.caique.uicommons.R
import com.caique.uicommons.cards.summary.SummaryFinanceCardType
import com.caique.uicommons.theme.green
import com.caique.uicommons.theme.heading
import com.caique.uicommons.theme.orange
import com.caique.uicommons.theme.red
import com.caique.uicommons.theme.shape
import com.caique.uicommons.utils.models.CardAppearance

fun SummaryFinanceCardType.handleColorResource(): Color {
    return when (this) {
        SummaryFinanceCardType.INCOME -> green
        SummaryFinanceCardType.OUTCOME -> red
        SummaryFinanceCardType.TOTAL -> shape
    }
}

fun SummaryFinanceCardType.getAppearance(): CardAppearance {
    return when (this) {
        SummaryFinanceCardType.INCOME -> CardAppearance(shape, heading, R.drawable.ic_income_icon)
        SummaryFinanceCardType.OUTCOME -> CardAppearance(shape, heading, R.drawable.ic_outcome_icon)
        SummaryFinanceCardType.TOTAL -> CardAppearance(orange, shape, R.drawable.ic_result_icon)
    }
}