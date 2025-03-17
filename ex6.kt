var aprovados = 0
fun main() {
    executarPrograma()
}
    // 6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
    // Considere que a nota de aprovação é 9,5.
    // Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?"
    // e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente,
    // caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

    fun executarPrograma(){
    println("Informe duas notas do aluno: ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val media = ((n1+n2)/2)

    println("A media final do aluno é: $media")

    if(media < 9.5){
        println("O aluno foi reprovado")
    }
    else{
        println("O aluno foi aprovado")
        aprovados+=1
    }

    println("Calcular a média de outro aluno 1. Sim/2. Não?")

    val opçao = readln().toInt()

    when(opçao){
        1 ->{
            println("1. Sim")
            executarPrograma()
        }
        2 ->{
            println("2. Nao")
            println("$aprovados foram aprovados")
        }
    }





}