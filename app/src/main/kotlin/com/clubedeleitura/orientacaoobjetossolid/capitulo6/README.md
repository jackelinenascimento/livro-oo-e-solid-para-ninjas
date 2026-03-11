# Capítulo 6 — Herança vs Composição e o LSP

Este capítulo discute quando usar **herança** e quando preferir **composição** em projetos orientados a objetos. O autor mostra que a herança pode gerar problemas de design quando usada apenas para reutilizar código.

---

# Problema da Herança

Herança cria um **forte acoplamento entre a classe pai e a classe filha**.

Quando uma classe herda de outra, ela automaticamente recebe:

- todos os métodos
- todos os comportamentos
- todas as responsabilidades

Isso pode gerar situações em que a classe filha **herda comportamentos que não fazem sentido para ela**.

---

# Liskov Substitution Principle (LSP)

O capítulo apresenta o **Liskov Substitution Principle**, que afirma:

> Objetos de uma classe filha devem poder substituir objetos da classe pai sem alterar o comportamento esperado do sistema.

Se uma subclasse muda o comportamento esperado, então a herança foi usada de forma incorreta.

---

# Exemplo: ContaComum e ContaEstudante

No exemplo do capítulo:

- `ContaComum` possui um método `rende()`
- `ContaEstudante` herda de `ContaComum`

Porém, contas de estudante **não deveriam ter rendimento**.

Para resolver isso, a classe precisa lançar exceção:
