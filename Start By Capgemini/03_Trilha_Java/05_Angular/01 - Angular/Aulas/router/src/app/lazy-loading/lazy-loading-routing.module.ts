import { RouterModule, Routes } from "@angular/router";
import { LazyLoadingComponent } from "./lazy-loading.component";
import { NgModule } from "@angular/core";

const routes: Routes = [
    { path: '', component: LazyLoadingComponent }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})

export class LazyLoadingRoutingModule { }