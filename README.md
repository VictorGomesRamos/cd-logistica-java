# CD Logística – Controle de Estoque em Java

Projeto desenvolvido em Java com foco em fundamentos de programação orientada a objetos,
regras de negócio e versionamento com Git.

## Objetivo
Simular o controle de estoque de um centro de distribuição (CD), permitindo:
- Cadastro de produtos
- Entrada e saída de estoque
- Validações de regras de negócio
- Tratamento de exceções

## Tecnologias utilizadas
- Java
- Programação Orientada a Objetos (POO)
- Git e GitHub

## Conceitos aplicados
- Encapsulamento
- Construtores
- Getters e Setters
- Validações de domínio
- Tratamento de exceções (try/catch)
- Organização em pacotes
- Commits semânticos

## Exemplo de execução
```java
Produto produto = new Produto("Teclado", 10);
produto.entradaEstoque(100);
produto.saidaEstoque(3);
