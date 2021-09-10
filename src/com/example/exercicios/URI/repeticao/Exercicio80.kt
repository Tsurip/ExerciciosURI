package com.example.exercicios.DI

fun main(){
    val range = readLine().toString().toInt()
    var pos = 0
    var maior = 0

    for (i in 1..range){
        var num = readLine().toString().toInt()

        if(num>maior){
            maior = num
            pos = i
        }
    }

    print("Número: $maior \nPosiçâo: $pos")
}