package MediatorAndSingleton_Assignment;

public interface Mediator {
		void sendMessage(String message, ChatUser user);
		void register(ChatUser user);
		void unRegister(ChatUser user);
}
