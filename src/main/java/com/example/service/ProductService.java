package com.example.service;

import java.util.List;
import java.util.Map;

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
	
	//查詢商品清單
	public List<Map<String, Object>> findAllProd(){
		List<Map<String, Object>> resultList = productRepository.findAll();
		
		return resultList;
	}
	//新增一筆商品
	public void addProduct(ProductModel productModel) {
		productRepository.addProduct(productModel);
	}
	
	//取得最大序號
	public String getId() {
		String id = productRepository.getId();
		return id;
	}
	
	//得到最新編號
	public String getNewId(String oldId) {
		int id = Integer.parseInt(oldId.substring(1));
		
		StringBuilder result = new StringBuilder();
		result.append("P");
		result.append(String.format("%03d", id+1));
		
		return result.toString();
	}
}
