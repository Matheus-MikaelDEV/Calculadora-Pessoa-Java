# 👤 Cálculo de Idade e Tempo de Trabalho

Este projeto em Java permite que o usuário insira seu nome, data de nascimento e a data de início do trabalho. A partir dessas informações, o programa calcula:

- 📅 A idade atual do usuário.
- 💼 O tempo total de trabalho em anos.
- 🚫 Validações para garantir que as datas fornecidas sejam coerentes.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- API `java.time` para manipulação de datas
- Estrutura básica de POO com encapsulamento (`People`)

## 📦 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java         # Classe principal com a lógica de entrada e saída
├── entities/
│   └── People.java          # Classe representando a pessoa com seus métodos
```

## ✅ Validações Implementadas

- Verifica se a data de nascimento ou a data de início no trabalho está no futuro.
- Impede que uma pessoa comece a trabalhar antes de nascer.

## 💡 Exemplo de Uso

```
Qual seu nome? João
Qual sua data de nascimento (dd/MM/yyyy)? 10/03/2000
Quando você começou a trabalhar (dd/MM/yyyy)? 15/01/2020
Olá João!
Você tem 24 anos e está trabalhando há 4 anos.
```

---
