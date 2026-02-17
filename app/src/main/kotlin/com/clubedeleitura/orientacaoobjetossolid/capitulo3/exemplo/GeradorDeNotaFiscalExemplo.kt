package com.clubedeleitura.orientacaoobjetossolid.capitulo3.exemplo

class GeradorDeNotaFiscalExemplo(

    // Java para Kotlin
    // val comporta-se exatamente como uma private final (imutavel)
    // o compilador cria um campo privado e um metodo getter publico
    // acessa como fosse var direta mas na verdade esta chamando o metodo
    // criado o construtor que recebe esses dois parametros

    private val email: EnviadorDeEmailExemplo, //dependencia de classe concreta e instavel
    private val dao: NotaFiscalDaoExemplo // dependencia de classe concreta e instavel
) {
    fun gera(faturaExemplo: FaturaExemplo): NotaFiscalExemplo {
        val valor = faturaExemplo.valor

        val nf = NotaFiscalExemplo(
            valor = valor,
            imposto = impostoSimplesSobreO(valor)
        )

        email.enviaEmail(nf) // acoplamento de invocacao
        dao.persiste(nf) // rigidez e falta  de extensibilidade

        return nf

    }

    private fun impostoSimplesSobreO(valor: Double): Double {
        return valor * 0.06
    }
}