package gun3Odev2;

public class UserManager {

	
	public void add(User user) {
		System.out.print(user.firstName + user.lastName+  " kaydedildi");
	}
	
	public void delete(User user) {
		System.out.print(user.firstName + user.lastName+  " silindi");
	}
	
	public void update(User user) {
		System.out.print(user.firstName + user.lastName+  " güncellendi");
	}
}
