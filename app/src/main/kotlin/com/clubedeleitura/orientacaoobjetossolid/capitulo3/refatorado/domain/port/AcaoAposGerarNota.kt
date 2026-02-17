package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.port

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.NotaFiscal

interface AcaoAposGerarNota {
    fun executa(nf: NotaFiscal)
}