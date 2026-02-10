package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado

data class Funcionario(
    val nome: String,
    val salarioBase: Double,
    val cargo: Cargo
)

enum class Cargo(regraDeCalculo: RegraDeCalculo) {
    DESENVOLVEDOR(DezOuVintePorCento()),
    DBA(QuinzeOuVinteCincoPorCentro()),
    TESTER(QuinzeOuVinteCincoPorCentro())
}
