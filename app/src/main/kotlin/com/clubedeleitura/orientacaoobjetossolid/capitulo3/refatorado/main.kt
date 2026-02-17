package com.clubedeleitura.orientacaoobjetossolid.capitulo3.refatorado

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    // Este método inicia o container do Spring, que:
    // 1. Escaneia suas pastas
    // 2. Encontra @Service, @Component e @RestController
    // 3. Resolve as dependências (Injeção de Dependência)
    // 4. Sobe o servidor Tomcat na porta 8080
    runApplication<Application>(*args)
}