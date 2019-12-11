package com.rprm.pedidapp.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GestorExcepcionesController {
	private static final Logger logger = Logger.getLogger(GestorExcepcionesController.class);
	
	@ExceptionHandler(Exception.class)
	public String sessionRequiredException(Exception ex){
		logger.info("Excepcion capturada: " + ex.getClass().getSimpleName());	
		logger.error(ex.getCause());
		logger.error(ex.getLocalizedMessage());
		logger.error(ex.getMessage());
		
		/*
		 * Devolveriamos un DTO con la informacion necesaria para 
		 * controlar desde front que se ha producido un error y mostrar un mensaje
		 */
		return "error";
	}
}
