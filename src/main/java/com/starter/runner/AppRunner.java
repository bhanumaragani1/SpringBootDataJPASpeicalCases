package com.starter.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.model.Product;
import com.starter.repository.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {

		Product p = repo.getProduct(12);
		System.out.println(p.getProdCode());
		
		Optional<Product> opt = repo.getOptionalProduct(13);
		if(opt.isPresent()) {
			Product prod = opt.get();
			System.out.println(prod.getProdCode());
		}else {
			System.out.println("Product not found");
		}
	}

}
