package com.clubedeleitura.orientacaoobjetossolid.capitulo6.refatorado

class ContaComum (
    private var saldo: Double = 0.0,
    private val rendimento: RegraRendimento
) {

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        saldo -= valor
    }

    fun rende(){
        saldo = rendimento.aplicar(saldo)
    }
}

class RendimentoContaComum : RegraRendimento {
    override fun aplicar(saldo: Double): Double {
        return saldo * 1.1
    }
}