package MediatorAndSingleton_Assignment;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {

	
	private List<ChatUser> users;
	
	public ChatRoom() {
		this.users = new ArrayList<>();
	}
	
	
	@Override
	public void sendMessage(String message, ChatUser user) {
		ChatUser removeUser = null;

		Bot b = Bot.getInstance();

		if(message.equalsIgnoreCase("addBot")) {
			b.addBot("bot");
		}
		
		for(ChatUser chatUser : this.users) {
			
			if(chatUser != user) {
				chatUser.receive(message);
				}	
			
			if(b != null && message.contains("cat")) {
				System.out.println("-->" + chatUser.username + "" + "'cat' is forbidden word");
				removeUser = user;
				}
			}
		
		if(removeUser != null) {
			unRegister(removeUser);
			System.out.println("!!! The user has been removed. Due to the forbidden word 'cat'.");
		}
	}

	@Override
	public void register(ChatUser user) {
		this.users.add(user);

	}

	@Override
	public void unRegister(ChatUser user) {
		this.users.remove(user);

	}
}
