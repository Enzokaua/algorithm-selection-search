# Algoritmo de Ordenação por Seleção (Selection Sort)

> Este repositório contém a implementação do algoritmo de ordenação por seleção (*Selection Sort*), conforme descrito em diversos materiais sobre algoritmos e estruturas de dados. O projeto foi desenvolvido para ser utilizado como base de estudo e prática de algoritmos fundamentais de ordenação.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

O algoritmo *Selection Sort* é um método simples de ordenação que funciona selecionando o menor (ou maior) elemento de uma lista e posicionando-o no início (ou no final). Apesar de sua simplicidade, o *Selection Sort* tem complexidade de tempo **O(n²)**, sendo mais adequado para listas pequenas ou como introdução ao conceito de algoritmos de ordenação.

### ✨ Funcionalidades

- Implementação do algoritmo de ordenação por seleção;
- Suporte para ordenação crescente e decrescente;
- Testes simples para validar a lógica do algoritmo;
- Entrada customizável para arrays de inteiros, strings ou outros tipos comparáveis.

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Java Simple**: Estilo direto e simplificado para a implementação dos algoritmos.

## 📚 Como Funciona o Algoritmo

O *Selection Sort* organiza os elementos de uma lista através de uma abordagem iterativa. Em cada iteração:

1. Encontra o menor (ou maior) elemento da parte não ordenada da lista.
2. Troca o menor (ou maior) elemento com o primeiro elemento da parte não ordenada.
3. Avança para a próxima posição na lista e repete o processo até que toda a lista esteja ordenada.

### Etapas Gerais:
1. Inicialize o índice mínimo/máximo como o índice atual.
2. Compare o elemento atual com os elementos subsequentes para encontrar o menor/maior.
3. Realize a troca dos elementos, se necessário.
4. Repita até que a lista esteja completamente ordenada.

A complexidade do algoritmo é:
- **Melhor caso:** O(n²)
- **Pior caso:** O(n²)
- **Espaço auxiliar:** O(1)

## 🛠️ Configuração e Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/selection-sort.git
