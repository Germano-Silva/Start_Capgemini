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