package com.example.repository;

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
	
	public void addProduct(ProductModel productModel) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO shoppingmall.product(ProductId, ProductName, Price, Quantity)");
		sb.append("VALUES('" + productModel.getProductId() + "',");
		sb.append("'" + productModel.getProductName() + "',");
		sb.append("'" + productModel.getPrice() + "',");
		sb.append("'" + productModel.getQuantity() + "');");
		
		jdbcTemplate.update(sb.toString());
	}
}
