# 📚 Exercícios Java Básico - Riachuelo

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Este repositório contém uma coleção completa de exercícios práticos de Java, organizados por tópicos fundamentais da linguagem. Os exercícios foram desenvolvidos como parte do curso "Primeiros Passos Java" da Riachuelo, abrangendo desde conceitos básicos até tópicos avançados como interfaces, lambda e collections.

## 📋 Índice

- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Exercícios por Módulo](#-exercícios-por-módulo)
- [Projetos Práticos](#-projetos-práticos)
- [Como Executar](#-como-executar)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Contribuição](#-contribuição)

## 🗂️ Estrutura do Projeto

```
exercicios-java-basico/
├── README.md
├── exercicios/                          # Enunciados dos exercícios
│   ├── 1 - Fundamentos da Linguagem de Programação Java.md
│   ├── 2 - Estruturas de Controle em Java.MD
│   ├── 3 - Java e a Arte da Abstração com Classes e Encapsulamento.md
│   ├── 4 - Herança e Polimorfismo em Java.md
│   ├── 5 - Dominando Interfaces e Lambda em Java.md
│   ├── 6 - Praticando com Collections e Outras Classes Úteis do Java.md
│   └── resolucaoExercicios/             # Implementações dos exercícios
│       ├── src/                         # Código fonte das soluções
│       ├── bin/                         # Arquivos compilados (.class)
│       └── lib/                         # Bibliotecas externas
├── projetos/                            # Projetos práticos avançados
│   ├── 1 - Conceitos Básicos Para Começar a Programar em Java.md
│   ├── 2 - Programação Orientada a Objetos e Estruturas de Dados com Java.md
│   ├── 3 - Gerenciando Exceções, IO e Dependências em Java.md
│   └── 4 - Técnicas Avançadas, Padrões e Persistência (Literalmente).md
└── images/                              # Recursos visuais
    ├── draft.gif
    └── sudoku.jpg
```

## 🎯 Exercícios por Módulo

### 1️⃣ Fundamentos da Linguagem de Programação Java
- **A:** Calculadora de idade baseada em ano de nascimento
- **B:** Cálculo de área de quadrado
- **C:** Cálculo de área de retângulo
- **D:** Diferença de idade entre duas pessoas

**Implementação:** [`exe01.java`](exercicios/resolucaoExercicios/src/exe01.java)

### 2️⃣ Estruturas de Controle em Java
- **A:** Gerador de tabuada
- **B:** Calculadora de IMC com classificação
- **C:** Listagem de números pares/ímpares em intervalo
- **D:** Validação de divisibilidade com loop condicional

**Implementação:** [`exe02.java`](exercicios/resolucaoExercicios/src/exe02.java)

### 3️⃣ Java e a Arte da Abstração com Classes e Encapsulamento

#### A. Sistema de Conta Bancária 💰
- ✅ Consultar saldo e cheque especial
- ✅ Depositar e sacar dinheiro
- ✅ Pagar boletos
- ✅ Sistema de cheque especial com taxas
- ✅ Verificação de uso do cheque especial

**Implementação:** [`ContaBancaria.java`](exercicios/resolucaoExercicios/src/ContaBancaria.java)

#### B. Sistema de Controle de Carro 🚗
- Sistema completo de controle automotivo
- Gerenciamento de marchas e velocidade
- Controles de direção e segurança

**Implementação:** [`SistemaDoCarro.java`](exercicios/resolucaoExercicios/src/SistemaDoCarro.java)

#### C. Máquina de Banho para Pet Shop 🐕
- Sistema de banho automatizado
- Controle de recursos (água e shampoo)
- Gerenciamento de pets

**Implementação:** [`Pet.java`](exercicios/resolucaoExercicios/src/Pet.java)

### 4️⃣ Herança e Polimorfismo em Java

#### A. Sistema de Cinema 🎬
- Hierarquia de ingressos (normal, meia-entrada, família)
- Cálculo automático de preços
- Sistema de descontos

#### B. Sistema de Usuários (Loja) 👥
- Gerente, Vendedor e Atendente
- Controle de permissões
- Operações específicas por tipo de usuário

#### C. Sistema de Relógios Mundiais 🌍
- ✅ Relógio Brasileiro (formato 24h)
- ✅ Relógio Americano (formato 12h AM/PM)
- ✅ Conversão automática entre fusos
- ✅ Hierarquia com classe abstrata e sealed classes

**Implementações:**
- [`Clock.java`](exercicios/resolucaoExercicios/src/Clock.java) - Classe base abstrata
- [`BRLClock.java`](exercicios/resolucaoExercicios/src/BRLClock.java) - Relógio brasileiro
- [`USClock.java`](exercicios/resolucaoExercicios/src/USClock.java) - Relógio americano
- [`MainExercicio04.java`](exercicios/resolucaoExercicios/src/MainExercicio04.java) - Menu interativo

### 5️⃣ Dominando Interfaces e Lambda em Java
- **A:** Sistema de mensagens de marketing (SMS, Email, Redes Sociais, WhatsApp)
- **B:** Calculadora de tributos por categoria de produto
- **C:** Calculadora de área para figuras geométricas

### 6️⃣ Praticando com Collections e Outras Classes Úteis do Java
- **A:** Calculadora avançada com múltiplos operandos
- **B:** Formatador de números de telefone (fixo e celular)
- **C:** Conversor de dados para JSON, XML e YAML

## 🚀 Projetos Práticos

### 1. Calculadora Interativa 🧮
Sistema completo de calculadora com menu interativo, suportando:
- Operações básicas (soma, subtração, multiplicação, divisão)
- Potenciação
- Menu de navegação contínua
- Operações encadeadas (opcional)

### 2. Jogo de Sudoku 🎲
Implementação completa do clássico jogo Sudoku com:
- Interface de console interativa
- Validação de regras do Sudoku
- Sistema de verificação de status
- Funcionalidades de adição/remoção de números
- Opção de interface gráfica (AWT/Swing)

### 3. Gerenciamento de Exceções e I/O 📁
Projetos focados em:
- Tratamento de exceções
- Operações de entrada/saída
- Gerenciamento de dependências

### 4. Técnicas Avançadas e Padrões 🔧
Implementação de:
- Padrões de design
- Persistência de dados
- Técnicas avançadas de programação

## 🔧 Como Executar

### Pré-requisitos
- Java JDK 11 ou superior
- IDE de sua preferência (VS Code, IntelliJ, Eclipse)

### Executando os exercícios

1. **Clone o repositório:**
```bash
git clone https://github.com/HayJM/exercicios-java-basico.git
cd exercicios-java-basico
```

2. **Navegue até a pasta de soluções:**
```bash
cd exercicios/resolucaoExercicios/src
```

3. **Compile os arquivos Java:**
```bash
javac *.java
```

4. **Execute um exercício específico:**
```bash
# Exercícios básicos
java exe01
java exe02
java exe03

# Exercícios com POO
java MainExercicio03
java MainExercicio04

# Desafios extras
java desafioJava01
java desafioJava02
```

### Executando o sistema de relógios (Exemplo)
```bash
java MainExercicio04
# Escolha a opção C para testar o sistema de relógios
```

## 🛠️ Tecnologias Utilizadas

- **Java 11+** - Linguagem principal
- **Scanner** - Entrada de dados do usuário
- **Time API** - Manipulação de datas e horários
- **OOP Concepts** - Programação orientada a objetos
- **Collections Framework** - Estruturas de dados
- **Interfaces e Lambda** - Programação funcional
- **Sealed Classes** - Recursos modernos do Java

## 🎨 Características do Código

### Conceitos Implementados
- ✅ **Encapsulamento** - Getters, setters e modificadores de acesso
- ✅ **Herança** - Hierarquia de classes com extends
- ✅ **Polimorfismo** - Métodos abstratos e sobrescrita
- ✅ **Interfaces** - Contratos e implementações
- ✅ **Sealed Classes** - Controle de herança (Java 15+)
- ✅ **Collections** - Listas, Maps e Sets
- ✅ **Lambda Expressions** - Programação funcional
- ✅ **Exception Handling** - Tratamento de erros
- ✅ **Menu Interativo** - Interface de usuário via console

### Padrões de Design Utilizados
- **Template Method** - Classe Clock abstrata
- **Strategy Pattern** - Diferentes implementações de relógio
- **Factory Pattern** - Criação de objetos específicos

## 📚 Recursos de Aprendizado

Cada exercício inclui:
- 📖 **Enunciado detalhado** - Especificação completa do problema
- 🎯 **Objetivos de aprendizado** - Conceitos a serem praticados
- ✅ **Implementação funcional** - Código comentado e testado
- 🔄 **Menu interativo** - Interface amigável para teste
- 📝 **Validações** - Tratamento de entradas inválidas

## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor
# Haynner Joner Mattos estudante de Eng. da Computação - UTFPR - Toledo-PR

**HayJM** - [GitHub](https://github.com/HayJM)

---

⭐ **Gostou do projeto? Não esqueça de dar uma estrela!**

*Este repositório faz parte do curso "Primeiros Passos Java" da Riachuelo, desenvolvido para ensinar os fundamentos da programação Java através de exercícios práticos e progressivos.*