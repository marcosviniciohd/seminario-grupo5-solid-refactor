# SOLID

## Single Responsibility Principle - Princípio da  Responsabilidade Única (SRP).
### Aplicamos esse principio na classe de Funcionario, essa classe não precisa saber as regras de negócio de como o reajuste salarial  é feito. Portanto extraímos o método reajusteSalarioDoFuncionario() para a classe de serviço ReajusteService. Tornando assim a classe Funcionario mais coesa. 

## Open/Closed Principle - Princípio Aberto/Fechado (OCP).
### Aplicamos o principio de aberto/fechado na classe de ReajusteService, onde criamos uma interface de reajuste salarial, e criamos uma classe para cada tipo de reajuste salarial. Dessa forma, quando precisarmos criar um novo tipo de reajuste salarial, não precisaremos alterar a classe de ReajusteService, apenas criaremos uma nova classe que implementa a interface de reajuste salarial.











