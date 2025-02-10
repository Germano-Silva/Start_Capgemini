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
