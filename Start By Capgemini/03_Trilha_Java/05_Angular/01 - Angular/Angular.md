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

#### Aula 4.C

#### Aula 4.D

#### Aula 4.E

#### Aula 4.F

#### Aula 4.G

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
