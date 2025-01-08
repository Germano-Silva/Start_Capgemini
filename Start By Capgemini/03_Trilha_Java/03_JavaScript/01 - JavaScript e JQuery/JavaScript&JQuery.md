
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

**Conceito:** **Funções `toUpperCase()` e `toLowerCase()`.**

**Para que serve:** *As funções `toUpperCase()` e `toLowerCase()` são usadas para converter strings (textos) para letras maiúsculas ou minúsculas, respectivamente. Isso é útil para padronizar dados, especialmente em situações como validação de formulários, comparação de strings e organização de informações em bancos de dados.*

**Como utilizar:**

*   `toUpperCase()`: Converte uma string para letras maiúsculas. Sintaxe: `string.toUpperCase()`. Exemplo: `palavra.toUpperCase()` (onde `palavra` é uma variável contendo uma string).
*   `toLowerCase()`: Converte uma string para letras minúsculas. Sintaxe: `string.toLowerCase()`. Exemplo: `palavra.toLowerCase()`.

**Boas práticas:**

*   Utilizar essas funções antes de comparar strings para evitar erros causados por diferenças de capitalização (maiúsculas/minúsculas).
*   Em validação de formulários, converter os dados de entrada do usuário para um formato consistente (maiúsculas ou minúsculas) antes de armazená-los no banco de dados. Isso previne problemas de busca e comparação.
*   Em bancos de dados, a distinção entre maiúsculas e minúsculas pode afetar a integridade dos dados. O uso dessas funções ajuda a garantir a consistência.
*   Não confie apenas na validação do lado do cliente (JavaScript). É crucial ter validações também no servidor para garantir a segurança e a integridade dos dados.

#### Aula 2.D

**Conceito:** **Funções `indexOf()` e `lastIndexOf()`.**

**Para que serve:** *As funções `indexOf()` e `lastIndexOf()` são usadas para encontrar a posição (índice) de um determinado caractere ou substring dentro de uma string. `indexOf()` retorna a posição da primeira ocorrência, enquanto `lastIndexOf()` retorna a posição da última ocorrência.*

**Como utilizar:**

*   `indexOf()`: Retorna o índice da primeira ocorrência de um valor especificado em uma string. Se o valor não for encontrado, retorna -1. Sintaxe: `string.indexOf(valorPesquisado, [índiceInicial])`. O parâmetro `índiceInicial` é opcional e especifica a posição a partir da qual a busca deve começar.
*   `lastIndexOf()`: Retorna o índice da última ocorrência de um valor especificado em uma string, pesquisando a string de trás para frente. Se o valor não for encontrado, retorna -1. Sintaxe: `string.lastIndexOf(valorPesquisado, [índiceInicial])`. O parâmetro `índiceInicial` é opcional e especifica a posição a partir da qual a busca deve começar a partir do final.

**Boas práticas:**

*   Lembrar que a indexação em strings começa em 0. O primeiro caractere está no índice 0, o segundo no índice 1, e assim por diante.
*   Usar `indexOf()` para encontrar a primeira ocorrência de um caractere ou substring.
*   Usar `lastIndexOf()` para encontrar a última ocorrência de um caractere ou substring.
*   Verificar o retorno das funções (`-1`) para tratar casos em que o valor pesquisado não é encontrado na string.
*   Essas funções são úteis para validações de dados, como verificar a presença de um caractere específico em um email ou nome de usuário.

#### Aula 2.E

**Conceito:** **Função `slice()`.**

**Para que serve:** *A função `slice()` é utilizada para extrair uma parte de uma string, retornando uma nova string sem modificar a original. Ela permite definir o ponto de início e, opcionalmente, o ponto de fim da extração.*

**Como utilizar:**

*   `slice(índiceInicial)`: Extrai a parte da string a partir do `índiceInicial` até o final da string.
*   `slice(índiceInicial, índiceFinal)`: Extrai a parte da string do `índiceInicial` até o `índiceFinal` (não incluindo o caractere no `índiceFinal`).

