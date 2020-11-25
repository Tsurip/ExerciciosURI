package com.example.exercicios.selecao

fun main(){
    var diaTotal=0; var horaTotal=0; var minTotal=0; var segTotal=0
    val sDiaI= readLine().toString().split(" ")
    val sHoraI= readLine().toString().split(":")
    val sDiaF= readLine().toString().split(" ")
    val sHoraF= readLine().toString().split(":")

    val diaI= sDiaI[1].toInt();val diaF= sDiaF[1].toInt()
    val horaI= sHoraI[0].toInt();val minI= sHoraI[1].toInt();val segI= sHoraI[2].toInt();
    val horaF= sHoraF[0].toInt();val minF= sHoraF[1].toInt();val segF= sHoraF[2].toInt();

    when {
        segF < segI -> {segTotal += (60 - segI) + segF; minTotal--;}
        segF > segI -> segTotal += segF - segI
        else -> segTotal = 0
    }

    when {
        minF < minI -> {minTotal += (60 - minI) + minF; horaTotal--;}
        minF > minI -> minTotal += minF - minI
        else -> minTotal = 0
    }

    when {
        horaF < horaI -> {horaTotal += (24 - horaI) + horaF; diaTotal--;}
        horaF > horaI -> horaTotal += horaF - horaI
        else -> horaTotal = 0
    }

    when {
        diaF < diaI -> diaTotal += (30 - diaI) + diaF
        diaF > diaI -> diaTotal += diaF - diaI
        else -> diaTotal = 0
    }

    print("$diaTotal dia (s)\n$horaTotal hora (s)\n$minTotal minuto (s)\n$segTotal segundo (s)")
}
