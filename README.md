# Desafio Banco Terminal

## 📌 Descrição
O desafio consiste em criar um programa Java que simula a abertura de uma conta bancária através do terminal. O usuário deverá fornecer algumas informações e, ao final, receberá uma mensagem confirmando a criação da conta com os dados informados.

## ⭐ Objetivo
O programa deve solicitar ao usuário os seguintes dados:
- **Número da Conta** (inteiro)
- **Número da Agência** (texto, permite conter hífen)
- **Nome do Cliente** (texto)
- **Saldo Inicial** (número decimal, podendo ser inserido com vírgula ou ponto)

Após a entrada de dados, o programa deve exibir uma mensagem confirmando a criação da conta e os detalhes fornecidos pelo usuário.

## 📜 Requisitos
- Utilizar a classe `Scanner` para capturar entradas do usuário.
- Garantir que o tipo de cada dado esteja correto:
  - `int` para o número da conta.
  - `String` para a agência e o nome do cliente.
  - `double` para o saldo inicial.
- Tratar a entrada do saldo para aceitar tanto vírgula quanto ponto como separador decimal.
- Evitar problemas de buffer ao alternar entre `nextInt()` e `nextLine()`.

## 💻 Exemplo de Entrada e Saída

### ✏️ Entrada do usuário:
```
Por favor, digite o número da Conta (apenas números):
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o seu Nome:
MARIO ANDRADE
Por favor, digite o seu Saldo:
237,48
```

### 📤 Saída esperada:
```
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco.
Sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## 💡 Observações de implementação
1. **Cuidado com o buffer do `Scanner`**: Após usar `nextInt()`, sempre adicione um `nextLine();` para evitar problemas ao ler a próxima entrada.
2. **Converter corretamente o saldo**: Substitua a vírgula por ponto antes de usar `Double.parseDouble()` na conversão String ➝ Double

## ✅ Conclusão
Esse desafio foi uma excelente forma de praticar conceitos básicos de `Java`, como entrada de dados, manipulação de strings e tipos numéricos. Nele, me encontrei buscando informações sobre a `classe Scanner`, e me aprofundar no funcionamento do `buffer`



Além disso, pude aprender e aplicar boas práticas, como:

- Uso correto do `Scanner` para evitar problemas de leitura entre diferentes tipos de entrada.
- Conversão de dados de forma segura.
- Validação de tipos de dados, garantindo o armazaenamento correto da entrada.  
- Compilação de código por terminal, para gerar o .class no diretório e entender melhor o a execução de classes.

O exercício reforça a importância de compreender o gerenciamento de entradas no Java e o funcionamento correto de suas classes para evitar problemas.




