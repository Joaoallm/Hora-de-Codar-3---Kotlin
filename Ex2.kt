fun main() {
    //2 - Escreva um algoritmo para ler 2 valores informados pelo usuário
    // e enquanto o segundo valor informado for igual ou menor que ZERO,
    // deve ser lido um novo valor, mas para a mesma variável.
    // Ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.

    // O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.

    println("Informe dois valores: ")
    val n1: Int = readln().toInt()
    var n2: Int = readln().toInt()

    while (n2 <= 0) {
        println("Erro, informe outro valor: ")
        n2 = readln().toInt()
    }
            print("A duvisao dos valores é igual a: ${n1 / n2}")
        }









