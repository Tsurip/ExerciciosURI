package com.example.exercicios

fun main(){
    val a: String = readLine().toString()
    val b: String = readLine().toString()
    val c: String = readLine().toString()

    val media = (a.toDouble()*0.2)+(b.toDouble()*0.3)+(c.toDouble()*0.5)

    println("MEDIA = $media")
}