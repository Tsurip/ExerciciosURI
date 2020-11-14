package com.example.exercicios.sequencial

fun main(){
    val x: String = readLine().toString()
    val y: String = readLine().toString()

    val consumo = x.toInt()/y.toFloat()

    println("$consumo km/1")
}