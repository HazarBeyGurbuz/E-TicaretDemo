package business.abstracts;

import java.util.List;


import entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	boolean existingEmail(User user);
	void registerWith(User user);
	List<User> getAll();
}
