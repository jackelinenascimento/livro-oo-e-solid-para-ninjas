package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.exemplo


class CalculadoraDeSalarioV1 {
    fun calcula(funcionario: FuncionarioV1): Double{
        return when (funcionario.cargo) {
            CargoV1.DESENVOLVEDOR -> dezOuVintePorcento(funcionario)
            CargoV1.DBA, CargoV1.TESTER -> quinzeOuVinteCincoPorcento(funcionario)
            else -> {
                throw RuntimeException("funcionario invalido")
            }
        }
    }

    private fun dezOuVintePorcento(funcionario: FuncionarioV1): Double {
        return if (funcionario.salarioBase > 3000.0) {
            funcionario.salarioBase * 0.8
        } else {
            funcionario.salarioBase * 0.9
        }
    }

    private fun quinzeOuVinteCincoPorcento(funcionario: FuncionarioV1): Double {
        return if (funcionario.salarioBase > 2000.0) {
            funcionario.salarioBase * 0.75
        } else {
            funcionario.salarioBase * 0.85
        }
    }

}