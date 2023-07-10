package `004`

fun main() {
    println("Qual seu nome?")
    var nome: String? = null
    nome = readlnOrNull().toString()
    println("Bom dia, $nome!")
}