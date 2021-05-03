package coffeShop;

public class Main {

	public static void main(String[] args) {

		
		Customer customer= new Customer();
		customer.id=1;
		customer.firstName="GÜLBEYAZ";
		customer.lastName="ARSLAN";
		customer.dateOfBirth="1993";
		customer.nationalityId="62662042682";
	
		CustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);

	}

}
