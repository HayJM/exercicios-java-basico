# 🎯 Exercícios Java Básico - Riachuelo

Este repositório contém a resolução completa dos exercícios básicos de Java do curso **Primeiros Passos com Java** da Riachuelo, com implementação de sistemas orientados a objetos e interfaces interativas.

## 📁 Estrutura do Projeto

```
exercicios-java-basico/
├── src/                    # Código fonte Java
│   ├── Main.java          # Sistema principal com menu interativo
│   ├── exe01.java         # Módulo 1: Fundamentos básicos
│   ├── exe02.java         # Módulo 2: Estruturas de controle  
│   ├── exe03.java         # Módulo 3: Sistemas interativos
│   ├── ContaBancaria.java # Classe do sistema bancário
│   ├── SistemaDoCarro.java# Classe do simulador de carro
│   ├── Pet.java           # Classe do sistema de petshop
│   ├── desafioJava01.java # Desafio: Sistema de descontos
│   └── desafioJava02.java # Desafio: Organização de estoque
├── bin/                   # Classes compiladas (.class)
├── lib/                   # Dependências  
└── README.md             # Este arquivo
```

## 🚀 Sistema Principal - Main.java

### 🎮 **Menu Interativo**
O arquivo `Main.java` implementa um sistema completo com menu de seleção para todos os exercícios:

- **A)** 🏦 **Conta Bancária** - Sistema bancário completo com POO
- **B)** 🚗 **Sistema de Controle de Carro** - Simulador realista de veículo  
- **C)** 🐕 **Sistema de Controle de Banho de PetShop** - *(Em desenvolvimento)*
- **D)** ↩️ **Sair** - Encerrar aplicação

### 🎯 **Características Técnicas**
- Menu principal com loop interativo
- Validação de entrada com switch/case
- Instanciação de objetos para cada sistema
- Gerenciamento adequado de recursos (Scanner)

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

### 🎮 **Módulo 3 - Sistemas Orientados a Objetos** 

**Conceitos:** POO, encapsulamento, classes, métodos, estado de objetos, sistemas complexos

#### 🏦 **Sistema Bancário** (`ContaBancaria.java`)
**Funcionalidades Completas:**
- ✅ Criação de conta com depósito inicial
- ✅ Cálculo automático de limite de cheque especial (R$ 50 ou 50% do depósito)
- ✅ Operações: consultar saldo, depositar, sacar, pagar boletos
- ✅ Sistema de cheque especial com taxa de 20% sobre valor usado
- ✅ Validação de operações e controle de limites

**Estados e Regras:**
- Depósito inicial ≤ R$ 500 → Cheque especial: R$ 50
- Depósito inicial > R$ 500 → Cheque especial: 50% do valor
- Taxa de 20% sobre valores do cheque especial utilizados
- Pagamento automático de débitos pendentes em novos depósitos

#### 🚗 **Simulador de Carro** (`SistemaDoCarro.java`)  
**Sistema Realista de Controle:**
- ✅ Estados: ligado/desligado, velocidade (0-120 km/h), marcha (0-6)
- ✅ Sistema de marchas com validação de velocidade mínima/máxima
- ✅ Aceleração progressiva por marcha com limites realistas
- ✅ Controle de direção (esquerda/direita) com validações
- ✅ Redução de velocidade com alertas para mudança de marcha

**Regras de Marcha e Velocidade:**
- 1ª marcha: 0-20 km/h (mín. 15 km/h para subir)
- 2ª marcha: 15-40 km/h (mín. 35 km/h para subir)  
- 3ª marcha: 35-60 km/h (mín. 55 km/h para subir)
- 4ª marcha: 55-80 km/h (mín. 75 km/h para subir)
- 5ª marcha: 75-100 km/h (mín. 95 km/h para subir)
- 6ª marcha: 95-120 km/h (velocidade máxima)

#### 🐕 **Sistema de PetShop** (`Pet.java`)
**Status:** Em desenvolvimento
- Estrutura base criada para sistema de controle de banho
- Planejamento: controle de recursos, agendamento, limpeza

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

### **Execução Principal (Recomendada)**

