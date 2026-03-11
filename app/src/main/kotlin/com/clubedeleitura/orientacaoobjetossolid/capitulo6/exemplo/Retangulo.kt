package com.clubedeleitura.orientacaoobjetossolid.capitulo6.exemplo

// open permite herança em Kotlin
// open fun permite sobrescrever o metodo

open class Retangulo (
    private var x : Int = 0,
    private var y : Int = 0
) {

    open fun area(): Int {
        return this.x * this.y
    }

    open fun comprimento(): Int {
        return this.x * 2 + this.y * 2
    }
}