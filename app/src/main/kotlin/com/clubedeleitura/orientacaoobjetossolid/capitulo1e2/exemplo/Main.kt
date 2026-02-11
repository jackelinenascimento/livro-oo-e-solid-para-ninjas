package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.exemplo

fun main() {
    val desenvolvedor = FuncionarioV1(
        nome = "Ana Caroline",
        salarioBase = 7500.0,
        cargo = CargoV1.DESENVOLVEDOR
    )

    val dba = FuncionarioV1(
        nome = "Joao Augusto",
        salarioBase = 5000.0,
        cargo = CargoV1.DBA
    )

    val calculadora = CalculadoraDeSalarioV1()

    val salarioDev = calculadora.calcula(desenvolvedor)
    val salarioDba = calculadora.calcula(dba)

    println("salario dev $salarioDev")
    println("salario dba $salarioDba")
}