package com.example.exercicios.sequencial

fun main(){
    val a: String = readLine().toString()
    val b: String = readLine().toString()
    val c: String = readLine().toString()

    val triangulo: Double = (a.toDouble()*c.toDouble())/2
    val circulo: Double = 3.14159*(c.toDouble()*c.toDouble())
    val trapezio: Double = ((a.toDouble()+b.toDouble())*c.toDouble())/2
    val quadrado: Double = b.toDouble()*b.toDouble()
    val retangulo: Double = a.toDouble()*b.toDouble()


    println("TRIANGULO: $triangulo\n" +
          "CIRCULO: $circulo\n" +
          "TRAPEZIO: $trapezio\n" +
          "QUADRADO: $quadrado\n" +
          "RETANGULO: $retangulo")


}