package com.example.travelappui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.travelappui.Components.PopularDestinications
import com.example.travelappui.Components.SearchBar
import com.example.travelappui.Components.ToolBar
import com.example.travelappui.Components.YouMayLike
import com.example.travelappui.Models.Travel


@Composable
fun FeedScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ToolBar()
        //SearchBar
        SearchBar()
        
        //Popular Destinications Section
        Spacer(modifier = Modifier.padding(top = 7.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Popular Destinications",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 20.sp
            )
            Text(
                text = "See All",
                fontWeight = FontWeight.Light,
                color = Color.LightGray,
                fontSize = 16.sp
            )
        }
        PopularDestinications(
            modifier = Modifier,
            navController = navController,
            listOf(

                Travel(
                    image = R.drawable.nakkastepe,
                    name = "Nakkaş Tepe",
                    country = "Turkey",
                    city = "İstanbul"
                ),

                Travel(
                    image = R.drawable.koh_yao_yai,
                    name = "Koh Yao Yai",
                    country = "Thailand",
                    city = null
                ),

                Travel(
                    image = R.drawable.pom_pom,
                    name = "Pom Island",
                    country = "Malasyia",
                    city = null
                ),

                Travel(
                    image = R.drawable.paris,
                    name = "Eiffel Tower",
                    country = "France",
                    city = "Paris"
                )
            )
        )
        //Popular Destinications Section END

        //You May Like Section
        Spacer(modifier = Modifier.padding(top = 25.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "You May Like",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 20.sp
            )
            Text(
                text = "See All",
                fontWeight = FontWeight.Light,
                color = Color.LightGray,
                fontSize = 16.sp
            )
        }
        YouMayLike(
            destinications = listOf(
                Travel(
                    image = R.drawable.nakkastepe,
                    name = "Nakkaş Tepe",
                    country = "Turkey",
                    city = "İstanbul"
                ),

                Travel(
                    image = R.drawable.koh_yao_yai,
                    name = "Koh Yao Yai",
                    country = "Thailand",
                    city = null
                ),

                Travel(
                    image = R.drawable.pom_pom,
                    name = "Pom Island",
                    country = "Malasyia",
                    city = null
                ),

                Travel(
                    image = R.drawable.paris,
                    name = "Eiffel Tower",
                    country = "France",
                    city = "Paris"
                )
            )
        )
        //You May Like Section END



        //Top Tours Section
        Spacer(modifier = Modifier.padding(top = 25.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Top Tours",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 20.sp
            )
            Text(
                text = "See All",
                fontWeight = FontWeight.Light,
                color = Color.LightGray,
                fontSize = 16.sp
            )
        }
        YouMayLike(
            destinications = listOf(
                Travel(
                    image = R.drawable.nakkastepe,
                    name = "Nakkaş Tepe",
                    country = "Turkey",
                    city = "İstanbul"
                ),

                Travel(
                    image = R.drawable.koh_yao_yai,
                    name = "Koh Yao Yai",
                    country = "Thailand",
                    city = null
                ),

                Travel(
                    image = R.drawable.pom_pom,
                    name = "Pom Island",
                    country = "Malasyia",
                    city = null
                ),

                Travel(
                    image = R.drawable.paris,
                    name = "Eiffel Tower",
                    country = "France",
                    city = "Paris"
                )
            )
        )
        //Top Tours Section END

    }
}