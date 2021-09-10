package com.example.exercicios.selecao

fun main(){
    val sal: Float= readLine().toString().toFloat()

    when (sal){
        in 0.0..2000.0 -> print("Isento")
        in 2000.01..3000.0 -> print("R$ %.2f".format((sal-2000)*0.08))
        in 3000.01..4500.0 -> print("R$ %.2f".format(((sal-3000)*0.18)+(1000*0.08)))
        else -> print("R$ %.2f".format(((sal-4500)*0.28)+(1500*0.18)+(1000*0.08)))
    }
}