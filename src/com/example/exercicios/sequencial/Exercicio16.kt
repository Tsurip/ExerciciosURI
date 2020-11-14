package com.example.exercicios.sequencial
/*
    60km/h = 1km/min ->     f(y1) = 1x
    90km/h = 1,5km/min ->   f(y2) = 1.5x

    diferença de dist. -> 1.5x - 1x = x(1.5-1) = 0.5x

    km = 0.5t -> t = km/0.5 ou t = km*2
 */
fun main(){
    val x: Int = readLine().toString().toInt()

    val t: Int = x*2

    println("$t minutos")
}