# Router
como criar o projeto passo a passo angular 19:

# **Roteamento no Angular 19.1.5 com Angular Router**

## **Introdução ao Angular Router**
- O **Angular Router** é utilizado para gerenciar a navegação entre páginas em aplicações Angular.
- Permite definir **rotas dinâmicas**, associando caminhos de URL a componentes específicos.

---

## **Passos para Configurar o Roteamento no Angular 19.1.5**

### **1. Criar o Projeto Angular**
```bash
ng new roteamento-angular-19
cd roteamento-angular-19
```
- **Não adicionar Angular Routing automaticamente**, pois a configuração será feita manualmente.

### **2. Instalar o Angular Router**
```bash
npm install @angular/router
```
- Essa biblioteca permite o gerenciamento de rotas na aplicação.

### **3. Criar o Módulo de Rotas**
```bash
ng generate module app-routing --flat --module=app
```
- A flag `--flat` evita a criação de uma pasta adicional.
- A flag `--module=app` adiciona automaticamente esse módulo ao `AppModule`.

---

## **Configuração do Arquivo de Rotas (`app-routing.module.ts`)**
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
- **Exportação do `RouterModule`**: Permite que o módulo de rotas seja acessado globalmente.

---

## **4. Criar um Componente para a Primeira Página**
```bash
ng generate component primeira-pagina
```
- O componente será acessado ao navegar para `/primeira-pagina`.

### **Conteúdo do Template (`primeira-pagina.component.html`)**
```html
<h2>Primeira Página</h2>
```

---

## **5. Integrar o `RouterOutlet`**
- No arquivo `app.component.html`, substituir o conteúdo pelo `RouterOutlet`:
```html
<router-outlet></router-outlet>
```
- Esse elemento permite que os componentes sejam carregados dinamicamente com base na URL acessada.

---

## **6. Executar a Aplicação**
```bash
ng serve --open
```
- Acessar `http://localhost:4200/primeira-pagina` para visualizar o componente carregado.

---

## **Diferenças no Angular 19.1.5**
- **Melhoria no gerenciamento de rotas dinâmicas** e suporte otimizado para **Lazy Loading**.
- **Suporte aprimorado ao `standalone components`**, permitindo estrutura modular mais flexível.
- **Maior integração com `Signal API`**, impactando a reatividade e otimização de componentes.

---

## **Resumo**
- **O Angular Router** permite definir **rotas associadas a componentes**.
- **O `RouterOutlet`** carrega dinamicamente os componentes com base na URL.
- **A nova versão do Angular 19.1.5** traz otimizações para **Lazy Loading** e maior suporte a **componentes standalone**.

Essa abordagem facilita a navegação estruturada e modular dentro de aplicações Angular modernas.

# **Navegação entre Páginas no Angular com Angular Router**

## **Criando um Menu de Navegação**
- Para navegar entre páginas, é necessário criar um **menu fixo** utilizando o **RouterLink** necessario importar o **RouterModule**.
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

---

## **Criando um Novo Componente e Rota**
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

---

## **Navegação com Botão e Código**
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

---

## **Mantendo o Menu Fixo**
- O **menu permanece visível** porque foi colocado **antes do `<router-outlet>`** no `app.component.html`.
- Isso garante que a navegação carregue os componentes sem afetar o layout do menu.

---

## **Resumo**
- **O `RouterLink`** é usado para criar links de navegação diretamente no HTML.
- **O serviço `Router`** permite navegar entre páginas via código.
- **O `RouterOutlet`** carrega dinamicamente os componentes correspondentes à URL.
- **Menus fixos** são mantidos ao serem colocados **antes do `RouterOutlet`**.

Essa abordagem permite criar aplicações Angular com uma navegação fluida e estruturada.

---

# **Redirecionamento de Rotas e Página 404 no Angular**

## **Redirecionamento Automático para uma Página Inicial**
- Quando acessamos a aplicação sem uma **rota definida**, podemos redirecionar o usuário automaticamente para uma página padrão.
- No arquivo `app-routing.module.ts`, adicionamos a seguinte configuração:
```typescript
const routes: Routes = [
  { path: '', redirectTo: 'primeira-pagina', pathMatch: 'full' },
  { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
];
```
### **Explicação**
- **`path: ''`**: Define o caminho vazio, ou seja, a raiz da aplicação.
- **`redirectTo: 'primeira-pagina'`**: Redireciona para a primeira página.
- **`pathMatch: 'full'`**: Garante que a correspondência da URL deve ser exata.

Agora, ao acessar a **raiz da aplicação**, o usuário será automaticamente redirecionado para a primeira página.

---

