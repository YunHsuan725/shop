package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ProductModel;
import com.example.repository.ProductRepository;

/**
 * 2024/05/23, add by YunHsuan
 **/
@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void addProduct(ProductModel productModel) {
		productRepository.addProduct(productModel);
	}
}
