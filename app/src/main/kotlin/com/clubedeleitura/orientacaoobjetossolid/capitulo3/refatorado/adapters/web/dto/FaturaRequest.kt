package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.web.dto

import jakarta.validation.constraints.Positive

data class FaturaRequest(
    @field:Positive(message = "O valor da fatura deve ser maior que zero")
    val valor: Double
)