## **Criando uma Página 404 - "Não Encontrada"**
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
### **Explicação**
- **`path: '**'`**: Corresponde a qualquer **rota não definida**.
- **`component: PaginaNaoEncontradaComponent`**: Carrega o componente de erro.

Agora, sempre que o usuário acessar **uma URL inexistente**, a página de **erro 404** será exibida.

---

## **Resumo**
- **Redirecionamento automático**: Define um redirecionamento para a página inicial quando não há uma rota na URL.
- **Página 404 personalizada**: Exibe uma página de erro para **URLs inválidas** usando `path: '**'`.
- **Melhor experiência do usuário**: Evita telas em branco e melhora a navegação.

Esse processo melhora a **usabilidade da aplicação Angular**, tornando a navegação mais intuitiva e eficiente.

---

# **Trabalhando com Parâmetros de Rota e Query Params no Angular**

## **Introdução**
- No Angular, podemos **passar parâmetros** na URL para buscar informações específicas.
- Existem **dois tipos principais de parâmetros**:
  1. **Parâmetros de Rota**: Passados diretamente na URL (`/produtos/1`).
  2. **Query Params**: Passados após uma interrogação (`/produtos?id=1&nome=João`).

---

## **Criando um Componente para Trabalhar com Parâmetros**
```bash
ng generate component pagina-com-parametros
```

### **Definição da Rota com Parâmetro**
- No arquivo `app-routing.module.ts`, adicionamos a rota que aceita um parâmetro:
```typescript
const routes: Routes = [
  { path: 'pagina-com-parametros/:id', component: PaginaComParametrosComponent }
];
```
- O **`:id`** representa um valor dinâmico que pode ser passado pela URL.

---

## **Obtendo Parâmetros de Rota**
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
### **Explicação**
- **`ActivatedRoute`**: Serviço do Angular Router usado para acessar informações da rota ativa.
- **`paramMap.subscribe()`**: Obtém o **ID** da URL e o converte para número.

---

## **Exibindo o Parâmetro no Template**
```html
<h2>Parâmetro da Rota: {{ id }}</h2>
```
- Ao acessar `http://localhost:4200/pagina-com-parametros/5`, será exibido:
  ```
  Parâmetro da Rota: 5
  ```

---

## **Trabalhando com Query Params**
- Query Params são usados para **filtrar** informações em uma URL (`?nome=João&idade=23`).
- Atualizamos a rota no `app-routing.module.ts` para aceitar **query parameters**:
```typescript
const routes: Routes = [
  { path: 'pagina-com-parametros/:id', component: PaginaComParametrosComponent }
];
```

### **Obtendo Query Params no Componente**
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

---

## **Exibindo os Query Params no Template**
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

---

## **Resumo**
- **Parâmetros de Rota (`:id`)** são usados para identificar um item específico.
- **Query Params (`?nome=João&idade=23`)** são usados para filtros e buscas.
- **O `ActivatedRoute`** é a classe usada para capturar esses valores.
- **Sempre verificar e converter os valores** quando necessário.

Agora a aplicação está preparada para lidar com URLs dinâmicas de forma eficiente!

---

# **Lazy Loading no Angular**

## **O que é Lazy Loading?**
- **Lazy Loading** é uma técnica que carrega um **módulo ou componente** apenas quando necessário.
- Evita que a aplicação carregue **todos os módulos de uma vez**, otimizando **tempo de carregamento** e **uso de recursos**.
- Diferente do **Eager Loading**, onde todos os arquivos são baixados **logo no início**.

---

## **Por que usar Lazy Loading?**
✔ **Melhora o desempenho da aplicação**  
✔ **Diminui o tempo de carregamento inicial**  
✔ **Reduz o consumo de memória**  
✔ **Carrega apenas os módulos necessários no momento certo**  

---

## **Criando um Módulo com Lazy Loading**
### **1. Gerar um Módulo**
```bash
ng generate module lazy-loading --route lazy-loading --module=app
```
- O módulo `lazy-loading` é criado e registrado automaticamente no `app-routing.module.ts`.
- O `--route lazy-loading` já configura a rota para esse módulo.
- O `--module=app` atrela esse módulo ao `AppModule`.

---

## **2. Configuração da Rota para Lazy Loading**
- No arquivo `app-routing.module.ts`, o Angular configura o **carregamento assíncrono** do módulo:
```typescript
const routes: Routes = [
  { 
    path: 'lazy-loading', 
    loadChildren: () => import('./lazy-loading/lazy-loading.module').then(m => m.LazyLoadingModule) 
  }
];
```
### **Explicação**
- `loadChildren`: Importa o módulo **somente quando necessário**.
- `import('./lazy-loading/lazy-loading.module')`: Carrega dinamicamente o módulo `LazyLoadingModule`.

