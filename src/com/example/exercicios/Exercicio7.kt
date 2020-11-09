package com.example.exercicios

fun main(){
    val a: String = readLine().toString()
    val b: String = readLine().toString()
    val c: String = readLine().toString()
    val d: String = readLine().toString()

    val dif: Int = ((a.toInt()*b.toInt()) - (c.toInt()*d.toInt()))

    println("DIFERENÇA = $dif")
}