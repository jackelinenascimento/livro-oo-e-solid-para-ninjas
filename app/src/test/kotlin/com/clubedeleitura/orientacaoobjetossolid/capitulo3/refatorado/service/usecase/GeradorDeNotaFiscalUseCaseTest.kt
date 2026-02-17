package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.service.usecase

import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.entity.Fatura
import com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.domain.port.AcaoAposGerarNota
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GeradorDeNotaFiscalUseCaseTest {

    @Test
    fun `deve gerar nota com imposto de 6 por cento e executar acoes`() {
        // GIVEN (Dado que...)
        val acao1 = mockk<AcaoAposGerarNota>(relaxed = true)
        val acao2 = mockk<AcaoAposGerarNota>(relaxed = true)
        val useCase = GeradorDeNotaFiscalUseCase(listOf(acao1, acao2))
        val fatura = Fatura(valor = 1000.0)

        // WHEN (Quando...)
        val nf = useCase.gerarNota(fatura)

        // THEN (Então...)
        assertEquals(1000.0, nf.valor)
        assertEquals(60.0, nf.imposto) // 6% de 1000

        // Verifica se o contrato foi respeitado: as ações foram chamadas?
        verify(exactly = 1) { acao1.executa(nf) }
        verify(exactly = 1) { acao2.executa(nf) }
    }
}