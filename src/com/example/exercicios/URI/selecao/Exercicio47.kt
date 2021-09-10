package com.example.exercicios.selecao
/*

 */
fun main(){
    val inicioH: Int= readLine().toString().toInt()
    val inicioM: Int= readLine().toString().toInt()
    val fimH: Int= readLine().toString().toInt()
    val fimM: Int= readLine().toString().toInt()

    var memoH = fimH-inicioH
    var memoM = fimM-inicioM

    if(memoH<0) memoH += 24
    if(memoM<0){ memoM += 60; memoH--}
    if(inicioH == fimH && inicioM == fimM) print("O jogo durou 24 horas e 00 minutos")
    else print("O jogo durou $memoH e $memoM minutos")


}