package com.banesco.repo;

import java.util.List;

import com.banesco.model.Product;

public interface IProductoRepo {
	
	public void registrar(String producto) ;
	public List<Product> findAll();
	public Product getProductByCustomerId();

}
