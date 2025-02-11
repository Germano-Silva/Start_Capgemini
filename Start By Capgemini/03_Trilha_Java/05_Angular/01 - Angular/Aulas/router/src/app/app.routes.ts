import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { AppComponent } from './app.component';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';
import { PaginaComParametrosComponent } from './pagina-com-parametros/pagina-com-parametros.component';
import { PaginaProtegidaComponent } from './pagina-protegida/pagina-protegida.component';
import { AuthGuard } from './auth.guard';

export const routes: Routes = [
    { path: '', component: AppComponent },
    { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
    { path: 'segunda-pagina', component: SegundaPaginaComponent },
    { path: 'pagina-com-parametros/:id', component: PaginaComParametrosComponent },
    {
        path: 'lazy-loading',
        loadChildren: () => import('./lazy-loading/lazy-loading.module').then(m => m.LazyLoadingModule)
    },
    { path: 'pagina-protegida', component: PaginaProtegidaComponent, canActivate: [AuthGuard] },
    { path: '**', component: PaginaNaoEncontradaComponent }
];
