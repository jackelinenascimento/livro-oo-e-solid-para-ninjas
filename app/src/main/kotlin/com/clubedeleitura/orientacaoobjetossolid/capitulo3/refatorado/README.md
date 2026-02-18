# 🚀 Gerador de Nota Fiscal - Versão Refatorada (SOLID & Clean Arch)

Este módulo apresenta a solução para os problemas de acoplamento identificados no Capítulo 3 do livro *Orientação a Objetos e SOLID para Ninjas*. A implementação evoluiu de um design rígido para uma arquitetura baseada em **Inversão de Dependência (DIP)** e **Ports and Adapters**.

## 🏗️ A Nova Estrutura (Clean Architecture)

A aplicação foi dividida em camadas para garantir que a regra de negócio seja o centro do sistema, agnóstica a frameworks e detalhes de infraestrutura.



### 📂 Organização de Pastas
* **`domain`**: Onde reside a verdade do negócio.
    * `entity`: Objetos de valor e entidades (`Fatura`, `NotaFiscal`).
    * `port`: Interfaces que definem os contratos de saída (`AcaoAposGerarNota`).
* **`service.usecase`**: Orquestra a lógica de negócio (`GeradorDeNotaFiscalUseCase`).
* **`adapters`**: Implementações técnicas (detalhes).
    * `web`: Controlador REST e DTOs de entrada (`FaturaRequest`).
    * `mail`: Adaptador para envio de e-mails.
    * `persistence`: Adaptador para banco de dados (`NotaFiscalDao`).

## 🛠️ Tecnologias Utilizadas
* **Kotlin**: Linguagem principal.
* **Spring Boot 3.x**: Gerenciamento de Injeção de Dependência (IoC) e exposição da API.
* **Jakarta Validation**: Garantia de integridade dos dados na entrada (Bean Validation).
* **MockK & JUnit 5**: Testes unitários e de integração.

## 💡 Princípios Aplicados

### 1. Inversão de Dependência (DIP)
O `GeradorDeNotaFiscalUseCase` não depende mais de classes concretas. Ele depende da interface `AcaoAposGerarNota`. Isso inverte a seta de dependência: a infraestrutura agora depende do domínio.

### 2. Princípio Aberto/Fechado (OCP)
O sistema está aberto para extensões mas fechado para modificações. Para adicionar uma nova ação (ex: enviar SMS), basta criar um novo `@Component` que implemente a interface de porta. O Spring o injetará automaticamente na lista de ações.

## 🧪 Testes de Qualidade
* **Unitários**: Testam o UseCase isoladamente usando Mocks.
* **Integração**: Validam o `NotaFiscalController` e o bloqueio de entradas inválidas (valores negativos).

---

## 🏃 Como Executar
1. **Subir a aplicação**: `./gradlew bootRun`
2. **Gerar Nota (Sucesso)**:
   ```bash
   curl -X POST http://localhost:8080/notas-fiscais -H "Content-Type: application/json" -d '{"valor": 1000.0}'