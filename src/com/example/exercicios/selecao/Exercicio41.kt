package com.example.exercicios.selecao

fun main(){
    val x: Float= readLine().toString().toFloat()
    val y: Float= readLine().toString().toFloat()

    if(x>0.0 && y>0.0) print("Q1")
    else if(x<0.0 && y>0.0) print("Q2")
    else if(x<0.0 && y<0.0) print("Q3")
    else if(x>0.0 && y<0.0) print("Q4")
    else print("Origem")

}