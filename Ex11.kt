fun main(){
    // 11 - Escreva um programa para imprimir todas as tabuadas
    // de 1 a N. N será informado pelo usuário.

    println("Informe o valor da tabuada desejada: ")
    val n1 = readln().toInt()

    for (a in 1..n1){
        println("Tabuada do $a")

     for (b in 1..10)  {
         println("$a x $b = ${a * b}")

     }
        println()
    }

}

