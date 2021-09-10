package com.example.exercicios.sequencial

fun main(){
    val numFunc: String = readLine().toString()
    val horas: String = readLine().toString()
    val valHora: String = readLine().toString()

    val sal = horas.toFloat() * valHora.toFloat()

    println("NUMBER = $numFunc \nSALARY = U$ $sal")
}