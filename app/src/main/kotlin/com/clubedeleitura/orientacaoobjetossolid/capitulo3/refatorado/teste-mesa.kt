package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.mail.EnviadorDeEmail
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.persistence.NotaFiscalDao
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.Fatura
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.service.usecase.GeradorDeNotaFiscalUseCase

fun main() {
    // instanciar adaptadores
    val email = EnviadorDeEmail()
    val dao = NotaFiscalDao()

    // lista de acoes baseada na interface
    val acoes = listOf(email, dao)

    // instanciar o caso de uso
    val gerador = GeradorDeNotaFiscalUseCase(acoes)

    // regra de negocio
    val fatura = Fatura(valor = 5000.0)

    println("Iniciando processo de geração de nota fiscal")
    val nf = gerador.gerarNota(fatura)

    println("--- Resumo Final ---")
    println("Valor da Nota: R$ ${nf.valor}")
    println("Imposto Calculado: R$ ${nf.imposto}")
    println("Processo concluído com sucesso!")
}