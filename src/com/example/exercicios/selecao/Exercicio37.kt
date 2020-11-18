package com.example.exercicios.selecao

fun main() {
    val a: Float = readLine().toString().toFloat()

    when (a) {
        in 0.0..25.0 -> println("Intervalo (0,25)")
        in 25.0..50.0 -> println("Intervalo (25,50)")
        in 50.0..75.0 -> println("Intervalo (50,75)")
        in 75.0..100.0 -> println("Intervalo (75,100)")
        else -> println("Fora de intervalo")
    }
}