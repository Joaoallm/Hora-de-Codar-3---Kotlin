var soma = 0
fun main() {
    // 7 - Escreva um algoritmo para ler as notas de avaliações de um aluno,
    // calcule e imprima a média (simples) desse aluno.
    // Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
    // São 6 notas ao total.
    // Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido,
    // deve ser solicitado um novo valor ao usuário.


    for( i in 1..6){
        println("Informe as notas do aluno: ")
        var notas = readln().toInt()

    while (notas < 0 || notas > 10){
            println("Erro. Informe outro valor: ")
        notas = readln().toInt()
    }

        soma = (soma + notas)
    }

        var media: Double
        media = (soma/6.0)

        println("O resultado é: ${media}")
}
