package registerLogin.dataAccess.concretes;

import registerLogin.dataAccess.abstracts.UserDao;
import registerLogin.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Uyeliðinizin tamamlanmasý için epostanýzý doðrulayýnýz");
		System.out.println("Eposta Doðrulandý");
		System.out.println("Uye Olma Islemi Basarli : " + user.getFirstName());		
	}

	@Override
	public void login(User user) {
		System.out.println("Giris Yapma Islemi Basarili : " + user.getFirstName());
	}

}
