# Curso: Java - Web

**Professor:** Marcelo  
**Curso:** Java - Web  

---

## Índice

01. [Aula 01 - Boas vindas](#aula-01---boas-vindas)  
    - [Aula 1.A](#aula-1a)
02. [Aula 02 - Um projeto Java Web](#aula-02---um-projeto-java-web)  
    - [Aula 2.A](#aula-2a)  
    - [Aula 2.B](#aula-2b)  
    - [Aula 2.C](#aula-2c)  
    - [Aula 2.D](#aula-2d)  
    - [Aula 2.E](#aula-2e)  
    - [Aula 2.F](#aula-2f)  
    - [Aula 2.G](#aula-2g)  
    - [Aula 2.H](#aula-2h)  
    - [Aula 2.I](#aula-2i)  
    - [Aula 2.J](#aula-2j)
03. [Aula 03 - Considerações finais](#aula-03---considerações-finais)  
    - [Aula 3.A](#aula-3a)

---

## Aula 01 - Boas vindas
**Guia para Configuração do Servidor no Eclipse IDE no Windows 11 com Apache Tomcat**

**Nota:** O processo detalhado de configuração do servidor no Eclipse IDE e Apache Tomcat não foi informado diretamente no curso, sendo necessário complementar o aprendizado com guias e referências externas.

**Link para o vídeo no YouTube:** [Configuração do servidor no Eclipse IDE](https://www.youtube.com/watch?v=GCc4ZQqnmVY)

---
**Passo 1: Baixar o Apache Tomcat**

1. Acesse o site oficial do Apache Tomcat: [Apache Tomcat 9 Download](https://tomcat.apache.org/download-90.cgi).
2. Localize a seção **Binary Distributions**:
   - Escolha a versão **Core**.
   - Clique no link correspondente ao arquivo **.zip** (Windows).
3. Após o download, extraia o conteúdo para uma pasta de fácil acesso, como `C:\apache-tomcat-9`.
---
**Passo 2: Instalar o Eclipse IDE**

1. Caso ainda não tenha o Eclipse, baixe-o no site oficial: [Eclipse Downloads](https://www.eclipse.org/downloads/).
2. Escolha a versão **Eclipse IDE for Enterprise Java and Web Developers**.
3. Instale o Eclipse no Windows 11 seguindo as instruções do instalador.
---
**Passo 3: Configurar o Servidor no Eclipse**

1. Abra o Eclipse IDE.
2. No menu superior, vá até **Window > Show View > Servers**.
3. Na aba **Servers**:
   - Clique com o botão direito na área branca e selecione **New > Server**.
4. Na janela de configuração:
   - Em **Select the server type**, escolha **Apache > Tomcat v9.0 Server** (ou a versão que você baixou).
   - Clique em **Next**.
5. No campo **Tomcat Installation Directory**:
   - Clique em **Browse** e selecione a pasta onde você extraiu o Apache Tomcat, por exemplo, `C:\apache-tomcat-9`.
   - Clique em **Finish**.
---
**Passo 4: Testar o Servidor no Eclipse**

1. No painel **Servers**, clique com o botão direito no servidor configurado e selecione **Start**.
2. Abra um navegador e digite: `http://localhost:8080`.
3. Se o Tomcat estiver funcionando corretamente, você verá a página de boas-vindas.
---
**Passo 5: Configurar Projetos Java Web**
1. Crie ou importe um projeto **Dynamic Web Project** no Eclipse.
2. Clique com o botão direito no servidor configurado (na aba **Servers**) e selecione **Add and Remove**.
3. Adicione o projeto à lista de implantação e clique em **Finish**.
---
#### Aula 1.A

**Objetivo do curso:** Avançado em **Java Web**, ensinando o desenvolvimento de sistemas e páginas web interativas com **Java**.

**Conteúdo abordado:**
  - Criação de sistemas dinâmicos.
  - Integração com **bancos de dados** e operações interativas.
  - Configuração inicial e ferramentas necessárias.

**Foco principal:** Entender como **Java** pode ser utilizado para criar soluções web escaláveis e práticas.

## Aula 02 - Um projeto Java Web

#### Aula 2.A

**Definição de projeto web:** Um projeto web em Java utiliza uma arquitetura padrão, como **MVC** ou **DAO**.

**Integração:** O backend, previamente desenvolvido e testado, é integrado ao projeto web.

**Ferramentas destacadas:** Além do **Eclipse**, o **NetBeans** foi apresentado como uma alternativa viável para desenvolvimento de projetos Java Web.

**Objetivo do projeto:** Criar telas para interação com o usuário e executar métodos no backend a partir das entradas fornecidas.

**Processo de desenvolvimento:** Desenho das telas no frontend e envio de dados ao backend para operações específicas.

#### Aula 2.B

**HTML, JSP e Dinamismo em Páginas Web**

O uso de **HTML** e **JSP** é destacado como essencial para o desenvolvimento de páginas web dinâmicas. Essas tecnologias permitem a integração de **JavaScript**, **CSS** e **HTML**, proporcionando maior interatividade e funcionalidade.

- **HTML e CSS:** Responsáveis pela estrutura e estilização das páginas web.
- **JSP:** Utilizado para incorporar lógica Java diretamente nas páginas HTML, gerando conteúdo dinâmico no lado do servidor.

As principais funcionalidades abordadas incluem:
- Comunicação eficiente com o servidor.
- Atualização de dados em bancos de dados.
- Apresentação de informações dinâmicas para os usuários.

Essas ferramentas possibilitam a criação de sistemas modernos e interativos, alinhados aos padrões de sites amplamente utilizados atualmente.

#### Aula 2.C

**Criação de Projeto Java Web com Tomcat**

O processo de criação de um projeto Java Web envolve a configuração inicial do ambiente e a integração com um servidor como o **Apache Tomcat**. Seguem os passos detalhados mencionados:

1. **Configuração Inicial do Projeto:**
   - Criar um novo projeto web no **NetBeans**.
   - Escolher a categoria **Java Web** e o tipo de projeto **Web Application**.
   - Nomear o projeto (ex.: `PessoaWeb`) e definir a pasta de destino.

2. **Configuração do Servidor:**
   - Adicionar o servidor **Apache Tomcat** ao projeto.
   - Selecionar o diretório onde o Tomcat foi previamente instalado.
   - Confirmar a configuração do servidor para o projeto.

3. **Estrutura Inicial do Projeto:**
   - Após a criação, o projeto já inclui um arquivo **index.html** na estrutura web.
   - O servidor Tomcat é integrado automaticamente ao projeto.

4. **Dependências:**
   - Garantir a presença do driver de conexão com o banco de dados, como o **PostgreSQL**.
   - Organizar os arquivos do projeto dentro das pastas adequadas para manter a estrutura clara.

#### Aula 2.D

**Conceito de Host e Ambiente Local**

**Host:** Refere-se ao hospedeiro onde um site é armazenado para acesso na web. Para publicar um site, é necessário contratar um serviço de hospedagem.

**Ambiente Local:** Todo computador pode simular um ambiente web através de um **servidor local**, permitindo o desenvolvimento e testes antes da publicação online.

**Servidor Web:** Um servidor, como o **Apache Tomcat**, é utilizado para interpretar linguagens como **HTML**, **CSS** e **JavaScript**, possibilitando o desenvolvimento local de páginas web.

**Fluxo de Trabalho:**
  - Desenvolvimento e testes são realizados localmente utilizando o servidor configurado.
  - Após finalizado, o projeto pode ser publicado em um serviço de hospedagem, tornando-o acessível na web.

#### Aula 2.E

**Estrutura de Projeto e Integração do Backend**

**Estrutura Inicial do Projeto:**

  - Os arquivos HTML e recursos do site são organizados em pastas específicas.
  - O backend é estruturado dentro de **Source Packages**, onde ficam as classes em **Java**.

**Criação e Organização de Pacotes e Classes:**

  - Criar pacotes organizados, como `utils`, para agrupar classes específicas.
  - As classes existentes no backend são importadas e organizadas dentro da estrutura do projeto.

**Exemplo de Organização:**

  - Pacote `utils`: Criado para armazenar classes utilitárias como `Conexao`.
  - Erros de importação ou referências são corrigidos ao organizar as classes nos pacotes corretos.

#### Aula 2.F

**Criação de Menu e Interação com Métodos**

**Objetivo do Menu:**

  - O menu permite acessar métodos específicos dentro das classes para executar tarefas, como:
    - Cadastrar pessoa.
    - Consultar pessoa.
    - Alterar pessoa.
    - Excluir pessoa.

**Estrutura do Menu:**

  - Construído em **HTML** com formatação básica usando **CSS**.
  - Cada opção do menu direciona para um arquivo ou endpoint específico, como `cadastrarPessoa.pl` ou `consultarPessoa.pl`.

**Requisitos Técnicos:**

  - Conhecimento básico de **HTML**, **CSS** e **JavaScript** é essencial para criar e estilizar menus funcionais.
  - **JSP** é mencionado como tecnologia que suporta a integração de HTML, CSS e JavaScript no projeto.

#### Aula 2.G

#### Aula 2.H

#### Aula 2.I

#### Aula 2.J

## Aula 03 - Considerações finais

#### Aula 3.A

