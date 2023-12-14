package com.example.blackjack.Cardgames.data

data class Jugador(
    var nickName:String,
    var puntos:Int,
    val listaDeCartas:ArrayList<Carta> = ArrayList()
)
