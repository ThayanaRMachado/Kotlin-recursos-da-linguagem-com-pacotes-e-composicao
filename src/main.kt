import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaAutenticacaoTiposDiferentes

fun main() {
    val endereco = Endereco(
        logradouro = "Vila Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Vila Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo))

    //hashCode-Faz a identificação real do objeto
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    //toString - Retorna a representação do objeto
    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}

