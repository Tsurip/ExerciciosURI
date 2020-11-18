package com.example.exercicios.selecao

fun main(){
    val n1: Float= readLine().toString().toFloat()
    val n2: Float= readLine().toString().toFloat()
    val n3: Float= readLine().toString().toFloat()
    val n4: Float= readLine().toString().toFloat()
    val nExame: Float

    var media: Float= ((n1*0.2)+(n2*0.3)+(n3*0.4)+(n4*0.1)).toFloat()

    when (media){
        in 0.0..5.0 -> print("Media: $media \nAluno reprovado")
        in 5.0..7.0 ->{
            print("Media: $media \nAluno em exame\n")
            nExame = readLine().toString().toFloat()
            media= (media+nExame)/2
            if(media>=5.0) println("Nota do exame: $nExame \nAluno aprovado \nMedia final: $media")
            else println("Nota do exame: $nExame \nAluno reprovado \nMedia final: $media")
        }
        in 7.0..10.0 -> print("Media: $media \nAluno aprovado")

    }


}