import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco()
    val objeto = Any = Any()

    imprime(objeto)

    val teste: Any = imprime(endereco)
    println(teste)

    fun imprime(valor: Any) : Any{
        println(valor)
        return valor
    }
}