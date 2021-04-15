package Observer_Assignment;

public class MainMovie {

	public static void main(String[] args) {

		Movie movie = new Movie();
		
		MoviePrice moviePrice1 = new MovieSubscriber("The SpongeBob Movie: Sponge on the Run");
		MoviePrice moviePrice2 = new MovieSubscriber("3096 Tage");
		MoviePrice moviePrice3 = new MovieSubscriber("New Amsterdam");
		
		
		movie.subscribe(moviePrice1);
		movie.subscribe(moviePrice2);
		movie.subscribe(moviePrice3);
		
		movie.setPrice(50);
		movie.setPrice(80);
		movie.setPrice(25);

	}

}
