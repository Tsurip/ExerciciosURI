package com.example.exercicios

fun main(){
    val numFunc: String = readLine().toString()
    val horas: String = readLine().toString()
    val valHora: String = readLine().toString()

    val sal = horas.toFloat() * valHora.toFloat()

    println("NUMBER = $numFunc \nSALARY = U$ $sal")
}