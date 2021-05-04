package gameproject;

public class GamerManager implements GamerService {

	UserCheckService userCheckService;

	public GamerManager(UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userCheckService.checkIfUser(gamer)) {
			System.out.println("Kimlik Doðrulandý");
			System.out.println("Kaydedildi :" + gamer.firstName + " " + gamer.lastName);
		}else {
			System.out.println("Kimlik doðrulanamadý...");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý bilgileri güncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi");
	}

}
