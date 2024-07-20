# **Aula 4.R - A programação estruturada**

A programação estruturada é um paradigma de programação que busca organizar o código em estruturas lógicas bem definidas, como sequência, seleção e repetição. É baseada no princípio do "top-down" ou "descendente", em que o programa é dividido em módulos menores e mais simples, facilitando a compreensão, manutenção e reutilização do código. A programação estruturada utiliza principalmente as estruturas de controle condicional (como if-else) e de repetição (como while e for) para controlar o fluxo de execução do programa.

1. **Dados Globais**
   1.1. procedimento
   1.2. procedimento
   1.3. procedimento

# A programação orientada a objetos (POO)

A programação orientada a objetos (POO) é um paradigma de programação que organiza o código em torno de objetos, que são instâncias de classes. Um objeto é uma entidade que possui características (atributos) e comportamentos (métodos).

Na programação orientada a objetos, o foco está na modelagem do mundo real, onde os objetos representam entidades reais ou abstratas. As classes são as estruturas que definem os objetos, descrevendo seus atributos e métodos.

Os princípios fundamentais da programação orientada a objetos são:

1. **Encapsulamento:** a capacidade de ocultar detalhes internos do objeto e expor apenas o necessário para sua interação.
2. **Herança:** a capacidade de criar novas classes baseadas em classes existentes, herdam atributos e comportamentos da classe pai.
3. **Polimorfismo:** a capacidade de um objeto se comportar de maneiras diferentes, dependendo do contexto em que é usado.
4. **Abstração:** a capacidade de representar entidades complexas do mundo real como objetos simplificados em software.

A programação orientada a objetos permite criar programas mais modulares, flexíveis, reutilizáveis e de fácil manutenção.

**Programação Orientado a Objetos**

1. **Dados objeto**
   1.1. método
   1.2. método
2. **Dados objeto**
   2.1. método
   2.2. método
3. **Dados objeto**
   3.1. método
   3.2. método

**Classe:**
Na programação orientada a objetos (POO), uma classe é uma estrutura que define um tipo de objeto. Ela representa um conjunto de atributos e comportamentos que cada objeto desse tipo pode ter. Uma classe serve como um molde ou uma planta para a criação de objetos.

Os atributos de classe são variáveis que armazenam informações sobre o estado do objeto.
Eles representam as características ou propriedades do objeto. Os atributos definem as características únicas de cada objeto criado a partir da classe. Por exemplo, em uma classe "Carro", os atributos podem ser a cor, o modelo, a velocidade atual, etc. Cada objeto do tipo "Carro" terá seus próprios valores específicos para esses atributos.

Os métodos de classe são funções ou procedimentos que definem o comportamento do objeto. Eles representam as ações ou operações que o objeto pode realizar. Os métodos são responsáveis por manipular os atributos do objeto e interagir com outros objetos. Por exemplo, em uma classe "Carro", os métodos podem ser "acelerar", "frear", "ligar" e "desligar". Cada objeto do tipo "Carro" poderá chamar esses métodos para executar as respectivas ações.

Em resumo, uma classe define um tipo de objeto, os atributos da classe são as características desse objeto e os métodos da classe são as ações que o objeto pode executar.

# Aula 4.S - Método:

O método é definido dentro de uma classe e abaixo segue a estrutura básica:
Em Java, o nome do método deve seguir algumas convenções de nomenclatura:

1. O nome do método deve começar com uma letra minúscula.
2. Se o nome do método for composto por múltiplas palavras, cada palavra subsequente deve começar com uma letra maiúscula (camel case). Por exemplo: calcularMedia, obterNomeCompleto.
3. Evite usar abreviações ou siglas obscuras no nome do método, pois isso pode dificultar a compreensão do código.
4. É recomendado escolher nomes descritivos e significativos que indiquem claramente a função ou ação realizada pelo método.
5. É importante evitar usar palavras reservadas da linguagem Java, como int, class, public, entre outras, como nomes de métodos. Isso pode causar erros de compilação.

**Estrutura**

```java
[modificador] tipoDeRetorno nomeDoMetodo([parâmetros]) {
// corpo do método
// código a ser executado
// retorno, se houver
}
```

