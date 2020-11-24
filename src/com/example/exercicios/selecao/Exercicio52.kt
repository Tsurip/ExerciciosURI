package com.example.exercicios.selecao

fun main(){
    val mes: Int= readLine().toString().toInt()

    when (mes){
        1 -> print("Janeiro")
        2 -> print("Fevereiro")
        3 -> print("Março")
        4 -> print("Abril")
        5 -> print("Maio")
        6 -> print("Junho")
        7 -> print("Julho")
        8 -> print("Agosto")
        9 -> print("Setembro")
        10 -> print("Outubro")
        11 -> print("Novembro")
        12 -> print("Dezembro")
    }
}