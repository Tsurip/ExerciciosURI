package com.example.exercicios.selecao

fun main(){
    val n1 = readLine().toString().toInt()
    val n2 = readLine().toString().toInt()
    val n3 = readLine().toString().toInt()
    var menor = 0
    var meio = 0
    var maior = 0

    if (n1>n2 && n1>n3) {maior = n1; if(n2>n3){meio=n2; menor=n3} else {meio=n3; menor=n2}}
    if (n2>n1 && n2>n3) {maior = n2; if(n1>n3){meio=n1; menor=n3} else {meio=n3; menor=n1}}
    if (n3>n2 && n3>n1) {maior = n3; if(n1>n2){meio=n1; menor=n2} else {meio=n2; menor=n1}}

    println("$menor \n$meio \n$maior \n\n$n1 \n$n2 \n$n3")
}