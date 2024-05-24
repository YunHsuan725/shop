package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.ProductModel;

/**
 * 2024/05/23, add by YunHsuan
 **/
@Repository
public class ProductRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//新增商品
	public void addProduct(ProductModel productModel) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO shoppingmall.product(ProductId, ProductName, Price, Quantity)");
		sb.append("VALUES('" + productModel.getProductId() + "',");
		sb.append("'" + productModel.getProductName() + "',");
		sb.append("'" + productModel.getPrice() + "',");
		sb.append("'" + productModel.getQuantity() + "');");
		
		jdbcTemplate.update(sb.toString());
	}
	
	public String getId() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT MAX(ProductId) FROM product ");
		sb.append("ORDER BY ProductId asc; ");
		
		String result =  jdbcTemplate.queryForObject(sb.toString(), String.class);
		
		return result;
	}
	
	//查詢所有商品
	public List<Map<String, Object>> findAll(){
		List<Map<String, Object>> result = new ArrayList<Map<String,Object>>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM Product WHERE Quantity > 0;");
		
		result = jdbcTemplate.queryForList(sb.toString());
		
		return result;
	}
	
	
}
