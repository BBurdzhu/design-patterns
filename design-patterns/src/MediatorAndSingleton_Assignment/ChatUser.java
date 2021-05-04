package MediatorAndSingleton_Assignment;

public abstract class ChatUser {

	protected Mediator mediator;
	protected String username;
	
	
	public ChatUser(Mediator mediator, String username) {
		this.mediator = mediator;
		this.username = username;
	}
	
	public abstract void send(String message);

	public abstract void receive(String message);


}

