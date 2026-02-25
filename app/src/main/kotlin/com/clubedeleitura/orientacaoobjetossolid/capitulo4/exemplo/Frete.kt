package com.clubedeleitura.orientacaoobjetossolid.capitulo4.exemplo

// em caso de novas cidades, necessario adicionar a condicional

class Frete {
    fun para(cidade: String): Double {
        return if (cidade.uppercase() == "SAO PAULO") 15.0 else 30.0
    }
}