```bash
# Navegar para o diretório
cd /caminho/para/exercicios-java-basico/exercicios/resolucaoExercicios

# Compilar sistema principal
javac -d bin src/Main.java src/ContaBancaria.java src/SistemaDoCarro.java src/Pet.java

# Executar sistema principal
java -cp bin Main
```

### **Execução Individual de Exercícios**

```bash
# Compilar e executar exercício específico
javac -d bin src/exe01.java && java -cp bin exe01
javac -d bin src/exe02.java && java -cp bin exe02  
javac -d bin src/exe03.java && java -cp bin exe03
```

### **Execução Via VS Code**
1. Abrir o arquivo `Main.java` 
2. Pressionar `F5` ou clicar em "▶ Run"
3. Seguir o menu interativo no terminal

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
- ✅ **Classes e Objetos**: ContaBancaria, SistemaDoCarro, Pet
- ✅ **Encapsulamento**: Atributos privados, métodos públicos
- ✅ **Métodos**: getters, setters, métodos de operação
- ✅ **Estado de Objetos**: Controle de estado entre operações
- ✅ **Instanciação**: Criação e manipulação de objetos no Main
- ✅ **Composição**: Sistema principal compondo subsistemas

### **🛠️ Tecnologias Avançadas**
- ✅ **BigDecimal**: Precisão em cálculos monetários
- ✅ **Collections**: LinkedHashMap para manutenção de ordem
- ✅ **Gerenciamento de Recursos**: try-finally, fechamento adequado

## 🏆 Melhorias e Funcionalidades Implementadas

### **🎮 Sistema Integrado**
- **� Menu Principal**: Interface unificada para todos os exercícios
- **🎯 Navegação Intuitiva**: Sistema de opções com validação
- **🔙 Retorno ao Menu**: Possibilidade de testar múltiplos sistemas

### **🏦 Sistema Bancário Avançado**
- **� Cheque Especial Inteligente**: Cálculo automático baseado no depósito inicial
- **📊 Controle de Limites**: Rastreamento de valores utilizados do cheque especial
- **🔄 Pagamento Automático**: Quitação de débitos em novos depósitos
- **⚠️ Validações Robustas**: Verificação de valores e operações inválidas

### **🚗 Simulador Realista de Carro**
- **⚙️ Sistema de Marchas Complexo**: 6 marchas + ponto morto com regras realistas
- **🎯 Controle de Velocidade**: Limites por marcha e aceleração progressiva
- **🔄 Estados Dependentes**: Validação de operações baseada no estado atual
- **💡 Feedback Inteligente**: Sugestões de mudança de marcha baseadas na velocidade

### **�️ Qualidade de Código**
- **🔒 Encapsulamento**: Atributos privados com métodos de acesso controlado
- **📦 Organização Modular**: Separação de responsabilidades em classes
- **🛡️ Tratamento de Erros**: Validação de entrada e estados inválidos
- **💾 Gerenciamento de Recursos**: Fechamento adequado de Scanner

## 🤝 Estrutura de Aprendizagem

Este projeto segue uma progressão pedagógica completa:

1. **📚 Fundamentos** → Sintaxe, operações básicas, entrada/saída
2. **🔄 Estruturas de Controle** → Loops, condicionais, validação  
3. **🎯 Programação Orientada a Objetos** → Classes, objetos, encapsulamento, estado
4. **🎮 Sistemas Integrados** → Composição, menus interativos, múltiplos subsistemas
5. **🏆 Desafios Avançados** → Aplicação de tecnologias específicas (BigDecimal, Collections)

### **🎓 Competências Desenvolvidas**
- **Pensamento Algorítmico**: Resolução de problemas complexos
- **Programação Orientada a Objetos**: Design e implementação de classes
- **Experiência do Usuário**: Interfaces intuitivas e validação de entrada
- **Qualidade de Software**: Código limpo, modular e bem documentado

---

**👨‍💻 Desenvolvido por:** HayJM  
**🎓 Curso:** Primeiros Passos com Java - Riachuelo  
**📅 Data:** Agosto 2025  
**🚀 Status:** Sistema principal completo com POO avançada
