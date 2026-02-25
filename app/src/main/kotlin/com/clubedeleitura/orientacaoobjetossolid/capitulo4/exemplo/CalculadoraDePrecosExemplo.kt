package com.clubedeleitura.orientacaoobjetossolid.capitulo4.exemplo

class CalculadoraDePrecosExemplo {

    fun calcula(compra: Compra): Double {
        val tabela = TabelaDePrecoPadrao()
        val correios = Frete()

        val desconto = tabela.descontoPara(compra.valor)
        val frete = correios.para(compra.cidade)

        return compra.valor * (1 - desconto) + frete
    }
}