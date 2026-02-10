package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado

class CalculadoraDeSalario {
    fun calcula(funcionario: Funcionario): Double {
        return when (funcionario.cargo) {
            Cargo.DESENVOLVEDOR ->
                DezOuVintePorCento().calcula(funcionario)
            Cargo.DBA, Cargo.TESTER ->
                QuinzeOuVinteCincoPorCentro().calcula(funcionario)
            else -> throw RuntimeException("Funcionario inválido!")
        }
    }
}