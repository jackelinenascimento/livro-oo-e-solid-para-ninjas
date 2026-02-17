package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.web

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.web.dto.FaturaRequest
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.Fatura
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.service.usecase.GeradorDeNotaFiscalUseCase
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notas-fiscais")
class NotaFiscalController(
    private val geradorUseCase: GeradorDeNotaFiscalUseCase
) {
    @PostMapping
    fun gerar(@Valid @RequestBody request: FaturaRequest): String {
        val fatura = Fatura(request.valor)
        val nf = geradorUseCase.gerarNota(fatura)

        return "Nota Fiscal emitida com sucesso! Valor: ${nf.valor} - Imposto: ${nf.imposto}"
    }
}
