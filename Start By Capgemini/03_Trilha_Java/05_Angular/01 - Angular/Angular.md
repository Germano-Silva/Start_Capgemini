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

#### Aula 3.B

---

## Aula 04

#### Aula 4.A

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
