package com.clubedeleitura.orientacaoobjetossolid.capitulo3.exemplo

fun main() {
    //instanciar as dependencias
    val enviadorEmail = EnviadorDeEmailExemplo()
    val notaFiscalDaoExemplo = NotaFiscalDaoExemplo()

    //injetar as depependencias
    val gerador = GeradorDeNotaFiscalExemplo(
        enviadorEmail,
        notaFiscalDaoExemplo
    )

    //criacao de dados da fatura
    val faturaExemplo = FaturaExemplo(4500.0)

    //chamada metodo de negocio
    println("Gerando nova fiscal para fatura $faturaExemplo")
    val nf = gerador.gera(faturaExemplo)

    //verifica resultado
    println("Nota fiscal gerada com sucesso!")
    println("Dados da fatura: $nf")
}