**Boas práticas:**

*   Lembrar que a indexação de strings começa em 0.
*   Se o `índiceInicial` for negativo, ele conta a partir do final da string. Por exemplo, `-1` representa o último caractere.
*   Se o `índiceFinal` for omitido, a extração vai até o final da string.
*   Se o `índiceFinal` for negativo, ele também conta a partir do final da string.
*   `slice()` não modifica a string original; ela retorna uma nova string contendo a parte extraída.
*   Utilizar `slice()` para extrair partes relevantes de textos, como em resumos de artigos para blogs ou para processar dados de strings.

#### Aula 2.F

**Conceito:** **Função `Math.round()`.**

**Para que serve:** *A função `Math.round()` é usada para arredondar um número para o inteiro mais próximo.*

**Como utilizar:** `Math.round(numero)`.

**Boas práticas:**

*   Números com a parte decimal menor que 0.5 são arredondados para baixo.
*   Números com a parte decimal igual ou maior que 0.5 são arredondados para cima.
*   `Math.round()` retorna um valor numérico inteiro.
*   Útil para exibir valores formatados sem casas decimais, como notas ou valores monetários em algumas situações.

#### Aula 2.G

**Conceito:** **Funções `Math.min()` e `Math.max()`.**

**Para que servem:** *Encontram o menor e o maior valor, respectivamente, entre um conjunto de números.*

**Como utilizar:**

*   `Math.min(num1, num2, ..., numN)`: Retorna o menor valor.
*   `Math.max(num1, num2, ..., numN)`: Retorna o maior valor.

**Boas práticas:**

*   Aceitam múltiplos argumentos numéricos.
*   Retornam `NaN` se algum argumento não for numérico.
*   Podem ser usados com arrays via spread operator (`...`). Exemplo: `Math.min(...meuArray)`.

#### Aula 2.H

**Conceito:** **Função `Math.random()`.**

**Para que serve:** *Gera um número pseudoaleatório entre 0 (inclusivo) e 1 (exclusivo).*

**Como utilizar:**

*   `Math.random()`: Retorna um número decimal entre 0 e 1.
*   Para gerar um número aleatório dentro de um intervalo específico (entre `min` e `max`, inclusivos):
    ```javascript
    Math.floor(Math.random() * (max - min + 1)) + min;
    ```

**Boas práticas:**

*   Para obter um número inteiro aleatório, utilize `Math.floor()` (arredonda para baixo) ou `Math.round()` (arredonda para o inteiro mais próximo) em conjunto com `Math.random()`.
*   Multiplicar `Math.random()` por um número define o intervalo máximo (exclusivo) do número aleatório gerado antes do arredondamento.
*   Somar um valor ao resultado da multiplicação desloca o intervalo para cima.
*   Útil para jogos, simulações e outras aplicações que necessitam de aleatoriedade.

#### Aula 2.I

**Conceito:** **Criação de Funções.**

**Para que serve:** *Funções permitem reutilizar código e criar blocos de código com funcionalidades específicas.*

**Como utilizar:**

*   `function nomeDaFuncao(parametro1, parametro2, ...)`: Define uma função com o nome `nomeDaFuncao` e parâmetros opcionais.
*   `return valor;`: Retorna um valor da função.
*   `nomeDaFuncao(argumento1, argumento2, ...);`: Chama/executa a função passando argumentos para os parâmetros.

**Boas práticas:**

*   Nomes de funções devem ser descritivos e indicar sua finalidade.
*   Parâmetros são as entradas da função.
*   `return` encerra a execução da função e retorna um valor. Se não houver `return`, a função retorna `undefined`.
*   Funções podem ser usadas para organizar o código, tornando-o mais modular e legível.

## Aula 03 - Eventos

#### Aula 3.A

**Conceito:** **Eventos em JavaScript.**

**Para que servem:** *Eventos representam ações ou ocorrências que acontecem em elementos HTML, permitindo a execução de código JavaScript em resposta a essas ações.*

