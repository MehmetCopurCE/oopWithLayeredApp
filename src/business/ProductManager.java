package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {  //super i sildik 
		this.productDao = productDao;
		this.loggers = loggers;
	}


	
	
	public void add(Product product ) throws Exception{
		// iş kuralları
		
		if(product.getUnitprice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		
		//Buradan dataAccess e gittik ve onun add ini çağırdık
		//ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
		for (Logger logger : loggers) {  //db , file, mail
			logger.log(product.getName());
		}
		
	}

}
