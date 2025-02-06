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

#### Aula 4.I

#### Aula 4.J

#### Aula 4.K

---

## Aula 05

#### Aula 5.A

#### Aula 5.B

#### Aula 5.C

#### Aula 5.D

#### Aula 5.E

#### Aula 5.F
---

## Aula 06

#### Aula 6.A

#### Aula 6.B

#### Aula 6.C

#### Aula 6.D

#### Aula 6.E

#### Aula 6.F

#### Aula 6.G

#### Aula 6.H

#### Aula 6.I

#### Aula 6.J

#### Aula 6.K

#### Aula 6.L

#### Aula 6.M

#### Aula 6.N

#### Aula 6.O

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
