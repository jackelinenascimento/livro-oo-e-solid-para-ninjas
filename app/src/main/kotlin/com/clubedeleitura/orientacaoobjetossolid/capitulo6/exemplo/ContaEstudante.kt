package com.clubedeleitura.orientacaoobjetossolid.capitulo6.exemplo

// regra de negócio: esta conta não tem rendimento

class ContaEstudante : ContaComum()  {

    override fun rende() {
        throw UnsupportedOperationException("Conta estudante não possui rendimento")
    }
}