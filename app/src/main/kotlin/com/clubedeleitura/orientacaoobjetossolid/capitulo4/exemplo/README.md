# Exemplo de Violação do OCP
## CalculadoraDePrecos com múltiplas regras

Este exemplo demonstra o problema apresentado no capítulo **Classes abertas e o tal do OCP** do livro *Orientação a Objetos e SOLID para Ninjas*.

A ideia é mostrar uma implementação comum em sistemas reais onde a classe responsável pelo cálculo de preços precisa lidar com diversas regras de desconto e frete.

---

## Contexto

Inicialmente o sistema possui apenas uma tabela de preços e uma regra de frete.  
Com a evolução do negócio surgem novas regras.

Por exemplo:

• diferentes tabelas de desconto  
• promoções específicas  
• regras de frete por região  
• transportadoras diferentes

Uma solução comum é usar condicionais para decidir qual regra executar.

---

## Problemáticas identificadas

À medida que novas regras surgem, alguns problemas começam a aparecer:

### Crescimento de condicionais

A lógica de decisão passa a depender de vários ifs para escolher qual regra aplicar.  
Isso torna o fluxo difícil de entender e propenso a erros.

### Aumento da complexidade

Com mais regras, a classe central acumula responsabilidades e se torna cada vez mais complexa.

### Baixa coesão

A mesma classe passa a conter diferentes regras de negócio que poderiam estar separadas.  
Isso dificulta manutenção e evolução.

### Alto acoplamento

A classe depende diretamente de implementações concretas de desconto e frete.  
Qualquer mudança nessas regras exige modificar a classe principal.

### Dificuldade de testes

O número de caminhos possíveis cresce conforme novas regras são adicionadas.  
Testar todos os cenários se torna mais custoso.

### Interfaces que se tornam complicadas

Quando a tentativa de organizar regras move condicionais para classes específicas, essas classes passam a precisar saber qual regra aplicar, recebendo parâmetros extras ou múltiplos métodos, aumentando a complexidade da API.

---

## Consequência de design

Esse tipo de implementação viola o Princípio Aberto Fechado.

A classe precisa ser modificada sempre que surge uma nova regra, em vez de apenas estendida.

O resultado é um sistema mais frágil, difícil de evoluir e com maior custo de manutenção.

---

## Reflexão

A discussão central é o equilíbrio entre coesão e acoplamento.

Buscar esse equilíbrio é fundamental para permitir que o sistema evolua sem que mudanças em uma regra se propaguem por várias partes do código.