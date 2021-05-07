package business.concretes;

import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.UserDaoService;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserDaoService userDaoService;
	private LoggerService loggerService;

	
	public UserManager(UserDaoService userDaoService, LoggerService loggerService) {
		super();
		this.userDaoService = userDaoService;
		this.loggerService = loggerService;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(User user) {
		 if (user.getPassword().length() < 6) {
	            System.out.println("�ifreniz en az 6 karakter uzunlu�unda olmal�d�r.");
	            return;
	        }
	          String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(user.getEmail());
	        if (!matcher.matches()) {
	            System.out.println("Mail adresi e posta format�nda olmal�d�r(example@example.com)");
	            return;
	        }
	        if(user.getFirstName().length()<2 ||user.getLastName().length()<2) {
		    	System.out.println("�sim-Soyisim 2 karakterden az olamaz!!");
		    	return;
		    }
		    
	        else {
	        	System.out.println(user.getEmail() + " onaylama linki g�nderildi");
	        	System.out.println("e-mail onayland� " + user.getEmail());
	        	this.userDaoService.add(user);
	        }
	        
	    }
		
	

	@Override
	public void login(User user) {
		if(user.getEmail() == "hazar@gmail.com" && user.getPassword() =="123214" ) {
		System.out.println("giri� yap�ld� " + user.getFirstName());
		}
		else {
			System.out.println("giri� ba�ar�s�z");
		}
	}

	@Override
	public boolean existingEmail(User user) {
		
			
		
		return false;
	}

	@Override
	public void registerWith(User user) {
		this.loggerService.registerToSystem(user.getEmail() + " Google hesab� ile kay�t olundu");
		
	}

}
