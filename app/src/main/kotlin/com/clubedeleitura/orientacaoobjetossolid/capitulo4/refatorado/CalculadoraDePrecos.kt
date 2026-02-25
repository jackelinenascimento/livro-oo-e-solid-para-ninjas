package com.clubedeleitura.orientacaoobjetossolid.capitulo4.refatorado

import com.clubedeleitura.orientacaoobjetossolid.capitulo4.exemplo.Compra

// A CalculadoraDePrecos recebe TabelaDePreco e ServicoDeEntrega por injeção de dependência.
// Isso evita acoplamento com implementações concretas e permite trocar regras
// sem modificar a calculadora, seguindo o princípio Aberto-Fechado (OCP).

class CalculadoraDePrecos(
    private val tabela: TabelaDePreco,
    private val frete: ServicoDeEntrega
) {
    fun calcula(compra: Compra): Double {
        val desconto = tabela.descontoPara(compra.valor)
        val valorFrete = frete.para(compra.cidade)

        return compra.valor * (1 - desconto) + valorFrete
    }
}