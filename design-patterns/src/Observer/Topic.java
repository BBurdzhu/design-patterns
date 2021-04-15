package Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	public List<Observer> observers;
	public String topic;
	
	
	public Topic() {
		this.observers =  new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObservers();
	}

}
