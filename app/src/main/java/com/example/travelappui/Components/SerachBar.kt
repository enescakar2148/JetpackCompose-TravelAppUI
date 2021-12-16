package com.example.travelappui.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(){
    Column(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp)
    ) {
        TextField(
            value = "Search ",
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(10.dp)
                ),
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                textColor = Color.Gray,
                cursorColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            onValueChange = {
            //Change Value
            //Not need is now
        })
    }
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview(){
    SearchBar()
}