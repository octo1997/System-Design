package designPattern.mediator;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chatroom cr = new Chatroom();
		User shubham = new chatUser("Shubham", cr), Adcd = new chatUser("Adcd", cr), Kenny = new chatUser("Kenny", cr), Bhai = new chatUser("Bhai", cr);
		cr.addUser(shubham);
		cr.addUser(Adcd);
		cr.addUser(Kenny);
		cr.addUser(Bhai);
		
		Bhai.sendMessage("Hi!", "Adcd");
		Adcd.sendMessage("Bye!", "Bhai");
		
		
		
	}

}
