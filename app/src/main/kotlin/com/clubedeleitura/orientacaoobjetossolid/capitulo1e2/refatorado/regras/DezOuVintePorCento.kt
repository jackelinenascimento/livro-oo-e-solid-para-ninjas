package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras

class DezOuVintePorCento: RegraDeCalculo {
    override fun calcula(salarioBase: Double): Double {
        return if (salarioBase > 3000.0) {
            salarioBase * 0.8
        } else {
            salarioBase * 0.9
        }
    }
}