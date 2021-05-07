package dataAccess.concretes;
	
import entities.concretes.User;

import java.util.List;

import dataAccess.abstracts.UserDaoService;

public class UserDao implements UserDaoService{

	@Override
	public void add(User user) {
		System.out.println("kayýt baþarýlý " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
