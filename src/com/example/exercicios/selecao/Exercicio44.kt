package com.example.exercicios.selecao

fun main(){
    val a: Int= readLine().toString().toInt()
    val b: Int= readLine().toString().toInt()

    if(b%a == 0) print("São Multiplos") else print("Não são Multiplos")
}