package com.example.travelappui

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.travelappui.Models.Travel
import com.example.travelappui.Screens.TravelDetailsPage
import com.example.travelappui.ui.theme.TravelAppUITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "feed"
            ){
                composable("feed"){
                    FeedScreen(navController = navController)
                }

                composable("travel_details_page/{name}/{image}/{about}/{country}", arguments = listOf(
                    navArgument("name"){
                        type = NavType.StringType
                    },
                    navArgument("image"){
                        type = NavType.IntType
                    },
                    navArgument("about"){
                        type = NavType.StringType
                    },
                    navArgument("country"){
                        type = NavType.StringType
                    }
                )){

                    //Verilen argümanların gidilen route üzerinden geri alınması
                    val name = remember{
                        it.arguments?.getString("name")
                    }

                    val image = remember{
                        it.arguments?.getInt("image")
                    }
                    val about = remember{
                        it.arguments?.getString("about")
                    }
                    val country = remember{
                        it.arguments?.getString("country")
                    }


                    //Alınan Argümanların işleme dökülmesi
                    val travel = Travel(
                        about = about,
                        image = image!!,
                        name = name!!,
                        country = country!!,
                        city = null
                    )

                    //Gidilecek sayfaya işlenmiş argümanların verilmesi
                    TravelDetailsPage(travel = travel)
                }
            }
        }
    }
}