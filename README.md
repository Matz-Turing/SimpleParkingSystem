# Modelagem de Veículos e Estacionamento com Descontos

<img src="https://user-images.githubusercontent.com/74038190/212284115-f47cd8ff-2ffb-4b04-b5bf-4d1c14c0247f.gif" width="1000">

## Objetivo

Este exercício prático em Java explora conceitos de Orientação a Objetos, como Herança, Polimorfismo e Interfaces, para construir um sistema de cálculo de custos de estacionamento que oferece descontos para clientes com seguro.

## Funcionamento

O sistema é composto por três classes principais:

* **Veiculo:** Define as propriedades básicas de um veículo estacionado (valor por hora, valor adicional e tempo de permanência) e calcula o custo total.

* **Segurado:** Herda da classe `Veiculo` e implementa a interface `ISeguroService` para aplicar um desconto específico para veículos segurados no cálculo do custo final.

* **BalancoDiario:** Responsável por registrar cada veículo estacionado e gerar um relatório com a quantidade total de veículos e o valor total arrecadado pelo estacionamento.

## Destaque

A utilização da interface `ISeguroService` permite que diferentes tipos de seguros sejam facilmente integrados ao sistema no futuro, simplesmente implementando a interface e definindo a lógica de desconto específica para cada tipo de seguro.

## Execução

O programa pode ser executado a partir da classe `TestaEstacionamento` localizada no pacote `test`, que demonstra a criação de instâncias das classes, o cálculo de custos de estacionamento e a geração de um relatório do balanço diário.

## Créditos

Desenvolvido por Mateus S.  
GitHub: [Matz-Turing](https://github.com/Matz-Turing)
