package com.example.exercicios.selecao

import kotlin.math.pow
import kotlin.math.sqrt

// x12 = (-b +- (b²-4ac)^(1/2))/2a

fun main(){
    val a: Float = readLine().toString().toFloat()
    val b: Float = readLine().toString().toFloat()
    val c: Float = readLine().toString().toFloat()

    if(a>0 || a<0){
        val delta: Float = b.pow(2)-(4*a*c)
        if (delta>0){
            val x1 = (-b + sqrt(delta))/(2*a)
            val x2 = (-b - sqrt(delta))/(2*a)

            println("R1 = $x1\nR2 = $x2 $delta")
        } else println("Impossível calcular")
    } else println("Impossível calcular")
}