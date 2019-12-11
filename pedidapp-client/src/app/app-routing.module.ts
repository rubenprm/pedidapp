import { PedidosComponent } from './pedidos/pedidos.component';
import { CabeceraComponent } from './shared/components/cabecera/cabecera.component';
import { LoginComponent } from './shared/components/login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'principal',
    children: [
      {
        path: 'pedidos',
        component: PedidosComponent
      }
    ]
  },
  { path: '**', redirectTo: 'login' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
