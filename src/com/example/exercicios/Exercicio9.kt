package com.example.exercicios

fun main(){
    val nome: String = readLine().toString()
    val sal: String = readLine().toString()
    val totalSell: String = readLine().toString()

    val salTotal = sal.toFloat() + (totalSell.toFloat() * 0.15)
    println("TOTAL = R$ $salTotal")
}