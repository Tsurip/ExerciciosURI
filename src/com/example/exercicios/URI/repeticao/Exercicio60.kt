package com.example.exercicios.DI

fun main(){
    var positivo: Int = 0

    for (i in 1..6){
        val x: Float = readLine().toString().toFloat()

        if(x > 0) positivo++
    }

    print("$positivo valor(es) positivo(s)")
}