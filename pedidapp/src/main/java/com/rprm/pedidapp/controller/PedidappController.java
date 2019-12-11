package com.rprm.pedidapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rprm.pedidapp.dto.DetallePedidoWrapperDTO;
import com.rprm.pedidapp.dto.ProductoDTO;

@Controller
public class PedidappController {
	
	
	@GetMapping(path = "/entorno", produces = "application/json")
    public ResponseEntity<String> entorno() {
        return new ResponseEntity<String>("Hola", HttpStatus.OK);
    }
	
	@PostMapping(path = "/crearPedido", produces = "application/json")
    public ResponseEntity<DetallePedidoWrapperDTO> crearPedido(@RequestBody DetallePedidoWrapperDTO pedido) {
		
		
        return new ResponseEntity<DetallePedidoWrapperDTO>(pedido, HttpStatus.OK);
    }
	
	@PostMapping(path = "/cancelarPedido", produces = "application/json")
    public ResponseEntity<DetallePedidoWrapperDTO> cancelarPedido(@RequestBody DetallePedidoWrapperDTO pedido) {
		
		
        return new ResponseEntity<DetallePedidoWrapperDTO>(pedido, HttpStatus.OK);
    }
	
	@PostMapping(path = "/pagarPedido", produces = "application/json")
    public ResponseEntity<DetallePedidoWrapperDTO> pagarPedido(@RequestBody DetallePedidoWrapperDTO pedido) {
		
		
        return new ResponseEntity<DetallePedidoWrapperDTO>(pedido, HttpStatus.OK);
    }
	
	@PostMapping(path = "/crearPlato", produces = "application/json")
    public ResponseEntity<ProductoDTO> crearPlato(@RequestBody ProductoDTO producto) {
		
		
        return new ResponseEntity<ProductoDTO>(producto, HttpStatus.OK);
    }
}
