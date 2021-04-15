package Observer_Assignment;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Observable {

	public List<MoviePrice> moviePrices = new ArrayList<>();
	public double price;
	
	
	public void setPrice(double price) {
		this.price = price;
		this.notifyMovies();
	}
	
	@Override
	public double getUpdate() {
		return this.price;
	}

	@Override
	public void subscribe(MoviePrice moviePrice) {
		this.moviePrices.add(moviePrice);
		moviePrice.setPrice(this);
	}

	@Override
	public void unsubscribe(MoviePrice moviePrice) {
		this.moviePrices.remove(moviePrice);

	}

	@Override
	public void notifyMovies() {
		for(MoviePrice moviePrice: this.moviePrices) {
			moviePrice.update();
		}

	}

}
