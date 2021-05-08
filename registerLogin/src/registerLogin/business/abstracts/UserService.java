package registerLogin.business.abstracts;

import registerLogin.entities.concretes.User;

public interface UserService {
	void delete(User user);
	void update(User user);
	void register(User user);
	void login(User user);

}
