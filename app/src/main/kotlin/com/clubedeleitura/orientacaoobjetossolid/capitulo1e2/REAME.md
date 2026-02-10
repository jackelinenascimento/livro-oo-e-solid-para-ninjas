# Resumo — Orientação a Objetos e SOLID para Ninjas

## Capítulo 1 — Orientação a Objetos, para que te quero?

### 💡 Ideia central
Orientação a Objetos (OO) vai muito além de usar classes, herança e polimorfismo. O verdadeiro objetivo da OO é **projetar sistemas fáceis de evoluir, manter e estender**.

### 🧠 Procedural vs Orientado a Objetos
- **Programação Procedural**
    - Foco no algoritmo e na implementação.
    - Prioriza resolver o problema diretamente com passos sequenciais.

- **Programação Orientada a Objetos**
    - Foco no **design das classes e nas relações entre elas**.
    - Preocupa-se com extensibilidade e manutenção.

### 🧩 Classes como peças de um quebra-cabeça
- Cada classe representa uma peça do sistema.
- Alterar uma peça pode impactar outras.
- O desafio está em criar classes com formato adequado para evitar propagação excessiva de mudanças.

### ⚠️ Problemas comuns em sistemas OO mal projetados
- Alto acoplamento entre classes.
- Dificuldade de manutenção.
- Baixo reúso de código.
- Mudanças que quebram várias partes do sistema.

### 🎯 Objetivo do livro
Mostrar como aplicar conceitos como:
- Coesão
- Encapsulamento
- Abstração
- Flexibilidade de design

---

## Capítulo 2 — Coesão e o tal do SRP

### 💡 O que é Coesão?
Uma classe é coesa quando possui **uma única responsabilidade**, representando apenas um conceito dentro do sistema.

👉 Classes coesas:
- São menores
- Mais fáceis de manter
- Mais reutilizáveis
- Mais fáceis de testar

---

### ❌ Problema: Classes não coesas
Classes que acumulam muitas responsabilidades:
- Crescem indefinidamente.
- Possuem muitos `if` e regras misturadas.
- São difíceis de entender e manter.
- Reduzem o reúso.

Exemplo típico:
Uma classe que calcula salário contendo regras diferentes para vários cargos.

---

### ✅ Solução: Separação de responsabilidades
A estratégia é dividir comportamentos em classes menores.

#### Estratégias:
- Criar interfaces que representam comportamentos.
- Implementar cada regra em uma classe específica.
- Permitir extensões sem modificar código existente.

---

### 🔒 Encapsulamento
Encapsular significa esconder detalhes internos e expor apenas o necessário.

Benefícios:
- Reduz impacto de mudanças.
- Centraliza regras importantes.
- Evita dependências implícitas.

---

### 🧱 Métodos privados
Devem ser usados para:
- Melhorar legibilidade do código.
- Organizar algoritmos complexos.

Não devem ser usados para representar responsabilidades diferentes.

---

### 🚨 Falta de coesão em Controllers
Controllers frequentemente acumulam:
- Regras de negócio
- Acesso a banco
- Integração com serviços externos
- Envio de e-mails

👉 Boa prática:
Controllers devem apenas **coordenar o fluxo da aplicação**.

Separar responsabilidades em:
- Serviços
- DAOs/Repositórios
- Classes de integração

---

### 😬 "Feature Envy" (Inveja de outra classe)
Ocorre quando uma classe manipula excessivamente dados de outra.

👉 Solução:
Mover comportamentos para a classe que possui os dados.

---

### 📌 SRP — Single Responsibility Principle
Uma classe deve ter **apenas um motivo para mudar**.

Esse princípio:
- Aumenta coesão
- Reduz complexidade
- Facilita evolução do sistema

---

## 🧭 Conclusão dos Capítulos

Para construir sistemas OO de qualidade:

- Separe responsabilidades claramente.
- Busque classes pequenas e especializadas.
- Encapsule comportamentos.
- Evite dependências implícitas.
- Utilize abstrações para permitir evolução do código.

Esses conceitos são base para os princípios SOLID e para um design de software sustentável.
