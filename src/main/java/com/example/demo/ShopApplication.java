package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bean.product;

@SpringBootApplication
@RestController
public class ShopApplication {

	private product product;
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
	
	@GetMapping("/product/all")
	  @ResponseBody
	  public product getAll() {
		product = new product();
		product.setProductId("P004");
		product.setProductName("測試");
		product.setPrice(250);
		product.setQuantity(2);
		
	  return product;
	  }

}
