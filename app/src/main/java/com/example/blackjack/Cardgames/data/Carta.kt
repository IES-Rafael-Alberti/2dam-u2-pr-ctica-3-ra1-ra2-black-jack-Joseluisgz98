package com.example.blackjack.Cardgames.data

import androidx.annotation.DrawableRes

data class Carta(
    var puntos:Valor,
    var palo:Palos,
    var puntosMinimos:Int,
    var puntosMaximos:Int,
    @DrawableRes var id:Int
)
