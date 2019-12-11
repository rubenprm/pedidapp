import { IdDescripcion } from './idDescripcion';
export class Pedido {
    idPedido: number;

    usuario: IdDescripcion;
    primero: IdDescripcion;
    segundo: IdDescripcion;
    postre: IdDescripcion;
    estado: IdDescripcion;

    constructor() {
        this.usuario = new IdDescripcion();
        this.primero = new IdDescripcion();
        this.segundo = new IdDescripcion();
        this.postre = new IdDescripcion();
        this.estado = new IdDescripcion();
    }
}
