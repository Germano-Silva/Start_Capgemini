import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlunosComponent } from './components/alunos/alunos.component';
import { NotasComponent } from './components/notas/notas.component';
import { DisciplinasComponent } from './components/disciplinas/disciplinas.component';

const routes: Routes = [
  { path: 'alunos', component: AlunosComponent },
  { path: 'notas', component: NotasComponent },
  { path: 'disciplinas', component: DisciplinasComponent },
  { path: '', redirectTo: '/alunos', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
