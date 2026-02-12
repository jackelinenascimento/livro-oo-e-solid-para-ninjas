package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras

class QuinzeOuVinteCincoPorCentro : RegraDeCalculo {
    override fun calcula(salarioBase: Double): Double {
        return if (salarioBase > 2000.0){
            salarioBase * 0.75
        } else {
            salarioBase * 0.85
        }
    }
}