**Exemplos de Eventos Abordados:**

*   **Clique (click):** Ocorre quando um elemento é clicado com o mouse. (Ex: botão que redireciona para um site)
*   **Clique Duplo (dblclick):** Ocorre quando um elemento é clicado duas vezes rapidamente. (Ex: botão que exibe um alerta)
*   **Entrada de Texto (input/change/keyup/etc.):** Ocorre quando o usuário interage com um campo de texto, digitando, alterando ou liberando uma tecla. (Ex: campo de texto onde o valor digitado pode ser usado em outra parte da página).

**Boas práticas:**

*   Eventos permitem interatividade nas páginas web.
*   Diferentes eventos correspondem a diferentes ações do usuário.
*   JavaScript possibilita a captura e o tratamento desses eventos, executando funções específicas em resposta.

#### Aula 3.B

**Conceito:** **Evento `onclick`.**

**Para que serve:** *O evento `onclick` é disparado quando um elemento HTML é clicado com o mouse.*

**Como utilizar:**

*   **HTML (inline):** `<elemento onclick="funcao()">` - Executa a função `funcao()` ao clicar no elemento.
*   **JavaScript (addEventListener):** `elemento.addEventListener('click', funcao);` - Adiciona um ouvinte de evento `click` ao elemento, executando a função `funcao()` quando o evento ocorre.

**Boas práticas:**

*   O atributo `onclick` em HTML (inline) é uma forma mais antiga de adicionar eventos. O uso de `addEventListener` em JavaScript é considerado uma prática melhor, pois permite adicionar múltiplos ouvintes para o mesmo evento e facilita a remoção de ouvintes, além de separar melhor o HTML do JavaScript.
*   `onclick` executa uma função JavaScript. Essa função pode conter qualquer código JavaScript, como exibir um alerta, modificar o conteúdo da página, enviar dados para um servidor, etc.
*   O evento `click` é um dos eventos mais comuns em JavaScript, usado para adicionar interatividade às páginas web.

#### Aula 3.C

**Conceito:** **Evento `onChange`.**

**Para que serve:** *O evento `onChange` é disparado quando o valor de um elemento HTML é alterado. É frequentemente usado com elementos `<input>`, `<select>` e `<textarea>`.*

**Como utilizar:**

*   **HTML (inline):** `<elemento onchange="funcao()">` - Executa a função `funcao()` quando o valor do elemento é alterado.
*   **JavaScript (addEventListener):** `elemento.addEventListener('change', funcao);` - Adiciona um ouvinte de evento `change` ao elemento, executando a função `funcao()` quando o evento ocorre.

**Boas práticas:**

*   O atributo `onchange` em HTML (inline) é uma forma mais antiga de adicionar eventos. O uso de `addEventListener` em JavaScript é considerado uma prática melhor.
*   Em elementos `<select>`, o evento `onChange` é disparado quando uma opção diferente é selecionada.
*   Em campos de texto `<input type="text">`, o evento `onChange` é disparado quando o elemento perde o foco *após* uma alteração no valor. Para detectar mudanças em tempo real, use os eventos `oninput` ou `onkeyup`.
*   O evento `onChange` é útil para validar formulários, atualizar outros elementos da página com base na seleção do usuário ou executar outras ações dinâmicas.

#### Aula 3.D

**Conceito:** **Evento `onload`.**

**Para que serve:** *O evento `onload` é disparado quando um elemento, ou a página inteira, termina de carregar completamente. É frequentemente usado com o elemento `<body>` para executar código JavaScript após o carregamento completo do conteúdo da página, incluindo imagens, scripts e outros recursos.*

**Como utilizar:**

*   **HTML (inline):** `<body onload="funcao()">` - Executa a função `funcao()` após o carregamento completo do corpo da página. Também pode ser usado em outros elementos, como `<img>`, para detectar quando a imagem é carregada.
*   **JavaScript (addEventListener):** `window.addEventListener('load', funcao);` - Adiciona um ouvinte de evento `load` ao objeto `window`, executando a função `funcao()` após o carregamento completo da página. Esta abordagem é preferível ao uso inline.

