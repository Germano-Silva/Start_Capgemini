import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';

export const routes: Routes = [
    { path: 'primeira-pagina', component: PrimeiraPaginaComponent },
    { path: 'segunda-pagina', component: SegundaPaginaComponent }
];
