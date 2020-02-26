package com.banesco.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banesco.model.OutParam;
import com.banesco.model.Product;
import com.banesco.service.IProductoService;

@RestController
public class DemoRestController {
	
	@Autowired
	private IProductoService service; 

	@RequestMapping("/productos")
	public OutParam listar(){
		OutParam out = new OutParam();
		out.setProduct(new ArrayList<Product>());
		out.getProduct().add(service.getProductByCustomerId());
		

		
		return out;
	}
}
