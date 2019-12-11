package com.rprm.pedidapp.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.rprm.pedidapp.dao.IPedidoDAO;

public class PedidoManagerImpl implements IPedidoManager {

	@Autowired
	IPedidoDAO pedidoDAO;
}
