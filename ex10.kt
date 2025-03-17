fun main() {

    var dentro = 0
    var fora = 0

    for (i in 1..10) {
        println("Informe 10 valores: ")
        val valores = readln().toInt()

        if (valores >= 24 && valores <= 42) {
            dentro += 1
        }
        else{
            fora += 1
        }
        println("Os valores informados foram: $${valores}")
    }
    println("Os valores entre 24 e 42 é: $dentro. E os valores fora sao: $fora")
}