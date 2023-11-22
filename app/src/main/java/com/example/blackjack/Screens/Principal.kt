package com.example.blackjack.Screens

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.blackjack.Models.Routes

@Composable
fun MenuPrincipal(navController: NavHostController){
    var botonUnJugador by rememberSaveable{mutableStateOf("1 Jugador")}
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)){
            Text(text = "Black Jack")
            Button(onClick = { navController.navigate(Routes.soloUnJugador.routes) }) {
                Text(text = botonUnJugador)
            }
    }

}



