package com.example.blackjack.Cardgames.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.blackjack.R

@Composable
fun SoloUnJugador(navController: NavHostController,unJugadorViewModel: UnJugadorViewModel){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.fondo), contentDescription ="fondo",modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds)
    }
}