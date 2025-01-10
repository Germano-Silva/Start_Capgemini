## Aula 02 - Introdução ao JAVA

#### Aula 2.B

**UM POUCO DA HISTÓRIA DO JAVA**

Sun - Microsystems
A empresa que criou o JAVA em 1982 foi a SUN Microsystems, que foi fundada por 4 alunos da Universidade de Stanford, por isso o nome SUN (Stanford University Network).
Em 2008 a SUN comprou o MySQL por um bilhão de dólares.
O JAVA foi criado com o objetivo de ser compatível com várias plataformas da época (1991).
A ideia central era: "escreva uma vez e execute em qualquer lugar".
O primeiro projeto JAVA foi "engavetado" por ser ambicioso demais para a época.
Jame "Pai do Java'
Porém em 1994/1995 tudo voltou á tona. Desde o início dos anos 90 a internet começou a se popularizar e o acesso a ele não tinha restrições de processadores ou sistemas operacionais.
Nesse mesmo período se firma uma parceria da Netscape com a SUN. A Netscape era detentora popular do navegador de internet da época. A ideia era que applets em Java começassem a rodar no Netscape, o que, para as características do JAVA, foi "jogo rápido". E daí por diante o Java começou a se popularizar.

#### Aula 2.C

![](https://4.bp.blogspot.com/-ZRtEPHuFX3Y/WnD-eF1pJSI/AAAAAAAAA6c/xC5P-0vTgRcu7efT7DsK_PbpaNQXLjqLwCLcBGAs/s1600/java-packages.png)

#### Aula 2.D

**CARACTERÍSTICAS**

**Simples** : Java foi projetado para ser fácil de aprender e usar, removendo complexidades de linguagens anteriores como C++. Sua sintaxe clara e a ausência de recursos complicados facilitam a escrita e a manutenção do código.

**Orientado a objetos** : Java é fundamentalmente orientado a objetos, o que significa que organiza o software em classes e objetos, promovendo a reutilização de código e a modularidade, facilitando o desenvolvimento e a manutenção.

**Distribuível** : Java suporta o desenvolvimento de aplicações distribuídas através de suas bibliotecas e frameworks que facilitam a comunicação entre sistemas diferentes, permitindo que aplicações sejam executadas em várias máquinas.

**Multithread** : Java oferece suporte integrado a multithreading, permitindo que múltiplos threads de execução sejam criados e gerenciados, o que é ideal para aplicações que precisam realizar várias tarefas simultaneamente.

**Dinâmico** : Java é dinâmico, carregando e verificando classes em tempo de execução. Isso permite que novos métodos e objetos sejam adicionados sem necessidade de recompilar a aplicação, facilitando a adaptação a mudanças.

**Arquitetura neutra** : O código Java é compilado em bytecode, que é independente de hardware e sistema operacional. Esse bytecode é executado pela Java Virtual Machine (JVM), permitindo que aplicações Java rodem em qualquer plataforma.

**Portátil** : A portabilidade é uma das principais características do Java, permitindo que aplicações sejam desenvolvidas em uma plataforma e executadas em qualquer outra que suporte a JVM, garantindo ampla compatibilidade.

**Alto desempenho** : Java utiliza técnicas como compilação just-in-time (JIT) e otimização de código, proporcionando um desempenho eficiente. Embora não seja tão rápido quanto linguagens compiladas diretamente para código de máquina, seu desempenho é bastante competitivo.

**Robusto** : Java é projetado para ser robusto, com forte verificação de erros em tempo de compilação e tempo de execução, gerenciamento automático de memória e a capacidade de lidar com exceções de forma eficiente.

**Seguro** : Java oferece um ambiente seguro através de sua arquitetura de sandbox, que restringe o acesso a recursos do sistema e previne execução de código malicioso, além de suportar criptografia e autenticação para segurança adicional

#### Aula 2.E

A JVM
Em 2010 a ORACLE adquire a SUN, mantendo todas as patentes e projetos que eram úteis.
WRITE ONCE, RUN ANYWHERE
Interpretando codigo em outras linguagens:

![Interpretação de linguagem compilada](https://www.alura.com.br/artigos/assets/jvm-conhecendo-processo-execucao-de-codigo/imagem2.jpg)

A Java Virtual Machine (JVM) é um componente central da plataforma Java que permite a execução de código Java em diferentes sistemas operacionais e arquiteturas de hardware. Ela desempenha um papel crucial na portabilidade das aplicações Java, já que o código-fonte Java é primeiro compilado em bytecode, uma forma intermediária e independente de plataforma.

A JVM executa esse bytecode, traduzindo-o para instruções específicas da máquina onde está rodando. Isso significa que, enquanto o código Java pode ser o mesmo, a JVM se adapta às particularidades do sistema em que está sendo executada.

![Compilação Java](https://miro.medium.com/v2/resize:fit:1024/1*3M_Bj3dbx5c780cjwNuaqw.png)

JVM é apenas uma especificação e sua implementação é diferente de fornecedor para fornecedor.
Por enquanto, vamos entender a arquitetura comumente aceita de JVM conforme definido na especificação a baixo:

![JVM Arquitetura](https://miro.medium.com/v2/resize:fit:700/1*FqUFOZpxt7miKYH4CpRqLg.jpeg)

#### Aula 2.F

**JRE** significa Java Runtime Environment. É o pacote JAVA necessário para você ter acesso a JVM (Java Virtual Machine), e que possibilita você "rodar" os programas JAVA em seu computador.

**JDK** significa Java Development Kit. É um pacote JAVA necessário para desenvolver aplicativos baseados em Java.

## Aula 03 - Ambiente de desenvolvimento

Um ambiente de desenvolvimento é um conjunto integrado de ferramentas que facilita a criação e manutenção de software. Inclui editores de código, compiladores, depuradores, sistemas de controle de versão, e gerenciadores de pacotes, proporcionando um espaço eficiente e organizado para programar.


## Aula 04 - Visão dos Frameworks

#### Aula 4.A

Uma IDE (Ambiente de Desenvolvimento Integrado) é uma aplicação que fornece um conjunto completo de ferramentas para facilitar o desenvolvimento de software. Ela combina um editor de código, um compilador ou interpretador, um depurador e, frequentemente, outras ferramentas como sistemas de controle de versão e gerenciadores de pacotes, em uma interface unificada. Isso permite que desenvolvedores escrevam, testem e depurem código de forma mais eficiente e organizada. Exemplos populares de IDEs incluem IntelliJ IDEA, Visual Studio Code e Eclipse.

#### Aula 4.B

[NetBeans](https://netbeans.apache.org/front/main/download/nb22/) - IDE de código aberto que oferece suporte a várias linguagens como Java, PHP e C++. É conhecida por sua interface intuitiva e funcionalidades integradas, como editor de código, depurador e suporte a gerenciamento de projetos, tornando o desenvolvimento ágil e eficiente.

#### Aula 4.C

[Eclipse](https://eclipseide.org/) - IDE extensível e popular, ideal para Java e outras linguagens. Oferece uma plataforma modular com um vasto ecossistema de plugins, permitindo personalização e expansão conforme necessário. É amplamente usada no desenvolvimento de software corporativo e projetos complexos.

#### Aula 4.D

[IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows) - IDE da JetBrains famosa por sua interface moderna e recursos avançados. É especialmente forte no desenvolvimento Java, com suporte robusto a frameworks, refatoração inteligente e integração contínua, proporcionando uma experiência de codificação produtiva.

## Aula 05 - Programas Java 

#### Aula 5.A

**Criação e Execução de um Programa Java**

- **Objetivo:** Demonstrar o processo de criação, compilação e execução de um programa Java simples, utilizando a IDE Eclipse.

- **Conceitos Aprendidos:**
  - Processo de criação de um projeto Java em uma IDE.
  - Estrutura básica de um programa Java, incluindo `public static void main`.
  - Introdução ao bytecode (`.class`) gerado pelo Java após a compilação.

- **Principais Comandos e Sintaxe:**
  - Criar um novo projeto Java no Eclipse:
    - **Passos:** File > New > Java Project > Nome do projeto > Finish.
  - Criar uma classe principal:
    - **Passos:** New > Class > Nome da classe > Marcar a opção `public static void main`.
  - Estrutura básica do programa:
    ```java
    public class ClassePrincipal {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```
  - Bytecode gerado: Arquivo `.class` que contém o código em bytecode para execução na JVM.

- **Exercícios Propostos:** 
  - Criar um programa que exiba a mensagem "Meu Primeiro Programa em Java!".
  - Localizar o arquivo `.class` gerado pelo programa e explorá-lo no sistema de arquivos.


#### Aula 5.B

**Manipulação de Variáveis e Impressão de Valores no Java**

**Objetivo:**  
Demonstrar como declarar, inicializar e manipular variáveis em Java, além de exibir seus valores no console.

**Conceitos Aprendidos:**  
- Declaração de variáveis em Java com diferentes tipos de dados (`int`, `float`).  
- Uso de modificadores de acesso como `public`.  
- Impressão de valores no console utilizando `System.out.println`.  
- Concatenar texto e variáveis para criar mensagens dinâmicas.  

#### Aula 5.C

**Execução e Geração do Arquivo `.class`**

**Objetivo:**  
Demonstrar o processo de compilação e execução de um programa Java, destacando a geração do arquivo `.class`.

**Conceitos Aprendidos:**  
- Compilação do programa Java gera um arquivo `.class`, que contém o bytecode.  
- Execução do programa exibe os resultados definidos no código.  

#### Aula 5.D

**Explorando o Arquivo `.class` e Portabilidade do Java**

**Objetivo:**  
Mostrar a localização, estrutura interna e portabilidade do arquivo `.class` gerado após a compilação de um programa Java.

**Conceitos Aprendidos:**  
- O arquivo `.class` é gerado na pasta `bin` do workspace após a compilação.  
- O `.class` não é um arquivo `.java`, mas sim o bytecode que pode ser interpretado pela JVM.  
- A estrutura interna do `.class` pode ser visualizada em um editor de texto, onde é possível identificar algumas referências como nomes de variáveis, métodos e strings.  
- Portabilidade do `.class`: pode ser executado em qualquer sistema operacional com a JVM instalada.  

#### Aula 5.E

**Execução de Programas Java**

**Objetivo:**  
Demonstrar as formas de executar programas Java, utilizando IDEs ou linha de comando, e destacar atalhos comuns em diferentes ferramentas.

**Conceitos Aprendidos:**  
- Execução via IDE:  
  - Botão de execução (geralmente um ícone verde com uma seta branca).  
  - Atalhos variam entre frameworks:
    - **Eclipse:** Ctrl + F11.  
    - **NetBeans:** F6.  
    - **IntelliJ IDEA:** Atalho similar ao botão de execução.  

- Execução via linha de comando:  
  - Compilar com `javac NomeDoPrograma.java`.  
  - Executar com `java NomeDoPrograma`.  

- Diferenças entre execução via linha de comando e IDE:
  - Linha de comando é funcional, mas sem interface amigável.  
  - IDEs oferecem botões e telas intuitivas que simplificam a execução.  

## Aula 06 - Tipos de dados

#### Aula 6.A

**Introdução a Tipos de Dados, Variáveis e Operadores em Java**

**Objetivo:**  
Iniciar a exploração dos conceitos fundamentais de programação em Java, incluindo tipos de dados, variáveis e operadores, para desenvolver uma base sólida na linguagem.

**Conceitos Apresentados:**  
- Tipos de dados.  
- Declaração e uso de variáveis.  
- Operadores aritméticos, relacionais e lógicos.  
- Organização por projeto: cada assunto será trabalhado em um projeto separado, facilitando a consulta e o uso como material de referência.  

**Nota:**  
Os projetos criados durante essa fase serão disponibilizados no pacote de exercícios do curso para consulta e estudo.  

#### Aula 6.B

**Tipos de Dados no Java**

**Objetivo:**  
Apresentar os principais tipos de dados disponíveis em Java, suas características e como utilizá-los.

**Conceitos Apresentados:**  
- **Tipos de Dados mais Comuns:**
  - **`int`:** Armazena números inteiros, sem casas decimais.  
    Exemplo: `int numero = 10;`  
  - **`float`:** Armazena números decimais curtos. Necessita do sufixo `F`.  
    Exemplo: `float decimalCurto = 10.5F;`  
  - **`double`:** Armazena números decimais longos, sem necessidade de sufixo.  
    Exemplo: `double decimalLongo = 20.5;`  
  - **`char`:** Armazena um único caractere, delimitado por aspas simples.  
    Exemplo: `char letra = 'A';`  
  - **`String`:** Armazena uma sequência de caracteres, delimitada por aspas duplas.  
    Exemplo: `String texto = "Curso de Java";`  

- **Observações:**  
  - O operador `=` é usado para atribuição de valores.  
  - **Erros comuns:**  
    - Tentar usar `double` como `float` sem o sufixo `F`.  
    - Usar aspas duplas em valores `char`.  
    - Usar aspas simples em valores `String`.  

**Nota:**  
Esses são os tipos de dados mais utilizados em Java. Outros tipos podem ser abordados conforme necessário durante o curso.

## Aula 07 - Variáveis

#### Aula 7.A

**Introdução a Variáveis no Java**

**Objetivo:**  
Definir o conceito de variáveis, sua função nos programas e boas práticas de utilização em Java.

**Conceitos Apresentados:**  
- **O que são variáveis?**  
  - Áreas de memória nomeadas e tipificadas para armazenar dados.  
  - O valor de uma variável pode mudar durante a execução do programa, de acordo com a lógica implementada.  

- **Constantes:**  
  - Variáveis definidas como `final` em Java são imutáveis (não podem ter o valor alterado após inicialização).  
  - Exemplo: `final int valorConstante = 10;`  

- **Boas práticas:**  
  - Evitar criar variáveis desnecessárias ou com dimensionamento inadequado para economizar memória.  
  - Criar apenas as variáveis necessárias para o programa.  

- **Persistência:**  
  - Variáveis existem apenas durante a execução do programa; ao término, são liberadas da memória.  

## Aula 08 - Literais

#### Aula 8.A

**Introdução a Literais no Java**

**Objetivo:**  
Definir o conceito de literais e sua relação com a atribuição de valores a variáveis em Java.

**Conceitos Apresentados:**  
- **O que são Literais?**  
  - Valores atribuídos diretamente às variáveis durante a programação.  
  - Exemplo:  
    - Inteiros: `int numero = 10;`  
    - Decimais (float): `float decimalCurto = 10.5F;`  
    - Decimais (double): `double decimalLongo = 20.5;`  
    - Caracteres: `char letra = 'A';`  
    - Strings: `String texto = "Curso de Java";`  

#### Aula 8.B

**Detalhes sobre Literais no Java**

**Objetivo:**  
Explorar os diferentes tipos de literais em Java e como eles são utilizados para atribuir valores a variáveis.

**Conceitos Apresentados:**  
- **Tipos de Literais:**
  - **Numéricos:** Valores inteiros ou decimais atribuídos a variáveis numéricas.  
    Exemplo: `int numero = 10;`  
  - **String:** Cadeias de caracteres delimitadas por aspas duplas.  
    Exemplo: `String cadeia = "Meu curso de Java";`  
  - **Char:** Um único caractere delimitado por aspas simples.  
    Exemplo: `char caractere = 'S';`  
  - **Boolean:** Valores lógicos que podem ser `true` ou `false`.  
    Exemplo: `boolean certoOuErrado = true;`  

- **Alteração de Valores:**  
  - Variáveis podem ser reatribuídas durante a execução do programa.  
  - Exemplo:  
    - `numero = 20;`  
    - `cadeia = "Novo texto";`  
    - `caractere = 'N';`  
    - `certoOuErrado = false;`  

- **Observação:**  
  - Os literais atribuídos às variáveis são armazenados em memória, e seus valores podem ser exibidos ou modificados conforme necessário.  

## Aula 09 - Aritméticos

#### Aula 9.A

**Operadores Aritméticos no Java**

**Objetivo:**  
Demonstrar o uso de operadores aritméticos básicos em Java e como aplicá-los em variáveis.

**Operadores Aritméticos:**  
  - Soma (`+`)  
  - Subtração (`-`)  
  - Multiplicação (`*`)  
  - Divisão (`/`)  

- **Declaração de Variáveis:**  
  - É possível declarar várias variáveis do mesmo tipo em uma única linha, separando-as por vírgulas.  

**Nota:**  
Operações aritméticas simples não envolvem lógica complexa, mas são fundamentais para cálculos básicos no programa. Resultados são exibidos usando `System.out.println`.  

#### Aula 9.B

**Introdução a Expressões e Operadores Lógicos**

**Objetivo:**  
Apresentar o conceito de expressões em Java e como utilizá-las em conjunto com operadores lógicos.

**Expressões:**  
  - Fórmulas que combinam operadores e variáveis para realizar cálculos ou tomadas de decisão.  

**Nota:**  
Expressões são essenciais para criar lógica em programas, combinando operadores para resolver problemas específicos.  

#### Aula 9.C

**Comandos de Incrementação e Decrementação no Java**

**Objetivo:**  
Demonstrar o uso dos comandos de incrementação (`++`) e decrementação (`--`) e sua aplicação em laços de repetição.

**Conceitos Apresentados:**  
- **Incrementação (`++`):** Adiciona 1 ao valor atual de uma variável.  
- **Decrementação (`--`):** Subtrai 1 do valor atual de uma variável.  

- **Aplicação em Laços de Repetição:**  
  - Utilizados frequentemente em loops como `while` e `for`.  
  - Permitem repetir instruções baseadas em condições específicas.  

- **Boas Práticas:**  
  - Identação e legibilidade do código são fundamentais para facilitar a leitura e manutenção.  
  - Usar incrementação e decrementação de forma clara para evitar erros de lógica.

#### Aula 9.D

**Operadores Relacionais no Java**

**Objetivo:**  
Apresentar os operadores relacionais em Java e demonstrar como eles são usados para controlar o fluxo de um programa.

**Conceitos Apresentados:**  
- **Operadores Relacionais:**  
  - `>` (maior)  
  - `<` (menor)  
  - `>=` (maior ou igual)  
  - `<=` (menor ou igual)  
  - `==` (igual)  
  - `!=` (diferente)  

- **Uso dos Operadores:**  
  - Permitem comparar variáveis e valores, determinando condições para execução de trechos específicos de código.  
  - São utilizados para definir a lógica em comandos condicionais, como `if` e `else`.  

**Boas Práticas:**  
- Garantir que as comparações sejam feitas entre tipos compatíveis de variáveis.  
- Organizar e indentar o código para melhorar a legibilidade e manutenção.  

#### Aula 9.E

**Operadores Lógicos no Java**

**Objetivo:**  
Apresentar os operadores lógicos em Java e como eles são utilizados para combinar condições em expressões condicionais.

**Conceitos Apresentados:**  
- **Operadores Lógicos:**  
  - **`&&` (E):** Ambas as condições devem ser verdadeiras para a expressão ser verdadeira.  
  - **`||` (OU):** Pelo menos uma das condições deve ser verdadeira para a expressão ser verdadeira.  

- **Uso dos Operadores Lógicos:**  
  - Permitem agrupar e combinar condições em comandos condicionais (`if` e `else`).  
  - As expressões devem ser delimitadas por parênteses para garantir a correta avaliação.  
  - No caso do `&&`, todas as condições devem ser satisfeitas.  
  - No caso do `||`, basta que uma das condições seja satisfeita.  

**Boas Práticas:**  
- Organizar as expressões com parênteses para facilitar a leitura e evitar ambiguidades.  
- Utilizar operadores lógicos para simplificar e otimizar a lógica do programa.  

#### Aula 9.F

**Resumo sobre Operadores no Java**

**Objetivo:**  
Recapitular os operadores apresentados e introduzir a importância de compreender as diferenças entre os operadores condicionais para utilizá-los de forma adequada.

**Conceitos Apresentados:**  
- **Operadores já estudados:**
  - Aritméticos: Soma, subtração, multiplicação e divisão.  
  - Incrementais e decrementais: Usados para adicionar ou subtrair 1 de uma variável.  
  - Relacionais: Comparações como maior, menor, igual e diferente.  
  - Lógicos: Combinação de condições com `&&` (E) e `||` (OU).  

**Nota:**  
Diferentes operadores condicionais devem ser utilizados de acordo com o contexto do programa, sendo importante entender suas particularidades e aplicações.  

## Aula 10 - Estruturas Condicionais

#### Aula 10.A

**Introdução às Estruturas Condicionais no Java**

**Objetivo:**  
Apresentar as estruturas condicionais no Java e sua função de alterar o fluxo do programa com base em condições específicas.

**Conceitos Apresentados:**  
- **Estruturas Condicionais:**  
  - Utilizam operadores relacionais e lógicos para avaliar condições.  
  - Permitem direcionar o fluxo do programa de acordo com resultados específicos.  
  - Exemplos práticos: Validação de dados como CPF.  

- **Tipos de Estruturas:**  
  - `if`: Avalia uma única condição.  
  - `if-else`: Avalia uma condição e fornece alternativas.  
  - Condicionais aninhadas: Combinação de várias condições para cenários mais complexos.  

**Nota:**  
As estruturas condicionais serão exploradas em detalhes, partindo de casos simples até exemplos mais complexos.  

#### Aula 10.B

**Estruturas Condicionais: `if` com `else`**

**Objetivo:**  
Demonstrar o uso do comando `if` com `else` em Java para tratar condições e fornecer alternativas de execução.

**Conceitos Apresentados:**  
- **Uso do `if-else`:**  
  - Avalia uma condição.  
  - Executa um bloco de código se a condição for verdadeira e outro bloco se for falsa.  
  - Exemplo prático: Verificar se um número é maior ou menor que outro.  

- **Funcionamento:**  
  - Se a condição no `if` for satisfeita, executa o bloco correspondente.  
  - Caso contrário, executa o bloco do `else`.    

- **Aplicação em Cenários Mais Complexos:**  
  - Possibilidade de adicionar condições intermediárias para maior controle.  

#### Aula 10.C

**Estruturas Condicionais: `if-else` com `else if`**

**Objetivo:**  
Demonstrar o uso do comando `if-else` com condições intermediárias utilizando `else if`.

**Conceitos Apresentados:**  
- **Uso do `else if`:**  
  - Permite avaliar condições intermediárias antes de chegar ao bloco final do `else`.  
  - Ideal para cenários onde há mais de duas possibilidades, como maior, menor ou igual.  

- **Funcionamento:**  
  - A primeira condição (`if`) é avaliada.  
  - Se não for satisfeita, a próxima condição (`else if`) é avaliada.  
  - Caso nenhuma condição seja verdadeira, o programa segue para o bloco `else`.  

- **Boas Práticas:**  
  - Estruturar mensagens e condições de forma clara para facilitar a identificação do fluxo.  
  - Adicionar quantos `else if` forem necessários para cobrir todas as possibilidades.  

#### Aula 10.D

**Estruturas Condicionais: Comando `switch`**

**Objetivo:**  
Apresentar o comando `switch` em Java, suas características e uso em comparação com o comando `if`.

**Conceitos Apresentados:**  
- **O que é o `switch`:**  
  - Comando utilizado para testar valores absolutos.  
  - Ideal para cenários com múltiplas opções bem definidas, como menus.  
  - Não permite testar faixas de valores ou usar operadores relacionais.  

- **Funcionamento:**  
  - O valor da variável é comparado com as opções (`case`) especificadas.  
  - O comando `break` é necessário para evitar que o programa continue avaliando os demais `case`.  
  - Caso nenhuma das opções seja atendida, o bloco `default` pode ser utilizado como alternativa.  

- **Exemplo de Aplicação:**  
  - Menus onde cada opção corresponde a uma ação, como incluir, alterar, excluir ou consultar.  

- **Boas Práticas:**  
  - Sempre utilizar `break` para evitar execução indesejada de outros blocos.  
  - Certificar-se de que o tipo de dado da variável é compatível com os valores testados no `case`.  

## Aula 11 - Laços de repetição

#### Aula 11.A

**Introdução aos Laços de Repetição no Java**

**Objetivo:**  
Explicar o conceito de laços de repetição, sua finalidade e como utilizá-los para evitar redundância no código.

**Conceitos Apresentados:**  
- **O que são Laços de Repetição:**  
  - Estruturas que permitem executar um bloco de código várias vezes com base em uma condição.  
  - Eliminam a necessidade de repetir manualmente trechos idênticos de código.  

- **Funcionamento:**  
  - Uma condição é avaliada.  
  - Enquanto a condição for verdadeira, o bloco de código do laço será executado.  
  - Quando a condição não é mais satisfeita, o programa sai do laço e continua a execução após seu escopo.  

- **Benefícios:**  
  - Reduz redundância no código.  
  - Facilita manutenção e alterações, já que o trecho repetido está centralizado.  

#### Aula 11.B

**Laços de Repetição: Comando `while`**

**Objetivo:**  
Apresentar o comando `while`, suas características e funcionamento como um laço de repetição no Java.

**Conceitos Apresentados:**  
- **Comando `while`:**  
  - Um laço de repetição pré-testado.  
  - Avalia uma condição antes de executar o bloco de código associado.  
  - Continua repetindo enquanto a condição for verdadeira.  

- **Funcionamento:**  
  - Uma variável controla o número de repetições.  
  - Após cada iteração, a variável é atualizada (geralmente incrementada ou decrementada).  
  - Quando a condição deixa de ser verdadeira, o programa sai do laço e executa os comandos subsequentes.  

- **Características:**  
  - Ideal para cenários onde o número de iterações depende de uma condição dinâmica.  
  - Requer atenção para evitar loops infinitos (garantir que a condição seja eventualmente falsa).  

- **Boas Práticas:**  
  - Garantir clareza no controle do laço, utilizando variáveis e incrementos bem definidos.  
  - Mensagens claras para indicar o progresso do laço e o momento em que ele termina.  

#### Aula 11.C

**Laços de Repetição: Comando `do-while`**

**Objetivo:**  
Explicar o funcionamento do comando `do-while` no Java e suas diferenças em relação ao `while`.

**Conceitos Apresentados:**  
- **Comando `do-while`:**  
  - Um laço de repetição pós-testado.  
  - Garante que o bloco de código será executado pelo menos uma vez, pois a condição é avaliada somente após a execução.  

- **Funcionamento:**  
  - O programa entra no bloco `do` independentemente da condição inicial.  
  - Após a execução, a condição é testada para determinar se o laço deve ser repetido.  
  - Se a condição for falsa na primeira avaliação, o laço não será repetido.  

- **Características:**  
  - Ideal para situações em que é necessário executar o bloco pelo menos uma vez antes de validar a condição.  
  - Deve ser usado com cautela para evitar comportamentos inesperados.  

- **Diferenças entre `do-while` e `while`:**  
  - `while`: Pré-testado, avalia a condição antes de entrar no laço.  
  - `do-while`: Pós-testado, entra no laço e avalia a condição após a execução.  

**Boas Práticas:**  
- Utilizar `do-while` somente quando for garantido que o bloco deve ser executado ao menos uma vez.  
- Certificar-se de que a lógica do programa se beneficia dessa estrutura específica.  

#### Aula 11.D

**Laços de Repetição: Comando `for`**

**Objetivo:**  
Apresentar o comando `for` no Java, destacando sua estrutura e utilização para controle eficiente de laços de repetição.

**Conceitos Apresentados:**  
- **Comando `for`:**  
  - Estrutura de laço que combina inicialização, condição e incremento em uma única linha.  
  - Reduz a chance de erros como esquecer a incrementação, comum em outros laços.  

- **Estrutura do `for`:**  
  - **Inicialização:** Declaração e inicialização de uma variável de controle.  
  - **Condição:** Avaliada antes de cada iteração; controla a execução do laço.  
  - **Incremento:** Atualiza a variável de controle após cada iteração.  

- **Funcionamento:**  
  - O laço é executado enquanto a condição for verdadeira.  
  - Ao final do laço, o programa continua a execução após o bloco do `for`.  

- **Características e Limitações:**  
  - A variável declarada dentro do `for` está limitada ao escopo do laço.  
  - Para reutilizar valores após o laço, é necessário atribuí-los a uma variável externa.  

- **Boas Práticas:**  
  - Utilizar o `for` para laços com número conhecido de iterações.  
  - Manter condições e incrementos claros para evitar loops infinitos ou comportamentos inesperados.  

#### Aula 11.E

**Interrupção de Laços: Comando `break`**

**Objetivo:**  
Apresentar o uso do comando `break` para interromper a execução de um laço de repetição em Java.

**Conceitos Apresentados:**  
- **Comando `break`:**  
  - Utilizado para interromper um laço de repetição antes de sua condição ser satisfeita.  
  - Comumente usado quando uma condição específica dentro do laço é atendida.  

- **Funcionamento:**  
  - O comando `break` faz o programa sair imediatamente do laço em que está inserido.  
  - Após o `break`, a execução continua no próximo comando após o laço de repetição.  

- **Aplicações Comuns:**  
  - Procurar valores específicos em estruturas como arrays ou matrizes.  
  - Parar o laço após alcançar um objetivo, como encontrar um valor ou atender a uma condição.  

- **Boas Práticas:**  
  - Utilizar o `break` apenas quando necessário para manter a legibilidade e controle do código.  
  - Evitar dependência excessiva do `break`, priorizando estruturas claras e bem organizadas.  

## Aula 12 - Entrada de dados gráficos

#### Aula 12.A

**Entrada de Dados no Java**

**Objetivo:**  
Apresentar diferentes formas de entrada de dados no Java, destacando o uso de `JOptionPane` para interações simples com o usuário.

**Conceitos Apresentados:**  
- **Entrada de Dados:**  
  - Variáveis podem ser inicializadas diretamente no código ou receber valores fornecidos pelo usuário em tempo de execução.  
  - Ferramentas para entrada de dados incluem:
    - `Scanner`: Lê dados do console.  
    - `JOptionPane`: Fornece uma interface gráfica para entrada e exibição de dados.  

- **Uso do `JOptionPane`:**  
  - Classe útil para criar caixas de diálogo interativas.  
  - Método `showInputDialog`: Solicita entrada de dados ao usuário.  
  - Método `showMessageDialog`: Exibe mensagens ao usuário.  

- **Conversão de Dados:**  
  - Entradas do `JOptionPane` são recebidas como `String`.  
  - Conversão necessária para tipos numéricos, utilizando métodos como:  
    - `Integer.parseInt()`: Converte `String` para `int`.  
    - `Float.parseFloat()`: Converte `String` para `float`.  

- **Boas Práticas:**  
  - Garantir que o valor recebido seja tratado adequadamente, especialmente ao realizar conversões de tipo.  
  - Usar `JOptionPane` para testes e programas simples, evitando seu uso em aplicações comerciais complexas.  

#### Aula 13.A

**Introdução à Orientação a Objetos**

**Objetivo:**  
Apresentar o conceito de orientação a objetos (OO) e seus benefícios em comparação ao paradigma estruturado.

**Conceitos Apresentados:**  
- **Paradigma Estruturado vs. Orientação a Objetos:**  
  - No paradigma estruturado, código e rotinas precisam ser repetidos, o que dificulta manutenção e reaproveitamento.  
  - A orientação a objetos permite reutilização de código por meio de objetos, aumentando a produtividade e facilitando a manutenção.  

- **Benefícios da Orientação a Objetos:**  
  - Reduz redundância no código.  
  - Melhora a manutenibilidade e escalabilidade das aplicações.  
  - Acelera o desenvolvimento ao reaproveitar objetos existentes.  
  - É amplamente utilizada em linguagens modernas como Java, C#, Python e JavaScript.  

- **Quatro Pilares da Orientação a Objetos:**  
  - A base conceitual da orientação a objetos será explorada com foco nos quatro pilares principais em aulas futuras.  

**Nota:**  
A orientação a objetos é essencial para o desenvolvimento de sistemas robustos e escaláveis.  
