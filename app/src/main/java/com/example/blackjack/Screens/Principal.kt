package com.example.blackjack.Screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.blackjack.Models.Routes

@Composable
fun MenuPrincipal(navController: NavHostController){
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Blackjack", fontSize = 32.sp)
            Button(onClick = { navController.navigate(Routes.soloUnJugador.routes) }) {
                Text(text = "1 Jugador")
            }
            Button(onClick = {navController.navigate(Routes.dosJugadores.routes) }) {
                Text(text = "2 Jugadores")
            }
        }
    }



