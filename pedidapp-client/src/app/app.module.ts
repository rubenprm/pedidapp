import { ButtonModule } from 'primeng/button';
import { PedidosComponent } from './pedidos/pedidos.component';
import { FooterComponent } from './shared/components/footer/footer.component';
import { CabeceraComponent } from './shared/components/cabecera/cabecera.component';
import { LoginComponent } from './shared/components/login/login.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CabeceraComponent,
    PedidosComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    ButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
