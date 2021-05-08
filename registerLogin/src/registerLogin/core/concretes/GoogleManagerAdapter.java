package registerLogin.core.concretes;

import registerLogin.core.abtstracts.GoogleService;
import withGoogleAccount.jGoogleManager;

public class GoogleManagerAdapter implements GoogleService{


	@Override
	public void registerToGoogle(String message) {
		jGoogleManager manager= new jGoogleManager();
		manager.register(message);
	}
}
