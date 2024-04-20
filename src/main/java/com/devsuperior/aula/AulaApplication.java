package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import com.devsuperior.aula.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior.aula"})
public class AulaApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	@Autowired
	private ShippingService shippingService;
	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1030, 800.0, 10.0);
		System.out.println("Pedido código " + order.getCode());

		double valorTotalPedido = orderService.total(order);
		double custoEnvio = shippingService.shipment(order);
		double valorTotal = valorTotalPedido + custoEnvio;

		System.out.println("Valor total do pedido: R$ " + valorTotal);

	}
}
