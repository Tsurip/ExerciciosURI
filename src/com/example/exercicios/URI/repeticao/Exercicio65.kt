package com.example.exercicios.DI

fun main(){
    var par: Int = 0

    for (i in 1..5){
        val x: Int = readLine().toString().toInt()

        if(isEven(x)) par++
    }

    print("$par valor(es) par(es)")
}