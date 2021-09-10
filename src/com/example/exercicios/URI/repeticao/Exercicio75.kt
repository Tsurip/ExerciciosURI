package com.example.exercicios.DI

fun main(){
    val n: Int= readLine().toString().toInt()

    for (i in 1..10000){
        if(i%n==2) println(i)
    }
}