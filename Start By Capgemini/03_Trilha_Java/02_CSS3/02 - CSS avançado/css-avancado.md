## **Aula 02 - Apresentação do Curso**

#### **Aula 2.A**

**CSS AVANÇADO**

* Pré-processadores CSS, como SASS e LESS
* Variáveis, Loopings, Funções e operações para Pré- processadores CSS.
* PostCSS
* Shadow DOM
* Styled Components
* CSS Modules

## **Aula 03 - Processadores CSS**

#### **Aula 3.A**

**Introdução - CSS**

O Cascading Style Sheets (CSS) é uma "folha de estilo" composta por "camadas" e utilizada para definir apresentação (aparência) em páginas da internos adotam para o seu desenvolvimento linguagens de  marcação (como XML HTML e XHTML).

**Pré-processadores CSS**

* CSS não possui o dinamismo e alguns recursos de Ruby, Python ou JavaScript.
* A falta de dinamismo deixa nosso código extenso e repetitivo.
* Existem linguagens intermediárias, os pré-processadores, que adicionam recursos para criar estilos com menos código.
* São interpretadores de código.
* Permitem gerar CSS a partir de um arquivo de outra sintaxe, conforme o pré-processador utilizado.
* Leem todo o código gerado e convertem para CSS (podendo ser minificado, se assim estiver definido).
* Possuem funcionalidades que não existe no CSS puro, como herança por exemplo.
* Bons exemplos são:
  * LESS
  * Sass
  * Stylus
* Eles tem semelhanças, logo vale a pena identificar qual agrada mais e qual irá atender melhor sua demand

#### **Aula 3.B**

**Vantagens:**

* Maioria permite a criação de Variáveis, Condicionais, Repetição, Imports/Extends, Funções e Mixins.
* Facilitam a manutenção do código.
* Permite um código limpo.
* Códigos CSS flexíveis e reutilizáveis.
* Linguagem/estrutura de melhor entendimento para pessoas e "menos" para a máquina.

**Desvantagens:**

* Aumento de complexidade em relação ao CSS puro.
* Devido a este aumento de complexidade, aumenta também a chance de baixo desempenho.

#### **Aula 3.C**

**LESS**

* É um pré-processador de CSS.
* Amplia a capacidade do CSS e que compila mais rápido que outros pré processadores.
* É baseado em JavaScript (não precisa conhecer a linguagem).
* Reduz redundância de código.
* Usado por várias empresas e frameworks, como o Bootstrap.
* Permite o uso de variáveis, funções, cálculos e hierarquia.
* Site: Lesscss.org
* Instalação no NodeJs: npm install less
  * Não é obrigatório, pois também funciona sem a instalação.

#### **Aula 3.D**

**Arquivo HTML**

* `<link rel="stylesheet/less" type="text/css" href="styles.css" />`
* A parte importante do link é o stylesheet/less onde faz a definição do processamento.
* `href="styles.css"` pode ser também `href="styles.less"`
* https://lesscss.org/

#### **Aula 3.E**

**Variáveis**

* Usa o @
  * Exemplo: @cor
* E ao invés de utilizar Uma determinado valor, você usa a variável criada.
* Facilita a mudança de propriedades do CSS de forma mais dinâmica e rápida.

#### **Aula 3.F**

**Hierarquia**

* Pode ser usado de forma mais intuitiva, colocando um dentro do outro:

```
p{
    color: @cor;
    b{
        color: @cor2;
    }
}
```

#### **Aula 3.G**

**Função**

* Permite a manipulação de valores a partir de uma lista de funções predefinidas pelo LESS.
* Permite transformar um valor noutro, manipular condicionais, fazer cálculos, etc.
* Site: https://lesscss.org/functions/

#### **Aula 3.I**

**Mixins**

* Usado quando há itens iguais em mais de um seletor e acaba usando a mesma estrutura de função.
* E como criar "funtions" dentro do CSS, com passagem ou não de parâmetros.
* Possibilita uso de valores padrão.
* Evita repetições.
  Função:

```
h1 {
    .drop-shadow();
    color: red;
}

.drop-shadow(){
    text-shadow: 2px 1px 1px #ccc;
    text-decoration: underline;
}
```

