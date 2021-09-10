package com.example.exercicios.DI

fun main(){
    for (i in 1..100){
        if(isEven(i)) {
            println(i)
        }
    }
}

fun isEven(x: Int): Boolean{
    return x % 2 == 0
}