**Boas práticas:**

*   O atributo `onload` em HTML (inline) é uma forma mais antiga de adicionar eventos. O uso de `addEventListener` em JavaScript é considerado uma prática melhor.
*   Usar `window.addEventListener('load', ...)` garante que o código JavaScript seja executado somente após o carregamento completo de todos os recursos da página, evitando erros ao tentar acessar elementos que ainda não foram carregados.
*   `onload` é útil para executar inicializações, animações ou outras ações que dependem da disponibilidade de todos os elementos da página.
*   O evento `DOMContentLoaded` é diferente de `load`. `DOMContentLoaded` é disparado quando o HTML é completamente carregado e analisado, mas não espera o carregamento de recursos externos como imagens e folhas de estilo. O evento `load` (associado a `window`) aguarda o carregamento completo de todos os recursos.

#### Aula 3.E

**Conceito:** **Eventos de Teclado: `onkeyup`, `onkeydown` e `onkeypress`.**

**Para que servem:** *Os eventos de teclado permitem capturar as interações do usuário com o teclado, como pressionar, manter pressionada ou soltar uma tecla.*

**Tipos de Eventos de Teclado:**

*   **`onkeyup`:** Disparado quando uma tecla é *solta*. Executa a ação *após* exibir o caractere no campo (se aplicável).
*   **`onkeydown`:** Disparado quando uma tecla é *pressionada*. Executa a ação *antes* de exibir o caractere no campo (se aplicável).
*   **`onkeypress`:** Disparado quando uma tecla que produz um caractere é pressionada. Executa a ação *antes* de exibir o caractere no campo (se aplicável). *Não suporta teclas de função (F1, F2, etc.), teclas modificadoras (Alt, Ctrl, Shift) e algumas outras teclas especiais.*

**Diferenças Chave:**

*   **Ordem de Execução:** `onkeydown` -> `onkeypress` -> `onkeyup`.
*   **Suporte a Teclas Especiais:** `onkeypress` não suporta teclas de função, modificadoras e algumas outras teclas especiais, enquanto `onkeydown` e `onkeyup` suportam.
*   **`onkeypress` é considerado obsoleto em muitos casos e seu uso não é recomendado.** Os eventos `keydown` e `keyup` oferecem maior flexibilidade e abrangência.

**Boas práticas:**

*   Para a maioria dos casos de uso, `onkeydown` e `onkeyup` são as melhores opções.
*   Use `onkeydown` para detectar quando uma tecla é pressionada, independentemente do caractere que ela produz.
*   Use `onkeyup` para detectar quando uma tecla é solta, geralmente após o caractere ter sido inserido no campo.
*   Evite usar `onkeypress` devido ao suporte limitado a teclas especiais e comportamento inconsistente entre navegadores.

## Aula 04 - Seletores de Conteúdo

#### Aula 4.A

**Conceito:** **Seletores HTML em JavaScript (getElementByTagName).**

**Para que servem:** *Os seletores HTML permitem acessar e manipular elementos HTML específicos em uma página web usando JavaScript.*

**`document.getElementsByTagName()`:**

*   Este método retorna uma coleção *HTMLCollection* de todos os elementos que têm o nome de tag especificado.
*   A coleção retornada é *ao vivo* (live), o que significa que se o DOM for modificado, a coleção será atualizada automaticamente.
*   Para acessar um elemento específico na coleção, use índices numéricos (começando em 0).

**Propriedade `innerHTML`:**

*   A propriedade `innerHTML` define ou retorna o conteúdo HTML de um elemento.
*   Pode ser usada para obter o conteúdo de um elemento ou para modificar o conteúdo existente.

**Boas práticas:**

