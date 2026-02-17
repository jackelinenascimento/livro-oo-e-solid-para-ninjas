package com.clubedeleitura.orientacaoobjetossolid.capitulo3.exemplo

fun main() {
    //instanciar as dependencias
    val enviadorEmail = EnviadorDeEmail()
    val notaFiscalDao = NotaFiscalDao()

    //injetar as depependencias
    val gerador = GeradorDeNotaFiscal(
        enviadorEmail,
        notaFiscalDao
    )

    //criacao de dados da fatura
    val fatura = Fatura(2500.0)

    //chamada metodo de negocio
    println("Gerando nova fiscal para fatura R$${fatura.valor}")
    val nf = gerador.gera(fatura)

    //verifica resultado
    println("Nota fiscal gerada com sucesso!")
    println("Dados da fatura: $nf")
}