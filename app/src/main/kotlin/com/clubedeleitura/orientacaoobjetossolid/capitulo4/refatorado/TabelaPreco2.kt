package com.clubedeleitura.orientacaoobjetossolid.capitulo4.refatorado

// tabela de preco para acima de 1000

class TabelaPreco2 : TabelaDePreco {
    override fun descontoPara(valor: Double): Double{
        if (valor < 1000) {
            throw IllegalArgumentException("Valor mínimo para esta tabela é R$ 1000,00")
        }
        return 0.05
    }
}