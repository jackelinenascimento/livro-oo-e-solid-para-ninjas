# 🧠 Capítulo 8 – Consistência, objetinhos e objetões

## 💡 Ideia central
Modelar bem os objetos é essencial para ter código **consistente, seguro e fácil de manter**.

---

## 🏗️ 1. Construtores ricos
- Objetos devem nascer **válidos**
- Regras essenciais devem estar no construtor

❌ Evite:
- criar objeto inválido e corrigir depois

✅ Prefira:
- garantir consistência já na criação

---

## ✅ 2. Validação de dados
- Validações devem ficar **dentro do objeto**
- Evita duplicação e inconsistência

👉 Regra prática:
> Quem tem o dado, valida o dado

---

## 🚫 3. Nulos e o “teorema do bom vizinho”
- Evitar `null` sempre que possível
- Objetos devem se proteger contra estados inválidos

**Problemas do null:**
- aumenta complexidade
- gera bugs silenciosos

---

## 🧱 4. Tiny Types (Value Objects)
- Criar classes pequenas para representar conceitos do domínio

**Exemplos:**
- `CPF`, `Email`, `Dinheiro` em vez de `String`

**Vantagens:**
- validação centralizada
- mais segurança
- código mais expressivo

---

## 📦 5. DTOs “do bem”
- Usados para:
    - transporte de dados
    - integração (API, banco, etc.)

❌ Problema:
- virar modelo anêmico

👉 Regra:
- lógica fica no domínio, não no DTO

---

## 🔄 6. Imutabilidade vs Mutabilidade
- Prefira objetos **imutáveis** sempre que possível

**Vantagens:**
- menos bugs
- mais previsível
- thread-safe

---

## 🧟 7. Classes “feias por natureza”
- Algumas classes serão feias (ex: integração, infraestrutura)
- Isso é normal

👉 Evite contaminar o domínio com essa complexidade

---

## 🏷️ 8. Nomes importam
- Bons nomes facilitam entendimento
- Nomes ruins aumentam a complexidade

---

## 🚀 Mensagem final
Objetos bem modelados:
- evitam inconsistências
- reduzem bugs
- facilitam a evolução do sistema

---

## ⚠️ Tradução prática
Se seu código tem:
- validação espalhada
- muito `null`
- tudo como `String`
- objetos sendo criados inválidos

👉 O problema não é sintaxe, é modelagem.