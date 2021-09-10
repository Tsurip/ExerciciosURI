package com.example.exercicios.DI

fun main(){
    var x: Int= readLine().toString().toInt()
    var aux: Int = 6

    while(aux>0){
        if(!isEven(x)){
            println(x)
            aux--
        }
        x++;
    }
}