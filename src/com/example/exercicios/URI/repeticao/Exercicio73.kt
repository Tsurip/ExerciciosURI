package com.example.exercicios.DI
import kotlin.math.pow

fun main(){
    val n: Int= readLine().toString().toInt()

    for(i in 1..n){
        val j: Double= i.toDouble()

        if(isEven(i)) println("$i^2 = %.0f".format(j.pow(2)))
    }
}