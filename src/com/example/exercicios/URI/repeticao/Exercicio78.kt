package com.example.exercicios.DI

fun main(){
    val n: Int= readLine().toString().toInt()

    for(i in 1..10){
        println("$i x $n = ${i*n}")
    }
}