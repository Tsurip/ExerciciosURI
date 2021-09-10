package com.example.exercicios.selecao

fun main(){
    val inicio: Int= readLine().toString().toInt()
    val fim: Int= readLine().toString().toInt()

    if (inicio<fim) print("O jogo durou ${fim-inicio} horas")
    if (inicio==fim) print("O jogo durou 24 horas")
    if (inicio>fim) print("O jogo durou ${24-fim+inicio} horas")
}