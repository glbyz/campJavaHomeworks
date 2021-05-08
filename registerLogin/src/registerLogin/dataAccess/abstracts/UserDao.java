package registerLogin.dataAccess.abstracts;

import registerLogin.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
}
