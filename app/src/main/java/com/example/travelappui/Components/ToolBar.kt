package com.example.travelappui.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelappui.R

@Composable
fun ToolBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){

            Image(
                painterResource(id = R.drawable.menu_button),
                contentDescription = "Menu Button",
                modifier = Modifier.size(30.dp)
            )

            Text(
                text = "Search",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp),
            )
        }

        Image(
            painter =  painterResource(id = R.drawable.pp),
            contentDescription = "Profile Photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(40.dp)
                .clip(CircleShape)
        )
    }
}

//Preview Scope
@Preview(showBackground = true)
@Composable
fun ToolBarPreview() {
    ToolBar()
}