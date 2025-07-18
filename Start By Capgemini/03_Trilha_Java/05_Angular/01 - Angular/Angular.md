# Curso: Angular

**Professores:**
- Willian
- Ralf Lima
  - [GitHub](https://github.com/ralflima)
  - [LinkedIn](https://www.linkedin.com/in/ralflima-3b93708a/)
  - [Instagram](https://www.instagram.com/ralflima_dev/)
  - [YouTube](https://www.youtube.com/@RalfLima/featured)

## Introdução ao Curso Angular

**Objetivos do Curso**


**Principais Temas Abordados**


**Público-Alvo**

Este curso é indicado para estudantes e profissionais interessados em aprender **Angular** para criar aplicações web modernas e escaláveis.

**Requisitos**

Para um melhor aproveitamento do curso, recomenda-se que tenha:
- Conhecimento básico de **JavaScript**.
- Noções de **HTML** e **CSS**.
- Experiência com **Node.js** e gerenciadores de pacotes como **npm**.

---

## Índice

01. [Aula 01](#aula-01)  
    - [Aula 1.A](#aula-1a)  
    - [Aula 1.B](#aula-1b)  
02. [Aula 02](#aula-02)  
    - [Aula 2.A](#aula-2a)  
03. [Aula 03](#aula-03)  
    - [Aula 3.A](#aula-3a)  
    - [Aula 3.B](#aula-3b)  
04. [Aula 04](#aula-04)  
    - [Aula 4.A](#aula-4a)  
    - [Aula 4.B](#aula-4b)  
    - [Aula 4.C](#aula-4c)  
    - [Aula 4.D](#aula-4d)  
    - [Aula 4.E](#aula-4e)  
    - [Aula 4.F](#aula-4f)  
    - [Aula 4.G](#aula-4g)  
    - [Aula 4.H](#aula-4h)  
    - [Aula 4.I](#aula-4i)  
    - [Aula 4.J](#aula-4j)  
    - [Aula 4.K](#aula-4k)  
05. [Aula 05](#aula-05)  
    - [Aula 5.A](#aula-5a)  
    - [Aula 5.B](#aula-5b)  
    - [Aula 5.C](#aula-5c)  
    - [Aula 5.D](#aula-5d)  
    - [Aula 5.E](#aula-5e)  
    - [Aula 5.F](#aula-5f)  
06. [Aula 06](#aula-06)  
    - [Aula 6.A](#aula-6a)  
    - [Aula 6.B](#aula-6b)  
    - [Aula 6.C](#aula-6c)  
    - [Aula 6.D](#aula-6d)  
    - [Aula 6.E](#aula-6e)  
    - [Aula 6.F](#aula-6f)  
    - [Aula 6.G](#aula-6g)  
    - [Aula 6.H](#aula-6h)  
    - [Aula 6.I](#aula-6i)  
    - [Aula 6.J](#aula-6j)  
    - [Aula 6.K](#aula-6k)  
    - [Aula 6.L](#aula-6l)  
    - [Aula 6.M](#aula-6m)  
    - [Aula 6.N](#aula-6n)  
    - [Aula 6.O](#aula-6o)  
07. [Aula 07](#aula-07)  
    - [Aula 7.A](#aula-7a)  
    - [Aula 7.B](#aula-7b)  
    - [Aula 7.C](#aula-7c)  
    - [Aula 7.D](#aula-7d)  
08. [Aula 08](#aula-08)  
    - [Aula 8.A](#aula-8a)  
09. [Aula 09](#aula-09)  
    - [Aula 9.A](#aula-9a)  
10. [Aula 10](#aula-10)  
    - [Aula 10.A](#aula-10a)  
11. [Aula 11](#aula-11)  
    - [Aula 11.A](#aula-11a)  

---

## Aula 01

#### Aula 1.A

**Apresentação do Curso EAD Proway**

- **Instrutor:** William, analista de projetos.
- **Experiência do Instrutor:** 
  - Ministrou cursos de **React**, **React Native**, **Vue** e **Node**.

#### Aula 1.B

**Introdução ao Angular**

O Angular é uma **plataforma de desenvolvimento front-end** para aplicações web. Ele inclui:  
- Um **framework** baseado em **componentes**.  
- Diversas **bibliotecas** para auxiliar no desenvolvimento.  
- Ferramentas integradas para **build** e **testes** de projetos.

Além disso, o Angular conta com uma **comunidade ativa**, sendo ideal para desenvolvedores **front-end** e **full-stack**.

---

## Aula 02

#### Aula 2.A

Nesta aula, será explicado como configurar o ambiente de desenvolvimento e instalar o Angular na versão 14.

**Tópicos abordados:**
- Download e instalação do Node.js e VS Code.
- Configuração do Angular CLI para projetos futuros.

**Etapas para Instalação**

1. **Remover versões anteriores:**
    - Execute os seguintes comandos no terminal:
      ```bash
      npm uninstall -g @angular/cli
      npm cache clean --force
      ```

2. **Instalar a versão 14:**
    - Substitua o comando padrão pelo seguinte:
      ```bash
      npm install -g @angular/cli@14
      ```

3. **Ferramentas recomendadas:**
    - [Node.js](https://nodejs.org/en/)
    - [Visual Studio Code](https://code.visualstudio.com/)

**Configuração do Ambiente de Desenvolvimento**

Durante o próximo ano, utilizaremos diversas ferramentas essenciais. Abaixo está o passo a passo para instalação e configuração:

1. **Visual Studio Code**:
   - Acesse o site oficial e clique no botão de **Download**.
   - Após o download, abra o instalador, aceite os termos, configure as opções sugeridas e clique em **Instalar**.
   - O processo é simples, mas, como já tenho o software instalado, não prosseguirei com a instalação.

2. **Node.js**:
   - Acesse o site oficial: [nodejs.org](https://nodejs.org).
   - Escolha a versão **LTS** (recomendada por ser estável).
   - Baixe o instalador e siga os passos: **Next**, aceite os termos e finalize a instalação.
   - Para verificar a instalação:
     - Abra o terminal (**cmd**).
     - Digite `node -v` para confirmar a versão instalada.
     - Verifique também o **NPM** (gerenciador de pacotes do Node) com o comando `npm -v`.

3. **Instalação do Angular**:
   - Instale o Angular CLI de forma global com o comando:  
     `npm install -g @angular/cli`.
   - Após a instalação, o Angular estará disponível globalmente para uso em projetos.

4. **Extensão para Visual Studio Code**:
   - No Visual Studio Code, instale a extensão **Angular Language Service**.
   - Essa extensão facilita o desenvolvimento, oferecendo suporte como **autocompletar** e **dicas de código**.

Com isso, o ambiente de desenvolvimento está pronto.

---

## Aula 03

#### Aula 3.A

**Criação de um Novo Projeto no Angular com CLI**

1. **Configuração Inicial**:
   - Certifique-se de que o **Angular CLI** está instalado (como feito na aula anterior).
   - No **Visual Studio Code**, abra o terminal integrado e navegue até o diretório onde deseja criar o projeto.

2. **Comando para Criar o Projeto**:
   - Use o comando `ng new` seguido do nome do projeto. Exemplo:  
     ```bash
     ng new fundamentos-angular
     ```
   - Durante o processo:
     - Será solicitado adicionar o **Angular Routing** (roteamento). Escolha **Yes**.
     - Escolha o formato de estilo preferido (**CSS**, **SCSS**, **SASS**, ou **LESS**). Neste caso, foi selecionado **CSS**.

3. **Estrutura do Projeto**:
   - Após a criação, a estrutura do projeto estará disponível no diretório especificado.
   - Certifique-se de estar na pasta correta do projeto com o comando:  
     ```bash
     cd fundamentos-angular
     ```

4. **Execução do Projeto**:
   - Para rodar a aplicação, utilize o comando:  
     ```bash
     npm start
     ```
   - O servidor será iniciado e a aplicação estará acessível em:  
     **http://localhost:4200**

5. **Visualização da Aplicação**:
   - Acesse a URL mencionada para visualizar a aplicação Angular recém-criada.

#### Aula 3.B

**Estrutura de um Projeto Angular**

1. **Arquivos e Pastas Principais**:
   - **Angular.json**: Arquivo de configuração principal com metadados utilizados pela aplicação. Inclui:
     - **Prefix**: Define o prefixo dos componentes da aplicação.
     - Configurações de bibliotecas e navegadores suportados.
   - **Package.json**: Lista dependências e scripts da aplicação.
   - **Pasta `src`**: Contém os arquivos principais da aplicação.

2. **Pasta `app`**:
   - Local onde estão os componentes principais da aplicação.
   - **app.component.ts**: Arquivo principal do componente. Contém:
     - Decorador `@Component`, que especifica:
       - **Selector**: Prefixo utilizado para chamar o componente.
       - **TemplateUrl**: Local do arquivo HTML.
       - **StyleUrls**: Arquivo(s) de estilo associado(s).

3. **Estrutura de um Componente Angular**:
   - **Template**: Arquivo HTML que define o conteúdo exibido na interface.
   - **Classe**: Controlador que contém dados e métodos utilizados no template.
   - **Estilos**: Arquivo(s) CSS para definir o design da página.

4. **Conexão entre Arquivos**:
   - O **selector** no `app.component.ts` usa o prefixo definido no `Angular.json`.
   - A classe atua como um controlador, ligando métodos e propriedades ao template.

5. **Resumo do Fluxo**:
   - **HTML** exibe o conteúdo.
   - **Classe** gerencia dados e lógica da página.
   - **CSS** estiliza a interface.

---

## Aula 04

#### Aula 4.A

**Criação do Primeiro Componente Angular**

1. **O que é um Componente Angular**:
   - Um **componente** é uma classe que define a lógica de uma parte específica da aplicação.
   - Segue a convenção de nomeação: `nome-do-componente.component.ts`.

2. **Criando o Componente**:
   - No diretório `app`, crie o arquivo `primeiro-componente.component.ts`.
   - Defina a classe do componente e adicione o decorador `@Component`:
     ```typescript
     import { Component } from '@angular/core';

     @Component({
       selector: 'app-primeiro-componente',
       template: '<h2>Meu Primeiro Componente</h2>',
       styles: ['h2 { color: red; }']
     })
     export class PrimeiroComponente {}
     ```
   - **Detalhes**:
     - **Selector**: Identifica o componente como uma tag HTML.
     - **Template**: Define o conteúdo exibido na interface (HTML inline ou arquivo externo).
     - **Styles**: Contém os estilos associados ao componente.

3. **Registrando o Componente**:
   - No arquivo `app.module.ts`, adicione o componente à seção `declarations`:
     ```typescript
     import { PrimeiroComponente } from './primeiro-componente.component';

     @NgModule({
       declarations: [
         AppComponent,
         PrimeiroComponente
       ],
       // outras configurações...
     })
     export class AppModule {}
     ```

4. **Utilizando o Componente**:
   - No arquivo `app.component.html`, utilize o selector do componente:
     ```html
     <app-primeiro-componente></app-primeiro-componente>
     ```

5. **Visualização no Navegador**:
   - Ao salvar e recarregar a aplicação no navegador, o conteúdo do componente será exibido:  
     **"Meu Primeiro Componente"** com a cor definida no estilo.

#### Aula 4.B

**Criação de Componentes com Angular CLI**

1. **Gerando um Novo Componente**:
   - No terminal, execute o comando:
     ```bash
     ng generate component segundo-componente
     ```
   - O Angular CLI criará uma pasta com os seguintes arquivos:
     - **.component.ts**: Classe principal do componente.
     - **.component.html**: Template (HTML) do componente.
     - **.component.css** ou **.component.scss**: Estilos associados ao template.
     - **.component.spec.ts**: Arquivo para testes do componente.

2. **Configurações do Novo Componente**:
   - O decorador `@Component` referencia:
     - **templateUrl**: Caminho para o arquivo HTML.
     - **styleUrls**: Caminho para o arquivo de estilos.

3. **Removendo Configurações Desnecessárias**:
   - Métodos de ciclo de vida, como `ngOnInit`, podem ser removidos caso ainda não sejam necessários.
   - Exemplo atualizado do componente:
     ```typescript
     import { Component } from '@angular/core';

     @Component({
       selector: 'app-segundo-componente',
       templateUrl: './segundo-componente.component.html',
       styleUrls: ['./segundo-componente.component.css']
     })
     export class SegundoComponente {
       nome: string = 'Universidade Angular';
     }
     ```

4. **Interpolação de Texto**:
   - A interpolação é usada para exibir valores de propriedades da classe no template.
   - Exemplo no arquivo **.component.html**:
     ```html
     <h2>{{ nome }}</h2>
     ```
   - Resultado: O valor da propriedade `nome` será exibido na tela.

5. **Uso de Pipes**:
   - Pipes formatam dados exibidos na tela.
   - Exemplo de uso para converter texto para maiúsculas:
     ```html
     <h2>{{ nome | uppercase }}</h2>
     ```
   - O texto exibido será formatado de acordo com o pipe utilizado.

#### Aula 4.C

**Trabalhando com Pipes no Angular**

1. **Conceito de Pipes**:
   - Pipes são utilizados para **formatar** ou **transformar** dados exibidos no template.
   - [**Ducumentação**](https://angular.dev/guide/templates/pipes#creating-custom-pipes)
   - O Angular já oferece vários pipes prontos, como:
     - **uppercase**: Converte texto para maiúsculas.
     - **date**: Formata datas.
     - **currency**: Exibe valores monetários.
     - **percent**: Formata números como porcentagens.

2. **Utilizando Pipes Embutidos**:
   - Para formatar uma data com o pipe `date`:
     ```html
     <p>Data de nascimento: {{ dataNascimento | date:'dd/MM/yyyy' }}</p>
     ```
   - Neste exemplo:
     - `dataNascimento` é uma propriedade da classe.
     - O pipe `date` formata a data no formato `dia/mês/ano`.

3. **Criando Pipes Personalizados**:
   - Para situações específicas, é possível criar um pipe customizado.  
   - Comando para criar o pipe:
     ```bash
     ng generate pipe multiplica-por
     ```
   - O Angular CLI cria um arquivo com estrutura básica para o pipe.

4. **Implementação do Pipe**:
   - No arquivo do pipe (`multiplica-por.pipe.ts`):
     ```typescript
     import { Pipe, PipeTransform } from '@angular/core';

     @Pipe({
       name: 'multiplicaPor'
     })
     export class MultiplicaPorPipe implements PipeTransform {
       transform(valor: number, multiplicador: number): number {
         return valor * multiplicador;
       }
     }
     ```
   - Detalhes:
     - O método `transform` recebe o valor e os argumentos necessários.
     - Retorna o valor transformado.

5. **Registrando e Utilizando o Pipe**:
   - O pipe é automaticamente registrado no módulo (`app.module.ts`).
   - Para utilizá-lo no template:
     ```html
     <p>{{ 10 | multiplicaPor:2 }}</p>
     ```
   - Resultado: O valor `10` será multiplicado por `2`, exibindo `20`.

6. **Criando um Componente para Demonstrar o Pipe**:
   - Comando para gerar um novo componente:
     ```bash
     ng generate component exemplo-pipes
     ```
   - No arquivo HTML do componente, utilize o pipe:
     ```html
     <p>10 x 2 = {{ 10 | multiplicaPor:2 }}</p>
     <p>5 x 3 = {{ 5 | multiplicaPor:3 }}</p>
     ```

7. **Exibindo o Componente na Tela**:
   - No arquivo `app.component.html`, adicione o seletor do componente:
     ```html
     <app-exemplo-pipes></app-exemplo-pipes>
     ```

8. **Resultado no Navegador**:
   - O aplicativo exibirá os valores formatados ou calculados pelos pipes.  
   - Por exemplo:
     - `10 x 2 = 20`
     - `5 x 3 = 15`

#### Aula 4.D

**Trabalhando com Property Binding e Event Binding no Angular**

1. **Property Binding**:
   - Permite ligar uma propriedade de um elemento HTML a uma propriedade da classe do componente.
   - Exemplo:
     - No componente:
       ```typescript
       export class AppComponent {
         urlImagem: string = './assets/joao.jpg';
       }
       ```
     - No template:
       ```html
       <img [src]="urlImagem" width="300" height="200">
       ```
   - Resultado: A imagem é exibida na tela utilizando o valor da propriedade `urlImagem`.

2. **Event Binding**:
   - Permite associar eventos HTML (como cliques de botão) a métodos do componente.
   - Exemplo:
     - No componente:
       ```typescript
       export class AppComponent {
         dataNascimento: string = '01/01/1995';

         mostrarDataNascimento(): void {
           alert(`Data de Nascimento: ${this.dataNascimento}`);
         }
       }
       ```
     - No template:
       ```html
       <button (click)="mostrarDataNascimento()">Mostrar Data de Nascimento</button>
       ```
   - Resultado: Ao clicar no botão, o método `mostrarDataNascimento` é executado, exibindo um alerta com a data de nascimento.

3. **Estilização Global**:
   - Estilos podem ser aplicados globalmente em arquivos como `styles.css` ou `styles.scss`.
   - Exemplo:
     ```css
     button {
       background-color: #4CAF50;
       color: white;
       border: none;
       padding: 10px 20px;
       cursor: pointer;
     }
     ```

4. **Resumo dos Conceitos**:
   - **Property Binding**: Liga propriedades HTML a propriedades do componente.
   - **Event Binding**: Liga eventos HTML a métodos do componente.

Esses conceitos são fundamentais para criar interatividade e dinamismo em aplicações Angular.

#### Aula 4.E

**Two-Way Data Binding no Angular**

1. **O que é Two-Way Data Binding?**  
   - É um **vínculo bidirecional** entre a propriedade de um **componente** e um **elemento do template**.
   - Permite que as alterações no input do usuário **atualizem a propriedade da classe**, e vice-versa.

2. **Criando um Componente para Exemplo**  
   - No terminal, crie um novo componente:
     ```bash
     ng generate component two-way-binding
     ```
   - No arquivo `two-way-binding.component.ts`, defina uma propriedade:
     ```typescript
     export class TwoWayBindingComponent {
       nome: string = '';
     }
     ```

3. **Ligação no Template (HTML)**  
   - No arquivo `two-way-binding.component.html`, utilize `ngModel` para conectar a propriedade ao input:
     ```html
     <h2>Two-Way Binding</h2>
     <input type="text" [(ngModel)]="nome">
     <p>Nome digitado: {{ nome }}</p>
     ```
   - **Explicação**:
     - `[(ngModel)]="nome"` faz a **ligação bidirecional** entre o input e a propriedade `nome`.
     - O conteúdo do `<p>` será atualizado conforme o usuário digita no campo.

4. **Habilitando o `FormsModule`**  
   - O Angular não reconhece `ngModel` por padrão.  
   - É necessário importar o **FormsModule** no `app.module.ts`:
     ```typescript
     import { FormsModule } from '@angular/forms';

     @NgModule({
       imports: [FormsModule]
     })
     export class AppModule { }
     ```
   - Agora, o **Two-Way Binding** funcionará corretamente.

5. **Testando a Ligação Bidirecional**  
   - Quando o usuário digita no input, a propriedade `nome` é atualizada.
   - Se a propriedade `nome` já tiver um valor inicial, ele será exibido no input ao carregar a página.

O **Two-Way Data Binding** é fundamental para manipulação dinâmica de formulários no Angular.  

#### Aula 4.F

**Renderização de Listas e Diretivas no Angular**

1. **Criação do Componente**  
   - No terminal, execute:
     ```bash
     ng generate component renderizando-listas
     ```
   - O componente será criado e configurado para exibir uma lista de itens.

2. **Criando a Tipagem para os Itens**  
   - Para definir a estrutura dos objetos, crie uma **interface**:
     ```typescript
     export interface Celular {
       id: number;
       nome: string;
       descricao?: string;
       esgotado: boolean;
     }
     ```
   - O campo `descricao` foi definido como **opcional**.

3. **Definição da Lista no Componente**  
   - No arquivo `renderizando-listas.component.ts`, adicione uma lista de celulares:
     ```typescript
     import { Component } from '@angular/core';
     import { Celular } from '../types/celular';

     @Component({
       selector: 'app-renderizando-listas',
       templateUrl: './renderizando-listas.component.html',
       styleUrls: ['./renderizando-listas.component.css']
     })
     export class RenderizandoListasComponent {
       celulares: Celular[] = [
         { id: 1, nome: 'Celular XL', descricao: 'Celular grande', esgotado: false },
         { id: 2, nome: 'Celular Normal', esgotado: false },
         { id: 3, nome: 'Celular Mini', descricao: 'Celular pequeno', esgotado: true }
       ];
     }
     ```

4. **Renderizando a Lista no Template**  
   - No arquivo `renderizando-listas.component.html`, utilize a diretiva `*ngFor` para exibir os celulares:
     ```html
     <h2>Renderizando uma lista de dados</h2>
     <ul class="lista-produtos">
       <li *ngFor="let celular of celulares">
         <strong>{{ celular.nome }}</strong>
         <p *ngIf="celular.descricao">{{ celular.descricao }}</p>
         <span [ngClass]="{ 'esgotado': celular.esgotado }">
           {{ celular.esgotado ? 'Esgotado' : 'Disponível' }}
         </span>
       </li>
     </ul>
     ```
   - **Explicação**:
     - `*ngFor="let celular of celulares"`: Itera sobre a lista exibindo cada item.
     - `*ngIf="celular.descricao"`: Só exibe a descrição se ela existir.
     - `[ngClass]`: Adiciona a classe `"esgotado"` caso o celular esteja indisponível.

5. **Aplicando Estilos com Classes Condicionais**  
   - No arquivo `renderizando-listas.component.css`, adicione estilos:
     ```css
     .lista-produtos {
       list-style: none;
       padding: 0;
     }
     .lista-produtos li {
       padding: 10px;
       border-bottom: 1px solid #ccc;
     }
     .esgotado {
       color: red;
       font-weight: bold;
     }
     ```

6. **Exibindo o Componente no Aplicativo**  
   - No arquivo `app.component.html`, adicione o seletor:
     ```html
     <app-renderizando-listas></app-renderizando-listas>
     ```

7. **Resultado no Navegador**  
   - A lista será renderizada com os produtos.
   - Se um item estiver esgotado, aparecerá em **vermelho**.

Essa abordagem permite a renderização dinâmica de listas e a personalização de estilos com **ngClass**.

#### Aula 4.G

**Utilizando o Decorador `@Input` para Personalizar Componentes no Angular**

1. **O que é o `@Input`?**  
   - O `@Input` permite **passar dados de um componente pai para um componente filho**.
   - Isso possibilita a criação de componentes reutilizáveis e personalizáveis.

2. **Criando o Componente Personalizado**  
   - No terminal, execute:
     ```bash
     ng generate component componente-personalizado
     ```
   - No arquivo `componente-personalizado.component.ts`, defina as propriedades:
     ```typescript
     import { Component, Input } from '@angular/core';

     @Component({
       selector: 'app-componente-personalizado',
       templateUrl: './componente-personalizado.component.html',
       styleUrls: ['./componente-personalizado.component.css']
     })
     export class ComponentePersonalizadoComponent {
       @Input() nome: string = '';
       @Input() sobrenome: string = '';
     }
     ```

3. **Criando o Template do Componente**  
   - No arquivo `componente-personalizado.component.html`, utilize as propriedades:
     ```html
     <p>{{ nome }} {{ sobrenome }}</p>
     ```

4. **Estilizando o Componente**  
   - No arquivo `componente-personalizado.component.css`, adicione estilos:
     ```css
     p {
       color: blue;
       font-size: 22px;
     }
     ```

5. **Utilizando o Componente no `app.component.html`**  
   - O componente pode ser reutilizado com diferentes valores:
     ```html
     <app-componente-personalizado nome="João" sobrenome="da Silva"></app-componente-personalizado>
     <app-componente-personalizado nome="Maria" sobrenome="da Silva"></app-componente-personalizado>
     ```

6. **Resultado no Navegador**  
   - O componente será exibido com os valores passados como entrada.

O `@Input` permite criar **componentes reutilizáveis** e **personalizados**.  

#### Aula 4.H

**Comunicação entre Componentes no Angular**

**Interação do Componente Pai para o Componente Filho (`@Input`)**
  - O `@Input` permite passar **propriedades** do **componente pai** para o **componente filho**.

**Criando os Componentes**
  - No terminal, execute:
    ```bash
    ng generate component componente-pai
    ng generate component componente-filho
    ```

**Definição do Componente Pai (`componente-pai.component.ts`)**
  - Define uma propriedade `sobrenome`:
    ```typescript
    import { Component } from '@angular/core';

    @Component({
      selector: 'app-componente-pai',
      templateUrl: './componente-pai.component.html',
      styleUrls: ['./componente-pai.component.css']
    })
    export class ComponentePaiComponent {
      sobrenome: string = 'da Silva';
    }
    ```

**Passando a Propriedade para o Filho (`componente-pai.component.html`)**
  - Usa a diretiva `@Input` para passar o sobrenome:
    ```html
    <h2>Interação entre Componentes</h2>
    <h3>O sobrenome está definido no elemento pai: {{ sobrenome }}</h3>

    <app-componente-filho [sobrenome]="sobrenome"></app-componente-filho>
    ```

**Recebendo a Propriedade no Componente Filho (`componente-filho.component.ts`)**
  - Usa `@Input` para receber `sobrenome`:
    ```typescript
    import { Component, Input } from '@angular/core';

    @Component({
      selector: 'app-componente-filho',
      templateUrl: './componente-filho.component.html',
      styleUrls: ['./componente-filho.component.css']
    })
    export class ComponenteFilhoComponent {
      @Input() sobrenome: string = '';
      nome: string = '';
    }
    ```

**Exibindo a Propriedade no Componente Filho (`componente-filho.component.html`)**
  - Mostra a propriedade recebida:
    ```html
    <h3>O sobrenome veio do elemento pai: {{ sobrenome }}</h3>

    <label for="nome">Nome:</label>
    <input type="text" id="nome" [(ngModel)]="nome">
    ```

**Interação do Componente Filho para o Componente Pai (`@Output`)**
  - O `@Output` permite que o **componente filho** envie **eventos** para o **componente pai**.

**Criando um Método no Componente Pai (`componente-pai.component.ts`)**
  - Exibe o nome completo:
    ```typescript
    mostraNomeCompleto(nomeCompleto: string) {
      alert(`Nome Completo: ${nomeCompleto}`);
    }
    ```

**Criando o `@Output` no Componente Filho (`componente-filho.component.ts`)**
  - Usa `@Output` e `EventEmitter` para emitir eventos:
    ```typescript
    import { Component, Input, Output, EventEmitter } from '@angular/core';

    @Component({
      selector: 'app-componente-filho',
      templateUrl: './componente-filho.component.html',
      styleUrls: ['./componente-filho.component.css']
    })
    export class ComponenteFilhoComponent {
      @Input() sobrenome: string = '';
      @Output() mostraNome = new EventEmitter<string>();

      nome: string = '';

      emitirNomeCompleto() {
        this.mostraNome.emit(`${this.nome} ${this.sobrenome}`);
      }
    }
    ```

**Chamando o Evento no Template do Componente Filho (`componente-filho.component.html`)**
  - Cria um botão para disparar o evento:
    ```html
    <button (click)="emitirNomeCompleto()">Mostrar Nome Completo</button>
    ```

**Escutando o Evento no Componente Pai (`componente-pai.component.html`)**
  - Usa `@Output` no **pai** para escutar o evento do **filho**:
    ```html
    <app-componente-filho [sobrenome]="sobrenome" (mostraNome)="mostraNomeCompleto($event)"></app-componente-filho>
    ```

**Usando uma Variável de Template**
  - O **pai** pode acessar propriedades do **filho** diretamente:
    ```html
    <app-componente-filho #filho [sobrenome]="sobrenome"></app-componente-filho>
    <p>Nome completo: {{ filho.nome }} {{ sobrenome }}</p>
    ```

**Resumo**
  - O **componente pai** passa `sobrenome` para o **filho** com `@Input`.
  - O **componente filho** envia eventos para o **pai** com `@Output`.
  - A variável de template permite o **pai** acessar diretamente propriedades do **filho**.

Dessa forma, é possível criar uma comunicação bidirecional eficiente entre componentes no Angular.

#### Aula 4.I

**Serviços no Angular e Injeção de Dependências**

**O que são Serviços no Angular?**
  - Serviços são classes que contêm **lógica reutilizável** e podem ser compartilhadas entre múltiplos componentes.
  - Permitem manter a separação de responsabilidades, evitando duplicação de código.

**Criando um Serviço no Angular**
  - No terminal, crie um serviço chamado `logger`:
    ```bash
    ng generate service logger
    ```
  - O Angular cria automaticamente o arquivo `logger.service.ts`.

**Implementando o Serviço (`logger.service.ts`)**
  - O serviço usará o `@Injectable()` para ser injetado nos componentes.
    ```typescript
    import { Injectable } from '@angular/core';

    @Injectable({
      providedIn: 'root'
    })
    export class LoggerService {
      private mensagens: string[] = [];

      logar(mensagem: string): void {
        this.mensagens.push(mensagem);
        console.log(mensagem);
      }

      exibirTodosOsLogs(): void {
        console.log(this.mensagens);
      }
    }
    ```

**Criando Componentes para Utilizar o Serviço**
  - No terminal, crie dois componentes:
    ```bash
    ng generate component exemplo-servicos1
    ng generate component exemplo-servicos2
    ```

**Utilizando o Serviço no `ExemploServicos1Component`**
  - O serviço é injetado no **constructor**:
    ```typescript
    import { Component } from '@angular/core';
    import { LoggerService } from '../logger.service';

    @Component({
      selector: 'app-exemplo-servicos1',
      templateUrl: './exemplo-servicos1.component.html',
      styleUrls: ['./exemplo-servicos1.component.css']
    })
    export class ExemploServicos1Component {
      nome: string = '';

      constructor(private logger: LoggerService) {}

      adicionarNome(): void {
        this.logger.logar(`O nome ${this.nome} foi adicionado.`);
      }
    }
    ```
  - No template (`exemplo-servicos1.component.html`), adicione:
    ```html
    <h2>Serviço 1</h2>
    <label for="nome">Seu Nome:</label>
    <input type="text" id="nome" [(ngModel)]="nome">
    <button (click)="adicionarNome()">Adicionar Nome</button>
    ```

**Utilizando o Serviço no `ExemploServicos2Component`**
  - O serviço também pode ser injetado e usado da mesma forma:
    ```typescript
    import { Component } from '@angular/core';
    import { LoggerService } from '../logger.service';

    @Component({
      selector: 'app-exemplo-servicos2',
      templateUrl: './exemplo-servicos2.component.html',
      styleUrls: ['./exemplo-servicos2.component.css']
    })
    export class ExemploServicos2Component {
      descricao: string = '';

      constructor(private logger: LoggerService) {}

      adicionarProduto(): void {
        this.logger.logar(`O produto "${this.descricao}" foi adicionado.`);
      }
    }
    ```
  - No template (`exemplo-servicos2.component.html`), adicione:
    ```html
    <h2>Serviço 2</h2>
    <label for="descricao">Nome do Produto:</label>
    <input type="text" id="descricao" [(ngModel)]="descricao">
    <button (click)="adicionarProduto()">Adicionar Produto</button>
    <button (click)="logger.exibirTodosOsLogs()">Exibir Logs</button>
    ```

**Resultado**
  - Quando o usuário digita um nome ou produto e clica no botão, o serviço **armazenará e exibirá** os logs.
  - O botão "Exibir Logs" listará todos os itens adicionados.

**Vantagens do Uso de Serviços**
  - **Reutilização** de código entre diferentes componentes.
  - **Facilidade na manutenção**, separando a lógica de negócios dos componentes.
  - **Compartilhamento de estado** entre múltiplos componentes.

Os serviços são fundamentais para a **arquitetura escalável** do Angular.

#### Aula 4.J

**Ciclo de Vida dos Componentes no Angular**

**`ngOnInit` - Inicialização do Componente**  
  - Executado assim que o componente é criado.  
  - Utilizado para inicializar variáveis e configurar lógica antes da renderização.  
  - Exemplo: Iniciar um relógio que atualiza a cada segundo.  

**`ngOnChanges` - Detectando Alterações**  
  - Chamado quando uma propriedade marcada com `@Input()` sofre alteração.  
  - Permite monitorar mudanças em tempo real dentro do componente.  
  - Exemplo: Atualizar um valor sempre que o usuário digita em um campo de entrada.  

**`ngOnDestroy` - Finalização do Componente**  
  - Executado antes do componente ser removido da tela.  
  - Essencial para limpar **subscriptions**, **timers** e evitar erros de referência.  
  - Exemplo: Parar um intervalo (`setInterval`) para evitar atualizações em um componente inexistente.  

**Importância do Gerenciamento do Ciclo de Vida**  
  - **Evita vazamento de memória** ao limpar eventos e assinaturas de serviços.  
  - **Garante atualizações corretas** ao detectar mudanças em propriedades do componente.  
  - **Facilita a depuração**, permitindo entender em que momento cada evento ocorre.  

Os ciclos de vida são fundamentais para o controle da renderização e da comunicação entre componentes no Angular.  

#### Aula 4.K

**Utilizando `ng-content` no Angular**

**O que é `ng-content`?**  
  - Elemento utilizado para criar **componentes reutilizáveis**.  
  - Permite que um componente encapsule um layout, mantendo a flexibilidade para receber **conteúdo dinâmico**.  

**Benefícios do `ng-content`**  
  - **Evita duplicação de código**, permitindo reutilização de estrutura visual.  
  - **Facilita a organização da aplicação**, agrupando elementos dentro de um layout padronizado.  
  - **Mantém a flexibilidade**, permitindo passar qualquer tipo de conteúdo ao componente.  

**Exemplo de Aplicação - Criando um Card Genérico**  
  - Um **componente de card** foi criado para organizar visualmente os conteúdos.  
  - O card recebe um **título** e uma **cor de fundo**, tornando-se **personalizável**.  
  - O `ng-content` permite que o conteúdo do card seja **definido dinamicamente** pelo componente pai.  

**Uso do `ng-style`**  
  - O `ng-style` foi utilizado para modificar a **cor do background**, tornando o componente mais flexível.  

**Aplicação do Card na Estrutura da Aplicação**  
  - Cada componente da aplicação foi envolvido por um **card**, mantendo um layout uniforme.  
  - O título do card substituiu os títulos individuais dos componentes, centralizando a informação.  

**Resultado Final**  
  - Todos os componentes ficaram organizados dentro dos cards, separados visualmente.  
  - O `ng-content` possibilitou um contêiner genérico e reutilizável, tornando a aplicação mais **estruturada e modular**.  

---

## Aula 05

#### Aula 5.A

**Roteamento no Angular com Angular Router**

**Introdução ao Angular Router**

- O **Angular Router** é uma biblioteca utilizada para gerenciar a navegação entre páginas em aplicações Angular.
- Permite definir **rotas dinâmicas**, associando caminhos de URL a componentes específicos.

**Passos para Configurar o Roteamento**

1. **Criar o Projeto Angular**
```bash
ng new roteamento
cd roteamento
```
- **Não adicionar Angular Routing automaticamente**, pois a configuração será feita manualmente.

2. **Instalar o Angular Router**
```bash
npm install @angular/router
```
- Essa biblioteca permite o gerenciamento de rotas na aplicação.

3. **Criar o Módulo de Rotas**
```bash
ng generate module app-routing --flat --module=app
```
- A flag `--flat` evita a criação de uma pasta adicional.
- A flag `--module=app` adiciona automaticamente esse módulo ao `AppModule`.

**Configuração do Arquivo de Rotas (`app-routing.module.ts`)**
```typescript
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';

const routes: Routes = [
  { path: 'primeira-pagina', component: PrimeiraPaginaComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
```
- **`RouterModule.forRoot(routes)`**: Configura o roteamento principal da aplicação.
- **Exportação do `RouterModule`**: Permite que o módulo de rotas seja acessado em toda a aplicação.

4. **Criar um Componente para a Primeira Página**
```bash
ng generate component primeira-pagina
```
- O componente será acessado ao navegar para `/primeira-pagina`.

**Conteúdo do Template (`primeira-pagina.component.html`)**
```html
<h2>Primeira Página</h2>
```

5. **Integrar o `RouterOutlet`**
- No arquivo `app.component.html`, substituir o conteúdo pelo `RouterOutlet`:
```html
<router-outlet></router-outlet>
```
- Esse elemento permite que os componentes sejam carregados dinamicamente com base na URL acessada.

6. **Executar a Aplicação**
```bash
ng serve --open
```
- Acessar `http://localhost:4200/primeira-pagina` para visualizar o componente carregado.

**Resumo**
- **O Angular Router** permite definir **rotas associadas a componentes**.
- **O `RouterOutlet`** carrega dinamicamente os componentes com base na URL.
- **Configuração manual do roteamento** melhora o entendimento do funcionamento do Angular Router.

Essa abordagem facilita a navegação estruturada e modular dentro de aplicações Angular.


#### Aula 5.B

**Navegação entre Páginas no Angular com Angular Router**

**Criando um Menu de Navegação**
- Para navegar entre páginas, é necessário criar um **menu fixo** utilizando o **RouterLink**.
- No arquivo `app.component.html`, adicionamos um **navbar** com **links para as páginas**.
- Exemplo:
```html
<nav>
  <ul>
    <li><a routerLink="/primeira-pagina">Primeira Página</a></li>
    <li><a routerLink="/segunda-pagina">Segunda Página</a></li>
  </ul>
</nav>
<router-outlet></router-outlet>
```
- **O `RouterOutlet`** carrega dinamicamente o componente correspondente à URL.

**Criando um Novo Componente e Rota**

1. Criar o componente **Segunda Página**:
```bash
ng generate component segunda-pagina
```
2. No arquivo `segunda-pagina.component.html`, definir o conteúdo:
```html
<h2>Segunda Página</h2>
```
3. Adicionar a nova rota no `app-routing.module.ts`:
```typescript
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';

const routes: Routes = [
  { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
  { path: 'segunda-pagina', component: SegundaPaginaComponent }
];
```
- Agora, ao clicar no link da **Segunda Página**, o Angular Router carrega o componente correto.

**Navegação com Botão e Código**
- Além do `RouterLink`, podemos navegar entre páginas através de **funções programáticas**.
- Para isso, injetamos o serviço **Router** no componente.
- Exemplo de botão para redirecionar para a Segunda Página (`primeira-pagina.component.html`):
```html
<button (click)="moverParaSegundaPagina()">Ir para Segunda Página</button>
```
- Implementação da função em `primeira-pagina.component.ts`:
```typescript
import { Router } from '@angular/router';

export class PrimeiraPaginaComponent {
  constructor(private router: Router) {}

  moverParaSegundaPagina() {
    this.router.navigate(['/segunda-pagina']);
  }
}
```
- **O método `navigate(['/rota'])`** permite redirecionar o usuário programaticamente.

**Mantendo o Menu Fixo**
- O **menu permanece visível** porque foi colocado **antes do `<router-outlet>`** no `app.component.html`.
- Isso garante que a navegação carregue os componentes sem afetar o layout do menu.

**Resumo**
- **O `RouterLink`** é usado para criar links de navegação diretamente no HTML.
- **O serviço `Router`** permite navegar entre páginas via código.
- **O `RouterOutlet`** carrega dinamicamente os componentes correspondentes à URL.
- **Menus fixos** são mantidos ao serem colocados **antes do `RouterOutlet`**.

Essa abordagem permite criar aplicações Angular com uma navegação fluida e estruturada.

#### Aula 5.C

**Redirecionamento de Rotas e Página 404 no Angular**

**Redirecionamento Automático para uma Página Inicial**

- Quando acessamos a aplicação sem uma **rota definida**, podemos redirecionar o usuário automaticamente para uma página padrão.
- No arquivo `app-routing.module.ts`, adicionamos a seguinte configuração:

```typescript
const routes: Routes = [
  { path: '', redirectTo: 'primeira-pagina', pathMatch: 'full' },
  { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
];
```

**Explicação**

- **`path: ''`**: Define o caminho vazio, ou seja, a raiz da aplicação.
- **`redirectTo: 'primeira-pagina'`**: Redireciona para a primeira página.
- **`pathMatch: 'full'`**: Garante que a correspondência da URL deve ser exata.

Agora, ao acessar a **raiz da aplicação**, o usuário será automaticamente redirecionado para a primeira página.

**Criando uma Página 404 - "Não Encontrada"**

- Se o usuário digitar uma **URL inválida**, podemos exibir uma página personalizada de erro.
- Criamos um **novo componente** para a página 404:

```bash
ng generate component pagina-nao-encontrada
```

- No arquivo `pagina-nao-encontrada.component.html`, definimos o conteúdo da página:

```html
<h2>404 - Página Não Encontrada</h2>
```

- Agora, adicionamos essa rota ao `app-routing.module.ts`:

```typescript
const routes: Routes = [
  { path: '', redirectTo: 'primeira-pagina', pathMatch: 'full' },
  { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
  { path: '**', component: PaginaNaoEncontradaComponent }
];
```

**Explicação**

- **`path: '**'`**: Corresponde a qualquer **rota não definida**.
- **`component: PaginaNaoEncontradaComponent`**: Carrega o componente de erro.

Agora, sempre que o usuário acessar **uma URL inexistente**, a página de **erro 404** será exibida.

**Resumo**

- **Redirecionamento automático**: Define um redirecionamento para a página inicial quando não há uma rota na URL.
- **Página 404 personalizada**: Exibe uma página de erro para **URLs inválidas** usando `path: '**'`.
- **Melhor experiência do usuário**: Evita telas em branco e melhora a navegação.

Esse processo melhora a **usabilidade da aplicação Angular**, tornando a navegação mais intuitiva e eficiente.

#### Aula 5.D

**Trabalhando com Parâmetros de Rota e Query Params no Angular**

**Introdução**
- No Angular, podemos **passar parâmetros** na URL para buscar informações específicas.
- Existem **dois tipos principais de parâmetros**:
  1. **Parâmetros de Rota**: Passados diretamente na URL (`/produtos/1`).
  2. **Query Params**: Passados após uma interrogação (`/produtos?id=1&nome=João`).

**Criando um Componente para Trabalhar com Parâmetros**
```bash
ng generate component pagina-com-parametros
```

**Definição da Rota com Parâmetro**
- No arquivo `app-routing.module.ts`, adicionamos a rota que aceita um parâmetro:
```typescript
const routes: Routes = [
  { path: 'pagina-com-parametros/:id', component: PaginaComParametrosComponent }
];
```
- O **`:id`** representa um valor dinâmico que pode ser passado pela URL.

**Obtendo Parâmetros de Rota**
- Para acessar os **parâmetros da rota**, utilizamos o **`ActivatedRoute`**.
```typescript
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pagina-com-parametros',
  templateUrl: './pagina-com-parametros.component.html',
  styleUrls: ['./pagina-com-parametros.component.css']
})
export class PaginaComParametrosComponent implements OnInit {
  id: number | null = null;

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.id = Number(params.get('id'));
    });
  }
}
```
**Explicação**
- **`ActivatedRoute`**: Serviço do Angular Router usado para acessar informações da rota ativa.
- **`paramMap.subscribe()`**: Obtém o **ID** da URL e o converte para número.

**Exibindo o Parâmetro no Template**
```html
<h2>Parâmetro da Rota: {{ id }}</h2>
```
- Ao acessar `http://localhost:4200/pagina-com-parametros/5`, será exibido:
  ```
  Parâmetro da Rota: 5
  ```

**Trabalhando com Query Params**
- Query Params são usados para **filtrar** informações em uma URL (`?nome=João&idade=23`).
- Atualizamos a rota no `app-routing.module.ts` para aceitar **query parameters**:
```typescript
const routes: Routes = [
  { path: 'pagina-com-parametros/:id', component: PaginaComParametrosComponent }
];
```

**Obtendo Query Params no Componente**
```typescript
nome: string = '';
idade: number | null = null;

ngOnInit() {
  this.route.paramMap.subscribe(params => {
    this.id = Number(params.get('id'));
  });

  this.route.queryParamMap.subscribe(params => {
    this.nome = params.get('nome') || '';
    this.idade = Number(params.get('idade'));
  });
}
```
**Exibindo os Query Params no Template**
```html
<p *ngIf="nome">Nome: {{ nome }}</p>
<p *ngIf="idade">Idade: {{ idade }}</p>
```
- Agora, ao acessar `http://localhost:4200/pagina-com-parametros/5?nome=João&idade=23`, será exibido:
  ```
  Parâmetro da Rota: 5
  Nome: João
  Idade: 23
  ```

**Resumo**
- **Parâmetros de Rota (`:id`)** são usados para identificar um item específico.
- **Query Params (`?nome=João&idade=23`)** são usados para filtros e buscas.
- **O `ActivatedRoute`** é a classe usada para capturar esses valores.
- **Sempre verificar e converter os valores** quando necessário.

#### Aula 5.E

**Lazy Loading no Angular**

**O que é Lazy Loading?**
- **Lazy Loading** é uma técnica que carrega um **módulo ou componente** apenas quando necessário.
- Evita que a aplicação carregue **todos os módulos de uma vez**, otimizando **tempo de carregamento** e **uso de recursos**.
- Diferente do **Eager Loading**, onde todos os arquivos são baixados **logo no início**.

**Por que usar Lazy Loading?**
✔ **Melhora o desempenho da aplicação**  
✔ **Diminui o tempo de carregamento inicial**  
✔ **Reduz o consumo de memória**  
✔ **Carrega apenas os módulos necessários no momento certo**  

**Criando um Módulo com Lazy Loading**

**1. Gerar um Módulo**

```bash
ng generate module lazy-loading --route lazy-loading --module=app
```
- O módulo `lazy-loading` é criado e registrado automaticamente no `app-routing.module.ts`.
- O `--route lazy-loading` já configura a rota para esse módulo.
- O `--module=app` atrela esse módulo ao `AppModule`.

**2. Configuração da Rota para Lazy Loading**
- No arquivo `app-routing.module.ts`, o Angular configura o **carregamento assíncrono** do módulo:
```typescript
const routes: Routes = [
  { 
    path: 'lazy-loading', 
    loadChildren: () => import('./lazy-loading/lazy-loading.module').then(m => m.LazyLoadingModule) 
  }
];
```
**Explicação**
- `loadChildren`: Importa o módulo **somente quando necessário**.
- `import('./lazy-loading/lazy-loading.module')`: Carrega dinamicamente o módulo `LazyLoadingModule`.

**3. Configuração das Rotas Dentro do Módulo Lazy**
- O Angular cria automaticamente o arquivo `lazy-loading-routing.module.ts`:
```typescript
const routes: Routes = [
  { path: '', component: LazyLoadingComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LazyLoadingRoutingModule { }
```
**Explicação**
- O caminho `path: ''` significa que essa rota é **o ponto de entrada** do módulo.
- `RouterModule.forChild(routes)`: Registra as rotas **somente dentro do módulo Lazy Loading**.

**4. Verificando o Lazy Loading na Prática**
1. **Abrir as ferramentas do desenvolvedor (F12)**
2. **Ir para a aba Network**
3. **Recarregar a aplicação (F5)**
4. **Navegar para `lazy-loading` e observar o carregamento dinâmico dos arquivos.**

**Resumo**
- O **Lazy Loading** permite carregar módulos **sob demanda**, evitando downloads desnecessários.
- A configuração é feita através do **`loadChildren`** no `app-routing.module.ts`.
- As rotas dentro do módulo Lazy são registradas com **`RouterModule.forChild()`**.
- O uso de Lazy Loading melhora **tempo de resposta** e **uso eficiente de recursos**.

#### Aula 5.F

**Guards de Rotas no Angular: Protegendo Rotas com Autenticação**

**O que são Guards no Angular?**
- **Guards** são utilizados para proteger rotas e impedir que usuários não autorizados acessem determinadas páginas.
- O **`CanActivate`** é um dos principais Guards usados para restringir o acesso com base na autenticação do usuário.

**Criando a Página Protegida**

**1. Gerar o Componente da Página Protegida**
```bash
ng generate component pagina-protegida
```
- Criar um **botão de logout** no template (`pagina-protegida.component.html`):
```html
<h2>Página Protegida</h2>
<button (click)="logout()">Logout</button>
```

**2. Definir a Rota Protegida**

Adicionar a rota no `app-routing.module.ts`:
```typescript
const routes: Routes = [
  { path: 'pagina-protegida', component: PaginaProtegidaComponent, canActivate: [AuthGuard] }
];
```
- O **`canActivate: [AuthGuard]`** impede o acesso de usuários não autenticados.

**3. Criando o Guard de Autenticação**

**Gerar o Guard**
```bash
ng generate guard auth
```
Selecionar `CanActivate` como a opção de proteção.

**Configuração do Guard (`auth.guard.ts`)**
```typescript
@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private authService: AuthService, private router: Router) {}

  canActivate(): boolean {
    if (!this.authService.estaAutenticado()) {
      this.router.navigate(['/login']);
      return false;
    }
    return true;
  }
}
```
- Se o usuário **não estiver autenticado**, ele será **redirecionado para a página de login**.

**4. Criando a Página de Login**

**Gerar o Componente de Login**
```bash
ng generate component login
```
Criar o formulário no `login.component.html`:
```html
<h2>Login</h2>
<label>Email</label>
<input type="text" [(ngModel)]="email">
<label>Senha</label>
<input type="password" [(ngModel)]="senha">
<button (click)="login()">Entrar</button>
```
- **Necessário importar `FormsModule` no `app.module.ts`**:
```typescript
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [FormsModule]
})
```
**5. Criando o Serviço de Autenticação**

**Gerar o Serviço**
```bash
ng generate service auth
```
Configurar a autenticação em `auth.service.ts`:
```typescript
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private tokenKey = 'access_token';

  estaAutenticado(): boolean {
    return !!sessionStorage.getItem(this.tokenKey);
  }

  login(email: string, senha: string): boolean {
    if (email === 'admin@admin.com' && senha === '123456') {
      sessionStorage.setItem(this.tokenKey, 'TOKEN_SIMULADO');
      return true;
    }
    return false;
  }

  logout(): void {
    sessionStorage.removeItem(this.tokenKey);
  }
}
```
- **Salva o token no `sessionStorage` e verifica a autenticação**.
- **O token é removido no logout**.

**6. Implementando a Lógica de Login**
No `login.component.ts`:
```typescript
export class LoginComponent {
  email = '';
  senha = '';

  constructor(private authService: AuthService, private router: Router) {}

  login(): void {
    if (this.authService.login(this.email, this.senha)) {
      this.router.navigate(['/pagina-protegida']);
    } else {
      alert('Login inválido');
    }
  }
}
```
- Se o login for **válido**, o usuário é redirecionado para a página protegida.
- Se for **inválido**, aparece um alerta de erro.

**7. Implementando o Logout**
No `pagina-protegida.component.ts`:
```typescript
export class PaginaProtegidaComponent {
  constructor(private authService: AuthService, private router: Router) {}

  logout(): void {
    this.authService.logout();
    this.router.navigate(['/login']);
  }
}
```
- Quando o usuário **faz logout**, ele é redirecionado para a página de login.

**8. Testando a Proteção da Rota**
1. **Acessar `/pagina-protegida` sem estar autenticado** → Redireciona para `/login`.
2. **Fazer login com `admin@admin.com` e senha `123456`** → Acessa `/pagina-protegida`.
3. **Clicar no botão Logout** → Redireciona para `/login` e limpa a sessão.

**Resumo**
- **`CanActivate`** impede o acesso a páginas protegidas.
- **`AuthService`** gerencia o login, autenticação e logout.
- **Token é armazenado no `sessionStorage`**.
- **Usuário é redirecionado conforme seu status de autenticação**.

Essa abordagem garante **segurança e controle de acesso** nas aplicações Angular.

---

## Aula 06

#### Aula 6.A

**Resumo - Projeto ProWay-Computers (E-commerce com Angular)**  

**Visão Geral do Projeto**  
- O projeto **ProWay-Computers** será um **e-commerce de computadores**, onde os usuários poderão **comprar produtos, adicionar ao carrinho e gerenciar suas compras**.  
- A aplicação será **estruturada de forma modular**, utilizando **componentes e módulos** para melhorar a organização do código.  

**Funcionalidades Principais**  

**1. Estrutura Modular da Aplicação** 

A aplicação será organizada com:  
- **Cabeçalho:** Barra de navegação e pesquisa de produtos.  
- **Corpo:** Exibição de produtos, página de contato e carrinho de compras.  
- **Rodapé:** Informações gerais da loja.  

**2. Carrinho de Compras**  

- Usuário pode **adicionar produtos**, especificar a quantidade e **visualizar o carrinho**.  
- Permite **aumentar, diminuir ou remover produtos do carrinho**.  
- Simulação de compra finalizada, **limpando o carrinho e redirecionando para a página inicial**.  

**3. Formulário de Contato (Forms Reativos)**  

- Implementação de **validações dinâmicas** conforme o usuário preenche os campos.  
- Exibição de **mensagens de erro automáticas** para campos inválidos.  

**4. Barra de Pesquisa Global**  

- Permite **pesquisar produtos de qualquer página** da aplicação.  
- Ao pesquisar, a aba de produtos será filtrada para mostrar **apenas os itens correspondentes**.  

**Objetivo do Projeto**  

- **Explorar conceitos fundamentais do Angular**, como **componentes, módulos, roteamento, formulários reativos e manipulação de estados**.  
- Criar uma aplicação **completa e funcional**, com navegação dinâmica e interação do usuário.

#### Aula 6.B

**Resumo: Cabeçalho com Font Awesome**  

**1. Criando o Componente `Header`**  
- Comando: `ng generate component header`  
- Adicionado ao módulo principal (`app.module.ts`) para reutilização global.  

**2. Estrutura Básica**  
- **Título**: "Pro-Ai Computers" com estilos CSS personalizados.  
- **Links**: Produtos, Carrinho, Home e redes sociais (ícones).  

**3. Passo a Passo: Font Awesome**  
1. **Acesse o [Site do Font Awesome](https://fontawesome.com/)**.  
2. Clique em **"Start for Free"** e cadastre-se com e-mail.  
3. Após login, vá em **"Kits"** e crie um novo kit.  
4. Copie o **script HTML** gerado e cole no `<head>` do `index.html` da sua aplicação.  
5. **Procure ícones** (ex: "shopping cart", "facebook") e copie o código (ex: `<i class="fas fa-cart-shopping"></i>`).  
6. Cole os códigos no template do componente `Header`.  

**4. Estilização**  
- Classes CSS aplicadas para título, links e barra de pesquisa.  
- Exemplo:  
  ```html
  <span class="menu-title-blue">Pro-Ai</span>
  <span class="menu-title-orange">Computers</span>
  ```  
 
**Dica**: Use o [Font Awesome CDN](https://cdnjs.com/libraries/font-awesome) se preferir instalação rápida sem cadastro.

#### Aula 6.C

**Resumo: Criação do Rodapé (Footer)**  

**1. Criando o Componente `Footer`**  
- Comando: `ng generate component footer`  
- Adicionado ao template principal (`app.component.html`) para aparecer em **todas as páginas**.  

**2. Estrutura Básica**  
- **Divisão principal**:  
  - **Seção "Sobre"**:  
    - Título (`<h2>`) com classe `footer-title`.  
    - Texto descritivo (placeholder *Lorem ipsum*).  
  - **Seção "Contato"**:  
    - Título (`<h2>`) e lista com ícones (telefone, e-mail, WhatsApp).  
    - Ícones adicionados via **Font Awesome** (ex: `fa-envelope`, `fa-phone`, `fa-whatsapp`).  
  - **Seção "Copyright"**:  
    - Texto padrão ("Todos os direitos reservados").  

**3. Passo a Passo: Font Awesome**  
1. **Procure ícones** no site [Font Awesome](https://fontawesome.com/).  
2. Copie o código do ícone (ex: `<i class="fas fa-phone"></i>`).  
3. Cole no template do `footer` (dentro das listas de contato).  

**4. Estilização**  
- Classes CSS aplicadas para:  
  - Alinhamento do conteúdo.  
  - Formatação de títulos (`footer-title`).  
  - Espaçamento e cores dos ícones.  

**Resultado**  
- Rodapé funcional com informações de contato e copyright, pronto para integração com o restante da aplicação.  

**Observação**: O CSS foi disponibilizado pelo professor para estilização rápida.

#### Aula 6.D

**Resumo: Implementação de Rotas no Angular**

**1. Objetivo da Aula**  
- Adicionar **navegação entre páginas** (produtos, carrinho, contato).  
- Garantir que o conteúdo das páginas seja carregado **entre o cabeçalho (`header`) e o rodapé (`footer`)**.  

**2. Passos Realizados**  

1. **Criação do Módulo de Rotas**:  
   - Comando: `ng generate module app-routing --flat --module app.module`  
     - `--flat`: Mantém o arquivo na raiz do projeto (sem pasta própria).  
   - Arquivo gerado: `app-routing.module.ts`.
   - Dempendendo da versão do node e do Angular pode ser que quando criar o projeto esse arquivo já exista na rais do projeto configurado corretamente.  

2. **Configuração Básica das Rotas**:  
   - No arquivo `app-routing.module.ts`:  
     - Importação do `RouterModule` e definição de um array vazio (`routes`) para as rotas futuras.  
     - Configuração do módulo para usar as rotas no root (`RouterModule.forRoot(routes)`).  
     - Exportação do `RouterModule` para uso em outros componentes.  

3. **Integração com o Template Principal**:  
   - No `app.component.html`:  
     - Adição da diretiva `<router-outlet>` **entre o cabeçalho e o rodapé**.  
 
     - **Funcionalidade**:  
       - O conteúdo das páginas (produtos, carrinho, etc.) será renderizado no lugar do `<router-outlet>`.  
       - Cabeçalho e rodapé permanecem fixos em todas as páginas.

**Observação**:  
- O uso de `--flat` simplifica a organização para projetos pequenos.  
- O `<router-outlet>` é essencial para o carregamento dinâmico de páginas no Angular.

#### Aula 6.E

**Resumo: Implementação da Página de Produtos**  

**1. Objetivo**  
- Criar a página de produtos com exibição dinâmica dos itens.  
- Configurar rotas para navegação entre produtos.  

**2. Passos Realizados**  

1. **Criação do Módulo de Produtos**  
   - Comando: `ng generate module produtos --route produtos --module app.module` 
    -`ng generate module produtos` — Cria um novo módulo Angular chamado `produtos`.
    -`--route produtos` — Cria uma rota `/produtos` e um componente associado (`ProdutosComponent`), com configuração de **lazy loading**.
    -`--module app.module` — Adiciona a nova rota ao `AppRoutingModule`, vinculando ao `AppModule`.
 
   - Objetivo: Organizar tudo relacionado a produtos em um módulo separado para melhor desempenho e manutenção.  

2. **Configuração da Rota de Produtos**  
   - Rota principal: `/produtos`  
   - Redirecionamento da raiz (`/`) para `/produtos` usando:  
     ```typescript
     { path: '', redirectTo: 'produtos', pathMatch: 'full' }
     ```  

3. **Estrutura do Template (`produtos.component.html`)**  
   - Seção principal com classe `product-list`.  
   - Cards de produtos com:  
     - Imagem (`<img>`).  
     - Nome (`<h2 class="product-item-name">`).  
     - Preço formatado em BRL (`{{ produto.preco | currency:'BRL' }}`).  
     - Descrição (`<p class="product-item-description">`).  
     - Botão "Comprar".  

4. **Dados dos Produtos**  
   - Criação de uma interface `Produto`
   - Lista mockada de produtos em `produtos.ts` (simulando um backend).  
   - Imagens salvas na pasta `assets/`.  

5. **Exibição Dinâmica com `*ngFor`**  
   - Uso da diretiva para iterar sobre a lista de produtos:  
     ```html
     <div *ngFor="let produto of produtos" class="product-list-card">
       <!-- Conteúdo do card -->
     </div>
     ```  

6. **Navegação para Detalhes do Produto**  
   - Configuração de `routerLink` para redirecionar para `/produtos/{{produto.id}}` (a ser implementado).  

7. **Estilização**  
   - CSS aplicado para cards, preços e botões (arquivo `produtos.component.css`).  

**Dica**: Use `currency:'BRL'` para formatar preços em Reais (R$).

#### Aula 6.F

**Resumo: Implementação da Página "Não Encontrada" (404)**  

**1. Objetivo**  
Criar uma página personalizada para rotas inexistentes (erro 404) no projeto Angular.  

**2. Passos Realizados**  

1. **Geração do Componente**  
   - Comando: `ng generate component pagina-nao-encontrada`  
   - Componente criado para exibir mensagens de "página não encontrada".  

2. **Configuração da Rota**  
   - Adição da rota **curinga (`**`)** no `app-routing.module.ts`:  
     ```typescript
     { path: '**', component: PaginaNaoEncontradaComponent }
     ```  
   - Essa rota captura **qualquer URL não mapeada** e redireciona para o componente.  

3. **Personalização do Template**  
   - Estrutura básica:  
     ```html
     <section class="pagina-nao-encontrada">
       <i class="fas fa-times"></i> <!-- Ícone de "X" do Font Awesome -->
       <h2>404 - Página não encontrada</h2>
     </section>
     ```  
   - Uso do **Font Awesome** para ícone de erro.  

**3. Funcionalidade**  
- Quando um usuário acessa uma rota não existente (ex: `/produto-inexistente`), a página 404 é exibida **automaticamente**.  


**Observação**:  
- A rota curinga (`**`) deve ser a **última** no array de rotas para funcionar corretamente.  
- Ícones do Font Awesome requerem a instalação prévia (via kit ou CDN).  

#### Aula 6.G

**Resumo: Criação da Página de Detalhes do Produto**

**1. Objetivo**  
Desenvolver a página de detalhes de um produto, permitindo que os usuários visualizem informações específicas, selecionem a quantidade e adicionem itens ao carrinho.

**2. Passos Realizados**  

1. **Geração do Componente**  
   - Comando: `ng g component produtos/detalhes-produto --module produtos.module`  
     - O componente foi criado dentro da pasta `produtos` e automaticamente declarado no módulo de produtos.

2. **Configuração da Rota**  
   - Adição da rota dinâmica no módulo de produtos (`produtos-routing.module.ts`):  
     ```typescript
     { path: ':id', component: DetalhesProdutoComponent }
     ```  
   - A rota captura o ID do produto na URL (ex: `/produtos/1`).

3. **Estrutura do Template (`detalhes-produto.component.html`)**  
   - **Seção Principal**:  
     - Divisão para a imagem do produto (`<div class="produto-imagem-container">`).  
     - Exemplo: `<img src="/assets/monitor-1.jpg">`.  
   - **Seção de Informações**:  
     - Nome do produto (`<h2 class="produto-nome">`).  
     - Preço (`<h3 class="produto-preco">`).  
     - Quantidade em estoque (`<p class="produto-estoque">10 unidades</p>`).  
     - Input para seleção de quantidade (`<input type="number">`).  
     - Botão "Adicionar ao carrinho".

**Dica**:
  - Faça modificações no arquivo CSS baixado para utilizar trocando de:
    ```CSS
    /* Firefox */
    input[type=number] {
        appearance: textfield;
    }
    ```
    Para:

    ```CSS
    /* Firefox */
    input[type=number] {
        appearance: textfield;
    }
    ```

 - Troque tambem o nome da class de `product-deion__container` para `product-description__container`.

#### Aula 6.H
**Resumo: Implementação da Lógica da Página de Detalhes do Produto**

**1. Objetivo**  
Implementar a lógica para carregar os detalhes de um produto específico na página de detalhes, permitindo a seleção de quantidade e preparando a integração com o carrinho de compras.

**2. Principais Passos Realizados**

1. **Criação do Serviço de Produtos**  
   - Comando: `ng generate service produtos/produto`  
   - Responsabilidade:  
     - `getAll()`: Retorna a lista completa de produtos.  
     - `getById(id: number)`: Retorna um produto específico com base no ID.  

2. **Integração com o Componente de Detalhes**  
   - Injeção de dependências:  
     - `ProdutoService` para obter dados do produto.  
     - `ActivatedRoute` para capturar o ID da rota.  
   - Lógica no `ngOnInit()`:  
     ```typescript
     this.produto = this.produtoService.getById(
       Number(this.activatedRoute.snapshot.paramMap.get('id'))
     );
     ```  
     - Converte o parâmetro da rota (string) para número.  

3. **Template Dinâmico**  
   - Bindings no HTML:  
     - Imagem: `[src]="'/assets/' + produto.imagem"`  
     - Nome e preço: `{{ produto.nome }}`, `{{ produto.preco | currency:'BRL' }}`  
     - Estoque: `{{ produto.quantidadeEstoque }} unidades`  
   - Two-way binding para quantidade:  
     ```html
     <input type="number" [(ngModel)]="quantidade" min="1" [max]="produto.quantidadeEstoque">
     ```  

4. **Melhorias nos Dados**  
   - Adição da propriedade `quantidadeEstoque` na interface `Produto`.  
   - Atualização da lista mockada (`produtos.ts`) com valores de estoque.  

5. **Configuração do Módulo**  
   - Importação de `FormsModule` no módulo de produtos para habilitar `ngModel`.  

**3. Funcionalidades Pendentes**  
- **Adicionar ao Carrinho**: Lógica para enviar o produto selecionado (com quantidade) ao carrinho (próxima aula).  
- **Validação Avançada**: Impedir quantidade superior ao estoque.  

**4. Estava tendo erro no meu codigo ao acessar rotas com ID diferentes**

Explicando a solução, bati muito minha cabeça espero que goste:

**Diferença entre os códigos de `ngOnInit`**

A principal diferença entre os dois códigos está em como eles lidam com os parâmetros da rota no Angular:

**4.1. Primeiro Código (usando `snapshot`)**
```typescript
ngOnInit(): void {
    const routeParams = this.route.snapshot.paramMap;
    const produtoId = Number(routeParams.get("id"));
    this.produto = this.ProdutosService.getOne(produtoId);
}
```

- **Acesso único**: Usa `snapshot` para pegar os parâmetros uma única vez quando o componente é inicializado
- **Estático**: Se os parâmetros da rota mudarem enquanto o componente estiver ativo, essas mudanças não serão detectadas
- **Mais simples**: Adequado para casos onde você sabe que os parâmetros não mudarão durante o tempo de vida do componente

**4.2. Segundo Código (usando `subscribe`)**
```typescript
ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
        const produtoId = Number(params.get("id"));
        this.produto = this.ProdutosService.getOne(produtoId);
    });
}
```

- **Reativo**: Inscreve-se para receber atualizações sempre que os parâmetros da rota mudarem
- **Dinâmico**: Se o usuário navegar para a mesma rota mas com um ID diferente (sem recarregar o componente), o código será executado novamente
- **Mais complexo**: Requer gerenciamento de subscriptions (idealmente com operadores como `takeUntil` para evitar memory leaks)

**Quando usar cada um:**
- Use `snapshot` quando os parâmetros não mudarão durante o tempo de vida do componente
- Use `subscribe` quando você precisa reagir a mudanças nos parâmetros enquanto o componente está ativo

O segundo abordagem é geralmente mais segura e recomendada para a maioria dos casos, especialmente em aplicações com navegação mais complexa.

Troque também produtos-service corrigir comparação de ID em `getOne`

de: 
```javascript
  getOne(produtoId: number) {
    return this.produtos.find(produto => produto.id = produtoId);
  }
```
para:

de: 
```javascript
  getOne(produtoId: number) {
    return this.produtos.find(produto => produto.id === produtoId);
  }
```

Substitui operador de atribuição (`=`) por comparação estrita (`===`) na busca por ID.
Desta maneira vai parar de dar o erro que fica somente 1 ID aparecendo mesmo mudando a rota.

#### Aula 6.I

**Resumo: Implementação de Notificações com Angular Material**  

**Objetivo da Aula:**  
Implementar uma funcionalidade de notificação em uma aplicação Angular utilizando a biblioteca Angular Material, especificamente o componente `SnackBar`.  

**Passos Principais:**  

1. **Instalação do Angular Material:**  
   - Utilizou-se o comando `ng add @angular/material` para instalar a biblioteca.  
   - Durante a instalação, foram configurados:  
     - **Tema de cores:** Optou-se pelo tema padrão (indigo-pink).  
     - **Tipografia:** Habilitada para usar fontes padrão do Angular Material.  
     - **Animações:** Ativadas para melhor experiência do usuário.  

2. **Reinicialização do Servidor:**  
   - Após a instalação, reiniciou-se o servidor local para garantir que as mudanças fossem aplicadas corretamente.  

3. **Configuração do Módulo:**  
   - No arquivo `app.module.ts`, importou-se o módulo `MatSnackBarModule` do Angular Material e adicionou-o à lista de imports.  

4. **Criação do Serviço de Notificação:**  
   - Gerou-se um serviço chamado `NotificacaoService` usando o comando `ng generate service notificacao`.  
   - No serviço:  
     - Injetou-se o `MatSnackBar` para exibir as notificações.  
     - Criou-se um método `notificar` que recebe uma mensagem e exibe um `SnackBar` com:  
       - **Mensagem:** Texto a ser exibido.  
       - **Ação:** Botão "OK".  
       - **Configurações:** Duração de 2 segundos, posição no topo e centro da tela.  

5. **Integração com o Componente:**  
   - No componente `detalhes-produto`, criou-se um método `adicionarAoCarrinho` que, por enquanto, apenas chama o método `notificar` do serviço para exibir a mensagem "Produto foi adicionado ao carrinho".  
   - Associou-se o método ao evento de clique de um botão no template.  

**Links Importantes:**  
- [Documentação do Angular](https://material.angular.io/)  
- [Guia Oficial do SnackBar](https://material.angular.io/components/snack-bar/overview)

#### Aula 6.J

**Resumo da Aula:** Implementação de Carrinho de Compras com Angular e LocalStorage

**Objetivo da Aula:**
Desenvolver um serviço completo de carrinho de compras em Angular com persistência de dados utilizando localStorage, incluindo funcionalidades de adição, remoção e atualização de itens, além da exibição do conteúdo do carrinho.

**Passos Principais:**

**1. Criação do CarrinhoService:**
- Utilizou-se o comando `ng generate service carrinho` para criar o serviço
- Definimos a interface `ItemCarrinho` com propriedades:
  - `id`: Identificador único do produto
  - `nome`: Nome do produto
  - `preco`: Valor unitário
  - `quantidade`: Quantidade selecionada

**2. Configuração do LocalStorage:**
- Implementou-se os métodos para persistência de dados:
  - `salvarCarrinho()`: Converte o carrinho para JSON e armazena
  - `carregarCarrinho()`: Recupera e parseia os dados, com fallback para array vazio
- Criou-se a chave 'app_carrinho' para identificação no storage

**3. Métodos do Serviço:**
- `adicionarItem()`:
  - Verifica se item já existe no carrinho
  - Atualiza quantidade ou adiciona novo registro
  - Chama `salvarCarrinho()` após modificações
- `obterCarrinho()`: 
  - Retorna todos os itens via `carregarCarrinho()`
  - Inclui cálculo do total (preço × quantidade)
- `limparCarrinho()`:
  - Remove todos os itens
  - Atualiza o storage

**4. Integração com Componentes:**
- No componente de produtos:
  - Implementou-se `adicionarAoCarrinho()` que chama o serviço
  - Adicionou-se feedback visual usando MatSnackBar
- No componente do carrinho:
  - Criou-se tabela para exibir itens
  - Implementou-se remoção individual de itens
  - Adicionou-se cálculo do total geral

**5. Tratamento de Erros:**
- Validação de dados ao carregar do storage
- Mensagens de erro para casos de storage cheio
- Fallback para array vazio quando dados inválidos

**Links Úteis:**
- [Documentação Oficial do LocalStorage](https://developer.mozilla.org/pt-BR/docs/Web/API/Window/localStorage)
- [Guia de Serviços Angular](https://angular.io/guide/architecture-services)
- [Trabalhando com JSON no JavaScript](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/JSON)
- [Injeção de Dependência Angular](https://angular.io/guide/dependency-injection)

#### Aula 6.K

**Resumo da Aula:** Criação da Página de Carrinho com Angular

**Objetivo da Aula:**
Desenvolver a página de carrinho de compras com estrutura HTML, estilização CSS e integração inicial com o serviço de carrinho criado anteriormente.

**Passos Principais:**

**1. Criação do Módulo de Carrinho:**
- Utilizou-se o comando `ng generate module carrinho --route carrinho  --module app.module` para criar:
  - Um novo módulo dedicado ao carrinho
  - Rota automática '/carrinho'
  - Integração com o módulo principal da aplicação

**2. Estruturação do Template:**
- Implementou-se a estrutura básica com:
  - Título principal (h2) com classe 'cart-title'
  - Div container para listagem de produtos:
    - Imagem do produto (placeholder inicial)
    - Descrição do produto (parágrafo)
    - Preço unitário (parágrafo fixo temporário)
    - Input para quantidade (tipo number)
    - Botão de remoção com ícone 'x-mark' do Font Awesome

**3. Adição de Estilos CSS:**
- Criou-se classes específicas para:
  - Botão principal (.buy-button)
  - Botão de remoção (.remove-button)
  - Seção de total (.total-part)
- Aplicou-se estilos para:
  - Layout responsivo dos itens
  - Espaçamento e margens
  - Formatação de preços e quantidades

**4. Integração Inicial:**
- Preparou-se a estrutura para:
  - Exibição dinâmica dos produtos (a ser implementado)
  - Cálculo automático do total (a ser implementado)
  - Funcionalidade de remoção (a ser implementado)

**5. Próximos Passos (Preview):**
- Implementação da ligação com o CarrinhoService
- Carregamento dinâmico dos produtos
- Cálculo em tempo real do total
- Funcionalidade completa de remoção de itens

**Links Úteis:**
- [Documentação de Módulos Angular](https://angular.io/guide/architecture-modules)
- [Guia de Rotas Angular](https://angular.io/guide/router)
- [Font Awesome Icons](https://fontawesome.com/icons)
- [CSS Flexbox Layout](https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout)

#### Aula 6.L

**Resumo da Aula:** Implementação das Funcionalidades do Carrinho de Compras

**Objetivo da Aula:**
Completar a implementação da página de carrinho com todas as funcionalidades necessárias, incluindo:
- Carregamento dinâmico dos produtos
- Cálculo automático do total
- Remoção de itens
- Finalização de compra

**Passos Principais:**

**1. Integração com o CarrinhoService:**
- Injetou-se o serviço no componente do carrinho
- Criou-se a propriedade `itensCarrinho` para armazenar os produtos
- Implementou-se o carregamento inicial dos itens usando `obterCarrinho()`

**2. Exibição Dinâmica dos Produtos:**
- Utilizou-se `*ngFor` para listar os itens do carrinho
- Formatou-se os preços usando pipe de moeda (BRL)
- Implementou-se exibição condicional com `*ngIf` para mostrar mensagem quando o carrinho está vazio

**3. Funcionalidade de Remoção:**
- Criou-se método `removerProdutoCarrinho()` no serviço:
  - Filtra os itens pelo ID
  - Atualiza o localStorage
- Implementou-se botão de remoção com ícone (x-mark)
- Adicionou-se atualização automática da lista e do total após remoção

**4. Cálculo do Total:**
- Desenvolveu-se método `calcularTotal()`:
  - Usa `reduce()` para somar (preço × quantidade) de todos os itens
  - Atualiza automaticamente ao modificar quantidades
- Conectou-se ao evento `(change)` do input de quantidade

**5. Finalização de Compra:**
- Implementou-se método `comprar()` que:
  - Exibe mensagem de confirmação
  - Limpa o carrinho via serviço
  - Redireciona para página de produtos usando `Router.navigate()`
- Adicionou-se tratamento para carrinho vazio

**Links Úteis:**
- [Documentação de Pipes no Angular](https://angular.io/guide/pipes)
- [Guia de NgFor](https://angular.io/guide/built-in-directives#ngFor)
- [Manipulação de Arrays com Reduce](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce)
- [Navegação com Router](https://angular.io/guide/router)

#### Aula 6.M

**Resumo da Aula:** Criação da Página de Contato com Formulário e Mapa

**Objetivo da Aula:**
Desenvolver a página de contato com um formulário funcional e integração com mapa, incluindo estrutura HTML e estilização básica.

**Passos Principais:**

**1. Criação do Módulo de Contato:**
- Utilizou-se `ng generate module contato --route contato --module app.module` para:
  - Criar um módulo dedicado
  - Configurar rota automática '/contato'
  - Integrar com o módulo principal

**2. Estrutura do Template:**
- Implementou-se:
  - Título principal (h2) com classe 'contact-title'
  - Seção container com formulário:
    - Inputs para: Nome, Assunto, Telefone e Email
    - Textarea para Mensagem (com maxlength)
    - Botão de envio
  - Tag address com informações de localização
  - Incorporação de iframe com mapa do Google Maps

**3. Configuração Inicial:**
- Adicionou-se:
  - Placeholders em todos os campos
  - Atributos básicos de acessibilidade
  - Estrutura semântica HTML5

**4. Estilização Básica:**
- Aplicou-se CSS inicial para:
  - Formatação do formulário
  - Espaçamento dos elementos
  - Visualização do mapa incorporado

**Próximos Passos (Preview):**
- Validação de formulário
- Formatação específica para campos (telefone, email)
- Integração com serviços backend
- Melhorias de acessibilidade

**Links Úteis:**
- [Documentação de Módulos Angular](https://angular.io/guide/architecture-modules)
- [Formulários Template-driven no Angular](https://angular.io/guide/forms)
- [Incorporação de Mapas Google](https://developers.google.com/maps/documentation/embed/embedding-map)
- [HTML Semântico](https://developer.mozilla.org/pt-BR/docs/Glossary/Semantics)

#### Aula 6.N

**Resumo da Aula:** Implementação de Validações em Formulários Reativos no Angular  

**Objetivo da Aula:**  
Desenvolver um formulário reativo com validações em tempo real, máscara para campos específicos (como telefone) e feedback visual para o usuário, utilizando Reactive Forms e a biblioteca `ngx-mask`.  

**Passos Principais:**  

**1. Configuração Inicial:**  
- Importação do `ReactiveFormsModule` no módulo de contato para habilitar formulários reativos.  
- Uso do `FormBuilder` no componente para criar um grupo de controles de formulário (`FormGroup`).  

**2. Definição dos Campos e Validações:**  
- Criação de um objeto no `FormGroup` com os campos:  
  - **Nome**: Validações `required` e `minLength(4)`.  
  - **Assunto**: Validações `required` e `minLength(10)`.  
  - **Telefone**: Validações `required`, `minLength(11)` e aplicação de máscara com `ngx-mask`.  
  - **Email**: Validações `required` e `email` (validador padrão do Angular).  
  - **Mensagem**: Validações `required` e `minLength(20)`.  

**3. Template e Validação Visual:**  
- Vinculação dos campos do `FormGroup` aos inputs no HTML usando `formControlName`.  
- Aplicação de classes CSS condicionais:  
  - `class.valid`: Borda verde quando o campo é válido.  
  - `class.invalid`: Borda vermelha quando o campo é inválido e tocado (`touched` ou `dirty`).  
- Mensagens de erro dinâmicas com `*ngIf`:  
  - Exibição de erros específicos (ex: `minlength`, `required`) abaixo de cada campo.  

**4. Máscara para Telefone:**  
- Instalação da biblioteca `ngx-mask` via npm.  
- Configuração da máscara `(00) 00000-0000` no campo de telefone usando a diretiva `mask`.  

**5. Controle do Botão de Envio:**  
- Desabilitação do botão quando o formulário é inválido (`[disabled]="formContato.invalid"`).  

**6. Método de Envio e Reset:**  
- Implementação do método `enviarFormulario()` para:  
  - Exibir um alerta de sucesso (simulação).  
  - Resetar o formulário (`formContato.reset()`).  
- Associação do método ao evento `(ngSubmit)` do formulário.   

**Links Úteis:**  
- [Documentação Reactive Forms (Angular)](https://angular.io/guide/reactive-forms)  
- [Biblioteca ngx-mask](https://www.npmjs.com/package/ngx-mask)  
- [Validações Customizadas no Angular](https://angular.io/guide/form-validation#custom-validators)  
- [Gerenciamento de Estado em Formulários](https://blog.angular-university.io/angular-forms/)  

#### Aula 6.O

**Resumo da Aula:** Implementação da Barra de Pesquisa com Angular

**Objetivo da Aula:**
Desenvolver uma barra de pesquisa funcional que filtra produtos com base nos parâmetros da URL e mantém a consistência entre diferentes páginas da aplicação.

**Passos Principais:**

**1. Extração de Parâmetros da Rota:**
- Substituiu-se `ngOnInit` por `ActivatedRoute.paramMap.subscribe()`
- Implementou-se a captura do parâmetro "descricao" da URL:
  ```typescript
  this.route.paramMap.subscribe(params => {
    const descricao = params.get('descricao')?.toLowerCase();
    // Filtra produtos
  });
  ```

**2. Filtragem de Produtos:**
- Criou-se lógica para filtrar produtos baseados na descrição:
  ```typescript
  this.produtos = this.produtosFiltrados.filter(produto => 
    produto.descricao.toLowerCase().includes(descricao)
  );
  ```

**3. Criação do Componente de Pesquisa:**
- Gerou-se novo componente `barra-pesquisa` via Angular CLI
- Moveu-se o formulário de pesquisa para o novo componente
- Transferiu-se os estilos CSS específicos

**4. Implementação do Two-Way Binding:**
- Adicionou-se `FormsModule` no módulo principal
- Implementou-se `[(ngModel)]="descricao"` no input de pesquisa

**5. Navegação Programática:**
- Configurou-se redirecionamento para página de produtos com parâmetros:
  ```typescript
  pesquisar() {
    if (this.descricao) {
      this.router.navigate(['/produtos'], { 
        queryParams: { descricao: this.descricao } 
      });
    }
  }
  ```

**Links Úteis:**
- [ActivatedRoute Documentation](https://angular.io/api/router/ActivatedRoute)
- [Two-Way Binding Guide](https://angular.io/guide/two-way-binding)
- [Router Navigation](https://angular.io/guide/router#navigating-programmatically)

---

## Aula 07

#### Aula 7.A

#### Aula 7.B

#### Aula 7.C

#### Aula 7.D

---

## Aula 08

#### Aula 8.A

---
## Aula 09

#### Aula 9.A

---
## Aula 10

#### Aula 10.A

---

## Aula 11

#### Aula 11.A

---

## Considerações Finais

**Objetivo do Curso:** Capacitar os alunos a desenvolverem aplicações web modernas utilizando Angular, com foco em escalabilidade e boas práticas de desenvolvimento.

---

**Links Relevantes:**
- [GitHub do Professor Ralf Lima](https://github.com/ralflima)
- [YouTube - Canal do Ralf Lima](https://www.youtube.com/@RalfLima/featured)
