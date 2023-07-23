/**
 * 
 */
package designPattern.mediator;

import java.util.*;

/**
 * 
 */
public class Chatroom implements MediatorItf {

	
	private Map<String, User> userMap = new HashMap<String, User>();
	private int counter = 0;
	
	@Override
	public void sendMessage(String message, String uid) {
		// TODO Auto-generated method stub
		userMap.get(uid).recieveMessage(message);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMap.put(user.getUid(), user);
	}
	
}
