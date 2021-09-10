package com.example.exercicios.selecao

fun main(){
    val sal: Float= readLine().toString().toFloat()

    when(sal){
        in 0.0..400.0 -> println("Novo salário: %.2f\n".format(sal*1.15) +
                "Reajuste ganho: %.2f".format(sal*0.15) + "\n Em percentual: 15%")
        in 400.0..800.00 -> println("Novo salário: %.2f\n".format(sal*1.12) +
                "Reajuste ganho: %.2f\n".format(sal*0.12) + "Em percentual: 12%")
        in 800.0..1200.00 -> println("Novo   salário: %.2f\n".format(sal*1.10) +
                "Reajuste ganho: %.2f\n".format(sal*0.10) + "Em percentual: 10%")
        in 1200.0..2000.00 -> println("Novo salário: %.2f\n".format(sal*1.07) +
                "Reajuste ganho: %.2f\n".format(sal*0.07) + "Em percentual: 7%")
        else -> println("Novo salário: %.2f\n".format(sal*1.04) +
                "Reajuste ganho: %.2f \n".format(sal*0.04) +"Em percentual: 4%")
    }
}