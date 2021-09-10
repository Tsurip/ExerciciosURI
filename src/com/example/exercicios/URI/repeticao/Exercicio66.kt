package com.example.exercicios.DI

fun main(){
    var par: Int = 0; var imp: Int = 0; var neg: Int = 0; var pos: Int = 0

    for(i in 1..5){
        val x: Int= readLine().toString().toInt()
        if(isEven(x)) par++; if (!isEven(x)) imp++; if(x<0) neg++; if (x>0) pos++
    }

    print("$par valor(es) par(es)\n$imp valor(es) impar(es)" +
            "\n$pos valor(es) positivo(s)\n$neg valor(es) negativo(s)")

}