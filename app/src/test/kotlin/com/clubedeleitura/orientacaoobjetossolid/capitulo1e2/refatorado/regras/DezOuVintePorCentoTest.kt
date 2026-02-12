package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado.regras

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DezOuVintePorCentoTest {

    private val regra = DezOuVintePorCento()

    @Test
    fun `deve aplicar 20 porcento de desconto quando salario maior que 3000`() {
        val salario = regra.calcula(4000.0)
        assertEquals(3200.0, salario)
    }

    @Test
    fun `deve aplicar 10 porcento de desconto quando salario menor que 3000`() {
        val salario = regra.calcula(1000.0)
        assertEquals(900.0, salario)
    }
}