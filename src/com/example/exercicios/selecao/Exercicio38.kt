package com.example.exercicios.selecao
/*
    cod.    prod.   preço
    1   cachQuen    R$ 4.00
    2   X-salada    R$ 4.50
    3   X-bacon     R$ 5.00
    4   torradSim   R$ 2.00
    5   refrig      R$ 1.50
 */
fun main(){
    val a: Int= readLine().toString().toInt()
    val b: Int= readLine().toString().toInt()

    when(a){
        1 -> print("Total: R$ ${4*b}")
        2 -> print("Total: R$ ${4.5*b}")
        3 -> print("Total: R$ ${5*b}")
        4 -> print("Total: R$ ${2*b}")
        5 -> print("Total: R$ ${1.5*b}")
    }

}