# Fundamentos de HTML5 Módulo 3

## **Aula 02 - História do HTML**

#### **Aula 2.A**

A história do HTML (HyperText Markup Language) é bastante interessante e reflete a evolução da web como um todo.

###### **Origens**

* **1989-1990:** O conceito de HTML foi desenvolvido por Tim Berners-Lee, um cientista da computação britânico, enquanto trabalhava no CERN (Organização Europeia para a Pesquisa Nuclear). Ele queria criar uma maneira de organizar e compartilhar documentos científicos de forma eficiente. Em 1991, Berners-Lee lançou o primeiro site da web, que usava HTML para estruturar o conteúdo.

#### **Aula 2.B**

* **HTML 1.0 (1991):** A primeira versão oficial do HTML foi bastante simples. Ela permitia a criação de documentos com uma estrutura básica, como títulos, parágrafos e links.
* O W3C, ou World Wide Web Consortium, é uma organização internacional que desenvolve padrões e diretrizes para garantir a interoperabilidade e o crescimento da web. Vamos explorar um pouco mais sobre a sua história e funções
  O principal objetivo do W3C é promover a padronização e garantir que os padrões da web sejam implementados de maneira uniforme em diferentes plataformas e dispositivos. Isso ajuda a manter a web aberta e acessível, evitando que diferentes tecnologias se tornem incompatíveis.
  O trabalho do W3C teve um impacto significativo no desenvolvimento da web, ajudando a criar uma base tecnológica sólida e consistente. Sem os padrões do W3C, a web seria muito mais fragmentada, com diferentes navegadores e plataformas possivelmente oferecendo experiências muito diferentes.
  Através da colaboração global e do desenvolvimento de padrões, o W3C tem desempenhado um papel crucial em manter a web acessível, interoperável e inovadora.
* **HTML 2.0 (1995):** A versão HTML 2.0 trouxe uma maior capacidade de formatação e estruturação de documentos. Ela introduziu elementos importantes como tabelas, formulários e a capacidade de incluir imagens.
* **HTML 3.2 (1997):** Introduziu suporte para CSS (Cascading Style Sheets), permitindo maior controle sobre a aparência dos documentos. Também adicionou novos elementos como scripts e applets Java.
* **HTML 4.0 (1997):** Com a versão 4.0, houve um foco em separar o conteúdo da apresentação, promovendo o uso de CSS para estilização. Também trouxe melhorias em acessibilidade e suporte a internacionalização.
* **HTML 4.01 (1999):** Foi uma atualização menor da versão 4.0, focando em corrigir erros e melhorar a compatibilidade.
  **CSS e JavaScript:** Durante este período, CSS e JavaScript ganharam popularidade e se tornaram ferramentas essenciais para a criação de experiências web ricas. O desenvolvimento de bibliotecas e frameworks como jQuery e o crescimento do AJAX (Asynchronous JavaScript and XML) permitiram a criação de aplicações web mais dinâmicas e interativas.
  **Web 2.0:** O conceito de Web 2.0 começou a ganhar força, destacando a evolução para uma web mais interativa e social, com foco em conteúdo gerado pelo usuário e interação dinâmica.
  **XHTML:** No início dos anos 2000, o XHTML (Extensible Hypertext Markup Language) foi introduzido como uma reformulação mais rigorosa do HTML, seguindo a sintaxe do XML. No entanto, o XHTML nunca se tornou tão amplamente adotado quanto o HTML 4.

#### **Aula 2.C**

###### **Transição para o HTML5**

* **Especificações e Propostas:** Em 2008, a WHATWG começou a desenvolver o HTML5 como uma versão evolutiva do HTML, e o W3C adotou a especificação em 2009. A ideia era criar um padrão que unisse a melhor parte das especificações anteriores e que fosse mais adequado para as necessidades da web moderna.

###### **Impacto da Transição**

* **Adaptação da Web:** A transição para o HTML5 foi um marco importante, pois atendeu às crescentes demandas da web moderna e facilitou o desenvolvimento de aplicações web mais sofisticadas e funcionais.
* **Adoção Generalizada:** HTML5 foi amplamente adotado pelos navegadores e desenvolvedores, ajudando a criar uma web mais consistente e rica em recursos.
* **HTML5 (2014):** Esta versão representa um marco significativo na evolução do HTML. HTML5 trouxe uma série de melhorias e novos recursos, incluindo:

  * **Semântica:** Novos elementos semânticos como`<header>`,`<footer>`,`<article>`, e`<section>` ajudam a descrever melhor o conteúdo.
  * **Multimídia:** Suporte nativo para áudio e vídeo com as tags`<audio>` e`<video>`.
  * **Canvas:** A tag`<canvas>` permite desenho e gráficos dinâmicos diretamente na página.
  * **APIs:** Introduziu várias APIs poderosas, como a API de armazenamento local (LocalStorage), a API de geolocalização e a API de WebSockets.

###### **Evolução Contínua**

HTML5 continua a evoluir, com adições e melhorias sendo feitas de forma contínua. O HTML é um padrão vivo e em constante desenvolvimento, adaptando-se às novas necessidades da web e à inovação tecnológica.

Essa trajetória do HTML reflete como a web evoluiu de um simples sistema de documentos interconectados para uma plataforma rica e multifacetada, permitindo a criação de experiências digitais sofisticadas.

