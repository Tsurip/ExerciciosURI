package com.example.exercicios.sequencial

fun main(){
    val a: String = readLine().toString()
    val b: String = readLine().toString()
    val c: String = readLine().toString()

    val media = (a.toFloat()*0.2)+(b.toFloat()*0.3)+(c.toFloat()*0.5)

    println("MEDIA = $media")
}