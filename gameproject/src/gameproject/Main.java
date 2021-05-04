package gameproject;

public class Main {

	public static void main(String[] args) {

		Gamer gamer= new Gamer();
		gamer.id=1;
		gamer.firstName="GÜLBEYAZ";
		gamer.lastName="ARSLAN";
		gamer.dateOfBirth="1993";
		gamer.nationalityId="62662042682";
		
		Game game= new Game();
		game.price=250;
		
		Campaign campaign= new Campaign();
		campaign.discountRate=20;
		
		SalesManager manager= new SalesManager();
		manager.buy(gamer,game,campaign);
		

		GamerManager gamerManager= new GamerManager(new VerifyUserServiceAdapter());
		gamerManager.add(gamer); 
		
		
		System.out.println(gamer.firstName + " " + gamer.lastName + " " +
				"Sipariþ Toplamýnýz : " + gamer.order);
		
		
	}

}
