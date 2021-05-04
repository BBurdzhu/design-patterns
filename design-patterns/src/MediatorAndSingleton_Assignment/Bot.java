package MediatorAndSingleton_Assignment;

public class Bot { 

	private static Bot bot;
	private Bot() {}
	
	
	public static Bot getInstance() {
		if(bot == null) {
			bot = new Bot();
		}
		
		return bot;
		
	}
	
	public void addBot(String message) {
		System.out.println("The " + "'" +  message + "'"+ " has been created.");
	}
}