* `getElementsByTagName` retorna uma coleção de elementos. Mesmo que haja apenas um elemento com a tag especificada, ainda será retornado um HTMLCollection com um único item.
* É importante lembrar que os índices das coleções HTML começam em 0.
* A propriedade `innerHTML` é útil para manipular o conteúdo HTML dentro de um elemento, mas deve ser usada com cautela, pois pode apresentar riscos de segurança (XSS) se usada com dados fornecidos pelo usuário sem a devida sanitização.

#### Aula 4.B

**Conceito:** **Seletores HTML em JavaScript (getElementsByClassName).**

**Para que servem:** *`document.getElementsByClassName()` retorna uma coleção *HTMLCollection* de todos os elementos que possuem o nome de classe especificado.*

**`document.getElementsByClassName()`:**

*   Este método retorna um objeto *HTMLCollection* que representa uma coleção de elementos encontrados no documento que possuem a classe CSS especificada.
*   A coleção retornada é *ao vivo* (live), o que significa que se o DOM for modificado, a coleção será atualizada automaticamente.
*   Para acessar um elemento específico na coleção, use índices numéricos (começando em 0).

**Propriedade `innerHTML`:**

*   A propriedade `innerHTML` define ou retorna o conteúdo HTML de um elemento.

**Boas práticas:**

*   `getElementsByClassName` retorna uma coleção de elementos. Mesmo que haja apenas um elemento com a classe especificada, ainda será retornado um HTMLCollection com um único item.
*   É importante lembrar que os índices das coleções HTML começam em 0.
*   A propriedade `innerHTML` é útil para manipular o conteúdo HTML dentro de um elemento.

#### Aula 4.C

**Conceito:** **Seletores HTML em JavaScript (getElementById).**

**Para que serve:** *`document.getElementById()` retorna uma referência para o elemento com o ID especificado.*

**`document.getElementById()`:**

*   Este método retorna um objeto *Element* representando o elemento cujo atributo `id` corresponde à string especificada.
*   Como os IDs devem ser únicos dentro de um documento HTML, `getElementById()` é uma maneira rápida e direta de acessar um elemento específico.
*   Se nenhum elemento com o ID especificado for encontrado, o método retorna `null`.

**Propriedade `value`:**

*   A propriedade `value` é usada principalmente com elementos de formulário (`<input>`, `<select>`, `<textarea>`) para obter ou definir o valor do campo.

**Boas práticas:**

*   Utilize `getElementById` quando precisar acessar um único elemento específico com um ID conhecido. É o método mais rápido e eficiente para selecionar um elemento por ID.
*   Como os IDs devem ser únicos, não é necessário usar índices ou outras formas de iteração para acessar o elemento retornado por `getElementById`.
*   A propriedade `value` é essencial para interagir com campos de formulário, permitindo obter e modificar os dados inseridos pelo usuário.
*   Ao usar `getElementById`, certifique-se de que o ID especificado corresponda exatamente ao ID no HTML, incluindo letras maiúsculas e minúsculas.

#### Aula 4.D

**Conceito:** **Manipulação de CSS com JavaScript (style).**

**Para que serve:** *Permite modificar os estilos CSS de elementos HTML diretamente através de JavaScript.*

**Como funciona:**

*   **Acessando o elemento:** Primeiro, você precisa selecionar o elemento HTML que deseja estilizar, usando métodos como `document.getElementsByTagName()`, `document.getElementById()` ou `document.getElementsByClassName()`.
*   **Acessando a propriedade `style`:** Cada elemento HTML possui uma propriedade `style` que é um objeto contendo os estilos inline do elemento.
*   **Modificando os estilos:** Você pode acessar e modificar as propriedades CSS diretamente através da propriedade `style`. A sintaxe é `elemento.style.propriedadeCSS = "valor"`.

**Observações importantes:**

*   Nomes de propriedades CSS com hífen (`-`) são convertidos para camelCase em JavaScript. Por exemplo, `background-color` se torna `backgroundColor`, `font-size` se torna `fontSize`.
*   As unidades de medida devem ser incluídas como strings. Por exemplo, para definir o tamanho da fonte para 20 pixels, você usaria `elemento.style.fontSize = "20px"`.
*   Modificar estilos diretamente com a propriedade `style` adiciona estilos inline ao elemento, o que tem alta prioridade e pode sobrescrever estilos definidos em folhas de estilo externas ou internas.
*   Para alterar o conteúdo de um elemento, usa-se a propriedade `innerHTML`.

