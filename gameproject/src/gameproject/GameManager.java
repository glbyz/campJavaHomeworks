package gameproject;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Kaydedildi" + game.name);
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi" + game.name);
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi" + game.name);
		
	}

	
}
