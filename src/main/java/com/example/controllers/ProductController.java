package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ProductModel;
import com.example.service.ProductService;

/**
 * 2024/05/23, add by YunHsuan
 **/
@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductModel productModel;
	
	@GetMapping("/add")
    public String hello(){
		productModel = new ProductModel();
		productModel.setProductId("P004");
		productModel.setProductName("測試");
		productModel.setPrice(150);
		productModel.setQuantity(15);
		productService.addProduct(productModel);
        return "New Staff added";
    }
}
