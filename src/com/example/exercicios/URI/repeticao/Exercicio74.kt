package com.example.exercicios.DI

fun main(){
    val n = readLine().toString().toInt()
    var x = IntArray(n)

    for(i in 0 until n){
        x[i] = readLine().toString().toInt()
    }
    for(i in 0 until n){
        if(x[i]%2 == 0 && x[i]!=0) print("EVEN ")
        if(x[i]%2 != 0) print("ODD ")
        if(x[i]>0) print("POSITIVE ")
        if(x[i]<0) print("NEGATIVE ")
        if(x[i]==0) print("NULL")
        println("")
    }
}
