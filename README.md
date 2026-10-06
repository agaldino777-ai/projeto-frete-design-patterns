# Projeto Frete - Design Patterns em Java

Projeto desenvolvido no curso **Itaú - Java com Inteligência Artificial** (DIO), como desafio final sobre Padrões de Projeto (Design Patterns).

## Sobre o projeto

Um programa simples em Java que calcula o valor do frete de um pacote a partir do peso, mostrando o preço de três modalidades de envio: PAC, Sedex e Expresso.

## Padrões de projeto utilizados

- **Strategy:** cada modalidade de frete (`FretePAC`, `FreteSedex`, `FreteExpresso`) é uma classe separada que segue a interface `Frete`. Cada uma tem sua própria forma de calcular o preço.
- **Facade:** a classe `FreteFacade` oferece um único método, `mostrarFretes`, que esconde os detalhes de como cada frete é calculado.

## Estrutura

- `Frete.java`: interface com o contrato (`calcular` e `getNome`)
- `FretePAC.java`, `FreteSedex.java`, `FreteExpresso.java`: as três estratégias de cálculo
- `FreteFacade.java`: ponto de entrada simples para o uso dos fretes
- `Main.java`: executa o programa

## Exemplo de saída (pacote de 2 kg)
