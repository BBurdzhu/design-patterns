package Observer_Assignment;

public class MovieSubscriber implements MoviePrice {

	private Observable moviePrice;
	private String movieName;
	

	public MovieSubscriber(String movieName) {
		this.movieName = movieName;
	}
		
	
	public String getMovieName() {
		return  movieName;
	}
	
	@Override
	public void update() {
		if(this.moviePrice == null) {
			System.out.println(this.getMovieName() + "has no price");
			return;
		}
		
		double newPrice = this.moviePrice.getUpdate();
		
		System.out.println(this.getMovieName() + " has new price " + "$"+ newPrice + ".");

	}

	@Override
	public void setPrice(Observable price) {
		this.moviePrice = price;

	}
}
