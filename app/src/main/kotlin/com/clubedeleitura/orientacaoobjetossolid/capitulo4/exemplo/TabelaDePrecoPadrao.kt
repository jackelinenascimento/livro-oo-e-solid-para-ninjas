package com.clubedeleitura.orientacaoobjetossolid.capitulo4.exemplo

// para novas regras de desconto, necessario adicionar

class TabelaDePrecoPadrao {
    fun descontoPara(valor: Double): Double {
        return when {
            valor > 5000 -> 0.03
            valor > 1000 -> 0.05
            else -> 0.0
        }
    }
}
