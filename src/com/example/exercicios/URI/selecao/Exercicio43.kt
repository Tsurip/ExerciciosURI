package com.example.exercicios.selecao

fun main(){
    val a: Float = readLine().toString().toFloat()
    val b: Float = readLine().toString().toFloat()
    val c: Float = readLine().toString().toFloat()

    if(a<(b+c) && b<(a+c) && c<(a+b))
    {
        val perim= a+b+c
        print("Perímetro = $perim")
    } else {
        val area= ((a+b)*c)/2
        print("Área = $area")
    }

}