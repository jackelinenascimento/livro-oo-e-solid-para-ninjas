# Exemplo: Gerador de Nota Fiscal (Versão Acoplada)

Este diretório contém a implementação inicial do `GeradorDeNotaFiscal`, conforme apresentado no início do **Capítulo 3** do livro *Orientação a Objetos e SOLID para Ninjas*.

O objetivo deste código é servir de contra-exemplo para ilustrar os problemas de um design com **alto acoplamento**.

## 💻 O Código (Kotlin)

```kotlin
class GeradorDeNotaFiscal(
    private val email: EnviadorDeEmail, 
    private val dao: NotaFiscalDao
) {
    fun gera(fatura: Fatura): NotaFiscal {
        val valor = fatura.valorMensal
        
        val nf = NotaFiscal(
            valor = valor,
            imposto = impostoSimplesSobreO(valor)
        )

        email.enviaEmail(nf)
        dao.persiste(nf)

        return nf
    }

    private fun impostoSimplesSobreO(valor: Double): Double = valor * 0.06
}
```

## 🚩 Problemas Identificados
### 1. Dependência de Classes Instáveis
Linhas: private val email: EnviadorDeEmail e private val dao: NotaFiscalDao

O GeradorDeNotaFiscal (uma classe de regra de negócio) depende diretamente de classes de infraestrutura.

Por que é um problema? Classes que lidam com e-mail ou base de dados são "instáveis" (mudam por motivos técnicos externos). Segundo o autor, uma classe estável nunca deve depender de uma instável. Se a biblioteca de e-mail mudar, a regra de negócio corre o risco de ser afetada.

### 2. Acoplamento de Invocação
Linhas: email.enviaEmail(nf) e dao.persiste(nf)

O Gerador não sabe apenas o que deve ser feito, ele sabe como o método da outra classe se chama.

Por que é um problema? Se o desenvolvedor responsável pelo DAO alterar o nome do método persiste para salvar, o GeradorDeNotaFiscal deixará de compilar. O acoplamento é tão forte que a mudança de um nome de método em um detalhe de implementação quebra o coração do sistema.

### 3. Violação do Princípio Aberto/Fechado (OCP)
Contexto: Adição de novas funcionalidades.

Se o negócio exigir que a nota seja enviada também por SMS ou para um sistema do governo:

Por que é um problema? Seríamos obrigados a alterar o construtor e o método gera para incluir a nova dependência. A classe não está "fechada para alteração", o que aumenta a probabilidade de introduzir bugs em lógicas que já estavam prontas (como o cálculo do imposto).

### 4. Dificuldade de Testabilidade
Contexto: Testes Unitários.

Para testar se o imposto de 6% está correto, o programador é obrigado a instanciar um NotaFiscalDao.

Por que é um problema? O teste tentará conectar-se a uma base de dados real. Isso torna os testes lentos, difíceis de configurar em ambientes de CI (Integração Contínua) e sujeitos a falhas por problemas de rede, e não por erro na lógica de negócio.

## 🎯 Conclusão Técnica
O código acima é rígido (difícil de mudar), frágil (quebra facilmente ao mexer em dependências) e imóvel (difícil de reaproveitar ou testar isoladamente). A solução apresentada no capítulo é a aplicação do DIP (Princípio de Inversão de Dependência), abstraindo as ações pós-geração para uma interface comum.