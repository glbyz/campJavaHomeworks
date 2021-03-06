package registerLogin.dataAccess.concretes;

import registerLogin.dataAccess.abstracts.UserDao;
import registerLogin.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Uyeliğinizin tamamlanması için epostanızı doğrulayınız");
		System.out.println("Eposta Doğrulandı");
		System.out.println("Uye Olma Islemi Basarli : " + user.getFirstName());		
	}

	@Override
	public void login(User user) {
		System.out.println("Giris Yapma Islemi Basarili : " + user.getFirstName());
	}

}
