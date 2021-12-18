package com.example.travelappui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import com.example.travelappui.R

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelappui.Models.Travel

@Composable
fun TravelDetailsPage(travel: Travel) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopSection(
            image = travel.image,
            Modifier
                .height(375.dp)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 30.dp, end = 10.dp)
        )

        Texts(
            name = travel.name,
            country = travel.country,
            about = travel.about!!,
            customPadding = 10.dp,
            Modifier,
        )
    }
}

@Composable
fun TopSection(
    image: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
    ) {

        //Image
        Image(
            painter = painterResource(id = image),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
        Row(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(
                    Color(0f, 0f, 0f, 0.3f)
                )
                .padding(horizontal = 25.dp, vertical = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_back_light),
                contentDescription = "Back Button"
            )
            Image(
                painter = painterResource(id = R.drawable.ic_dot_menu),
                contentDescription = "Dot Menu"
            )

        }
    }
}


@Composable
fun Texts(
    name: String,
    country: String,
    about: String,
    customPadding: Dp,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 25.dp, vertical = customPadding)
    ) {

        //Location, Country, Saved Section
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = "Saved",
                    Modifier.padding(end = 5.dp),
                )
                Text(
                    text = country,
                    modifier = modifier,
                    color = Color.Gray,
                    fontSize = 16.sp
                )

            }

            Image(
                painter = painterResource(id = R.drawable.ic_mark),
                contentDescription = "Saved"
            )
        }

        //Name
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(top = customPadding)
        )

        //Star Section
        Row(
            modifier = modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .padding(top = 5.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.ic_star), contentDescription = "Star" )
                Text(text = "4.5 (15 Review)", color = Color(0xFFFFC107))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .padding(top = 5.dp)
            ) {
                Text(
                    text = "$60",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "/4 days",
                    color = Color.Gray
                )
            }

        }

        //About section
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "About",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = about,
                fontWeight = FontWeight.Light,
                color = Color.Gray,
                letterSpacing = 1.sp,
                modifier = modifier
                    .padding(top = 5.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DetailsPreview() {
    TravelDetailsPage(
        travel = Travel(
            image = R.drawable.nakkastepe,
            name = "Nakkaş Tepe",
            country = "Turkey",
            city = "İstanbul",
            about = "Üsküdar Belediyesi’nin Üsküdar’ın güzelleştirilmesi projesi kapsamında gerçekleştirdiği adımların bir parçası olan Nakkaştepe Millet Bahçesi; " +
                    "toplamda 50 bin metrekare  alan üzerine kurulu çok büyük bir yerdir. İstanbullular ve bölgeyi ziyarete gelenler için dinlenme, eğlenme ve " +
                    "güzel vakit geçirme adına tercih edilebilecek olan yerlerin başında gelir."
        )
    )
}