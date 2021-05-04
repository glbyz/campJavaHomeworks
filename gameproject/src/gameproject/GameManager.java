package gameproject;

public class GameManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Kaydedildi");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi");
	}

}