---

## **3. Configuração das Rotas Dentro do Módulo Lazy**
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
### **Explicação**
- O caminho `path: ''` significa que essa rota é **o ponto de entrada** do módulo.
- `RouterModule.forChild(routes)`: Registra as rotas **somente dentro do módulo Lazy Loading**.

---

## **4. Verificando o Lazy Loading na Prática**
1. **Abrir as ferramentas do desenvolvedor (F12)**
2. **Ir para a aba Network**
3. **Recarregar a aplicação (F5)**
4. **Navegar para `lazy-loading` e observar o carregamento dinâmico dos arquivos.**

---

## **Resumo**
- O **Lazy Loading** permite carregar módulos **sob demanda**, evitando downloads desnecessários.
- A configuração é feita através do **`loadChildren`** no `app-routing.module.ts`.
- As rotas dentro do módulo Lazy são registradas com **`RouterModule.forChild()`**.
- O uso de Lazy Loading melhora **tempo de resposta** e **uso eficiente de recursos**.

Dessa forma, a aplicação se torna mais **rápida, modular e escalável**. 🚀

---

# **Guards de Rotas no Angular: Protegendo Rotas com Autenticação**

## **O que são Guards no Angular?**
- **Guards** são utilizados para proteger rotas e impedir que usuários não autorizados acessem determinadas páginas.
- O **`CanActivate`** é um dos principais Guards usados para restringir o acesso com base na autenticação do usuário.

---

## **Criando a Página Protegida**
### **1. Gerar o Componente da Página Protegida**
```bash
ng generate component pagina-protegida
```
- Criar um **botão de logout** no template (`pagina-protegida.component.html`):
```html
<h2>Página Protegida</h2>
<button (click)="logout()">Logout</button>
```

---

## **2. Definir a Rota Protegida**
Adicionar a rota no `app-routing.module.ts`:
```typescript
const routes: Routes = [
  { path: 'pagina-protegida', component: PaginaProtegidaComponent, canActivate: [AuthGuard] }
];
```
- O **`canActivate: [AuthGuard]`** impede o acesso de usuários não autenticados.

---

## **3. Criando o Guard de Autenticação**
### **Gerar o Guard**
```bash
ng generate guard auth
```
Selecionar `CanActivate` como a opção de proteção.

### **Configuração do Guard (`auth.guard.ts`)**
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

---

## **4. Criando a Página de Login**
### **Gerar o Componente de Login**
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

---

## **5. Criando o Serviço de Autenticação**
### **Gerar o Serviço**
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

---

## **6. Implementando a Lógica de Login**
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

---

## **7. Implementando o Logout**
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

---

## **8. Testando a Proteção da Rota**
1. **Acessar `/pagina-protegida` sem estar autenticado** → Redireciona para `/login`.
2. **Fazer login com `admin@admin.com` e senha `123456`** → Acessa `/pagina-protegida`.
3. **Clicar no botão Logout** → Redireciona para `/login` e limpa a sessão.

---

## **Resumo**
- **`CanActivate`** impede o acesso a páginas protegidas.
- **`AuthService`** gerencia o login, autenticação e logout.
- **Token é armazenado no `sessionStorage`**.
- **Usuário é redirecionado conforme seu status de autenticação**.

Essa abordagem garante **segurança e controle de acesso** nas aplicações Angular. 🔐🚀

---

This project was generated using [Angular CLI](https://github.com/angular/angular-cli) version 19.1.5.

## Development server

To start a local development server, run:

```bash
ng serve
```

Once the server is running, open your browser and navigate to `http://localhost:4200/`. The application will automatically reload whenever you modify any of the source files.

## Code scaffolding

Angular CLI includes powerful code scaffolding tools. To generate a new component, run:

```bash
ng generate component component-name
```

For a complete list of available schematics (such as `components`, `directives`, or `pipes`), run:

```bash
ng generate --help
```

## Building

To build the project run:

```bash
ng build
```

This will compile your project and store the build artifacts in the `dist/` directory. By default, the production build optimizes your application for performance and speed.

## Running unit tests

To execute unit tests with the [Karma](https://karma-runner.github.io) test runner, use the following command:

```bash
ng test
```

## Running end-to-end tests

For end-to-end (e2e) testing, run:

```bash
ng e2e
```

Angular CLI does not come with an end-to-end testing framework by default. You can choose one that suits your needs.

## Additional Resources

For more information on using the Angular CLI, including detailed command references, visit the [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli) page.
