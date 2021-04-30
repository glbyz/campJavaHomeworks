package gun3Odev2;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.firstName+ " " + user.lastName+" "+ " adlý öðrenci eklendi");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.firstName+ " " +  user.lastName+" "+ " adlý öðrenci silindi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.firstName+ " " + user.getFirstName() +" "+  " adlý öðrenci güncellendi");
	}
}
