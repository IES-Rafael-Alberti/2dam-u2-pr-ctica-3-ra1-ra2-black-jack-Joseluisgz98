package com.example.blackjack.Cardgames.data

import androidx.annotation.DrawableRes

/**
 * Data class de carta en el que se jugar los puntos el palo la puntuaciones tanto maxima como minima y el id con la que se dibuja
 */
data class Carta(
    var puntos:Valor,
    var palo:Palos,
    var puntosMinimos:Int,
    var puntosMaximos:Int,
    @DrawableRes var id:Int
)
