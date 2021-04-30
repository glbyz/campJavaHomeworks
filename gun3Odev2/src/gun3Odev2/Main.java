package gun3Odev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1= new Student();
		student1.setId(1);
		student1.setFirstName("Gülbeyaz");
		student1.setLastName("Arslan");
		student1.setEmail("glbeyazarslan@gmail.com");
		student1.setCourse("Java&React Kampı");
		student1.setNationalıdentity("12563478965");
		student1.setStudentNumber("1456");
		
		
		Student student2= new Student();
		student2.setId(2);
		student2.setFirstName("Bugrahan Alptürk");
		student2.setLastName("Çeker");
		student2.setEmail("bugrahan17@gmail.com");
		student2.setCourse("Java&React Kampı");
		student2.setNationalıdentity("145698702365");
		student2.setStudentNumber("1418");
		
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@engin.com");
		instructor1.setCourse("Java&React Kampı");
		instructor1.setNationalıdentity("563214698745");
		instructor1.setInstructorNumber("1789");
		
		
		Instructor instructor2=new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Varış");
		instructor2.setEmail("kerem@varis.com");
		instructor2.setCourse("C#&Angular Kampı");
		instructor2.setNationalıdentity("25632446652");
		instructor2.setInstructorNumber("1203");
		
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.update(student2);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.update(instructor1);
		
		
		
		
		
	}
}
