# Capítulo 7 — Interface Segregation Principle (ISP)

Neste capítulo aprendemos sobre o **Interface Segregation Principle**, um dos princípios do **SOLID**.

O princípio afirma:

> Nenhum cliente deve ser forçado a depender de métodos que não utiliza.

Ou seja, **interfaces devem ser pequenas e específicas**.

---

## Problema: Interface grande demais

Imagine uma interface para cálculo de impostos.

```kotlin
interface Imposto {

    fun calculaParaPessoaFisica(valor: Double): Double

    fun calculaParaEmpresa(valor: Double): Double
}
```
Agora implementamos um imposto que só existe para pessoa física.

```kotlin
class ImpostoPessoaFisica : Imposto {

    override fun calculaParaPessoaFisica(valor: Double): Double {
        return valor * 0.1
    }

    override fun calculaParaEmpresa(valor: Double): Double {
        throw UnsupportedOperationException()
    }
}
```

O problema aparece rapidamente.

A classe foi obrigada a implementar um método que não faz sentido para ela.

Isso indica que a interface está grande demais.

---

## Aplicando o Interface Segregation Principle

A solução é dividir a interface em interfaces menores.

```kotlin
interface ImpostoPessoaFisica {

    fun calcula(valor: Double): Double
}

interface ImpostoEmpresa {

    fun calcula(valor: Double): Double
}
```

---

## Implementações

Agora cada imposto implementa apenas o que precisa.

Imposto para pessoa física

```kotlin
class IRPF : ImpostoPessoaFisica {

    override fun calcula(valor: Double): Double {
        return valor * 0.1
    }
}
```

---

Imposto para empresas

```kotlin
class ImpostoCorporativo : ImpostoEmpresa {

    override fun calcula(valor: Double): Double {
        return valor * 0.2
    }
}
```

---

## Uso

```kotlin
fun calculaImposto(valor: Double, imposto: ImpostoPessoaFisica): Double {
return imposto.calcula(valor)
}

fun main() {

    val imposto = IRPF()

    val resultado = calculaImposto(1000.0, imposto)

    println(resultado)
}
```

---

## Benefícios do ISP

Quando aplicamos o Interface Segregation Principle:

- evitamos interfaces grandes
- classes implementam apenas o que precisam
- reduzimos acoplamento
- facilitamos manutenção do código

---

## Exemplo com DDD — Repositórios

Em sistemas que seguem **Domain-Driven Design (DDD)**, é comum termos interfaces de repositório responsáveis por acessar dados do domínio.

Um exemplo simples seria:

```kotlin
interface ProdutoRepository {

    fun buscaPorId(id: Int): Produto

    fun todos(): List<Produto>

    fun salva(produto: Produto)

    fun remove(produto: Produto)
}
```