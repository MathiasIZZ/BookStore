package users;

import java.util.List;

public class UsersController {
	
	// appel le service 
	private UsersService usersService = UsersService.getInstance();
	
	
	
	public void create(User user) {
		usersService.create(user);
		
	}
	
	
	public User get(int id) {
		return this.usersService.read(id);
	}
	
	public List<User> getAll() {
		return this.usersService.getAll();
	}
	
	

	public void updateUser(User user) {
		usersService.update(user);
	}
	
	public void deleteUser(User user) {
		usersService.delete(user);
	}
	
	
	
	
	
	
	
	
	
	
}
