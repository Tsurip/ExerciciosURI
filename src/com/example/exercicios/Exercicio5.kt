package com.example.exercicios

fun main(){
    val n1: String = readLine().toString()
    val n2: String = readLine().toString()

    val media: Float = (n1.toFloat() + n2.toFloat())/2

    println("MEDIA = $media")
}