#### **Aula 3.J**

#### **Aula 3.K**

**Condições/lf**

Pode ser usado para fazer alguma condição de cores para tratar um valor padrão.

```
& when (@color = ") {
    color: darkgreen;
}else{
    color: @color;
}
```

#### **Aula 3.L**

**Math**

* Ao fazer uma configuração, a definição de um estilo, você poder fazer cálculos para definir padrões/proporcionalidades.
* Funciona também com cores.
* Opções: + - * /
* Devido às versões do Less, em algumas o/não funcionalidade a não ser que force o ./ que está obsoleto atualmente

#### **Aula 3.M**

Arquivos LESS são uma extensão do CSS que permitem usar variáveis, funções e outros recursos avançados para escrever folhas de estilo de maneira mais eficiente e organizada. No entanto, erros podem ocorrer durante a escrita ou compilação de arquivos LESS.

* Use uma ferramenta de linting: Ferramentas como lesshint podem ajudar a identificar erros e problemas de estilo.
* Consulte a documentação: A documentação oficial do LESS é uma ótima fonte para entender a sintaxe e os recursos disponíveis.
* Verifique o console de erros: A maioria dos compiladores LESS fornece mensagens de erro detalhadas que podem ajudar a identificar e corrigir problemas.

#### **Aula 3.N 3.O 3.P**

Os exercicio e o servido em Node.js não foram realizados devido não ser realizado o cursos de JavaScript.

## **Aula 04 - SASS**

#### **Aula 4.A**

**SASS**

* Sass é Uma extensão de CSS que empodera o CSS básico.
* É um pré-processador de CSS, assim como o Less.
* Permite o uso de variáveis, funções, cálculos e hierarquia.
* É uma Gem do Ruby, ou seja, uma biblioteca escrita em Ruby.
* Site: https://sass-lang.com/

#### **Aula 4.B**

**SASS**

* Exemplos de conversores online:
  - https://isonformatter.org/scss-to-css
  - https://codebeautify.org/sass-to-css-converter
* Plug-in Live Sass Compiler para VSCode.
* Estes são exemplos, pode usar outros conforme desejar
* Instalação da extenção:
  - Name: Live Sass Compiler
  - Id: glenn2223.live-sass
  - Description: Compile Sass or Scss to CSS at realtime.
  - Version: 6.1.2
  - Publisher: Glenn Marks
  - VS Marketplace Link: https://marketplace.visualstudio.com/items?itemName=glenn2223.live-sass

#### **Aula 4.C**

