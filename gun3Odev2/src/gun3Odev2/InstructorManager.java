package gun3Odev2;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		
		System.out.println(user.firstName+ "  "+ user.lastName+ " " + " adlý eðitmen usereklendi");
	}
	
	public void update(Instructor instructor ) {
		System.out.println(instructor.instructorNumber + " " + "numaralý Eðitmen "+ 
	instructor.firstName+ " " +  " "+ instructor.lastName + " Güncellendi" );
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.firstName+ user.lastName+" "+  " adlý eðitmen silindi");
	}
}
