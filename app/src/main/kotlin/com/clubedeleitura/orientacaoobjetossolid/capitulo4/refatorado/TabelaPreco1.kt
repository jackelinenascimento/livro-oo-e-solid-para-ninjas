package com.clubedeleitura.orientacaoobjetossolid.capitulo4.refatorado

// tabela de preco para acima de 5000

class TabelaPreco1 : TabelaDePreco {
    override fun descontoPara(valor: Double): Double{
        if (valor < 5000) {
            throw IllegalArgumentException("Valor mínimo para esta tabela é R$ 5000,00")
        }
        return 0.03
    }
}