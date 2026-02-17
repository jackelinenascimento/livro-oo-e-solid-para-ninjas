package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.mail

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.NotaFiscal
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.port.AcaoAposGerarNota
import org.springframework.stereotype.Component

@Component
class EnviadorDeEmail : AcaoAposGerarNota {
    override fun executa(nf: NotaFiscal) {
        println("Simulando envio de e-mail para NF de valor: ${nf.valor}")
    }
}