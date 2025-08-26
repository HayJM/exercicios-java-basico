# 🎯 Exercícios Java Básico - Riachuelo

Este repositório contém a resolução completa dos exercícios básicos de Java do curso **Primeiros Passos com Java** da Riachuelo, organizados em três módulos progressivos de aprendizagem.

## 📁 Estrutura do Projeto

```
exercicios-java-basico/
├── src/                    # Código fonte Java
│   ├── exe01.java         # Módulo 1: Fundamentos básicos
│   ├── exe02.java         # Módulo 2: Estruturas de controle
│   ├── exe03.java         # Módulo 3: Sistemas interativos
│   ├── desafioJava01.java # Desafio: Sistema de descontos
│   └── desafioJava02.java # Desafio: Organização de estoque
├── bin/                   # Classes compiladas (.class)
├── lib/                   # Dependências
├── .gitignore            # Arquivos ignorados pelo Git
└── README.md             # Este arquivo
```

## 🏋️‍♂️ Módulos de Exercícios

### 📚 **Módulo 1 - Fundamentos Básicos** (`exe01.java`)

**Conceitos:** Entrada/saída de dados, operações matemáticas, manipulação de tipos primitivos

- **A)** 👤 **Calculadora de Idade**: Recebe nome e ano de nascimento, calcula e exibe a idade
- **B)** 🔲 **Área do Quadrado**: Calcula área usando fórmula: área = lado × lado  
- **C)** 📐 **Área do Retângulo**: Calcula área usando fórmula: área = base × altura
- **D)** 👥 **Diferença de Idade**: Calcula diferença de idade entre duas pessoas

### 🔄 **Módulo 2 - Estruturas de Controle** (`exe02.java`)

**Conceitos:** Loops, condicionais, validação de entrada, formatação de saída

- **A)** 📊 **Tabuada**: Gera tabuada de multiplicação de 1 a 10 para um número
- **B)** ⚖️ **Calculadora de IMC**: Calcula IMC e classifica o resultado em categorias
- **C)** 🔢 **Números Pares/Ímpares**: Lista números pares ou ímpares em ordem decrescente
- **D)** ➗ **Verificador de Divisibilidade**: Verifica se números são divisíveis por um valor inicial

### 🎮 **Módulo 3 - Sistemas Interativos** (`exe03.java`)

**Conceitos:** Sistemas com estado, máquinas de estado, validação complexa, menus interativos

- **1)** 🏦 **Sistema Bancário Completo**
  - Gerenciamento de saldo e cheque especial
  - Operações: depósito, saque, pagamento de boletos
  - Cálculo automático de limites e taxas

- **2)** 🚗 **Simulador de Controle de Carro**
  - Controle de marcha, velocidade e direção
  - Validação de compatibilidade marcha/velocidade
  - Regras realistas de direção

- **3)** 🐕 **Sistema de Petshop**
  - Controle de máquina de banho para pets
  - Gerenciamento de recursos (água e shampoo)
  - Controle de limpeza e manutenção

## 🎖️ Desafios Especiais

### 💰 **Desafio 1 - Sistema de Descontos** (`desafioJava01.java`)
**Tecnologias:** BigDecimal para precisão monetária

Sistema que calcula descontos progressivos:
- < R$ 50,00: 0% de desconto
- R$ 50,00 - R$ 100,00: 10% de desconto  
- > R$ 100,00: 20% de desconto

### 📦 **Desafio 2 - Organizador de Estoque** (`desafioJava02.java`)
**Tecnologias:** LinkedHashMap, manipulação de strings

Processa entrada de múltiplas lojas e consolida estoque:
- Mantém ordem de primeira aparição
- Soma quantidades por código de loja
- Formata saída padronizada

## 🚀 Como Executar

### **Pré-requisitos**
- ☕ Java JDK 11 ou superior
- 📝 VS Code com extensão Java Pack

### **Execução Via Linha de Comando**

```bash
# Navegar para o diretório
cd /caminho/para/exercicios-java-basico/exercicios/resolucaoExercicios

# Compilar
javac -d bin src/exe01.java

# Executar
java -cp bin exe01
```

### **Execução Via VS Code**
1. Abrir o arquivo `.java` desejado
2. Pressionar `F5` ou clicar em "▶ Run"

## 💡 Conceitos e Tecnologias Aplicados

### **📋 Fundamentos**
- ✅ **Scanner**: Entrada robusta de dados com tratamento de buffer
- ✅ **Tipos Primitivos**: int, double, boolean, String
- ✅ **Operadores**: Aritméticos, relacionais, lógicos
- ✅ **Formatação**: printf, String.format

### **🔧 Estruturas de Controle**
- ✅ **Condicionais**: if/else, switch/case
- ✅ **Loops**: for, while, do-while
- ✅ **Validação**: Entrada de dados com loops de verificação

### **🎯 Programação Orientada a Objetos**
- ✅ **Classes e Métodos**: Organização modular do código
- ✅ **Instanciação**: Criação e uso de objetos
- ✅ **Encapsulamento**: Métodos privados para lógica interna

### **🛠️ Tecnologias Avançadas**
- ✅ **BigDecimal**: Precisão em cálculos monetários
- ✅ **Collections**: LinkedHashMap para manutenção de ordem
- ✅ **Gerenciamento de Recursos**: try-finally, fechamento adequado

## 🏆 Melhorias Implementadas

- **🔒 Gerenciamento de Recursos**: Scanner sempre fechado adequadamente
- **📦 Organização Modular**: Métodos separados por funcionalidade  
- **🛡️ Validação Robusta**: Tratamento de entradas inválidas
- **💾 Controle de Estado**: Sistemas que mantêm estado entre operações
- **📝 Documentação**: Comentários explicativos em todo o código

## 🤝 Estrutura de Aprendizagem

Este projeto segue uma progressão pedagógica:

1. **Básico** → Sintaxe e operações fundamentais
2. **Intermediário** → Estruturas de controle e validação
3. **Avançado** → Sistemas complexos com estado
4. **Desafios** → Aplicação de tecnologias específicas

---

**👨‍💻 Desenvolvido por:** HayJM  
**🎓 Curso:** Primeiros Passos com Java - Riachuelo  
**📅 Data:** Agosto 2025
