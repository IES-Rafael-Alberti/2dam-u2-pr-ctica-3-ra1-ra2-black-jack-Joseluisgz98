package com.example.blackjack.Cardgames.data

import android.content.Context
import android.widget.Toast
import com.example.blackjack.R


class Baraja {
    companion object {
        //variable mazo que esta compuesto por una array de cartas
        private val mazo: ArrayList<Carta> = ArrayList()
        /**
         *@param context proporciona información sobre el entorno de la aplicación y permite acceder a recursos como strings, drawables
         * funcion en la que creas una baraja
         */
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
                    //aqui esta añades las cartas al mazo
                    mazo.add(
                        Carta(
                            Valor.values()[cont],
                            Palos.values()[palo],
                            puntosMin,
                            puntosMax,
                            getIdDrawable(
                                context,
                                "${Palos.values()[palo].toString().lowercase()}${cont}"
                            )
                        )
                    )
                }
            }
        }

        /**
         * funcuion la cual te da una carta y si esta vacia te da una carta boca abajo
         */
        fun darCarta():Carta{
            if (mazo.isEmpty()){
                return (Carta(Valor.PORTADA,Palos.PORTADA,0,0,R.drawable.bocaabajo))
            }else{
             return mazo.removeAt(mazo.size-1)
            }
        }

        /**
         * Funcion para barajar el mazo
         */
        fun barajar() {
            mazo.shuffle()
        }

        /**
         * @param context proporciona información sobre el entorno de la aplicación y permite acceder a recursos como strings, drawables
         * @param nombreCarta es el nombre de la carta
         * funcion qte te da el idDrawable de la carta
         */
        private fun getIdDrawable(context: Context, nombreCarta: String) =
            context.resources.getIdentifier(
                nombreCarta,
                "drawable",
                context.packageName)
    }
}