package com.clubedeleitura.orientacaoobjetossolid.capitulo4.refatorado

import com.clubedeleitura.orientacaoobjetossolid.capitulo4.exemplo.Compra

class TesteDeMesa {

    fun executar() {
        val tabela = TabelaPreco2()
        val frete = Frete1()

        val calculadoraDePrecos = CalculadoraDePrecos(tabela, frete)

        val compra = Compra(
            valor = 2000.0,
            cidade = "Sao Paulo"
        )

        val total = calculadoraDePrecos.calcula(compra)
        println("Total calculado: $total")
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            TesteDeMesa().executar()
        }
    }
}