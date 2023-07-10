package `005`

fun main() {
    val usuarios: Array<String> = arrayOf("Rafael", "Julia", "Pedro", "Vanessa")

    println("| nome |")
    println("--------")
    for (item in usuarios) {
        println("| $item")
    }
    println("--------")
}