# 📅 Cronograma Kotlin — Semana de Estudo

## 🗓️ Dia 1 — Fundamentos

**🧠 Tópicos:**
- `val` vs `var`
- Tipos básicos: `String`, `Int`, `Double`, `Boolean`
- Operadores:
  - Aritméticos: `+`, `-`, `*`, `/`, `%`
  - Comparação: `==`, `!=`, `>`, `<`, `>=`, `<=`
  - Lógicos: `&&`, `||`, `!`
  - Atribuição: `=`, `+=`, `-=`, etc
- Funções (`fun`)
- Controle de fluxo: `if/else`, `when`
- Loops: `for`, `while`, `repeat`

---

## 🗓️ Dia 2 — Coleções

**📚 Tópicos:**
- `List`, `MutableList`, `Set`, `Map`
- Métodos funcionais:
  - `map`, `filter`, `forEach`, `find`, `reduce`
- Manipulação:
  - Adicionar, remover, acessar itens
  - Iterar e transformar listas

---

## 🗓️ Dia 3 — Programação Orientada a Objetos (POO)

**🔧 Tópicos:**
- `data class`
- Classes, atributos e métodos
- Encapsulamento: `private`, `public`
- Instanciando objetos e usando classes

---

## 🗓️ Dia 4 — Null Safety + Erros + Singleton

**🛑 Null Safety**
- Operadores:
  - `?` (safe call)
  - `!!` (not-null assertion)
  - `?:` (Elvis operator)
- Combinações com `let`

**💥 Tratamento de erros**
- `try`, `catch`, `finally`
- Lançar erros com `throw`
- Criar erros customizados (classes que herdam de `Exception`)

**👤 Singleton**
- Criando singletons com `object`
- Exemplo prático: `Logger`, `Config`, `DBConnection`
- Quando usar Singleton na real

---

## 🗓️ Dia 5 — Funções Avançadas + Lambdas + Módulos

**⚡ Lambdas**
- Sintaxe básica: `{ param -> corpo }`
- `it` como parâmetro implícito
- Trailing lambda syntax

**📦 Funções de escopo**
- `let`, `run`, `with`, `apply`, `also`
- Usos práticos:
  - `apply`: inicialização
  - `let`: com null safety
  - `run`: com contexto de execução

**🔗 Módulos**
- Criando múltiplos arquivos `.kt`
- Separando responsabilidades por arquivos
- Modularização em projetos maiores

---

## 🗓️ Dia 6 — Packages + Banco Fake + CRUD

**📁 Packages**
- Como declarar: `package meu.projeto.modelo`
- Importando de outros pacotes
- Organização em: `models/`, `services/`, `controllers/`, etc.

**💾 Banco Fake**
- Usar `mutableListOf` como banco de dados fake
- Gerar IDs únicos
- Validação simples

**🛠️ CRUD**
- `Create`: adicionar item
- `Read`: listar e buscar com `filter`, `find`, `firstOrNull`
- `Update`: atualizar item com `indexOf`, `mapIndexed`
- `Delete`: remover com `removeIf` ou `removeAt`

---

## 🗓️ Dia 7 — Projeto Final 🚀

**🎯 Desafio: construir um sistema de cadastro no terminal**

**✅ Deve ter:**
- Cadastro
- Busca
- Listagem
- Update
- Delete

**🛡️ Técnicas e boas práticas**
- Tratamento de erros com `try/catch`
- Null safety nos dados de entrada
- Uso de lambdas
- Funções de escopo (`apply`, `run`, etc)
- Singleton (ex: repositório, config)
- Arquitetura separada por pacotes e arquivos
- Código limpo e comentado

---

## 🛠️ Tecnologias usadas

- **Kotlin**
- **IntelliJ IDEA** (ou qualquer IDE com suporte a Kotlin)
- **Terminal** (modo raiz 🤘)

---

## ✍️ Autor

Feito com muito café por **Ruan Rickelme Ramos** ☕💻

---

## ⚡ Bora codar!

Se curtir, dá aquela ⭐ no repositório, compartilha com a galera dev e bora fazer acontecer! 🚀
