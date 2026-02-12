package com.clubedeleitura.orientacaoobjetossolid.capitulo1e2.refatorado

fun main() {
    val desenvolvedor = Funcionario(
        nome = "Ana Caroline",
        salarioBase = 7500.0,
        cargo = Cargo.DESENVOLVEDOR
    )

    val dba = Funcionario(
        nome = "Joao Augusto",
        salarioBase = 5000.0,
        cargo = Cargo.DBA
    )

    val tester = Funcionario(
        nome = "Jane Doe",
        salarioBase = 5000.0,
        cargo = Cargo.TESTER
    )


    val salarioDev = desenvolvedor.calculaSalario()
    val salarioDba = dba.calculaSalario()
    val salarioTester = tester.calculaSalario()

    println("salario dev $salarioDev")
    println("salario dba $salarioDba")
    println("salario tester $salarioTester")
}