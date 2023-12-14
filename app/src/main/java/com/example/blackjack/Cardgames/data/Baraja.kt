package com.example.blackjack.Cardgames.data

import android.content.Context
import com.example.blackjack.R


class Baraja {
    companion object {
        // The list to store the deck of cards
        private val mazo: ArrayList<Carta> = ArrayList()
        fun NuevaBaraja(context: Context) {
            mazo.clear()
            var puntosMin: Int
            var puntosMax: Int

            for (palo in 1..4) {
                for (cont in 1..13) {
                    when (cont) {
                        1 -> {
                            puntosMin = 1
                            puntosMax = 11
                        }
                        11, 12, 13 -> {
                            puntosMin = 10
                            puntosMax = 10
                        }
                        else -> {
                            puntosMin = cont
                            puntosMax = cont
                        }
                    }
                    mazo.add(
                        Carta(
                            Valor.values()[cont],
                            Palos.values()[palo],
                            puntosMin,
                            puntosMax,
                            getIdDrawable(
                                context,
                                "${Palos.values()[palo].toString().lowercase()}_${cont}"
                            )
                        )
                    )
                }
            }
        }

        fun barajar() {
            mazo.shuffle()
        }

        fun cogerCarta(): Carta {
            val nuevaCarta = mazo.last()
            mazo.removeLast()
            return nuevaCarta
        }
        fun cartaBocaAbajo(): Carta {
            return(Carta(Valor.PORTADA, Palos.PORTADA, 0, 0, R.drawable.bocaabajo))
        }
        private fun getIdDrawable(context: Context, nombreCarta: String) =
            context.resources.getIdentifier(
                nombreCarta,
                "drawable",
                context.packageName)
    }
}