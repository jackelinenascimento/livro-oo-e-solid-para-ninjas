package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.service.usecase

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.Fatura
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.NotaFiscal
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.port.AcaoAposGerarNota
import org.springframework.stereotype.Service

@Service
class GeradorDeNotaFiscalUseCase(
    private val acoes: List<AcaoAposGerarNota>
) {
    fun gerarNota(fatura: Fatura): NotaFiscal {
        val valor = fatura.valor
        
        val nf = NotaFiscal(
            valor = valor,
            imposto = calculaImposto(valor)
        )

        acoes.forEach { it.executa(nf) }

        return nf
    }

    private fun calculaImposto(valor: Double): Double {
        return valor * 0.06
    }
}