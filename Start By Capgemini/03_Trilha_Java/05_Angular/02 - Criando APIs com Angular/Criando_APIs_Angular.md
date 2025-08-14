# Curso: Criando APIs com Angular

**Professores:**

- Ralf Lima  
  - [GitHub](https://github.com/ralflima)  
  - [LinkedIn](https://www.linkedin.com/in/ralflima-3b93708a/)  
  - [Instagram](https://www.instagram.com/ralflima_dev/)  
  - [YouTube](https://www.youtube.com/@RalfLima/featured)  

## Introdução ao Curso Criando APIs com Angular

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

## 📚 Índice

- [Aula 01 - Introdução](#aula-01---introdução)
  - [Aula 1.A](#aula-1a)
  - [Aula 1.B](#aula-1b)
  - [Aula 1.C](#aula-1c)
- [Aula 02 - Configurar .htaccess](#aula-02---configurar-htaccess)
  - [Aula 2.A](#aula-2a)
  - [Aula 2.B](#aula-2b)
  - [Aula 2.C](#aula-2c)
  - [Aula 2.D](#aula-2d)
  - [Aula 2.E](#aula-2e)
  - [Aula 2.F](#aula-2f)
  - [Aula 2.G](#aula-2g)
  - [Aula 2.H](#aula-2h)
  - [Aula 2.I](#aula-2i)
- [Aula 03 - Configurar Angular](#aula-03---configurar-angular)
  - [Aula 3.A](#aula-3a)
  - [Aula 3.B](#aula-3b)
  - [Aula 3.C](#aula-3c)
  - [Aula 3.D](#aula-3d)
  - [Aula 3.E](#aula-3e)
  - [Aula 3.F](#aula-3f)
- [Aula 04 - Estrutura de Serviços](#aula-04---estrutura-de-serviços)
  - [Aula 4.A](#aula-4a)
  - [Aula 4.B](#aula-4b)
  - [Aula 4.C](#aula-4c)
  - [Aula 4.D](#aula-4d)
  - [Aula 4.E](#aula-4e)
  - [Aula 4.F](#aula-4f)
  - [Aula 4.G](#aula-4g)
- [Aula 05 - Método de Seleção](#aula-05---método-de-seleção)
  - [Aula 5.A](#aula-5a)
  - [Aula 5.B](#aula-5b)
  - [Aula 5.C](#aula-5c)
- [Aula 06 - Criando Método de Cadastro](#aula-06---criando-método-de-cadastro)
  - [Aula 6.A](#aula-6a)
  - [Aula 6.B](#aula-6b)
- [Aula 07 - Método de Exclusão](#aula-07---método-de-exclusão)
  - [Aula 7.A](#aula-7a)
  - [Aula 7.B](#aula-7b)
  - [Aula 7.C](#aula-7c)
- [Aula 08 - Método de Atualização](#aula-08---método-de-atualização)
  - [Aula 8.A](#aula-8a)
  - [Aula 8.B](#aula-8b)
  - [Aula 8.C](#aula-8c)
- [Aula 09 - Considerações Finais](#aula-09---considerações-finais)
  - [Aula 9.A](#aula-9a)

---
 
## Aula 01 - Introdução

#### Aula 1.A

**Título**: **Introdução a APIs RESTful: Conceitos Básicos e Métodos HTTP**  

**Objetivo da Aula**:  
Explicar o conceito de APIs como intermediárias entre aplicações frontend e bancos de dados, com foco nos métodos HTTP (GET, POST, PUT, DELETE) e seu funcionamento básico.

**Temas Abordados**  

1. **Definição e Propósito de APIs**  
   - Sistemas desenvolvidos em linguagens web que permitem comunicação entre aplicações  
   - Funcionam como ponte entre frontend (interface) e banco de dados  
   - Acessíveis via URLs específicas para operações de dados  

2. **Métodos HTTP Principais**  
   - **GET**: Solicita dados (operações de leitura)  
   - **POST**: Envia dados para criação de registros  
   - **PUT**: Atualiza dados existentes  
   - **DELETE**: Remove registros  
   - Cada método desencadeia ação específica no servidor

3. **Arquitetura Cliente-Servidor**  
   - Fluxo básico: Frontend → Requisição HTTP → Backend → Banco de Dados  
   - Exemplo prático: Formulário web envia dados via POST para cadastro  

4. **Tecnologias Envolvidas**  
   - Frontend: Angular, React, Vue  
   - Backend: PHP, Java (Spring), C# (ASP.NET)  
   - Destaque do curso: Combinação Angular + PHP puro

### **Links Úteis**  
- [Documentação Oficial HTTP Methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods)  
- [Guia Angular HTTP](https://angular.io/guide/http)  

#### Aula 1.B

**Título: Configuração do Ambiente de Desenvolvimento para Aplicações PHP e Angular**

**Objetivo da Aula:**
Explicar os requisitos e processo de configuração do ambiente de desenvolvimento para criar aplicações web utilizando PHP com banco de dados MySQL e Angular.

**Temas Abordados**

1. **Requisitos do Ambiente de Desenvolvimento**
   - PHP (versão 7.2.10 ou superior)
   - Node.js (necessário para executar aplicações Angular)
   - Angular CLI (ferramenta para criação de projetos Angular)
   - Editor de código (Visual Studio Code recomendado)

2. **Processo de Instalação**
   - **PHP e MySQL**: Ambiente integrado XAMPP/WAMP para desenvolvimento local
   - **Node.js**: Instalação simples via pacote oficial
   - **Angular CLI**: Instalado via npm (gerenciador de pacotes do Node.js)
   - **Editores de Código**: Opções como VS Code, Sublime Text ou Atom

3. **Configuração Inicial**
   - Verificação das instalações via terminal/linha de comando
   - Criação do primeiro projeto Angular usando Angular CLI
   - Preparação do ambiente PHP para integração futura

4. **Recomendações**
   - Uso do Visual Studio Code como editor principal
   - Verificação de compatibilidade entre versões dos softwares
   - Atualizações futuras serão disponibilizadas conforme necessário

**Links Úteis**
- [Documentação oficial do PHP](https://www.php.net/docs.php)
- [Guia de instalação do Node.js](https://nodejs.org/en/docs/)
- [Angular CLI Overview](https://angular.io/cli)
- [Download Visual Studio Code](https://code.visualstudio.com/)

#### Aula 1.C

**Título**: Configuração Inicial de um Projeto Angular com PHP e Banco de Dados  

**Objetivo**:  
Preparar o ambiente para desenvolvimento de um projeto Angular, integrado com PHP e banco de dados, incluindo a criação da estrutura inicial e configurações básicas.  

**Pontos Principais**:  

1. **Configuração do Ambiente**:  
   - Ativação de opções necessárias para execução do PHP e funcionamento do banco de dados.  
   - Criação de uma pasta chamada `api` dentro de `htdocs` para armazenar os arquivos do projeto.  

2. **Inicialização do Projeto Angular**:  
   - Uso do comando `ng new` para criar um novo projeto Angular (exemplo: `ng new projeto-api`).  
   - Seleção de configurações padrão durante a inicialização (CSS como pré-processador).  

3. **Ferramentas Utilizadas**:  
   - Visual Studio Code (VS Code) como editor principal.  
   - Terminal integrado do VS Code para execução de comandos, direcionado automaticamente para a pasta do projeto (`htdocs/api`).  

4. **Próximos Passos**:  
   - Na próxima aula, será iniciado o desenvolvimento do HTML e a integração com Angular.  

**Links Úteis**:  
- [Documentação Oficial do Angular - ng new](https://angular.io/cli/new)  
- [Configuração do PHP para Desenvolvimento](https://www.php.net/manual/pt_BR/install.php)  

**Observações**:  
- O processo de criação do projeto Angular pode variar conforme a velocidade da internet devido ao download de dependências.  

---
 
## Aula 02 - Configurar .htaccess

#### Aula 2.A

**Título**: Configuração de API Backend com Angular e Regras de .htaccess  

**Objetivo**:  
Explicar a configuração de um arquivo `.htaccess` para:  
1. Remover a extensão `.php` das URLs.  
2. Habilitar CORS para comunicação entre um frontend Angular (localhost:4200) e uma API PHP.  

---  

**Pontos Principais**  

**1. Remoção da Extensão .php**  
- **Regras do Apache**:  
  ```apache
  RewriteEngine On
  RewriteCond %{REQUEST_FILENAME} !-f
  RewriteRule ^([^\.]+)$ $1.php [NC,L]
  ```  
  - **Funcionamento**:  
    - `RewriteEngine On`: Ativa o módulo de reescrita.  
    - `RewriteCond`: Verifica se a URL **não** corresponde a um arquivo físico.  
    - `RewriteRule`: Redireciona URLs sem extensão (ex: `/api`) para o arquivo `.php` correspondente (ex: `/api.php`).  
    - `[NC,L]`: Ignora maiúsculas/minúsculas (`NC`) e encerra outras regras (`L`).  

**2. Configuração de CORS para API RESTful**  
- **Cabeçalhos HTTP**:  
  ```apache
  Header always set Access-Control-Allow-Origin "http://localhost:4200"
  Header always set Access-Control-Max-Age "1000"
  Header always set Access-Control-Allow-Headers "X-Requested-With, Content-Type, Origin, Authorization, Accept, Client-Security-Token, Accept-Encoding"
  Header always set Access-Control-Allow-Methods "POST, GET, OPTIONS, DELETE, PUT"
  ```  
  - **Propósito**:  
    - Permite requisições do frontend Angular (em `localhost:4200`).  
    - Define métodos HTTP permitidos (GET, POST, PUT, DELETE, OPTIONS).  
    - Habilita cabeçalhos customizados (como `Authorization` para autenticação).  

**3. Contexto da Aula**  
- **Integração Angular + PHP**:  
  - O `.htaccess` é essencial para:  
    - URLs limpas (sem `.php`).  
    - Evitar erros de CORS durante o desenvolvimento.  
- **Próximos Passos**:  
  - Utilizar o arquivo configurado na próxima aula para conectar o frontend Angular ao backend PHP.  

---  

**Links Úteis**  
- [Documentação Oficial do Apache mod_rewrite](https://httpd.apache.org/docs/2.4/mod/mod_rewrite.html)  
- [Guia de CORS (MDN)](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/CORS)  
- [Exemplos práticos de .htaccess para APIs](https://enable-cors.org/server_apache.html)  

---  

**Dicas de Implementação**  
1. **Para Angular**:  
   - Use `HttpClient` para consumir a API:  
     ```typescript
     this.http.get('http://localhost/api').subscribe(...);
     ```  
2. **Para PHP**:  
   - Certifique-se de que o servidor Apache está com o módulo `mod_headers` e `mod_rewrite` ativados.  

---  

**Observação**: O arquivo `.htaccess` deve estar na raiz do projeto PHP (ex: `htdocs/api/`).

#### Aula 2.B

**Título**: Configuração de API RESTful com Angular e Regras de .htaccess  

**Objetivo**:  
Explicar a configuração de um arquivo `.htaccess` para permitir:  
1. Remoção da extensão `.php` em URLs  
2. Habilitação de métodos HTTP (POST, GET, PUT, DELETE) para uma API RESTful  
3. Comunicação entre frontend Angular e backend PHP  

---  

**Pontos Principais**  

**1. Estrutura do Projeto**  
- **Pasta `ATINY`**:  
  - Diretório principal do projeto dentro de `htdocs`  
  - Contém:  
    - Frontend Angular  
    - Backend API (pasta `PODAPAXAS` com arquivos PHP)  

**2. Configuração do .htaccess**  
```apache
# Habilita métodos HTTP
Header always set Access-Control-Allow-Methods "POST, GET, OPTIONS, DELETE, PUT"

# Remove extensão .php
RewriteEngine On
RewriteCond %{REQUEST_FILENAME} !-f
RewriteRule ^([^\.]+)$ $1.php [NC,L]
```

**Funcionamento**:  
- Permite requisições RESTful (POST, GET, PUT, DELETE)  
- Transforma URLs como `/api/endpoint` → `/api/endpoint.php`  
- OPTIONS é incluído para compatibilidade completa  

**3. Benefícios**  
- URLs limpas (sem `.php`)  
- Comunicação simplificada entre Angular e PHP  
- Não requer configurações complexas de servidor  

---  

**Exemplo de Uso**  
**Frontend Angular (HTTP Request)**:  
```typescript
this.http.post('http://localhost/ATINY/api/usuarios', dados)
```

**Backend PHP**:  
Arquivo `api/usuarios.php` processa a requisição  

---  

**Links Úteis**  
- [Documentação Oficial Apache mod_rewrite](https://httpd.apache.org/docs/2.4/mod/mod_rewrite.html)  
- [Guia de CORS para APIs](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/CORS)   

#### Aula 2.C

**Título**: Configuração de Banco de Dados MySQL para Integração com API  

**Objetivo**:  
Criar e configurar um banco de dados MySQL para armazenar informações de cursos, preparando a base para integração com uma API futuramente.  

---  

**Pontos Principais**  

**1. Configuração Inicial**  
- **Acesso ao Banco de Dados**:  
  - Utilizando um cliente MySQL (como phpMyAdmin ou MySQL Workbench).  
  - Conexão via `localhost` (porta padrão ou personalizada, como `:8080` mencionado).  

**2. Criação do Banco de Dados e Tabela**  
- **Banco de Dados**:  
  - Nome: `API` (provavelmente em referência ao projeto de API).  
- **Tabela `cursos`**:  
  ```sql
  CREATE TABLE cursos (
      id_curso INT AUTO_INCREMENT PRIMARY KEY,
      nome_curso VARCHAR(30) NOT NULL,
      valor_curso DECIMAL(10,2) NOT NULL
  );
  ```  
  - **Campos**:  
    - `id_curso`: Chave primária com autoincremento.  
    - `nome_curso`: Texto (30 caracteres).  
    - `valor_curso`: Decimal (10 dígitos, 2 casas decimais).  

**3. Inserção de Dados de Exemplo**  
- **Comando SQL**:  
  ```sql
  INSERT INTO cursos (nome_curso, valor_curso) VALUES ('Angular', 85.00);
  ```  
- **Verificação**:  
  - Os dados aparecem na tabela `cursos` com `id_curso` incrementado automaticamente.   

---  

**Links Úteis**  
- [Documentação MySQL](https://dev.mysql.com/doc/)  
- [Guia de CREATE TABLE](https://www.w3schools.com/sql/sql_create_table.asp)  
- [Tutorial de INSERT INTO](https://www.mysqltutorial.org/mysql-insert-statement.aspx)  

#### Aula 2.D

**Título**: Configuração de Conexão PHP com Banco de Dados MySQL  

**Objetivo**:  
Estabelecer uma conexão entre um script PHP e um banco de dados MySQL (local) para manipulação de dados via API.  

---  

**Pontos Principais**  

**1. Estrutura do Projeto**  
- **Pasta `PHP`**:  
  - Diretório principal para arquivos PHP.  
  - Arquivo criado: `conexao.php` (sem caracteres especiais no nome).  

**2. Parâmetros de Conexão**  
Variáveis necessárias para conexão:  
```php
$url = "localhost";  // URL do servidor MySQL
$usuario = "root";   // Usuário padrão
$senha = "";         // Senha vazia (configuração padrão)
$bancoDados = "API"; // Nome do banco de dados criado anteriormente
```

**3. Método de Conexão**  
- **Função `SQL_connect()`**:  
  ```php
  $conexao = SQL_connect($url, $usuario, $senha, $bancoDados);
  ```  
  - Observação: O termo `SQL_connect` sugere o uso de uma biblioteca específica ou função personalizada (possivelmente `mysqli_connect` ou PDO).  

**4. Fluxo de Trabalho**  
1. Criar arquivo `conexao.php` na pasta `PHP`.  
2. Definir variáveis com credenciais do banco de dados.  
3. Estabelecer conexão usando a função apropriada.  
4. Testar acesso à tabela `cursos` (criada anteriormente).  

---  

**Links Úteis**  
- [Documentação MySQLi](https://www.php.net/manual/pt_BR/book.mysqli.php)  
- [Tutorial de PDO](https://www.w3schools.com/php/php_mysql_connect.asp)  

#### Aula 2.E

**Título**: Configuração de Conexão PHP com Banco de Dados MySQL  

**Objetivo**:  
Estabelecer uma conexão entre um script PHP e um banco de dados MySQL (local) para manipulação de dados via API.  

---  

**Pontos Principais**  

**1. Estrutura do Projeto**  
- **Pasta `PHP`**:  
  - Diretório principal para arquivos PHP.  
  - Arquivo criado: `conexao.php` (sem caracteres especiais no nome).  

**2. Parâmetros de Conexão**  
Variáveis necessárias para conexão:  
```php
$url = "localhost";  // URL do servidor MySQL
$usuario = "root";   // Usuário padrão
$senha = "";         // Senha vazia (configuração padrão)
$bancoDados = "API"; // Nome do banco de dados criado anteriormente
```

**3. Método de Conexão**  
- **Função `SQL_connect()`**:  
  ```php
  $conexao = SQL_connect($url, $usuario, $senha, $bancoDados);
  ```  
  - Observação: O termo `SQL_connect` sugere o uso de uma biblioteca específica ou função personalizada (possivelmente `mysqli_connect` ou PDO).  

**4. Fluxo de Trabalho**  
1. Criar arquivo `conexao.php` na pasta `PHP`.  
2. Definir variáveis com credenciais do banco de dados.  
3. Estabelecer conexão usando a função apropriada.  
4. Testar acesso à tabela `cursos` (criada anteriormente).  

---  

**Exemplo de Código para Apresentar erro caso ocorra**  
Conexão usando **MySQL Padão PHP**:  
```php
<?php
$conexao = mysqli_connect("localhost", "root", "", "API");
if (!$conexao) {
    die("Erro: " . mysqli_connect_error());
}
echo "Conectado!";
?>
```

---  

**Links Úteis**  
- [Documentação MySQLi](https://www.php.net/manual/pt_BR/book.mysqli.php)  
- [Tutorial de PDO](https://www.w3schools.com/php/php_mysql_connect.asp)  

#### Aula 2.F

**Título**: Processamento de Dados e Integração com Banco de Dados  

**Objetivo**:  
Explicar o fluxo de manipulação de dados recebidos de um formulário (via POST) e sua integração com um banco de dados MySQL, incluindo validação e inserção.  

---  

**Pontos Principais**  

**1. Captura de Dados do Formulário**  
- **Método HTTP**: POST (envio de dados sensíveis, como cadastro).  
- **Variáveis Recebidas**:  
  - `nome_curso`: Nome do curso (ex: "JavaScript Básico").  
  - `valor_curso`: Valor monetário (ex: 299.99).  

**2. Validação e Sanitização**  
- **Processo**:  
  - Verificar se os campos não estão vazios.  
  - Filtrar caracteres especiais (ex: `htmlspecialchars()` no PHP).  
  - Converter o valor para formato decimal (ex: `floatval()`).  

**3. Manipulação dos Dados**  
- **Exemplo de Código (PHP)**:  
  ```php
  $nome_curso = $_POST['nome_curso'];  
  $valor_curso = floatval($_POST['valor_curso']);  

  // Validação básica
  if (empty($nome_curso)) {
      die("Nome do curso é obrigatório!");
  }
  ```  

**4. Inserção no Banco de Dados**  
- **Comando SQL**:  
  ```sql
  INSERT INTO cursos (nome_curso, valor_curso) VALUES (?, ?);
  ```  
- **Uso de Prepared Statements (MySQLi)**:  
  ```php
  $stmt = $conexao->prepare("INSERT INTO cursos (nome_curso, valor_curso) VALUES (?, ?)");
  $stmt->bind_param("sd", $nome_curso, $valor_curso); // "s" = string, "d" = double
  $stmt->execute();
  ```  

**5. Fluxo Completo**  
1. Receber dados via POST.  
2. Validar e sanitizar.  
3. Conectar ao banco de dados (`mysqli_connect`).  
4. Inserir dados com prepared statements.  
5. Retornar feedback (ex: mensagem de sucesso/erro).  

---  

**Links Úteis**  
- [Documentação MySQLi Prepared Statements](https://www.php.net/manual/pt_BR/mysqli.quickstart.prepared-statements.php)  
- [Validação de Formulários em PHP](https://www.w3schools.com/php/php_form_validation.asp)  

#### Aula 2.G

**Título**: Processamento de Dados e Estruturação para Integração com Banco de Dados  

**Objetivo**:  
Explicar o fluxo de preparação e estruturação de dados recebidos de um formulário (possivelmente via API ou frontend) para integração com um banco de dados, destacando a manipulação de variáveis e validação.  

---  

**Pontos Principais**  

**1. Contexto Geral**  
- **Dados Recebidos**:  
  - Campos como `nome_curso` e `valor_curso` (extraídos de um formulário ou API).  
  - Menção a "AAC" (possivelmente um sistema ou módulo de autenticação/acesso).  

- **Alterações na Estrutura**:  
  - Os dados não dependem mais do "AAC" para operação, indicando uma mudança na arquitetura.  

**2. Processamento dos Dados**  
- **Variáveis-Chave**:  
  - `nome_curso`: Texto (ex: "JavaScript Avançado").  
  - `valor_curso`: Valor numérico (ex: 299.99).  

- **Validação**:  
  - Verificar se os campos estão preenchidos e em formato correto.  
  - Exemplo em PHP:  
    ```php
    if (empty($_POST['nome_curso'])) {
        die("Nome do curso é obrigatório!");
    }
    ```

**3. Preparação para o Banco de Dados**  
- **Estruturação**:  
  - Os dados são organizados em variáveis antes da inserção (ex: `$nome = $_POST['nome_curso']`).  
  - Uso de **prepared statements** para segurança:  
    ```php
    $stmt = $conexao->prepare("INSERT INTO cursos (nome_curso, valor_curso) VALUES (?, ?)");
    $stmt->bind_param("sd", $nome_curso, $valor_curso);
    $stmt->execute();
    ```

**4. Fluxo de Trabalho**  
1. **Receber Dados**: Via POST (formulário ou API).  
2. **Validar**: Checar campos obrigatórios e formatos.  
3. **Estruturar**: Atribuir a variáveis (`$nome_curso`, `$valor_curso`).  
4. **Inserir no Banco**: Usando MySQLi ou PDO.  
---  

**Links Úteis**  
- [Documentação Oficial MySQLi](https://www.php.net/manual/pt_BR/book.mysqli.php)  
- [Validação de Formulários em PHP](https://www.w3schools.com/php/php_form_validation.asp) 

#### Aula 2.H


#### Aula 2.I

---
 
## Aula 03 - Configurar Angular

#### Aula 3.A

#### Aula 3.B

#### Aula 3.C

#### Aula 3.D

#### Aula 3.E

#### Aula 3.F

---
 
## Aula 04 - Estrutura de Serviços

#### Aula 4.A

#### Aula 4.B

#### Aula 4.C

#### Aula 4.D

#### Aula 4.E

#### Aula 4.F

#### Aula 4.G

---
 
## Aula 05 - Método de Seleção

#### Aula 5.A

#### Aula 5.B

#### Aula 5.C

---
 
## Aula 06 - Criando Método de Cadastro

#### Aula 6.A

#### Aula 6.B

---
 
## Aula 07 - Método de Exclusão

#### Aula 7.A

#### Aula 7.B

#### Aula 7.C

---
 
## Aula 08 - Método de Atualização

#### Aula 8.A

#### Aula 8.B

#### Aula 8.C

---
 
## Aula 09 - Considerações Finais

#### Aula 9.A

---
 