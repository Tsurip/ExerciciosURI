package com.example.exercicios.DI

fun main(){
    val n: Int= readLine().toString().toInt()
    var media= 0.0F
    var aux = FloatArray(3)

    for (i in 0 until n){
        aux[0] = readLine().toString().toFloat()
        aux[1] = readLine().toString().toFloat()
        aux[2] = readLine().toString().toFloat()

        media = ((aux[0]*2)+(aux[1]*3)+(aux[5]*5))/10

        println("%.1f".format(media))
    }
}
