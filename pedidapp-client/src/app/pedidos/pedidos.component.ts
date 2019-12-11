import { Pedido } from './../clases/pedido';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pedidos',
  templateUrl: './pedidos.component.html',
  styleUrls: ['./pedidos.component.css']
})
export class PedidosComponent implements OnInit {
  public model: Pedido;
  public lstPedidos: Pedido[];

  constructor() { }

  ngOnInit() {
    this.model = new Pedido();
    this.lstPedidos = new Array<Pedido>();
  }

  crearPedido() {
    this.lstPedidos = [...this.lstPedidos, this.model];

    this.model = new Pedido();
  }

}
