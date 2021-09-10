package com.example.exercicios.DI

fun main(){
    val qnt: Int= readLine().toString().toInt()
    var entr = 0; var saida = 0;

    for(i in 1..qnt){
        when(readLine().toString().toInt()) {
        in 10..20 -> entr++
        else -> saida++
        }
    }

    print("$entr in\n$saida out")

}