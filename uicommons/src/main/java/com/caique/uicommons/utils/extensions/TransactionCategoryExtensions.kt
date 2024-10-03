package com.caique.uicommons.utils.extensions

import com.caique.uicommons.R
import com.caique.uicommons.utils.enums.TransactionCategoryEnum

internal fun TransactionCategoryEnum.getIcon(): Int {
    return when (this) {
        TransactionCategoryEnum.FOOD -> R.drawable.ic_food_icon
        TransactionCategoryEnum.SALES -> R.drawable.ic_dollar_icon
        TransactionCategoryEnum.HOUSE_BILLS -> R.drawable.ic_house_bills_icon
    }
}