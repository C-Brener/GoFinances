package com.caique.uicommons.cards.transaction

import com.caique.uicommons.utils.enums.TransactionCategoryEnum
import com.caique.uicommons.utils.enums.TransactionTypeEnum

data class TransactionInfo(
    val title: String,
    val transactionValue: String,
    val transactionCategory: TransactionCategoryEnum,
    val transactionTypeEnum: TransactionTypeEnum,
    val transactionDate: String
)