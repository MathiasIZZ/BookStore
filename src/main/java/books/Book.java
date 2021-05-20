package books;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
	
	private int id;
	private String title; 
	private String author; 
	private float price;
	
	// IMPORTANT: dans ma table c'est écrit book_id c'est pour ça qu'en bas on lui dit @Column(name = "book_id")
	// poour les autres si les attributs de ma class correspond bien aux entrées de ma table, Hibernate va le mapper directement
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	


}
