package com.example.blackjack.Cardgames.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.blackjack.Cardgames.data.Routes
import com.example.blackjack.R

@Composable
fun MenuPrincipal(navController: NavHostController){
    Image(painter = painterResource(id = R.drawable.fondo), contentDescription ="fondo",contentScale = ContentScale.Crop )
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Blackjack", fontSize = 32.sp)
            Spacer(modifier = Modifier.height(100.dp))
            Button(onClick = { navController.navigate(Routes.soloUnJugador.routes) }) {
                Text(text = "1 Jugador")
            }
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = {navController.navigate(Routes.dosJugadores.routes) }) {
                Text(text = "2 Jugadores")
            }
        }
    }



