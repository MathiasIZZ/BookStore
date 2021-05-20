package books;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BooksService {
	
	//private static final BooksService INSTANCE = new BooksService();
	
	
	
	
	
	protected SessionFactory sessionFactory;
	
	/**
	 * ouvre une session Hibernate -> mysql
	 */
	protected void setup() {
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
		} catch(Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.getTransaction().commit();
		session.close();
	}
	
	
	/**
	 * Ferme une session Hibernate -> mysql
	 */
	protected void exit() {
		sessionFactory.close();
	}

	protected void create() {
		Book book = new Book();
		book.setTitle("Les aventures de Marie dans les bordels");
		book.setAuthor("Marie");
		book.setPrice(25.34f);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
		
	}
	
	
	
	protected Book read(int bookId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Book book = session.get(Book.class, bookId);
		System.out.println(book.getTitle());
		session.close();
		
		return book;
		
	}
	
	protected void update(Book book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(book);
		session.getTransaction().commit();
		session.close();
	}
	
	protected List<Book> getAll() {
		List<Book> books = new ArrayList<Book>();
		
		Session session = sessionFactory.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Book> criteria = builder.createQuery(Book.class);
		criteria.from(Book.class);
		
		books = session.createQuery(criteria).getResultList();
		
		
		session.close();
		
		return books;
		
	}
	
	protected void delete(Book book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(book);
		session.getTransaction().commit();
		session.close();
	}
	
	
}
