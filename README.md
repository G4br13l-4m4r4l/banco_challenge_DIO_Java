# Repositório criado no intuito didatico de um desafio

Foi realizado uma refatoração de código em Java, onde foi aprimorado algumas funcionalidades e foi aplicado um clean code para diminuir o excesso de linhas de código e por consequencia diminuição de complexidade do código.
Também foi trabalhado algumas habilidades de POO(Programação Orientada a Objeto). 


## Breve explicação de cada arquivo:

 - IConta: Interface criada que serviu de implemento na classe Conta
 - Conta: Aqui temos a classe pai onde contem a maior parte dos metodos que são extendidos nas classes filhas contaCorrente e contaPoupanca. Aqui foi trabalhado herança, polimorfismo e encapsulamento
 - contaCorrente e contaPoupanca : classes filhas que extendem de Conta.
 - Cliente: Classe responsável por armazenar as informações de cada cliente do banco
 - Banco: Classe responsável por armazenar e vincular as contas dos clientes