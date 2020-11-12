package com.example.exercicios

fun main(){
    val cod1: String = readLine().toString(); val num1: String = readLine().toString(); val Preço1: String = readLine().toString()
    val cod2: String = readLine().toString(); val num2: String = readLine().toString(); val Preço2: String = readLine().toString()

    val total = (num1.toFloat() * Preço1.toFloat()) + (num2.toFloat() * Preço2.toFloat())

    println("VALOR A PAGAR: R$ $total")
}