* Para variável se usa o $ e não o conforme outras linguagens.
* Permite usar os formatos .sass e .scss.

  * .scss é mais parecido com a sintaxe do CSS e LESS e é a que usaremo

    $cor: red;
    .item{
    color: $cor;
    }

    * .sass é mais parecido com a sintaxe do Pug, ou seja, sem abertura.

      $cor: red;
      .item
      color: $cor;

  #### **Aula 4.D**


  * Para funções, usamos o @mixin para a declaração

    @mixin fundoP($color) {
    backg round -color:$color;
    }

    * Na chamada usamos o @include

      .tipo {
      @include fundoP($cor);
      }

    #### **Aula 4.E**

    **Hierarquia**


    * Pode ser usado de forma mais intuitiva, colocando um dentro do outro.

      .tipo {
      @include fundoP($cor2);
      a{
      color: $cor;
      }
      }

    #### **Aula 4.F**

    **Import*** É possível fazer o uso de imports:

    * @use 'base';
    * @import 'base'; / *este está em desuso
    * Ao contrário das importações de CSS simples, que exigem que o navegador faça varias solicitações HTTP à medida que renderiza sua página, aqui importa tudo de uma vez, visto que irá se tornar só um arquivo CSS.

    #### **Aula 4.G**

    **Operadores/Math**

    * ```>, >=, <, <= ==``` e ```!= ``` para comparações.
    * ```+, -, *``` e ``` /``` para números.
    * ```+``` para concatenar strings.
    * Exemplos:

      1 + 2 * 3 == 1 + (2 * 3) // true

      * true or false and false == true or (false and false) // true

        ((1 + 2)* 3 + 4) * 5; // 65

      #### **Aula 4.H**

      **Remover aspas de uma string**


      * ```#{$variável + 1}```
      * Cria uma string sem aspas
      * Se for usar como número, pode não funcionar, pois apesar de parecer um número não é.
      * Se for para transformar em número, use $number * 1 px.

      #### **Aula 4.I**

      **Repetição/For/Looping**

      * É possível o há um padrão de repetição entre alguma configuração:
      * Exemplo:

        $cor: red;

        @for $i from 1 through 3 {
        $nome: 'tipo' + $i;
        #{$nome} {
        background-color: lighten($cor, $i * 5%);
        }
        }

      #### **Aula 4.J**

      **Vamos criar um projeto:**

      * Você pode usar uma página sua como base, criando uma cópia.
      * Sugiro Usar algum plug-in, como segunda opção, o NodeJs.
      * Se já tiver um CSS, pode convertê-lo para SASS.
      * Obrigatório usar variáveis, mixins, cálculos, looping e hierarquia.

      ## **Aula 05 - Pós CSS**

      #### **Aula 5.A**

      **POSTCSS**

      * E um ecossistema de plugins personalizados e de ferramentas.
      * Existe mais de 200 plugins e é possível criar mais.
      * Pode ser usado com pré ou pós processador.
      * Como pós processador, você não terá muito controle do que será feito, diferente do que é feito com o Less ou Sass.

      ![POSTCSS](img/postcss.png)

      #### **Aula 5.B**

      Exemplo:

      * Entrada:

        p{
        display: flex;
        }

        * Saída:

          p{
          display: -webkit-box;
          display: -ms-flexbox;
          display: flex;
          }

        #### **Aula 5.C**


        * É uma ferramenta para transformas CSS com JavaScript.
        * No desenvolvimento podemos usar conceitos já apresentados neste  curso, visando evitar repetição de código, reuso, código limpo, organizada de fácil manutenção.
        * Podemos usá-lo através de linha de comando ou taskrunners.
        * É sempre importante consultar as documentações para entender e tirar o melhores benefícios.
        * https://github.com/iedmao/postcss-middleware
        * NodeJs

          * npm install postcss-middleware
        * https://github.com/postcss/postcss
        * https://www.postcss.parts/
        * https://postcss.org/

        #### **Aula 5.D**

        * Exemplos de plug-ins
          * PostCSS Brazilian Portuguese Stylesheets
            * https://www.npmis.com/package/postcss-brazilian-portuguese-stylesheets
            * Permite a programação em português e processa para CSS.
          * Autoprefixer
            * https;//github.com/postcss/autoprefixer#browsers
            * https://autoprefixer.github.io/
            * Usado pela Google e Twitter, por exemplo
            * Usa dados do https://caniuse.com/ para aplicar regras atualizadas.
          * StyleLint
            * https://stylelint.io/
            * Valida e revisa códigos CSS, evitando erros

        ## **Aula 06 - Componentes Estilizados**

        #### **Aula 6.A**

        **STYLED COMPONENTS**

        * É uma biblioteca para React/React Native que permite uso de estivos a nível  de componentes.
        * É baseado em JavaScript com CSS.
        * Documentação: https://styled-components.com/docs

        #### **Aula 6.B**

        **Principais vantagens:**

        * Evita erros de nome de classe.
        * Exclusão mais fácil de CSS: se excluir um componente não usado, todos seus estilos filhos também são excluídos juntos. Além disso há ferramenta para detectar se o componente é ou não usado.
        * Fácil manutenção.

        #### **Aula 6.C**

        **Instalação:**

        * YARN
          * yarn add styled-components
        * NPM
          * install create-react-app
          * Criação de projeto:
          * init react-app my-app
          * create-react-app my-app
        * Instalação do Styled-components
          * npm install styled-components
        * Iniciar a aplicação:
          * npm start

        #### **Aula 6.D**

        **Exemplo de uso:**
        import styled from 'styled-components';
        const Title = styled.h1'
        color: red;
        ';

        <Title>Página 01 </Title>

        Realizado a criação de um app simples chamado my-app.

        #### **Aula 6.E**
        
        Realizado a criação de um app simples chamado my-app-2.

        Para melhor compreender os conceitos foi realizado os cursos abaixo.

        * [NPM](https://www.youtube.com/watch?v=g-V5qptW2oo&list=PLbV6TI03ZWYVjruiKLeb3m2rEXeYsG6RQ)

        * [React](https://www.youtube.com/watch?v=mXuxPrs6oHE&list=PLbV6TI03ZWYVIiHL5XBvefrVwhcLo7XYN)

        #### **Aula 6.F**

        Vamos dar continuidade ao nosso projeto:
        - Criar um projeto com 5 páginas, simulando um site.
        - Utilizar Styled Components além de CSS num arquivo separado.
        - Tratar usabilidade e boas práticas.

        Exercício realizado e hospedado no link:[Travel](https://github.com/Germano-Silva/Start_Capgemini/tree/main/Start%20By%20Capgemini/03_Trilha_Java/02_CSS3/02%20-%20CSS%20avan%C3%A7ado/Aula_06/travel)

        ## **Aula 07 - Módulos CSS**

        #### **Aula 7.A**

          É um processo que ocorre no processo de build, que alteram o nome de classes e seletores para ter escopo local.
          ```JavaScript
          import styles from "./styles.css";
          element.innerHTML = <h1 class= "${styles.title}"> Titulo Exemplo </h1>
          ```
          ```HTML
          <h1 class= "styles_title_XPT0123"> Titulo Exemplo </h1>
          ```
          Geralmente feito por JavaScript.
          Exemplos: 
          [Bootstrap](https://getbootstrap.com/docs/5.3/getting-started/introduction/)
          [Jest](https://iestis.io/pt-BR/docs/webpack).

          Vem para sanar problemas como dependências, eliminação de código morto e classes globais.
          E mais vantajoso em projetos grandes.
          Projetos pequenos pode aumentar a complexidade de forma de desnecesária.

        #### **Aula 7.B**
        Criado um projeto node e react basico.
        Modificado o nome do arquivo App.css para App.module.css.
        Após isso será necessario modificar o arquivo App.js configurando a importação.
        ```JavaScript
        import estilo from App.module.css
        ```
        Depois desse processo tera que modificar todas as classe pois as mesmas estarão em formato hash convertendo as classes em uma sequência fixa de caracteres.

        Com base nisso foi realizado as seguintes modificações:
        ```JavaScript
        import logo from './logo.svg';
        import estilo from'./App.module.css';

        function App() {
          return (
            // utilizando o modulo css para estilizar o componente quando a classe não possuí "-" no nome.
            <div className={estilo.App}>
              {/* utilizando o modulo css para estilizar o componente quando a classe possuí "-" no nome. */}
              <header className={estilo["App-header"]}>
                <img src={logo} className={estilo["App-logo"]} alt="logo" />
                <p>
                  Edit <code>src/App.js</code> and save to reload.
                </p>
                <a
                  className={estilo["App-link"]}
                  href="https://reactjs.org"
                  target="_blank"
                  rel="noopener noreferrer"
                >
                  Learn React
                </a>
              </header>
            </div>
          );
        }

        export default App;
        ```

        Desta maneira podemos utilizar diversos modulos feitos com o mesmo nome de classe que não vai interferir na estilização da pagina caso não seja feito a troca do modulo impotado.

        #### **Aula 7.C**

        **STYLED COMPONENTS VS CSS MODULES.**

        Se você gosta de usar/programar em CSS e/ou se manter um pouco mais conservador, a sugestão é usar CSS Modules.
        Na prática, é quase o mesmo CSS puro, porém terá o escopo adicinal exceto nos casos que deixar a definição de escopo global.
        Caso não queira e/ou não goste e/ou simplesmente decida não usar CSS, o Styled Components é uma ótima opção
        Com ele não terá mais os arquivos .css. Usa tudo com JavaScript.

        #### **Aula 08**

        **Web Components**

        #### **Aula 8.A**

        #### **Aula 8.B**

        #### **Aula 8.C**

        #### **Aula 8.D**

        ## **Aula 09 - Google Mobile**

        #### **Aula 9.A**

        #### **Aula 9.B**

        ## **Aula 10 - Considerações Finais**

        #### **Aula 10.**

        A
