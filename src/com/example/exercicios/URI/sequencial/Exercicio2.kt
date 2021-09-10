package com.example.exercicios.sequencial
// Área do círculo.

fun main(){
// A= pi.r.r
    val r: String = readLine().toString()
    val a: Double = r.toInt() * r.toInt() * 3.14159

    println("A=$a")
}