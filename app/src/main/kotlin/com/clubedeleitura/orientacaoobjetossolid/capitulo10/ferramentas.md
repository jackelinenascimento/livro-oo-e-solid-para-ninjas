# 🛠️ Ferramentas para Métricas de Código

## 🔍 1. SonarQube
Ferramenta mais completa e usada no mercado.

**O que analisa:**
- Complexidade ciclomática
- Code smells
- Duplicação de código
- Cobertura de testes
- Segurança

**Por que usar:**
- Dashboard claro
- Integra com CI/CD
- Mostra evolução da qualidade ao longo do tempo

👉 Se for escolher uma só, escolha essa.

---

## ☁️ 2. SonarCloud
Versão cloud do SonarQube.

**Vantagens:**
- Não precisa instalar nada
- Integra facilmente com GitHub/GitLab

👉 Ótimo para projetos pessoais e open source.

---

## 🧪 3. JaCoCo
Focado em cobertura de testes.

**O que mede:**
- Percentual de código coberto por testes

**Por que usar:**
- Simples e direto
- Integra com Maven e Gradle

👉 Cobertura não garante qualidade, mas ajuda a enxergar riscos.

---

## 📦 4. PMD
Analisador estático de código.

**Detecta:**
- Código duplicado
- Complexidade alta
- Más práticas

👉 Bom para reforçar boas práticas no dia a dia.

---

## 🧹 5. Checkstyle
Focado em padronização de código.

**O que faz:**
- Naming conventions
- Formatação
- Regras de estilo

👉 Mantém consistência entre desenvolvedores.

---

## 🔬 6. Code Climate
Plataforma de análise de qualidade de código.

**Destaque:**
- Interface simples e visual
- Integração fácil

👉 Alternativa ao Sonar, mais comum fora do Java.

---

## 📊 7. IntelliJ IDEA (análise embutida)
A própria IDE já oferece métricas.

**Tem:**
- Complexidade de métodos
- Code smells
- Sugestões de refatoração

👉 Muita gente ignora isso, mas já resolve bastante coisa.

---

# ⚠️ Importante
Ferramentas **não resolvem código ruim**.

Se você não entende:
- coesão
- acoplamento
- refatoração

👉 As ferramentas só vão apontar problemas que você não sabe resolver.

---

# 💡 Setup recomendado (prático)
Para projetos Java/Kotlin:

1. SonarQube ou SonarCloud
2. JaCoCo
3. Integração com CI (GitHub Actions, GitLab CI, etc.)

👉 Simples, direto e suficiente para evoluir de verdade.