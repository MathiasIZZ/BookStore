package categories;

import java.util.Set;

import javax.persistence.*;

import products.Product;

@Entity
@Table(name="category")
public class Category {

	private int id; 
	private String name;
	
	private Set<Product> products;
	
	
	
	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	public Set<Product> getProducts() {
		return products;
	}
	
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	} 
	
	
	
	
	
}



