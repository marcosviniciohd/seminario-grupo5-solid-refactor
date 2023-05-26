# SOLID

## Single Responsibility Principle - Princípio da  Responsabilidade Única (SRP).
### Aplicamos esse principio na classe de Funcionario, essa classe não precisa saber as regras de negócio de como o reajuste salarial  é feito. Portanto extraímos o método reajusteSalarioDoFuncionario() para a classe de serviço ReajusteService. Tornando assim a classe Funcionario mais coesa. 

## Open/Closed Principle - Princípio Aberto/Fechado (OCP).
### Aplicamos o principio de aberto/fechado na classe de ReajusteService, onde criamos uma interface ValidacaoReajuste e criamos uma classe para cada tipo de validação de reajuste salarial, ValidacaoPercetualReajuste e ValidacaoPeriodicidadeEntreReajustes ambas implementa a interface ValidacaoReajuste. Dessa forma, quando precisarmos criar um novo tipo de validação salarial, não precisaremos alterar a classe de ReajusteService, apenas criaremos uma nova classe que implementa a interface de ValidacaoReajuste.

## Liskov Substitution Principle - Princípio da Substituição de Liskov (LSP).
### Aplicamos o principio de substituição de Liskov nas classes Funcionario e Terceirizado onde estraímos os atributos em comum para a classe DadosPessoais favorecendo a composição ao invés da herança. Partindo do principio que um terceirizado não deve herdar todos atributos e metodos de um funcionario.








