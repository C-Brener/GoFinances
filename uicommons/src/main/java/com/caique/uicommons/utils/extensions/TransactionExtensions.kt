package com.caique.uicommons.utils.extensions

import androidx.compose.ui.graphics.Color
import com.caique.uicommons.R
import com.caique.uicommons.buttons.transaction.TransactionType
import com.caique.uicommons.theme.background
import com.caique.uicommons.theme.green_with_opacity_10
import com.caique.uicommons.theme.red_with_opacity_10

internal fun getButtonTitle(buttonType: TransactionType) =
    if (buttonType == TransactionType.INCOME) R.string.income else R.string.outcome

internal fun getIcon(buttonType: TransactionType) = if (buttonType == TransactionType.INCOME) {
    R.drawable.ic_income_icon
} else {
    R.drawable.ic_outcome_icon
}

internal fun getColor(isClicked: Boolean, buttonType: TransactionType): Color {
    return if (isClicked && buttonType == TransactionType.INCOME) {
        green_with_opacity_10
    } else if (isClicked && buttonType == TransactionType.OUTCOME) {
        red_with_opacity_10
    } else {
        background
    }
}