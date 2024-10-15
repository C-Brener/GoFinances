package com.caique.uicommons.utils.extensions

import androidx.compose.ui.graphics.Color
import com.caique.uicommons.R
import com.caique.uicommons.theme.background
import com.caique.uicommons.theme.green
import com.caique.uicommons.theme.green_with_opacity_10
import com.caique.uicommons.theme.red
import com.caique.uicommons.theme.red_with_opacity_10
import com.caique.uicommons.theme.shape
import com.caique.uicommons.utils.enums.TransactionTypeEnum

internal fun getButtonTitle(buttonType: TransactionTypeEnum) =
    if (buttonType == TransactionTypeEnum.INCOME) R.string.income else R.string.outcome

internal fun TransactionTypeEnum.getIcon(): Int {
    return when (this) {
        TransactionTypeEnum.INCOME -> R.drawable.ic_income_icon
        TransactionTypeEnum.OUTCOME -> R.drawable.ic_outcome_icon
        else -> R.drawable.ic_result_icon
    }
}

internal fun TransactionTypeEnum.getBackgroundColor(isClicked: Boolean): Color {
    return if (isClicked) {
        if (this == TransactionTypeEnum.INCOME) {
            green_with_opacity_10
        } else {
            red_with_opacity_10
        }
    } else {
        background
    }
}

internal fun TransactionTypeEnum.getColor(): Color {
    return when (this) {
        TransactionTypeEnum.INCOME -> green
        TransactionTypeEnum.OUTCOME -> red
        else -> shape
    }
}