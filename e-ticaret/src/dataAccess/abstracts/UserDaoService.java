package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDaoService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	
}
