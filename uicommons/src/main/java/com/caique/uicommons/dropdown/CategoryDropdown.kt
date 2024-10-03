package com.caique.uicommons.dropdown

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.caique.uicommons.R
import com.caique.uicommons.theme.GoFinancesTheme
import com.caique.uicommons.theme.drop_down_height
import com.caique.uicommons.theme.paragraph
import com.caique.uicommons.theme.radius_five
import com.caique.uicommons.theme.shape
import com.caique.uicommons.theme.space_sixteen
import com.caique.uicommons.theme.space_twenty

@Composable
fun CategoryDropdown(
    optionSelected: String,
    optionList: List<String>,
    onOptionSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                expanded = true
            },
        shape = RoundedCornerShape(radius_five),
        colors = CardDefaults.cardColors().copy(containerColor = shape)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = space_twenty, horizontal = space_sixteen)
        ) {
            Text(
                text = optionSelected,
                color = paragraph,
                fontWeight = FontWeight.Medium,

                )
            Icon(
                painter = painterResource(R.drawable.ic_chevron_down),
                contentDescription = "",
                tint = paragraph
            )
        }
        DropdownMenu(
            modifier = Modifier
                .fillMaxWidth()
                .height(drop_down_height)
                .background(color = shape),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            optionList.forEach { option ->
                DropdownMenuItem(
                    modifier = Modifier.fillMaxWidth(),
                    text = {
                        Text(
                            text = option,
                            color = paragraph
                        )
                    },
                    onClick = {
                        onOptionSelected(option)
                        expanded = false
                    }
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CategoryDropdownPreview() {
    val options = listOf("Option 1", "Option 2", "Option 3", "Option 4")
    var optionSelected by remember { mutableStateOf(options.first()) }

    GoFinancesTheme {
        CategoryDropdown(optionSelected, options) {
            optionSelected = it
        }
    }
}