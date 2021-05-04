package MediatorAndSingleton_Assignment;

public class Main {

	public static void main(String[] args) {

		Mediator mediator = new ChatRoom();
						
		ChatUser cu1 = new User(mediator,"Ivan");
		ChatUser cu2 = new User(mediator,"Burdzhu");
		ChatUser cu3 = new User(mediator,"Petyr");
		
		cu1.send("Hi!");
		cu1.send("addBot");
		cu2.send("cat");
		cu3.send("nnnn");
		
	}

}
