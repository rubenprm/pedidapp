package com.rprm.pedidapp.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.rprm.pedidapp.dao.IProductoDAO;

public class ProductoManagerImpl implements IProductoManager {

	@Autowired
	IProductoDAO productoDAO;
}
