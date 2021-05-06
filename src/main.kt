import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaAutenticacaoTiposDiferentes

fun main() {
    val endereco = Endereco()

    val objeto: Any = Any()

    imprime(Any())
    imprime(1)
    imprime(1.0)
    val teste : Any = imprime(endereco)
    println(teste)

    testaFuncionarios()

    testaAutenticacaoTiposDiferentes()
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}

