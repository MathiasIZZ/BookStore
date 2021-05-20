package users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import books.Book;

public class UsersService {
	
	
	
	private static final UsersService INSTANCE = new UsersService();
	
	
	public static UsersService getInstance() {
		return INSTANCE;
	}
	
	private UsersService() {
		this.setup();
	}
	
	
	
	
	protected SessionFactory sessionFactory;
	
	public void setup() {
		
		//final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//try {
		//	sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		//	
		//} catch(Exception ex) {
		//	StandardServiceRegistryBuilder.destroy(registry);
		//}
		//
		//Session session = sessionFactory.openSession();
		//
		//session.beginTransaction();
		//session.getTransaction().commit();
		//session.close();
		//
		
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
		
		
		
	}
	
	public void exit() {
		sessionFactory.close();
	}
	
	
	
	public void create(User user) {
		//User user = new User();
		
		//user.setUsername("Marika Girard");
		//user.setAge(30);
		//user.setEmail("marika.girard@gmail.com");
		//user.setPassword("monmotdepass");
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}
	
	protected User read(int userId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = session.get(User.class, userId);
		
		System.out.println(user.getUsername());
		session.getTransaction().commit();
		session.close();
		
		return user;
	}

	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		
		Session session = sessionFactory.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		criteria.from(User.class);
		
		users = session.createQuery(criteria).getResultList();
		
		
		session.close();
		
		return users;
		
	}
	
	public void delete(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	



	
}

