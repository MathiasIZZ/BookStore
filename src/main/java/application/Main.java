package application;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import categories.Category;
import products.Product;
import users.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsersController userControl = new UsersController();
		
		
		//Configuration config = new Configuration();
		//config.configure("hibernate.cfg.xml");
		//SessionFactory sessionFactory = config.buildSessionFactory();
		
		
		//Session session = sessionFactory.openSession();
		//session.beginTransaction();
		
		
		User user = new User();
		
		
		//user.setAge(32);
		//user.setEmail("mathias.guiguen@gmai.com");
		//user.setPassword("monmotdepass");
		//user.setUsername("Mathias Guiguen");
		
		
		
		
		
		
		
		//session.save();
		
		//session.getTransaction().commit();
		//session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
        //Category computer = new Category();
        //computer.setName("Ordinateur");
        
        

        //Product macBookPro = new Product("Mac book pro", "Le meilleur ordinateur du monde", 1300, computer);
        

        //Set<Product> products = new HashSet<Product>();
        

        //computer.setProducts(products);

        //session.save(computer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//UsersController usersController = new UsersController();
		
		// création d'un nouvel utilisateur ! 
		
		
		//usersController.get(2);
		
		
		//User user  = new User(); 
		//user.setUsername("James Bond");
		//user.setEmail("jamesbond@gmail.com");
		//user.setAge(45);
		//user.setPassword("flingue");
		
		
		
		//usersController.create(user);
		
		
		
		//List<User> users = usersController.getAll();
		//for (User user : users) {
		//	System.out.println(user.getUsername());
		//}
		
		
		//User user = usersController.get(2);
		
		//user.setUsername("Marika la plus belle");
		
		//manager.update(user);
		
		
		//User user = usersController.get(2);
		
		//user.setUsername("Marika Girard");
		//usersController.updateUser(user);
		//usersController.get(2);
		
		
		//List<User> users = new ArrayList<User>();
		
		//users = manager.getAll();
		
		//for(User user : users) {
		//	System.out.println(user.getUsername());
		//}
		
		
		//List<User> users = usersController.getAll();
		
		//for (User user : users) {
		//	System.out.println(user.getUsername());
		//}
		
		
		
		//UsersService manager = new UsersService();
		
		//manager.setup();
		
		//manager.create();
		//manager.read(1);
		//manager.read(2);
		
		//List<User> users = new ArrayList<User>();
		//users = manager.getAll();
		//for(User user : users) {
		//	System.out.println(user.getUsername());
		//}
		
		//User user = manager.read(2);
		//user.setUsername("Marika la plus belle");
		//manager.update(user);
		
		
		
		//manager.exit();
		
		
		//BooksService manager = new BooksService();
		
				//manager.setup();
				
				//manager.create();
				
				
				//Book book = manager.read(1);
				//book.setTitle("Mes couilles en ski");
				//manager.update(book);
				
				//manager.delete(book);
				
				//List<Book> books = new ArrayList<Book>();
				//books = manager.getAll();
				
				//for(Book book : books) {
				//	System.out.println(book.getTitle());
				//}

				
				//manager.exit();
				
				
				
				//EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookStore");
				
				//EntityManager entityManager = factory.createEntityManager();
				//entityManager.getTransaction().begin();
				
				//Book book = new Book();
				//book.setAuthor("Marie");
				//book.setPrice(50.00f);
				//book.setTitle("Les aventures de marie dans les bordels");
				
				//entityManager.persist(book);
				//entityManager.getTransaction().commit();

	}

}
