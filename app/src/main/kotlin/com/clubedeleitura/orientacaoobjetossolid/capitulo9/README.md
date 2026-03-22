# 🧠 Capítulo 9 – Maus cheiros de design

## 💡 Ideia central
Maus cheiros de design são **sinais de alerta** de que algo está errado no código.

👉 Eles não são bugs, mas indicam problemas que podem virar bugs ou dificultar a evolução do sistema.

---

## 🚫 1. Refused Bequest (Herança rejeitada)
- Subclasse herda comportamentos que **não deveria usar**

**Problema:**
- quebra o princípio de substituição (LSP)
- gera código confuso e inconsistente

👉 Sinal de que herança foi mal utilizada  
👉 Prefira composição nesses casos

---

## 😒 2. Feature Envy (Inveja da outra classe)
- Classe usa mais dados/métodos de outra classe do que os seus próprios

**Problema:**
- responsabilidade no lugar errado
- alto acoplamento

👉 Solução: mover comportamento para a classe correta

---

## 🤝 3. Intimidade Inapropriada
- Classes sabem demais sobre a implementação umas das outras

**Problema:**
- forte acoplamento
- mudanças propagam facilmente

👉 Solução: melhorar encapsulamento

---

## 🧟 4. God Class
- Classe que faz tudo

**Características:**
- muito grande
- muitas responsabilidades
- difícil de manter

👉 Viola SRP (Single Responsibility Principle)

---

## 🔀 5. Divergent Change
- Uma classe sofre vários tipos diferentes de mudança

**Problema:**
- responsabilidades misturadas
- difícil de evoluir

👉 Cada tipo de mudança deveria afetar **uma classe específica**

---

## 💥 6. Shotgun Surgery
- Uma mudança exige alterar várias classes diferentes

**Problema:**
- difícil manutenção
- alto risco de erro

👉 Indica falta de encapsulamento e alto acoplamento

---

## ⚠️ 7. Outros cheiros
O capítulo menciona que existem vários outros smells, mas esses são alguns dos mais comuns e importantes.

---

## 🧠 Mensagem principal
> Maus cheiros não são o problema em si, mas indicam problemas maiores no design.

---

## 🚀 Tradução prática
Se no seu código você vê:
- classes gigantes
- mudanças que afetam vários arquivos
- lógica espalhada
- dependências excessivas

👉 Você provavelmente está lidando com maus cheiros de design.

---

## 🔧 O que fazer
- Refatorar continuamente
- Buscar coesão
- Reduzir acoplamento
- Melhorar encapsulamento

👉 Código bom não nasce pronto, ele é constantemente melhorado.