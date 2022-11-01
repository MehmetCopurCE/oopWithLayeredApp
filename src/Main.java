
import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {


		Product product = new Product(1,"IPhone Xr", 10000);
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};		
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers); //parametre istedi bizde verdik
		productManager.add(product);
		

	}

}
