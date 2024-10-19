package com.caique.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.caique.uicommons.theme.blue
import com.caique.uicommons.theme.orange
import com.caique.uicommons.theme.seven_weight
import com.caique.uicommons.theme.three_weight

@Composable
internal fun BackgroundLayer(content: @Composable () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .background(blue)
                    .weight(seven_weight)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxSize()
                    .background(orange)
                    .weight(three_weight)
            )
        }
        content()
    }
}