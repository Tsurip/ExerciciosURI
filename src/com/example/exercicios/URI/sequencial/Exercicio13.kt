package com.example.exercicios.sequencial

fun main(){
    val a: String = readLine().toString()
    val b: String = readLine().toString()
    val c: String = readLine().toString()

    var maior: Int

    if(a>b) maior = a.toInt() else maior = b.toInt()
    if(c.toInt()>maior) maior = c.toInt()

    println("$maior é o maior")

}