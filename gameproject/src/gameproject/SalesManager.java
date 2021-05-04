package gameproject;

public class SalesManager implements SalesService{

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		gamer.order=game.price-(game.price*campaign.discountRate/100);
	}

	
}
