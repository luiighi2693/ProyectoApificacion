package com.banesco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banesco.model.Product;
import com.banesco.repo.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepo repo;
	
	@Override
	public void registrar(String producto) {
		repo.registrar(producto);
	}

	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public Product getProductByCustomerId() {
		return repo.getProductByCustomerId();
	}

}
