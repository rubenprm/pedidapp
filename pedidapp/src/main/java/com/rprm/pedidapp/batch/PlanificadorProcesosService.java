package com.rprm.pedidapp.batch;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableAsync
@EnableScheduling
public class PlanificadorProcesosService {
	
	@Scheduled(cron = "${cron.entrega.pedidos}")
    public void procesarEntregaPedidosSched() throws Exception{
		/*
		 * Se consultan los pedidos que hay que pasar a entregado y se actualizan en base de datos
		 */
    }

}
