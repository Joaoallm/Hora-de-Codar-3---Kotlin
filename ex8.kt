fun main() {
    // 8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
    // Considere que o N será sempre maior que ZERO.
    //N  é um valor informado pelo usuário

    println("Informe um valor: ")
    val n = readln().toInt()

    for (i in 1 ..n)
        println(i)


}