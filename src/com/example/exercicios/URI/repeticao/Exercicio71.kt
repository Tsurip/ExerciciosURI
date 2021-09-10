package com.example.exercicios.DI

fun main(){
    val x: Int= readLine().toString().toInt()
    val y: Int= readLine().toString().toInt()
    var soma: Int = 0

    if(x<y){
        for (i in (x+1) until y) {
            if (!isEven(i)) soma += i
        }
    } else if(x>y){
        for (i in (x-1) downTo (y+1)){
            if (!isEven(i)) soma += i
        }
    }
    print(soma)
}