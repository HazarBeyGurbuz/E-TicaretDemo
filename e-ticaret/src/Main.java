import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.GoogleAdapter;
import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"hazar","gürbüz","123214", "hazar@gmail.com");
		User hazar = new User(1,"hazar","gürbüz","123224", "hazar@gmail.com");
		UserService userService = new UserManager(new UserDao(), new GoogleAdapter());
		userService.register(hazar);
		userService.login(hazar);
		userService.registerWith(user);
		

	}

}
