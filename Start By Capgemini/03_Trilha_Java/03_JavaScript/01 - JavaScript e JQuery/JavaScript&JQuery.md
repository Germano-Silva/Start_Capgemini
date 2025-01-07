
# Start_Capgemini
É uma iniciativa da Capgemini para acelerar a formação de novos talentos em tecnologia, valorizando a inclusão e a diversidade, com cursos online gratuitos. Você escolhe sua trilha nas principais plataformas (JAVA, SALESFORCE, SERVICE NOW e CLOUD).

# Curso de JavaScript e JQuery

Professor: Ralf Lima
[GitHub](https://github.com/ralflima)
[LinkedIn](https://www.linkedin.com/in/ralf-lima-3b93708a/)
[Instagram](https://www.instagram.com/ralflima_dev/)
[YouTube](https://www.youtube.com/@RalfLima/featured)



# Índice

- [Aula 01 - Introdução](#aula-01---introdução)
  - [Aula 1.A](#aula-1a)
  - [Aula 1.B](#aula-1b)
  - [Aula 1.C](#aula-1c)
  - [Aula 1.D](#aula-1d)
  - [Aula 1.E](#aula-1e)
  - [Aula 1.F](#aula-1f)
  - [Aula 1.G](#aula-1g)
  - [Aula 1.H](#aula-1h)
  - [Aula 1.I](#aula-1i)
  - [Aula 1.J](#aula-1j)
  - [Aula 1.K](#aula-1k)
  - [Aula 1.L](#aula-1l)
  - [Aula 1.M](#aula-1m)
  - [Aula 1.N](#aula-1n)
  - [Aula 1.O](#aula-1o)
  - [Aula 1.P](#aula-1p)
  - [Aula 1.Q](#aula-1q)
- [Aula 02 - Funções](#aula-02---funções)
  - [Aula 2.A](#aula-2a)
  - [Aula 2.B](#aula-2b)
  - [Aula 2.C](#aula-2c)
  - [Aula 2.D](#aula-2d)
  - [Aula 2.E](#aula-2e)
  - [Aula 2.F](#aula-2f)
  - [Aula 2.G](#aula-2g)
  - [Aula 2.H](#aula-2h)
  - [Aula 2.I](#aula-2i)
- [Aula 03 - Eventos](#aula-03---eventos)
  - [Aula 3.A](#aula-3a)
  - [Aula 3.B](#aula-3b)
  - [Aula 3.C](#aula-3c)
  - [Aula 3.D](#aula-3d)
  - [Aula 3.E](#aula-3e)
- [Aula 04 - Seletores de Conteúdo](#aula-04---seletores-de-conteúdo)
  - [Aula 4.A](#aula-4a)
  - [Aula 4.B](#aula-4b)
  - [Aula 4.C](#aula-4c)
  - [Aula 4.D](#aula-4d)
  - [Aula 4.E](#aula-4e)
- [Aula 05 - JQuery](#aula-05---jquery)
  - [Aula 5.A](#aula-5a)
  - [Aula 5.B](#aula-5b)
  - [Aula 5.C](#aula-5c)
  - [Aula 5.D](#aula-5d)
  - [Aula 5.E](#aula-5e)
  - [Aula 5.F](#aula-5f)
  - [Aula 5.G](#aula-5g)
  - [Aula 5.H](#aula-5h)
  - [Aula 5.I](#aula-5i)
  - [Aula 5.J](#aula-5j)
  - [Aula 5.K](#aula-5k)

## Aula 01 - Introdução
### Aula 1.A

- JavaScript foi criado em 1995 por Brendan Eich enquanto trabalhava na Netscape. Inicialmente chamado de Mocha, depois LiveScript, foi rebatizado como JavaScript para capitalizar na popularidade do Java.

- É uma linguagem de programação interpretada, dinâmica e baseada em protótipos. Originalmente desenvolvida para adicionar interatividade a páginas web, tornou-se uma das principais tecnologias da web, ao lado de HTML e CSS.

- Serve para criar experiências interativas no navegador, como validação de formulários, animações, manipulação de elementos da página e interações dinâmicas com o servidor (AJAX). Atualmente, é usado em back-end (Node.js), desenvolvimento mobile (React Native), aplicativos desktop (Electron) e até mesmo IoT.

- Hoje, JavaScript é amplamente utilizado em aplicações web modernas, frameworks (React, Angular, Vue.js) e na construção de APIs e servidores graças à sua versatilidade e comunidade ativa.

- Java e JavaScript são linguagens distintas:
  - **Java**: Linguagem orientada a objetos, tipagem estática, usada para criar aplicações robustas (desktop, mobile e servidores).
  - **JavaScript**: Linguagem leve, dinâmica e focada principalmente no desenvolvimento web, sendo executada diretamente no navegador ou em servidores com Node.js.

#### Aula 1.B

1. **Escolha o Local para o Workspace**  
   - Decida onde o workspace será criado no seu sistema de arquivos. Geralmente, pode ser dentro de uma pasta chamada `Projetos` ou `Aulas`.

2. **Crie a Pasta do Workspace**  
   - Navegue até o local escolhido e crie uma nova pasta. Por exemplo, nomeie a pasta como `JavaScript_Aulas`.

3. **Organize o Workspace**  
   - Dentro da pasta `JavaScript_Aulas`, crie subpastas para cada projeto ou aula. Exemplo:
     - `Aula_01`
     - `Aula_02`
     - `Aula_03`
   - Isso ajudará a manter os projetos organizados.

4. **Configure um Editor de Código**  
   - Baixe e instale um editor de código, como o [Visual Studio Code](https://code.visualstudio.com/), se ainda não tiver.
   - Abra o Visual Studio Code e selecione a opção **File > Open Folder** para abrir o workspace recém-criado.

5. **Inicie um Projeto**  
   - Dentro de uma subpasta (por exemplo, `Aula_01`), crie os seguintes arquivos básicos:
     - `index.html`: Estrutura básica de uma página HTML.
     - `style.css`: Para estilização (opcional).
     - `script.js`: Para o código JavaScript.

6. **Adicione um Servidor Local (Opcional)**  
   - Instale a extensão **Live Server** no Visual Studio Code para facilitar a execução e o teste dos projetos diretamente no navegador.
   - Clique com o botão direito no arquivo `index.html` e selecione **Open with Live Server**.

7. **Configure o Controle de Versão (Opcional)**  
   - Se quiser salvar o progresso do workspace, instale o [Git](https://git-scm.com/) e conecte o workspace a um repositório no GitHub:
     - Execute `git init` no terminal dentro do workspace.
     - Faça commits regulares do progresso de cada aula.

8. **Organize o Conteúdo para as Aulas**  
   - Dentro de cada subpasta de aula, mantenha anotações, exemplos de código e exercícios separados para facilitar a consulta.

9. **Teste seu Ambiente**  
   - Certifique-se de que o `index.html` pode ser executado no navegador e que o JavaScript está funcionando corretamente. Adicione um código simples no `script.js` para testar, como:
     ```javascript
     console.log("Ambiente configurado com sucesso!");
     ```

10. **Mantenha o Workspace Atualizado**  
    - Adicione novas subpastas para cada nova aula e siga a mesma estrutura.

#### Aula 1.C

- Na aula de hoje, trabalhamos com a **estrutura base do JavaScript** e criamos um arquivo HTML para iniciar nossos projetos.  

- Foi explicado como organizar os arquivos, sugerindo salvar com um nome que facilite a identificação, como `01_estrutura_base.html`.

- Estrutura básica criada no arquivo HTML:
  - Declaração do tipo de documento: `<!DOCTYPE html>`.
  - Tags principais: `<html>`, `<head>`, `<meta charset="UTF-8">`, `<title>` e `<body>`.
  - O título foi definido como "Estrutura Base".

- Introdução ao uso do JavaScript dentro do HTML:
  - O JavaScript será escrito dentro de uma tag `<script>` localizada no `<head>` do arquivo.
  - Foi recomendado adicionar comentários para organizar e identificar melhor o código JavaScript.

- Esta estrutura será a base para os próximos exemplos do curso.  

#### Aula 1.D

- A aula abordou o uso de **caixas de mensagem** no JavaScript para orientar o usuário em interações no site, como validações de formulários.

- Introduzimos o comando `alert` para exibir mensagens simples ao usuário.

- As caixas de mensagem são úteis para melhorar a interação e a navegação do usuário em sites e formulários.  

#### Aula 1.E
- A aula abordou o conceito de **variáveis** no JavaScript, usadas para armazenar e manipular diferentes tipos de dados.

- **Tipos de variáveis**:
  - Texto (string): Exemplo, nome armazenado como `"Ralf"`.
  - Numéricas: Exemplo, idade armazenada como `28`.
  - Decimais: Exemplo, altura armazenada como `1.80`.
  - Booleanas (lógicas): Verdadeiro ou falso, como `true` ou `false`.

- **Regras para criação de variáveis**:
  - Não usar caracteres especiais ou espaços.
  - Não começar o nome da variável com números.
  - Utilizar nomes coesos e legíveis. Exemplos: `nomeDaEmpresa` ou `nome_empresa`.

- Foi explicado o uso da função para exibir os valores das variáveis e como evitar erros comuns ao manipular os dados.

#### Aula 1.F
- A aula introduziu os **operadores relacionais** no JavaScript, usados para realizar comparações e retornar valores booleanos (`true` ou `false`).

- **Operadores Relacionais**:
  - **Maior (`>`):** Verifica se um número é maior que outro.
  - **Menor (`<`):** Verifica se um número é menor que outro.
  - **Igualdade (`==`):** Verifica se dois valores são iguais.
    - O operador `=` é usado para atribuição, enquanto `==` é usado para comparação.
  - **Maior ou Igual (`>=`):** Verifica se um número é maior ou igual a outro.
  - **Menor ou Igual (`<=`):** Verifica se um número é menor ou igual a outro.
  - **Diferente (`!=`):** Verifica se dois valores são diferentes. 

#### Aula 1.G
- **Condicional simples** no JavaScript, usado para executar ações baseadas em condições.

- **Conceito do condicional `if`**:
  - Avalia uma condição e executa o bloco de código correspondente se a condição for verdadeira.

- **Estrutura do condicional `if-else`**:
  - O bloco `if` verifica a condição.
  - O bloco `else` é opcional e executa uma ação caso a condição seja falsa.
- O uso do condicional simples permite criar validações básicas que serão expandidas em futuras implementações.  

#### Aula 1.H
- **Condicional alinhado**, usado para avaliar múltiplas condições e fornecer diversas respostas baseadas nos resultados.

- **Funcionamento**:
  - A estrutura básica utiliza `if`, `else if` e `else` para organizar as condições.
  - O JavaScript avalia as condições em sequência. Quando uma é atendida, o código correspondente é executado, e as demais são ignoradas.

- **Aplicação**:
  - Um exemplo prático foi a avaliação de médias escolares, com respostas diferentes para cada intervalo de notas:
    - Nota igual a 10: "Parabéns".
    - Nota entre 9 e 9.9: "Ótimo".
    - Nota entre 8 e 8.9: "Bom".
    - Nota entre 7 e 7.9: "Na média".
    - Nota entre 5 e 6.9: "Em exame".
    - Nota abaixo de 5: "Reprovado".

- O condicional alinhado permite criar validações mais detalhadas e flexíveis para diferentes cenários.  

#### Aula 1.I

- O operador lógico E (`&&`) é utilizado para validar se todas as condições especificadas em uma condicional são verdadeiras. Ele permite verificar múltiplas condições simultaneamente em estruturas de decisão como `if`.

- Serve para garantir que todas as condições sejam atendidas antes de executar um bloco de código. É uma boa prática organizar cada condição entre parênteses para facilitar a leitura e evitar lógicas excessivamente complexas em uma única verificação.

#### Aula 1.J

- O operador lógico OU (`||`) é usado para validar se pelo menos uma das condições em uma condicional é verdadeira. Ele permite que uma das opções avaliadas atenda ao critério para que o bloco de código seja executado.

- Sua utilidade está em criar verificações flexíveis, onde apenas uma condição precisa ser verdadeira para cumprir o objetivo. É importante organizar as condições em parênteses para facilitar a leitura e evitar ambiguidades. Pode ser utilizado com duas ou mais comparações, ampliando as possibilidades de validação em cenários diversos.


#### Aula 1.K

- O operador lógico NÃO (`!`) é utilizado para inverter o valor de uma variável booleana, transformando `true` em `false` e vice-versa. 

- É aplicado em verificações onde é necessário negar uma condição antes de avaliá-la. Sua utilidade está em simplificar a lógica ao trabalhar com valores booleanos. Para garantir clareza no código, organize bem as condições e evite negativas excessivas, que podem dificultar a leitura e compreensão.

#### Aula 1.L

- A estrutura de escolha `switch` é utilizada para executar diferentes blocos de código com base no valor de uma variável, sendo uma alternativa mais compacta aos condicionais `if-else` em casos de comparações de igualdade.

- Ela é útil para simplificar verificações com múltiplas possibilidades, especialmente quando há muitos casos a serem tratados. É importante lembrar que apenas comparações de igualdade são suportadas e que o comando `break` deve ser utilizado para finalizar cada caso, evitando a execução dos demais. O uso do `default` permite tratar valores não previstos, garantindo uma resposta padrão no código.


#### Aula 1.M

- O laço de repetição `while` é utilizado para executar uma ação repetidamente enquanto uma condição for verdadeira. Sua estrutura consiste em uma validação dentro de parênteses e o bloco de ações dentro de chaves.

- Esse laço é útil para situações em que o número de repetições depende de uma condição dinâmica. É essencial inicializar e incrementar um índice para evitar um looping infinito, garantindo que a condição eventualmente se torne falsa. Pode ser aplicado em diversas tarefas, como exibir mensagens, realizar validações ou iterar sobre dados de um banco de dados.

#### Aula 1.N

- O laço de repetição `do...while` é utilizado para executar uma ação pelo menos uma vez, independente da condição, e verificar a validação posteriormente. Sua estrutura inicia com o bloco `do` contendo as ações a serem executadas, seguido pela condição no `while`.

- É ideal para situações em que uma ação deve ser garantidamente realizada antes de qualquer validação, como exibir mensagens ou executar funções. Assim como no laço `while`, é importante garantir um incremento ou mudança na variável utilizada na condição, evitando loops infinitos. 


#### Aula 1.O

- O laço de repetição `for` é utilizado para executar ações com base em um número pré-determinado de iterações. Ele funciona com três parâmetros essenciais: valor inicial, condição de término e incremento ou decremento.

- Sua estrutura permite maior controle sobre o número de repetições e é ideal para cenários em que o número de iterações é conhecido. O índice é geralmente declarado dentro do próprio `for`, seguindo o padrão da linguagem. É importante configurar corretamente os parâmetros para evitar loops desnecessários ou infinitos, garantindo a eficiência do código.

#### Aula 1.P

- Um vetor ou array é uma estrutura que funciona como um banco de dados temporário, permitindo armazenar, manipular e exibir múltiplas informações enquanto a página estiver aberta. Ele deixa de existir ao fechar o navegador ou atualizar a página.

- Os dados no vetor são organizados por posições, que começam no índice zero. Essa estrutura é útil para armazenar coleções de dados, como listas de itens, e permite acessar ou manipular elementos individuais por meio de suas posições. Boas práticas incluem manter a organização dos dados e nomear os vetores de forma clara e descritiva.

#### Aula 1.Q

- Um vetor de objetos é uma estrutura que armazena múltiplos objetos, cada um contendo várias características ou atributos. Diferente de um vetor convencional que armazena apenas um valor por posição, ele permite agrupar informações adicionais, como nome, carga horária e local.

- Essa estrutura é útil para organizar dados mais complexos, como listas com várias propriedades por item. Para acessar as informações, utilizam-se os índices das posições do vetor e os nomes dos atributos do objeto. É importante manter a consistência na organização dos dados e evitar redundâncias nos atributos.

## Aula 02 - Funções

#### Aula 2.A

- Funções são ações definidas no código para executar uma tarefa específica quando solicitada, como validações, manipulações de dados ou envio de informações para o banco de dados. Elas podem ser criadas pelo desenvolvedor ou aproveitadas das funções nativas da linguagem.

- No JavaScript, funções são fundamentais para criar páginas dinâmicas e interativas, permitindo responder a eventos como cliques de botões ou entrada de dados pelo usuário. 

- Boas práticas incluem manter funções bem nomeadas, modularizadas e reutilizáveis para facilitar a manutenção e o entendimento do código.

#### Aula 2.B

**Contando Caracteres com Funções de Texto**

- A função para contar caracteres é amplamente utilizada em validações de entrada de dados, como nome, e-mail, número de conta ou outras informações que requerem um tamanho mínimo ou máximo. Ela contabiliza letras, números e espaços.

- No JavaScript, isso pode ser feito usando a propriedade `.length`. Por exemplo, ao atribuir uma string a uma variável e chamar `.length`, o resultado será o total de caracteres dessa string. É uma solução prática para verificar o cumprimento de requisitos em campos de formulários e melhorar a experiência do usuário com validações precisas.

#### Aula 2.C



#### Aula 2.D



#### Aula 2.E



#### Aula 2.F



#### Aula 2.G



#### Aula 2.H



#### Aula 2.I

## Aula 03 - Eventos



#### Aula 3.A



#### Aula 3.B



#### Aula 3.C



#### Aula 3.D



#### Aula 3.E

## Aula 04 - Seletores de Conteúdo



#### Aula 4.A



#### Aula 4.B



#### Aula 4.C



#### Aula 4.D



#### Aula 4.E

## Aula 05 - JQuery



#### Aula 5.A



#### Aula 5.B



#### Aula 5.C



#### Aula 5.D



#### Aula 5.E



#### Aula 5.F



#### Aula 5.G



#### Aula 5.H



#### Aula 5.I



#### Aula 5.J



#### Aula 5.K
