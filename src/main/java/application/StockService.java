package application;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import categories.Category;
import products.Product;

public class StockService {
	
	
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Category computer = new Category();
		
		computer.setName("Ordinateur");
		
		Product macBookPro = new Product("APPLE", "pc portable", 500, computer);
		
		Product rogue = new Product("ALIENWARE", "pc portable", 800, computer);
		
		Set<Product> products = new HashSet<Product>();
		
		products.add(macBookPro);
		products.add(rogue);
		
		computer.setProducts(products);
		
		session.save(computer);
		session.getTransaction();
		session.close();
		
		
		
		
	}
	
	
	
	

}
