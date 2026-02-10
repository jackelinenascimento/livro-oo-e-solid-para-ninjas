package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado

class QuinzeOuVinteCincoPorCentro : RegraDeCalculo {
    override fun calcula(funcionario: Funcionario): Double {
        return if (funcionario.salarioBase > 2000.0){
            funcionario.salarioBase * 0.75
        } else {
            funcionario.salarioBase * 0.85
        }
    }
}