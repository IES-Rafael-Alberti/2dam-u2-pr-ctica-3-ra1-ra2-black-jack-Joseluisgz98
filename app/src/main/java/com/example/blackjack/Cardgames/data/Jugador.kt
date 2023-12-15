package com.example.blackjack.Cardgames.data

/**
 * Data class de jugador donde se guarda el nombre los puntos y las cartas que tiene
 */
data class Jugador(
    var nickName:String,
    var puntos: Int,
    val listaDeCartas:ArrayList<Carta> = ArrayList()
)
