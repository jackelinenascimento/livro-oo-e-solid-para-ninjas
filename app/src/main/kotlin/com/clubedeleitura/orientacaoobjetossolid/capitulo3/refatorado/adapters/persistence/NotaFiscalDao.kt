package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.persistence

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.NotaFiscal
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.port.AcaoAposGerarNota
import org.springframework.stereotype.Component

@Component
class NotaFiscalDao : AcaoAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("Simulando persistência no banco de dados...")
    }
}