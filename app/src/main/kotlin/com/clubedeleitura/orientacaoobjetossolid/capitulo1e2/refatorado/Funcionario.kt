package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado

import com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras.DezOuVintePorCento
import com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras.QuinzeOuVinteCincoPorCentro
import com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras.RegraDeCalculo

data class Funcionario(
    val nome: String,
    val salarioBase: Double,
    val cargo: Cargo
) {
    fun calculaSalario(): Double {
        return cargo.regraDeCalculo.calcula(salarioBase)
    }
}

enum class Cargo(val regraDeCalculo: RegraDeCalculo) {
    DESENVOLVEDOR(DezOuVintePorCento()),
    DBA(QuinzeOuVinteCincoPorCentro()),
    TESTER(QuinzeOuVinteCincoPorCentro())
}
