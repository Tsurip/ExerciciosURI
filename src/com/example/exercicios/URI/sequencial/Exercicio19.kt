package com.example.exercicios.sequencial

fun main(){
    var a: Int = readLine().toString().toInt()

    val hora: Int = a/3600; a -= hora*3600
    val minuto: Int = a/60; a -= minuto * 60
    val segundo: Int = a

    println("$hora:$minuto:$segundo")


}