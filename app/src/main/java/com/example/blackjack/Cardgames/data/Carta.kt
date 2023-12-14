package com.example.blackjack.Cardgames.data

import androidx.annotation.DrawableRes

data class Carta(
    var nombre:Valor,
    var palo:Palos,
    var puntosMinimos:Int,
    var puntosMaximos:Int,
    @DrawableRes var id:Int
)
