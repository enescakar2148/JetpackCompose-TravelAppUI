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
                    city = "İstanbul",
                    about = "Üsküdar Belediyesi’nin Üsküdar’ın güzelleştirilmesi projesi kapsamında gerçekleştirdiği adımların bir parçası olan Nakkaştepe Millet Bahçesi; " +
                            "toplamda 50 bin metrekare  alan üzerine kurulu çok büyük bir yerdir. İstanbullular ve bölgeyi ziyarete gelenler için dinlenme, eğlenme ve " +
                            "güzel vakit geçirme adına tercih edilebilecek olan yerlerin başında gelir."
                ),

                Travel(
                    image = R.drawable.koh_yao_yai,
                    name = "Koh Yao Yai",
                    country = "Thailand",
                    city = null,
                    about = "Koh Yao Noi and Koh Yao Yai are a pair of large islands in the middle of Phang Nga Bay, equidistant to Phuket and Krabi. " +
                            "While you'll find several luxury resorts and tourist facilities on Koh Yao Noi, the islands remain a quiet refuge that feels far " +
                            "removed from the crowds of Phuket. Some of the best things you can do on the Koh Yao Islands include kayaking, hiking, snorkelling, and swimming."
                ),

                Travel(
                    image = R.drawable.pom_pom,
                    name = "Pom Island",
                    country = "Malasyia",
                    city = null,
                    about = "The island is 2.3 kilometres in circumference at the high tide line with a fringing coral reef 4 kilometres long. " +
                            "The island is flat sand with a maximum elevation of less than 2 metres above the HT line. The reef flat is only 50–75 metres wide " +
                            "to the west and several hundred metres wide around most of the island. The island has a white sand coral beach and is a significant nesting " +
                            "location site for green and hawksbill turtles. Relatively undeveloped, the island is one of the most popular dive destinations in the Semporna district."
                ),

                Travel(
                    image = R.drawable.paris,
                    name = "Eiffel Tower",
                    country = "France",
                    city = "Paris",
                    about = "For centuries Paris has been one of the world’s most important and attractive cities. " +
                            "It is appreciated for the opportunities it offers for business and commerce, for study, " +
                            "for culture, and for entertainment; its gastronomy, haute couture, painting, literature, " +
                            "and intellectual community especially enjoy an enviable reputation. " +
                            "Its sobriquet “the City of Light” (“la Ville Lumière”), earned during the Enlightenment, " +
                            "remains appropriate, for Paris has retained its importance as a centre for education and intellectual pursuits."
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
                    city = "İstanbul",
                    about = null
                ),

                Travel(
                    image = R.drawable.koh_yao_yai,
                    name = "Koh Yao Yai",
                    country = "Thailand",
                    city = null,
                    about = null
                ),

                Travel(
                    image = R.drawable.pom_pom,
                    name = "Pom Island",
                    country = "Malasyia",
                    city = null,
                    about = null
                ),

                Travel(
                    image = R.drawable.paris,
                    name = "Eiffel Tower",
                    country = "France",
                    city = "Paris",
                    about = null
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
                    city = "İstanbul",
                    about = null
                ),

                Travel(
                    image = R.drawable.koh_yao_yai,
                    name = "Koh Yao Yai",
                    country = "Thailand",
                    city = null,
                    about = null
                ),

                Travel(
                    image = R.drawable.pom_pom,
                    name = "Pom Island",
                    country = "Malasyia",
                    city = null,
                    about = null
                ),

                Travel(
                    image = R.drawable.paris,
                    name = "Eiffel Tower",
                    country = "France",
                    city = "Paris",
                    about = null
                )
            )
        )
        //Top Tours Section END

    }
}