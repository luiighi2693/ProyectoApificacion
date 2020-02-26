package com.banesco.service;

import java.util.List;

import com.banesco.model.Product;

public interface IProductoService {
	public void registrar(String producto) ;
	public List<Product> findAll();
	public Product getProductByCustomerId();
}
