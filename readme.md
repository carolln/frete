Aluna: Carolina Nunes de Carvalho
Descrição: Sistema de frete modelado com base no pdf passado 

Requisitos:

1.​ Crie a interface Fretavel com um método: double calcularCustoFrete(double distanciaEmKm);
2.​ Modele os Veículos:
    - Crie uma classe abstrata Veiculo (com placa, ano).
    -​ Crie as classes Carro e Motocicleta que herdam de Veiculo.
    - O custo do frete de um Carro é distanciaEmKm * 1.25.
    -​ O custo do frete de uma Motocicleta é distanciaEmKm * 0.45.
    -​ Faça Carro e Motocicleta implementarem a interface Fretavel.

3.​ Modele os Entregadores:
    -​ Crie a classe Entregador.
    -​ Crie a classe Funcionario que herda de Entregador. O custo de um funcionário é fixo em R$ 5,00 por entrega, independente da distância.
    -​ Crie a classe Autonomo que herda de Entregador. O custo de um autônomo é distanciaEmKm * 0.95.
    -​ Faça Funcionario e Autonomo implementarem a interface Fretavel.

4.​ Crie a classe ServicoDeEntrega:
    -​ Ela deve ter uma lista de Fretavel (List<Fretavel>).
    -​ Crie um método calcularCustoTotal() que percorre a lista, soma os custos de todos os itens (veículos e entregadores) e retorna o valor total da entrega.

5.​ Na sua classe Main:
    -​ Crie uma instância de ServicoDeEntrega.
    -​ Simule uma entrega de 10km feita por um Funcionario com um Carro. Adicione os dois à lista e calcule o custo total.
    -​ Simule outra entrega de 25km feita por um Autonomo com uma Motocicleta. Calcule o custo total.


Notas Finais:
espero que esteja rodando!! fiz no intellij pra experimentar, mas quem disse que eu consegui rodar no eclipse depois quando fui confirmar que rodava??
tive que meio que refazer tudo umas 2 vezes. acho que odeio todas as IDEs de java.