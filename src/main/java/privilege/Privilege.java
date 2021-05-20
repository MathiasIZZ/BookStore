package privilege;

import java.util.Set;

import javax.persistence.*;

import users.User;

@Entity
@Table(name="privilege")
public class Privilege {
	
	private int id; 
	private String name;
	
	private Set<User> users;
	
	
	
	
	@Id
	@Column(name="privilege_id")
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
	
	
	
	@OneToMany(mappedBy="role_id", cascade = CascadeType.ALL)
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	} 
	
	
	
	
	
	
	
	
	

}


