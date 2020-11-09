package com.example.exercicios

fun main(){
    val n1: String = readLine().toString()
    val n2: String = readLine().toString()

    val media: Double = (n1.toDouble() + n2.toDouble())/2

    println("MEDIA = $media")
}