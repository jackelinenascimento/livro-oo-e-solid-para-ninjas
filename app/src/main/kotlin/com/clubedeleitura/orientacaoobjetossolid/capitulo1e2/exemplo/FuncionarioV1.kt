package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.exemplo

data class FuncionarioV1(
    val nome: String,
    val salarioBase: Double,
    val cargo: CargoV1
)

enum class CargoV1 {
    DESENVOLVEDOR,
    DBA,
    TESTER
}
