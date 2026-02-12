package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class QuinzeOuVinteCincoPorCentoTest {

    private val regra = QuinzeOuVinteCincoPorCentro()

    @Test
    fun `deve aplicar 25 porcento de desconto quando salario maior que 2000`() {
        val salario = regra.calcula(3000.0)
        assertEquals(2250.0, salario)
    }

    @Test
    fun `deve aplicar 15 porcento de desconto quando salario menor que 2000`() {
        val salario = regra.calcula(1500.0)
        assertEquals(1275.0, salario)
    }
}