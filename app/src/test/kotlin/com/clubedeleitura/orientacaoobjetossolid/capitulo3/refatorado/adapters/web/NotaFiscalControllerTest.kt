package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado.adapters.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
class NotaFiscalControllerTest @Autowired constructor(
    val mockMvc: MockMvc
) {

    @Test
    fun `deve retornar 200 ao enviar fatura valida`() {
        mockMvc.post("/notas-fiscais") {
            contentType = MediaType.APPLICATION_JSON
            content = """{ "valor": 2000.0 }"""
        }.andExpect {
            status { isOk() }
        }
    }

    @Test
    fun `deve retornar 400 se o valor for negativo devido ao Bean Validation`() {
        mockMvc.post("/notas-fiscais") {
            contentType = MediaType.APPLICATION_JSON
            content = """{ "valor": -50.0 }"""
        }.andExpect {
            status { isBadRequest() }
        }
    }
}