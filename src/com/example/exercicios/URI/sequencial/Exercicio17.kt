package com.example.exercicios.sequencial
/*
    12km/L

    L = km*h/12
 */
fun main(){
    val h: Int = readLine().toString().toInt()
    val km: Int = readLine().toString().toInt()

    val litros: Float = ((h*km)/12).toFloat()

    println(litros)
}