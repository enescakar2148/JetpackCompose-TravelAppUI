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
import com.example.travelappui.Models.Travel
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelappui.R

@Composable
fun TopTour(
    modifier: Modifier = Modifier,
    travels: List<Travel>
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        LazyRow(modifier = modifier) {
            items(travels) { travel ->
                Cards(
                    modifier = Modifier
                        .size(width = 175.dp, height = 200.dp),
                    travels = travel
                )
            }
        }
    }
}


@Composable
fun Cards(
    modifier: Modifier = Modifier,
    travels: Travel
) {
    Card(
        modifier = modifier
            .padding(end = 10.dp, top = 10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp,
    ) {
        Image(
            painter = painterResource(id = travels.image),
            contentDescription = travels.name,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0f, 0f, 0f, 0.6f)),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = travels.name + ", " + travels.country,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                modifier = Modifier.padding(10.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "Star",
                    Modifier.padding(end = 5.dp)
                )
                Text(
                    text = "4.8 (32 Review)",
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}