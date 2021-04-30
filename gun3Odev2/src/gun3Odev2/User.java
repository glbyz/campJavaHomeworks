package gun3Odev2;

public class User {
	int id;
	String firstName;
	String lastName;
	String nationalýdentity;
	String email;
	String course;
	
	public User() {
		
	}
	public User(int id, String firstName, String lastName, String nationalýdentity, String email, String course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalýdentity = nationalýdentity;
		this.email = email;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalýdentity() {
		return nationalýdentity;
	}
	public void setNationalýdentity(String nationalýdentity) {
		this.nationalýdentity = nationalýdentity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
