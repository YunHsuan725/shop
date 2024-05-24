package com.example.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/addProduct")
	public String add(@RequestParam String prodName, @RequestParam double prodPrice, @RequestParam int prodQuantity) {
		String oldId = productService.getId();
		productModel = new ProductModel();
		productModel.setProductId(productService.getNewId(oldId));
		productModel.setProductName(prodName);
		productModel.setPrice(prodPrice);
		productModel.setQuantity(prodQuantity);
		productService.addProduct(productModel);
		return "New Product added";
	}

	@GetMapping("/findProduct")
	public List<Map<String, Object>> findAllProd() {
		List<Map<String, Object>> modelList = new ArrayList<Map<String, Object>>();

		modelList = productService.findAllProd();

		return modelList;
	}

}
