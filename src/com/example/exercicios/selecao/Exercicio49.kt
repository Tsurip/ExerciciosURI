package com.example.exercicios.selecao

fun main(){
    val estrut: String= readLine().toString()
    val tipo: String= readLine().toString()
    val alimen: String= readLine().toString()

    if(estrut == "vertebrado"){
        if(tipo == "ave"){
            if(alimen == "carnívoro") {
                print("aguia")
            }
            else{
                print("pomba")
            }
        }
        else {
            if(alimen == "onívoro") {
                print("homem")
            }
            else{
                print("vaca")
            }
        }
    }
    else {
        if(tipo == "inseto"){
            if(alimen == "hematofago") {
                print("pulga")
            }
            else{
                print("largata")
            }
        }
        else {
            if(alimen == "hematofago") {
                print("sanguessuga")
            }
            else{
                print("minhoca")
            }
        }
    }
}