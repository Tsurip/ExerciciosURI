package com.example.exercicios.sequencial

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    val x1: Float = readLine().toString().toFloat()
    val y1: Float = readLine().toString().toFloat()

    val x2: Float = readLine().toString().toFloat()
    val y2: Float = readLine().toString().toFloat()

    val dist = sqrt((x2 - x1).toDouble().pow(2.0) + (y2 - y1).toDouble().pow(2.0))

    println(dist)
}