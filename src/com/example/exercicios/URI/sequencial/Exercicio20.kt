package com.example.exercicios.sequencial

fun main(){
    var a: Int = readLine().toString().toInt()

    val anos: Int = a/365; a -= anos*365
    val meses: Int = a/30; a-= meses*30
    val dias: Int = a

    println("$anos ano(s) \n$meses mes(es) \n$dias dia(s)")
}