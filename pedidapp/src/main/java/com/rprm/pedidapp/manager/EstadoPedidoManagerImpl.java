package com.rprm.pedidapp.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.rprm.pedidapp.dao.IEstadoPedidoDAO;

public class EstadoPedidoManagerImpl implements IEstadoPedidoManager {

	@Autowired
	IEstadoPedidoDAO estadoPedidoDAO;
}