#### Aula 4.E

**Conceito:** **Manipulação de Atributos HTML com JavaScript.**

**Objetivo:** Modificar dinamicamente atributos de elementos HTML.

**Métodos e propriedades principais:**

*   `document.getElementsByTagName()`: Seleciona elementos pelo nome da tag.
*   `elemento.href`: Acessa ou modifica o atributo `href` de um link (`<a>`).
*   `elemento.setAttribute(nome, valor)`: Define ou altera o valor de um atributo.
*   `elemento.getAttribute(nome)`: Obtém o valor de um atributo.

**Observações:**

*   Atributos são complementos das tags HTML.
*   Acessar um elemento por `getElementsByTagName()` retorna uma coleção, sendo necessário usar o índice (ex: `[0]`) para acessar um elemento específico.

## Aula 05 - JQuery

#### Aula 5.A

**Conceito:** **Introdução ao jQuery.**

**O que é:** Uma biblioteca JavaScript criada em 2006 por John Resig.

**Contexto de criação:** Criado durante um evento BarCamp em Nova Iorque.

**Objetivo:** Simplificar o desenvolvimento JavaScript, permitindo escrever menos código para realizar mais ações. Slogan: "Write Less, Do More."

**Pré-requisitos:** HTML, CSS e JavaScript.

