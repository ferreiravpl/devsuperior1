package com.javaspringprofessional.desafio1;

import com.javaspringprofessional.desafio1.entities.Order;
import com.javaspringprofessional.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	Scanner sc = new Scanner(System.in);

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Qual o código do pedido? ");
		Integer code = sc.nextInt();

		System.out.print("Qual o valor básico do pedido? ");
		Double basic = sc.nextDouble();

		System.out.print("Qual a porcentagem de desconto do pedido? ");
		Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		Double totalOrderValue = orderService.total(order);

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " +  String.format("%.2f", totalOrderValue));
	}

}
