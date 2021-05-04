package gameproject;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class VerifyUserServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfUser(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(),
					Integer.parseInt(gamer.getDateOfBirth()));
					
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return result;
	}

}
