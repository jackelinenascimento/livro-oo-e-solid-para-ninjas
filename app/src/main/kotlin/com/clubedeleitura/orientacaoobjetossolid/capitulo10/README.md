# 📊 Capítulo 10 – Métricas de Código

## 🧠 Ideia central
Métricas são **ferramentas de apoio**, não regras absolutas.  
Elas ajudam a identificar problemas de design, mas **não substituem o julgamento do desenvolvedor**.

---

## 🔢 1. Complexidade Ciclomática
- Mede a quantidade de **caminhos possíveis** em um método (ifs, loops, etc.).
- Quanto maior:
    - mais difícil de testar
    - mais difícil de entender
    - mais difícil de manter

**Sinais de problema:**
- muitos `if/else`
- lógica muito ramificada

**Insight:**
> Alta complexidade pode indicar falta de abstração ou polimorfismo.

---

## 📏 2. Tamanho de Métodos
- Métodos grandes tendem a:
    - ter múltiplas responsabilidades
    - ser difíceis de entender e reutilizar

**Boa prática:**
- métodos pequenos
- foco em uma única responsabilidade

**Alerta:**
> Método grande geralmente viola o SRP (Single Responsibility Principle).

---

## 🧩 3. Coesão (LCOM)
- Mede o quanto os métodos de uma classe estão **relacionados entre si**.

**Alta coesão:**
- classe faz uma coisa bem definida
- mais fácil de manter

**Baixa coesão:**
- classe faz muitas coisas diferentes
- difícil de entender e evoluir

**Insight:**
> LCOM alto indica necessidade de dividir a classe.

---

## 🔗 4. Acoplamento
### Tipos:
- **Aferente (Ca):** quantas classes dependem da sua
- **Eferente (Ce):** de quantas classes a sua depende

**Problemas comuns:**
- alto acoplamento → código frágil
- muitas dependências → difícil manutenção

**Objetivo:**
- reduzir dependências
- manter classes mais independentes

---

## 🏷️ 5. Má Nomenclatura
- Nomes ruins dificultam a leitura e entendimento

**Regra prática:**
> Se você precisa explicar o nome, ele está ruim.

---

## 🤔 6. Como Avaliar as Métricas?
- Não existem valores absolutos ideais
- Métricas são **indicadores**, não regras

**Use para:**
- identificar possíveis problemas
- guiar refatorações

**Importante:**
> Contexto sempre importa mais que o número.

---

## 🛠️ 7. Ferramentas
- Existem ferramentas que calculam métricas automaticamente
- Ajudam a:
    - detectar problemas rapidamente
    - acompanhar evolução do código

**Mas:**
> Ferramentas não substituem análise humana.

---

## 💡 Mensagem Final
Métricas não servem para dizer se o código é bom ou ruim sozinhas.

Elas servem para responder perguntas como:
- Está fácil de entender?
- Está fácil de modificar?
- Está fácil de testar?

Se não estiver, as métricas provavelmente vão apontar o problema.