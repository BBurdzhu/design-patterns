package MediatorAndSingleton_Assignment;

public class User extends ChatUser { 

	public User(Mediator mediator, String username) {
		super(mediator, username);
		mediator.register(this);
	}

	@Override
	public void send(String message) {
		System.out.println("[" + this.username + "]" +  " sends: " + message);
		this.mediator.sendMessage(message, this);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("[" + username + "]" + " received: " + message);	
	}	
}