1. **[modificador]** é um opcional que pode indicar a visibilidade e modificação do método, como public, private, protected, static, entre outros.
2. **tipoDeRetorno** é o tipo de dado que o método retorna. Pode ser um tipo primitivo (como int, double, boolean, etc.) ou um objeto.
3. **nomeDoMetodo** é o nome dado ao método, seguindo as convenções de nomenclatura de Java.
4. **[parâmetros]** são os argumentos que o método pode receber. Eles são opcionais e podem ser de qualquer tipo de dado válido em Java.
5. O corpo do método é delimitado por chaves {} e contém as instruções que serão executadas quando o método for chamado. É nesse bloco de código que você escreve as ações que o método deve realizar.

Exemplo de um método em Java:

```java
public int soma(int a, int b) {
int resultado = a + b;
return resultado;
}
```

Neste exemplo, temos um método chamado soma que recebe dois parâmetros do tipo int e retorna um valor do tipo int. O corpo do método realiza a operação de soma dos valores recebidos e retorna o resultado.

É importante lembrar que, se o método não tiver um tipo de retorno (void), não é necessário usar a instrução return. Caso contrário, é obrigatório que o método retorne um valor do tipo especificado pelo tipoDeRetorno.

# Aula 4.T - Realizado o processo de criar imc em formato de orientação a objeto.

# Aula 4.U -  Modificadores de acesos.

Em Java, existem quatro modificadores de acesso que determinam a visibilidade de classes, atributos, métodos e construtores:

public: O código pode ser acessado de qualquer lugar, ou seja, não há restrições de acesso.

private: O código só pode ser acessado dentro da própria classe em que foi declarado. Ele não pode ser acessado por classes ou objetos externos.

protected: O código pode ser acessado pela própria classe, por classes do mesmo pacote (package) e por subclasses, mesmo que estejam em pacotes diferentes.

Sem modificador (default/package-private): O código só pode ser acessado dentro do mesmo pacote (package). Se nenhum modificador de acesso for especificado, o acesso é permitido apenas para classes no mesmo pacote.

A tabela a seguir resume a visibilidade dos modificadores de acesso:


| Modificador de Acesso | Classe | Pacote | Subclasse | Outro Pacote |
| ----------------------- | -------- | -------- | ----------- | -------------- |
| public                | Sim    | Sim    | Sim       | Sim          |
| protected             | Sim    | Sim    | Sim       | Não         |
| Sem modificador       | Sim    | Sim    | Não      | Não         |
| private               | Sim    | Não   | Não      | Não         |

É importante utilizar os modificadores de acesso de forma adequada para garantir a encapsulação e a segurança do código. Uma boa prática é tornar privados os atributos da classe e fornecer métodos públicos para acessá-los (encapsulamento). Dessa forma, o acesso aos atributos é controlado e a consistência dos dados é mantida.

**Métodos acessores**
Em Java, os métodos assessores são usados para acessar (ou ler) e alterar (ou escrever) os valores dos atributos de uma classe. Eles são conhecidos como "getters" e "setters".
O método acessor do tipo "setter" (ou "setNome") é usado para alterar o valor do atributo "nome". Por exemplo, se você quisesse mudar o nome de uma pessoa, você chamaria o método "setNome" passando o novo valor do nome como parâmetro.
Resumindo, os métodos assessores (getters e setters) são usados para ler e alterar os valores dos atributos de uma classe de forma controlada, garantindo a segurança e a integridade dos dados.

# Aula 4.V - Método contrutor

O método construtor é um tipo especial de método em uma classe Java que é chamado automaticamente quando um objeto dessa classe é criado. Ele é responsável por inicializar o objeto com os valores iniciais desejados.

Aqui estão algumas características importantes sobre os métodos construtores:

1. O nome do método construtor deve ser igual ao nome da classe.
2. O método construtor não possui um tipo de retorno especificado (nem mesmo void).
3. Um objeto pode ter vários construtores com diferentes listas de parâmetros (sobrecarga de construtores).
4. Se nenhum construtor for explicitamente definido na classe, o Java fornecerá automaticamente um construtor padrão (sem parâmetros) chamado construtor padrão.
   Pessoa: o primeiro pessoa é a classe referenciada;
   pessoa: é o objeto que vai receber os atributos e metodos da classe referenciada;
   new: cria uma nova instância de uma classe, ou seja, para criar um novo objeto
   Pessoa(): método contrutor que vai adicionar ao objeto os atributos e métodos
   Pessoa pessoa = new Pessoa("João");
5. O método construtor ele é executado quando um objeto é estanciado
6. O método contrutor só é necessario quando precisar de valores padrões.
