package Observer_Assignment;

public interface Observable {

	double getUpdate();
	
	void subscribe(MoviePrice moviePrice);
	void unsubscribe(MoviePrice moviePrice);
	
	void notifyMovies();
	
}
