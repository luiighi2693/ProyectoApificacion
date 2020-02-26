package com.banesco.repo;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

import com.banesco.model.Account;
import com.banesco.model.CreditCard;
import com.banesco.model.Product;
import com.banesco.repo.IProductoRepo;

@Repository
public class ProductoRepoImpl implements IProductoRepo{

	public static Logger LOG;
	
	@Override
	public void registrar(String producto) {
		LOG.info("Se registró el producto "+ producto + " de manera exitosa");
	}
	
	@Override
	public List<Product> findAll() {
		List<Product> lista = new ArrayList<Product>() ;
		return lista;
	}

	@Override
	public Product getProductByCustomerId() {
		Product p = new Product();
		p.setAccount(new ArrayList<Account>());
		p.setCreditCard(new ArrayList<CreditCard>());
//		if (idCustomer=="1") {
			Account a1 = new Account();
			a1.setId("156d0eb9");
			a1.setLabel("CUENTA AÑOS DORADOS");
			a1.setNumber("0134003210031029760");
			a1.setBalance("35767.62");
			a1.setStatus("1");
			a1.setType("MMK");
			p.getAccount().add(a1);

			CreditCard c1 = new CreditCard();
			c1.setId("81a1d5b5");
			c1.setLabel("BANESCO MASTERCARD DORADA");
			c1.setNumber("5401393001592545");
			c1.setBalance("1000");
			c1.setStatus("2");
			c1.setType("TCM");
			
			CreditCard c2 = new CreditCard();
			c2.setId("81a1d5d0");
			c2.setLabel("BANECO CLASICA VS PREPAGADAVR");
			c2.setNumber("4545203849388498");
			c2.setBalance("3000");
			c2.setStatus("2");
			c2.setType("TCV");
			p.getCreditCard().add(c1);
			p.getCreditCard().add(c2);
	//	}
		return p;
	}

	

}
