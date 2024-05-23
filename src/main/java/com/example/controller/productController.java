package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bean.product;

/**
 * 2024/05/23, add by YunHsuan
 **/
@RestController
public class productController {
	
	private product product;
	
	@GetMapping("/test")
    public String hello(@RequestParam(value = "name", defaultValue = "test") String name) {
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
