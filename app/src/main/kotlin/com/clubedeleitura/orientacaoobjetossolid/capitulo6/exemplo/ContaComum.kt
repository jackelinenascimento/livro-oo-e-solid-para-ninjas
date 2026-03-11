package com.clubedeleitura.orientacaoobjetossolid.capitulo6.exemplo

// open permite herança em Kotlin
// open fun permite sobrescrever o metodo

open class ContaComum (
    protected var saldo: Double = 0.0
) {

    fun depositar(valor: Double) {
        saldo += valor
    }

    open fun sacar(valor: Double) {
        saldo -= valor
    }

    open fun rende(){
        this.saldo *= 1.1
    }
}