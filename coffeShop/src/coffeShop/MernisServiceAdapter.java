package coffeShop;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result=false;
		 try {
	        	result = proxy.TCKimlikNoDogrula(
	                    Long.parseLong(customer.getNationalityId()),
	                    customer.getFirstName(),
	                    customer.getLastName(),
	                    Integer.parseInt(customer.getDateOfBirth())
	            );
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		 return result;
	}

}
