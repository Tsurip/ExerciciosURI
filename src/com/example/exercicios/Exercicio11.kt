package com.example.exercicios

fun main(){
    val raio: String = readLine().toString()

    val vol: Double = ((4.0/3) * 3.14159 * (raio.toDouble()*raio.toDouble()*raio.toDouble()))

    println("VOLUME = $vol")
}