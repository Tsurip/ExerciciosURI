package com.example.exercicios.sequencial

fun main(){
    val n: Double = readLine().toString().toDouble()
    var memo: Double = n

    //Notas
    val n100: Int = (memo/100).toInt(); memo %= 100
    val n50: Int = (memo/50).toInt(); memo%= 50
    val n20: Int = (memo/20).toInt(); memo%= 20
    val n10: Int = (memo/10).toInt(); memo%= 10
    val n5: Int = (memo/5).toInt(); memo%= 5
    val n2: Int = (memo/2).toInt(); memo%= 2
    memo *= 100
    //Moedas
    val m100: Int = (memo/100).toInt(); memo %= 100
    val m50: Int = (memo/50).toInt(); memo%= 50
    val m25: Int = (memo/25).toInt(); memo%= 25
    val m10: Int = (memo/10).toInt(); memo%= 10
    val m5: Int = (memo/5).toInt(); memo%= 5
    val m1: Int = (memo/1).toInt(); memo%= 1
    
    print("NOTAS: \n$n \n$n100 nota(s) de R$ 100,00 \n$n50  nota(s) de R$ 50,00 \n$n20 nota(s) de R$ 20,00 " +
            "\n$n10  nota(s) de R$ 10,00 \n$n5  nota(s) de R$ 5,00 \n$n2  nota(s) de R$ 2,00")

    print("\n MOEDAS:\n$m100 moeda(s) de R$ 1,00 \n$m50  moeda(s) de R$ 0,50 \n$m25 moeda(s) de R$ 0,25 " +
            "\n$m10  moeda(s) de R$ 0,10 \n$m5  moeda(s) de R$ 0,05 \n$m1  moeda(s) de R$ 0,01")

}