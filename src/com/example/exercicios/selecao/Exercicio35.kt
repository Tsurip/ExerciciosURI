package com.example.exercicios.selecao

fun main(){
    val a: Int = readLine().toString().toInt()
    val b: Int = readLine().toString().toInt()
    val c: Int = readLine().toString().toInt()
    val d: Int = readLine().toString().toInt()

    if (b>c && d>a && (c+d > a+b) && c>0 && d>0 && (a%2==0)) println("Valores aceitos")
    else println("Valores não aceitos")
}