package gameproject;

public class Gamer {

	int id;
	String firstName;
	String lastName;
	String nationalityId;
	String dateOfBirth;
	double order;
	
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String nationalityId, String dateOfBirth,double order) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.order=order;
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

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
