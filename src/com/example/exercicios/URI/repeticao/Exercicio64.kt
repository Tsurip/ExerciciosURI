package com.example.exercicios.DI

fun main(){
   var pos = 0; var total = 0.0F
    var media: Float; val num= FloatArray(6)

    for (i in 0..5){
        num[i] = readLine().toString().toFloat()

        if(num[i] > 0){
            total += num[i]
            pos++
        }
    }
    media = total/pos

    print("$pos valor(es) positivo(s) \n$media")
}