package com.example.exercicios.selecao

fun main(){
    val ddd: Int= readLine().toString().toInt()

    when(ddd){
        11 -> print("São Paulo")
        19 -> print("Campinas")
        21 -> print("Rio de Janeiro")
        27 -> print("Vitória")
        31 -> print("Belo Horizonte")
        32 -> print("Juiz de Fora")
        61 -> print("Brasilia")
        71 -> print("Salvador")
    }

}