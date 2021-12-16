package com.example.travelappui.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelappui.Models.Travels

@Composable
fun PopularDestinications(
    modifier: Modifier = Modifier,
    destinications: List<Travels>
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        LazyRow(modifier = modifier){
            items(destinications){ destinication ->
                ImageCard(destinication = destinication)
            }
        }
    }
}

@Composable
fun ImageCard(
    modifier: Modifier = Modifier
        .size(height = 100.dp, width = 200.dp),
    destinication: Travels
) {
    Card(
        modifier = modifier
            .padding(end = 10.dp, top = 10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Image(
            painter = painterResource(id = destinication.image),
            contentDescription = destinication.name,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0f, 0f, 0f, 0.6f)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = destinication.name +", " + destinication.country,
                color = Color.White,
                fontWeight = FontWeight.Light,
                fontSize = 17.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}
