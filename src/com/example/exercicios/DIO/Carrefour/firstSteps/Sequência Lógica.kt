package com.example.exercicios.DIO.Carrefour.firstSteps
/*
        Desenvolver um programa que leia um valor inteiro N. Deverão ser imprimidas duas linhas de saida
        como o exemplo de saída

        Input: N -> Int > 1 e < 1000

        Output: Conforme exemplo

        Exemplo:

        Input       |   Output
        5           |   5 25 125
                    |   5 26 126
 */

fun main(){
    val n = 1..(readLine() ?: return).toInt()

    n.forEach{
        println("$it ${pot(it,2)} ${pot(it,3)}")
        println("$it ${pot(it,2) + 1} ${pot(it,3) + 1}")
    }

}

fun pot(x: Int, y: Int): Int{
    when(y){
        0 -> return 1
        else -> return x*pot(x,(y-1))
    }
}