package coffeShop;

public abstract class CustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanưna Kaydedildi" + customer.firstName+ " " + 
				customer.lastName + " " );
		
	}

}
