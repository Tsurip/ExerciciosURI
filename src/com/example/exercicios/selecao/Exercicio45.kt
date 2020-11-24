package com.example.exercicios.selecao

import kotlin.math.pow

fun main(){
    val a: Double= readLine().toString().toDouble()
    val b: Double= readLine().toString().toDouble()
    val c: Double= readLine().toString().toDouble()

    if(a>(b+c)) println("Não forma triângulo")
    if(a.pow(2)==(b.pow(2)+c.pow(2))) println("Triângulo retângulo")
    if(a.pow(2)>(b.pow(2)+c.pow(2))) println("Triângulo obtusângulo")
    if(a.pow(2)<(b.pow(2)+c.pow(2))) println("Triângulo acutângulo")
    if(a == b && a == c) println("Triângulo equilátero")
    if(a == b && a!=c || a == c && a!=b || b==c && b!=a) println("Triângulo isóceles")
    if(a!=b && b!=c && c!=a) println("Triângulo escaleno")
}

