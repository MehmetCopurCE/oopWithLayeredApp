package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao {
	
	// Dao -> Data access object
	// Veri tabanına erişeceğiz
	
	
	// Veri tabanına bir şeyler ekleyeceğiz. 
	
	public void add(Product product) {  
		// ürün eklerken bizim bir "Parametre" geçmemiz lazım. (Product product)
		//sadece ve sadece db erişim kodları buraya yazılır...SQL 
		
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
