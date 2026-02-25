package com.clubedeleitura.orientacaoobjetossolid.capitulo4.refatorado

class Frete1: ServicoDeEntrega {
    override fun para(cidade: String): Double {
        require(cidade.isNotBlank()) { "Cidade não pode ser vazia" }

        return if (cidade.equals("SAO PAULO", ignoreCase = true)) 15.0 else 30.0
    }
}