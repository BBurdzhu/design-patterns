package Observer;

public class TopicSubscriber implements Observer {

	private Observable topic;
	private String name;
	
	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.topic == null) {
			System.out.println(this.getName() + " has no topic");
			return;
		}
		String newTopic = this.topic.getUpdate();
		
		System.out.println(this.getName() + " recieved an update: " + newTopic);

	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;

	}

	
	public String getName() {
		return name;
	}
}
