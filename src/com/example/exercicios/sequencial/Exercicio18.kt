package com.example.exercicios.sequencial

fun main(){
    val n: Int = readLine().toString().toInt()
    var memo: Int = n

    val n100: Int = memo/100; memo -= n100*100
    val n50: Int = memo/50; memo -= n50 * 50
    val n20: Int = memo/20; memo -= n20*20
    val n10: Int = memo/10; memo -= n10*10
    val n5: Int = memo/5; memo -= n5*5
    val n2: Int = memo/2; memo -= n2*2
    val n1: Int = memo

    print("$n \n$n100 nota(s) de R$ 100,00 \n$n50  nota(s) de R$ 50,00 \n$n20 nota(s) de R$ 20,00 " +
          "\n$n10  nota(s) de R$ 10,00 \n$n5  nota(s) de R$ 5,00 \n$n2  nota(s) de R$ 2,00" +
          "\n$n1  nota(s) de R$ 1,00")

}
