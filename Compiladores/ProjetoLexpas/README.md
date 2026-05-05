# 🔍 Analisador Léxico em Java

Este projeto é um **Analisador Léxico** (Scanner) desenvolvido em Java. Ele é capaz de ler arquivos de texto (como códigos em Pascal ou linguagens customizadas), identificar padrões através de **Expressões Regulares (Regex)** e transformar o texto bruto em uma sequência de **Tokens** classificados.

---

## 🚀 Funcionalidades

* **Leitura de Arquivos:** Processa arquivos externos utilizando `BufferedReader` e `FileReader`.
* **Reconhecimento de Padrões:** Identifica Números, Identificadores, Operadores e Delimitadores usando `Pattern` e `Matcher`.
* **Tabela de Símbolos:** Classifica palavras-chave da linguagem de forma dinâmica.
* **Tratamento de Erros:** Implementação de blocos `try-catch` para lidar com falhas de leitura ou arquivos inexistentes.
* **Design Patterns:** Utilização do padrão **Factory** para a criação padronizada de objetos `Token`.

---

## 📂 Estrutura do Projeto

O código está organizado em pacotes para melhor manutenção:

* `Dominio`: Contém as classes base como `Token`, `TokenType` e a `TokenFactory`.
* `Mecanismo`: Onde reside a lógica principal do `Scanner` e as definições de `PadroesLexicos`.
* `Exemplo/Testes`: Classes voltadas para demonstração e validação das funcionalidades.