## **Aula 03 - Estrutura básica**

#### **Aula 3.A**

No HTML, uma "tag" (ou "etiqueta") é uma parte do código que define o início e o fim de um elemento. Esses elementos são usados para estruturar e formatar o conteúdo em uma página web.

* **Tag de Abertura:** Começa com o sinal de menor `<` seguido pelo nome do elemento e, se necessário, atributos. Exemplo: `<p>`, `<div class="container">`.
* **Conteúdo:** O conteúdo é o texto ou outros elementos que ficam dentro da tag. Exemplo: `Olá, mundo!`.
* **Tag de Fechamento:** Termina com o sinal de maior `>`, seguido de uma barra `/` e o nome do elemento. Exemplo: `</p>`, `</div>`.
* **Tags Autoencerráveis:** Existem tags que não têm um valor associado a elas, ou seja, elas não possuem atributos que exigem um valor. Essas tags são frequentemente usadas para definir estruturas e formatos, mas não requerem dados adicionais para funcionar. Essas tags não têm um conteúdo interno e são autoencerráveis, ou seja, elas não possuem uma tag de fechamento. No HTML5, você pode simplesmente usar a tag de abertura e o navegador entenderá que é autoencerrável.

No HTML, **atributos** são usados para fornecer informações adicionais sobre os elementos e controlar seu comportamento ou aparência. Eles são especificados dentro da tag de abertura de um elemento.

* **Nome do Atributo:** Define o tipo de informação ou configuração.
* **Valor do Atributo:** Especifica o valor associado ao atributo, geralmente entre aspas.
* **Atributos Padrão e Personalizados:** Alguns atributos são padrão e definidos pelos padrões HTML, enquanto outros podem ser personalizados e específicos para bibliotecas ou frameworks.

* **Atributos Obrigatórios e Opcionais:** Alguns atributos são obrigatórios (como`href` para links), enquanto outros são opcionais e usados conforme a necessidade.
* **Segurança e Acessibilidade:** Sempre use atributos como`alt` para imagens e`title` para fornecer informações adicionais e melhorar a acessibilidade.

#### **Aula 3.B**

[Documento HTML5](file:///C:/Users/Germano-Silva/Documents/GitHub/Start_Capgemini/Start%20By%20Capgemini/03_Trilha_Java/01_HTML5/03%20-%20Fundamentos%20de%20HTML5%20M%C3%B3dulo%203/Aula%2003%20-%20Estrutura%20b%C3%A1sica)

#### **Aula 3.C**

O **Notepad++** é um editor de texto e código-fonte gratuito e de código aberto para Windows, amplamente utilizado por programadores e desenvolvedores devido às suas funcionalidades avançadas e interface amigável.

O **Visual Studio Code** (VSCode) é um editor de código-fonte desenvolvido pela Microsoft, amplamente utilizado no desenvolvimento de software. Ele é conhecido por sua flexibilidade, extensibilidade e recursos avançados, o que o torna uma escolha popular entre desenvolvedores em diversas áreas.

#### **Aula 3.D**


#### **Aula 3.E**

#### **Aula 3.F**

## **Aula 04 - Tags Estruturais**

#### **Aula 4.A**

#### **Aula 4.B**

#### **Aula 4.C**

#### **Aula 4.D**

#### **Aula 4.E**

#### **Aula 4.F**

#### **Aula 4.G**

#### **Aula 4.H**

#### **Aula 4.I**

#### **Aula 4.J**

#### **Aula 4.K**

## **Aula 05 - Textos, Cabeçalhos**

#### **Aula 5.A**

#### **Aula 5.B**

#### **Aula 5.C**

#### **Aula 5.D**

#### **Aula 5.E**

## **Aula 06 - Links**

#### **Aula 6.A**

#### **Aula 6.B**

#### **Aula 6.C**

#### **Aula 6.D**

## **Aula 07 - Listas**

#### **Aula 7.A**

#### **Aula 7.B**

#### **Aula 7.C**

#### **Aula 7.D**

## **Aula 08 - Tabelas, Mesas e outros**

#### **Aula 8.A**

#### **Aula 8.B**

#### **Aula 8.C**

#### **Aula 8.D**

#### **Aula 8.E**

## **Aula 09 - Tipos de Arquivos**

#### **Aula 9.A**

#### **Aula 9.B**

#### **Aula 9.C**

#### **Aula 9.D**

#### **Aula 9.E**

#### **Aula 9.F**

#### **Aula 9.G**

## **Aula 10 - Form**

#### **Aula 10.A**

#### **Aula 10.B**

#### **Aula 10.C**

## **Aula 11 - Input**

#### **Aula 11.A**

#### **Aula 11.B**

#### **Aula 11.C**

#### **Aula 11.D**

#### **Aula 11.E**

#### **Aula 11.F**

#### **Aula 11.G**

#### **Aula 11.H**

#### **Aula 11.I**

#### **Aula 11.J**

#### **Aula 11.K**

## **Aula 12 - Select**

#### **Aula 12.A**

#### **Aula 12.B**

## **Aula 13 - Button**

#### **Aula 13.A**

#### **Aula 13.B**

#### **Aula 13.C**

## **Aula 14 - Outros Campos**

#### **Aula 14.A**