**Página oficial:** [jquery.com](https://jquery.com/)

**Download:** Disponível na página oficial, oferecendo opções como download direto (versões comprimida e não comprimida), instalação via gerenciadores de pacotes (ex: NPM) e uso de CDNs (ex: Google CDN, Microsoft CDN). A versão comprimida (minified) é geralmente preferida por ser mais leve.


#### Aula 5.B

**Conceito:** **Estrutura Base jQuery.**

**Objetivo:** Definir a estrutura básica para uso do jQuery em projetos.

**Componentes principais:**

1.  **Importação da biblioteca jQuery:** Através da tag `<script src="caminho/para/jquery.js"></script>`. O arquivo jQuery deve estar na mesma pasta ou em um local acessível.
2.  **Bloco `$(document).ready()`:** Garante que o código jQuery seja executado somente após o carregamento completo do DOM (Document Object Model). Sintaxe:

    ```javascript
    $(document).ready(function() {
        // Código jQuery aqui
    });
    ```

**Diferenças em relação ao JavaScript puro:**

*   O JavaScript puro executa o código linha a linha, podendo gerar erros se o código tentar acessar elementos HTML que ainda não foram carregados.
*   O jQuery, com o uso do `$(document).ready()`, resolve esse problema, executando o código somente após o carregamento completo do DOM.

**Observações:**

*   O símbolo `$` é um atalho para o objeto jQuery.
*   Dentro do bloco `$(document).ready()`, podem ser definidas funções, variáveis, laços, condicionais e outras operações.
*   Esta estrutura será utilizada nas próximas aulas.

#### Aula 5.C

**Conceito:** **Seletores jQuery.**

**Objetivo:** Selecionar elementos HTML de forma simplificada.

**Tipos de seletores:**

*   **Seletor de elemento (tag):** `$('elemento')` (ex: `$('input')`). Seleciona todos os elementos com a tag especificada. Para obter o valor de um campo de formulário, usa-se `.val()`.
*   **Seletor de ID:** `$('#id')` (ex: `$('#titulo')`). Seleciona o elemento com o ID especificado. Para obter o conteúdo textual, usa-se `.html()`.
*   **Seletor de classe:** `$('.classe')` (ex: `$('.subtitulo')`). Seleciona todos os elementos com a classe especificada. Para obter o conteúdo textual, usa-se `.html()`.

**Métodos para obter conteúdo:**

*   `.val()`: Obtém o valor de elementos de formulário (input, select, textarea).
*   `.html()`: Obtém o conteúdo HTML de um elemento.

**Observações:**

*   O jQuery utiliza o símbolo `$` para suas funções.
*   A função `alert()` do JavaScript funciona normalmente com jQuery.

#### Aula 5.D

**Conceito:** **Eventos jQuery.**

**Objetivo:** Executar ações em resposta a interações do usuário.

**Sintaxe:** `$('seletor').evento(função);`

*   `$('seletor')`: Seleciona o elemento HTML.
*   `.evento()`: Define o tipo de evento (ex: `click`, `dblclick`, `keyup`, `change`, `load`). O prefixo `on` (ex: `onclick`) não é utilizado no jQuery.
*   `função`: Define a ação a ser executada quando o evento ocorre.

**Vantagens do jQuery para eventos:**

*   Código mais organizado, separando a definição do evento do HTML.
*   Sintaxe mais concisa.

**Observação:** Os conceitos dos eventos do JavaScript se aplicam ao jQuery, com sintaxe simplificada.

#### Aula 5.E

**Conceito:** **Efeitos de Exibir e Ocultar com jQuery.**

**Objetivo:** Controlar a visibilidade de elementos HTML na página.

**Métodos jQuery:**

*   `.hide()`: Oculta o elemento selecionado.
*   `.show()`: Exibe o elemento selecionado.

**Implementação:**

1.  Selecionar o elemento que será manipulado (ex: uma imagem com a tag `<img>`).
2.  Associar um evento (ex: `click`) a um elemento disparador (ex: um botão).
3.  Dentro da função de callback do evento, usar `.hide()` para ocultar ou `.show()` para exibir o elemento alvo.

**Exemplo conceitual:**

Um botão com o ID "ocultar" ao ser clicado, oculta uma imagem. Um botão com o ID "exibir" ao ser clicado, exibe a mesma imagem.

#### Aula 5.F

**Conceito:** **Efeito Fade com jQuery.**

**Objetivo:** Criar transições de fade (esmaecimento) para exibir e ocultar elementos.

**Métodos jQuery:**

*   `.fadeIn()`: Exibe o elemento com efeito de fade-in (aparecimento gradual).
*   `.fadeOut()`: Oculta o elemento com efeito de fade-out (desaparecimento gradual).

**Controle de Tempo:**

O tempo da transição pode ser controlado de três maneiras:

1.  **Padrão (default):** Quando nenhum argumento é passado para `.fadeIn()` ou `.fadeOut()`, o tempo padrão é de 0.4 segundos.
2.  **Palavras-chave:** Usando palavras como `slow` (0.6 segundos).
3.  **Milisegundos:** Especificando um valor numérico em milisegundos (ex: `3000` para 3 segundos).

**Exemplo conceitual:**

Um elemento pode ser inicialmente oculto usando CSS (`display: none`). Ao clicar em um botão "Exibir", o elemento aparece com um efeito fade-in. Ao clicar em um botão "Ocultar", o elemento desaparece com um efeito fade-out. O tempo da transição pode ser ajustado conforme necessário.

#### Aula 5.G

**Conceito:** **Efeito Slide com jQuery.**

**Objetivo:** Criar animações de deslize vertical para exibir e ocultar elementos.

**Métodos jQuery:**

*   `.slideUp()`: Oculta o elemento com uma animação de deslize para cima.
*   `.slideDown()`: Exibe o elemento com uma animação de deslize para baixo.

**Controle de Tempo:**

O tempo da animação pode ser controlado passando um valor em milissegundos como argumento para os métodos `.slideUp()` e `.slideDown()`.

**Exemplo conceitual:**

Um elemento com a classe "mensagem" pode ser oculto com `.slideUp()` e exibido com `.slideDown()`. A velocidade da animação pode ser ajustada usando valores em milissegundos.

#### Aula 5.H



#### Aula 5.I



#### Aula 5.J



#### Aula 5.K
