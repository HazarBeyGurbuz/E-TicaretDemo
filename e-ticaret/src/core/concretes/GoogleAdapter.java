package core.concretes;

import core.abstracts.LoggerService;
import registerWithGoogle.GoogleManager;

public class GoogleAdapter implements LoggerService{

	
	@Override
	public void registerToSystem(String message) {
		
		GoogleManager googleManager = new GoogleManager();
		googleManager.register(message);
	}

}
