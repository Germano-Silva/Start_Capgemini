# Curso: Linguagem de Programação em JAVA

### Professor Marcelo

Bem-vindo ao curso de Linguagem de Programação em JAVA! Este curso foi desenvolvido para fornecer uma base sólida na programação Java, abrangendo desde conceitos fundamentais até tópicos avançados. Com as orientações do professor Marcelo, exploraremos as principais ferramentas e conceitos que fazem de Java uma das linguagens mais utilizadas no mundo, focando em resolver problemas, estruturar soluções e criar aplicações robustas e escaláveis. Nosso objetivo é capacitar você a desenvolver aplicações robustas e eficientes, utilizando as melhores práticas da linguagem.

## Índice

- [Aula 01 - Boas Vindas](#aula-01---boas-vindas)
- [Aula 02 - Interfaces](#aula-02---interfaces)
- [Aula 03 - Construtores](#aula-03---construtores)
- [Aula 04 - Enumeradores](#aula-04---enumeradores)
- [Aula 05 - Modificadores de acesso](#aula-05---modificadores-de-acesso)
- [Aula 06 - Matriz](#aula-06---matriz)
- [Aula 07 - Cobranças](#aula-07---cobranças)
- [Aula 08 - Tópicos avançados](#aula-08---tópicos-avançados)
- [Aula 09 - Genéricos](#aula-09---genéricos)
- [Aula 10 - Anotações](#aula-10---anotações)
- [Aula 11 - Fios](#aula-11---fios)
- [Aula 12 - Laços](#aula-12---laços)
- [Aula 13 - Trabalhando com dados](#aula-13---trabalhando-com-dados)
- [Aula 14 - Persistência de dados](#aula-14---persistência-de-dados)
- [Aula 15 - Exceções e controle de erros](#aula-15---exceções-e-controle-de-erros)
- [Aula 16 - Considerações finais](#aula-16---considerações-finais)

## Aula 01 - Boas Vindas

#### Aulas 1.A

- **Curso de Java Intermediário:**
  - Objetivo: Capacitar o aluno para desenvolver um projeto Java com atualização em banco de dados.
  - Revisão: Continuação do aprendizado iniciado no curso básico, com foco na orientação a objetos.

- **Conceitos Abordados:**
  - **Consultores**, **interfaces** e **numeradores**.
  - Manipulação de **arrays**.
  - Integração de Java com **banco de dados**.

- **Projeto Final:**
  - Desenvolvimento de um sistema utilizando uma única tabela.
  - Implementação de métodos para:
    - Acessar banco de dados.
    - **Incluir**, **alterar**, **excluir** e **consultar** elementos específicos.
    - **Consultar todos** os elementos de uma tabela.

- **Objetivo Final:** Possibilitar a aplicação prática dos conceitos aprendidos em um sistema funcional com banco de dados.

## Aula 02 - Interfaces

#### Aulas 2.A

- **Conceito de Interface:**
  - Uma **interface** é um elemento do Java, criado de forma similar a **classes** e **numeradores**.
  - Permite agrupar classes com características em comum.
  - **Diferencial:** Uma interface pode ser vinculada a várias classes, ao contrário da herança.

- **Funcionalidades de uma Interface:**
  - Define métodos comuns para classes relacionadas.
  - Métodos podem incluir ações ou propriedades compartilhadas.

- **Características das Interfaces:**
  - Contêm assinaturas de métodos e suas propriedades.
  - Classes vinculadas devem implementar os métodos com a **mesma assinatura**:
    - Mesmo nome.
    - Mesmo retorno.
    - Mesmos parâmetros.
  - Garante **reaproveitamento de código** e melhora a manutenibilidade e legibilidade do programa.

- **Assinaturas de Métodos:**
  - Devem ser idênticas entre a interface e as classes que a implementam.
  - Reforçam o princípio de **orientação a objetos** focado no **reaproveitamento de código**.

- **Benefícios:**
  - Programas mais **flexíveis** e **manuteníveis**.
  - Melhoria na **legibilidade** do código.

- **Próximos Passos:**
  - Demonstração de como criar interfaces e utilizá-las em situações práticas.

#### Aulas 2.B

- **O que uma interface deve ter:**
  - Nomeação clara e objetiva.
  - Declaração de métodos com assinaturas específicas, sem implementação.

- **Criação de Classes que Implementam a Interface:**
  - Classes utilizam a palavra-chave **implements** para implementar a interface.
  - Implementação obrigatória de todos os métodos declarados na interface.
  - Métodos nas classes devem ter:
    - Mesmo nome.
    - Mesmo tipo de retorno.
    - Mesmos parâmetros.

- **Uso de Notações:**
  - O **@Override** é adicionado automaticamente para identificar que o método foi sobrescrito.

- **Regras Importantes:**
  - Todos os métodos da interface devem ser implementados nas classes correspondentes.
  - O código gerado automaticamente pode ser ajustado para atender às especificações do projeto.

- **Benefícios do Uso de Interfaces:**
  - Promove organização e consistência no código.
  - Facilita a reutilização e a implementação de comportamentos comuns em várias classes.

## Aula 03 - Construtores

#### Aulas 3.A

- **O que são Construtores:**
  - São elementos presentes em todas as classes.
  - Toda classe possui pelo menos um **construtor padrão**.
  - Permitem a comunicação entre a parte externa da classe e seus métodos ou atributos.

- **Função dos Construtores:**
  - Atuam como um meio de ligação entre a parte externa e interna da classe.
  - Facilitam a inicialização de variáveis e atributos de uma classe.
  - Podem retornar uma, várias ou todas as variáveis de uma classe, conforme necessário.

- **Características:**
  - Utilizam a variável **this** para diferenciar valores recebidos e atributos da classe.
  - Reduzem o tráfego de atributos entre diferentes partes do programa.
  - São importantes para o gerenciamento de memória, sendo auxiliados pelo **Garbage Collector** para liberar memória quando não são mais utilizados.

- **Regras Importantes:**
  - Construtores são essenciais para a **instanciação** de classes.
  - Ajudam a evitar o uso desnecessário de memória ao limitar a quantidade de atributos trafegados.

- **Benefícios:**
  - Facilitam a **organização e encapsulamento** em classes.
  - Contribuem para uma melhor **eficiência no uso da memória**.

#### Aulas 3.B

- **Construtores com Sobrecarga:**
  - Permitem receber múltiplos parâmetros ao instanciar uma classe.
  - Podem ser gerados automaticamente utilizando IDEs como Eclipse.
  - Construtores sobrecarregados são úteis para inicializar diversos atributos em uma única chamada.

- **Funcionamento:**
  - Atributos são definidos dentro da classe e podem ser inicializados através dos parâmetros do construtor.
  - A variável **this** diferencia os atributos da classe dos valores recebidos pelo construtor.
  - Após a execução, os valores dos parâmetros são atribuídos aos atributos correspondentes.

- **Gerenciamento de Memória:**
  - Construtores não utilizados são descartados pelo **Garbage Collector**.
  - Variáveis são carregadas na memória apenas quando criadas.

- **Cálculo de Valores:**
  - Métodos dentro da classe podem ser chamados após a inicialização dos atributos para realizar cálculos.
  - Os métodos utilizam os valores armazenados nos atributos da classe.

- **Uso de Enumeradores:**
  - Enumeradores podem ser utilizados para definir valores específicos associados a atributos.
  - Ajudam a representar estados ou categorias, como "aprovado" ou "reprovado".

- **Regras Importantes:**
  - Todos os parâmetros definidos no construtor devem ser devidamente atribuídos aos atributos da classe.
  - Construtores são flexíveis e podem ser adaptados conforme a necessidade do programa.

- **Benefícios dos Construtores:**
  - Facilitam a troca de informações entre o método principal e as classes.
  - Melhoram a organização e a inicialização de variáveis dentro das classes.
  - São cruciais para garantir consistência e eficiência na manipulação de dados.

## Aula 04 - Enumeradores

#### Aulas 4.A

- **Enumeradores:**
  - Enumeradores são estruturas que permitem definir valores fixos associados a um atributo.
  - Ajudam a representar estados ou categorias com valores limitados e bem definidos.
  - Substituem tabelas de banco de dados para armazenar valores simples e repetitivos.

- **Criação de Enumeradores:**
  - Podem ser definidos dentro ou fora de uma classe.
  - Cada valor do enumerador é tratado como uma constante.
  - Exemplo de uso: `matriculado`, `pendente`, `reprovado`.

- **Funcionamento:**
  - Atributos da classe utilizam o enumerador como tipo de dado.
  - Ao atribuir valores, o enumerador fornece opções pré-definidas, facilitando o controle e a validação.

- **Benefícios dos Enumeradores:**
  - Melhoram a legibilidade do código ao substituir valores arbitrários por constantes nomeadas.
  - Facilitam a manutenção e evitam erros ao limitar as opções possíveis.
  - São amplamente utilizados para representar status ou condições específicas.

- **Regras Importantes:**
  - Enumeradores são imutáveis, ou seja, seus valores não podem ser alterados em tempo de execução.
  - Devem ser usados para categorias com um número fixo de opções.

- **Uso Prático:**
  - Permitem verificar e alterar o estado de atributos com base em condições do programa.
  - Podem ser exibidos ou manipulados diretamente no código com boa integração em IDEs.
  - Garantem que o programa seja mais eficiente e consistente.

- **Legibilidade e Flexibilidade:**
  - Enumeradores tornam o código mais claro e compreensível.
  - São úteis para estruturar programas com requisitos fixos e categorias predefinidas.

## Aula 05 - Modificadores de acesso

#### Aulas 5.A
#### Aulas 5.B
#### Aulas 5.C
#### Aulas 5.D
#### Aulas 5.E
#### Aulas 5.F

## Aula 06 - Matriz

#### Aulas 6.A
#### Aulas 6.B
#### Aulas 6.C
#### Aulas 6.D
#### Aulas 6.E

## Aula 07 - Cobranças

#### Aulas 7.A
#### Aulas 7.B
#### Aulas 7.C
#### Aulas 7.D
#### Aulas 7.E

## Aula 08 - Tópicos avançados

#### Aulas 8.A
#### Aulas 8.B
#### Aulas 8.C

## Aula 09 - Genéricos

#### Aulas 9.A
#### Aulas 9.B

## Aula 10 - Anotações

#### Aulas 10.A
#### Aulas 10.B

## Aula 11 - Fios

#### Aulas 11.A
#### Aulas 11.B

## Aula 12 - Laços

#### Aulas 12.A
#### Aulas 12.B

## Aula 13 - Trabalhando com dados

#### Aulas 13.A
#### Aulas 13.B
#### Aulas 13.C
#### Aulas 13.D

## Aula 14 - Persistência de dados

#### Aulas 14.A
#### Aulas 14.B
#### Aulas 14.C
#### Aulas 14.D
#### Aulas 14.E
#### Aulas 14.F
#### Aulas 14.G
#### Aulas 14.H
#### Aulas 14.I
#### Aulas 14.J
#### Aulas 14.K
#### Aulas 14.L
#### Aulas 14.M
#### Aulas 14.N

## Aula 15 - Exceções e controle de erros

#### Aulas 15.A
#### Aulas 15.B
#### Aulas 15.C

## Aula 16 - Considerações finais

#### Aulas 16.A
