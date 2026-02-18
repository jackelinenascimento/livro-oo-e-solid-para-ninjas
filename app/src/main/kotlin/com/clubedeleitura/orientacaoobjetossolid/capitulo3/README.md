# 📖 Resumo: Capítulo 3 - Acoplamento e Estabilidade

Este capítulo explora como o acoplamento excessivo prejudica a evolução do software e como a utilização de interfaces e a inversão de dependência podem tornar o sistema mais flexível e fácil de testar.

## 1. O Problema do Acoplamento

O acoplamento ocorre quando uma classe depende de outra. Embora seja impossível criar um sistema sem acoplamento, o problema surge quando dependemos de classes instáveis.
1. Classes Instáveis: São aquelas que mudam com frequência (ex: regras de negócio complexas ou detalhes de infraestrutura). Se você depende delas, qualquer alteração nelas obrigará você a alterar sua própria classe.
2. Classes Estáveis: São aquelas que raramente mudam (ex: tipos básicos da linguagem ou interfaces bem definidas).


## 2. Princípio de Inversão de Dependência (DIP)

A regra de ouro apresentada pelo autor é: "Sempre dependa de abstrações e não de implementações". 
Ao depender de uma interface, a classe que utiliza o serviço não precisa saber como ele é feito, apenas o que ele faz.
Isso permite que você troque a implementação real (ex: trocar envio de e-mail por SMS) sem tocar no código que consome esse serviço.

## 3. Princípio Aberto-Fechado (OCP)

O Open-Closed Principle afirma que entidades de software devem estar abertas para extensão, mas fechadas para modificação.
Fechado para modificação: Não queremos alterar o código que já funciona e já foi testado.
Aberto para extensão: Queremos ser capazes de adicionar novos comportamentos facilmente.

Como aplicar: No exemplo do gerador de nota fiscal, em vez de o gerador ter uma lista fixa de ações, ele recebe uma lista de interfaces. Para adicionar uma nova ação, basta criar uma nova classe que implementa a interface, sem mexer no gerador.

## 4. Injeção de Dependência

Para que uma classe não precise instanciar suas próprias dependências (o que geraria acoplamento com a implementação concreta), utilizamos a Injeção de Dependência.
As dependências são passadas para a classe, geralmente via construtor.
Isso facilita o uso de Mocks em testes unitários, permitindo testar a lógica sem precisar de banco de dados ou serviços externos.

## 5. Conclusão: O Papel das Interfaces

1. As interfaces funcionam como contratos. Elas isolam o "que deve ser feito" do "como deve ser feito". Seguir essas práticas resulta em um código onde:
2. As classes são pequenas e focadas (SRP).
3. Novas funcionalidades são adicionadas como novos arquivos, não editando arquivos antigos.
4. O sistema é altamente testável e resiliente a mudanças tecnológicas.