fun main (){
    // 5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros
    // informados pelo usuário e todos os números inteiros entre eles.
    // Considere que o primeiro sempre será menor que o segundo.

    println("Informe dois valores: ")
        val n1 = readln().toInt()
        val n2 = readln().toInt()

        println("A media dos dois valores informados é: ${(n1 + n2) / 2}")

        val media = (n1..n2).average() // --> .average() calcula a média diretamente para o intervalo n1..n2,
                                                    // sem precisar calcular soma e quantidade manualmente.
        println("A media dos valores entre eles é: ${media}")
    }
