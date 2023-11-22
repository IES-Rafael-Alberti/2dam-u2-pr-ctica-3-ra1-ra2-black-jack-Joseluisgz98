package com.example.blackjack.Models
sealed class Routes(val routes:String){
    object menuPrincipal:Routes("Menu Principal")
    object soloUnJugador:Routes("Un jugador")
    object dosJugadores:Routes("Dos jugadores")

}