package com.example.blackjack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blackjack.Cardgames.data.Routes
import com.example.blackjack.Cardgames.ui.DosJugador
import com.example.blackjack.Cardgames.ui.DosJugadoresViewModel
import com.example.blackjack.Cardgames.ui.MenuPrincipal
import com.example.blackjack.Cardgames.ui.SoloUnJugador
import com.example.blackjack.Cardgames.ui.UnJugadorViewModel
import com.example.blackjack.ui.theme.BlackJackTheme

class MainActivity : ComponentActivity() {
    private val dosJugadoresViewModel: DosJugadoresViewModel by viewModels()
    private val unJugadorViewModel: UnJugadorViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlackJackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,startDestination = Routes.menuPrincipal.routes){
                        composable(Routes.menuPrincipal.routes){ MenuPrincipal(navController) }
                        composable(Routes.soloUnJugador.routes){ SoloUnJugador(navController,unJugadorViewModel= unJugadorViewModel) }
                        composable(Routes.dosJugadores.routes){ DosJugador(navController, dosJugadoresViewModel = dosJugadoresViewModel) }
                    }
                }
            }
        }
    }
}



