package com.rprm.pedidapp.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.rprm.pedidapp.dao.IUsuarioDAO;

public class UsuarioManagerImpl implements IUsuarioManager {
	
	@Autowired
	IUsuarioDAO usuarioDAO;

}
