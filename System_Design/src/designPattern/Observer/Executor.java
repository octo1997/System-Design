package designPattern.Observer;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessagePublisher mPub = new MessagePublisher("1");
		
		for(int i = 0; i < 9; i++) {
			Reciever rec = new MessageReciever(Integer.toString(i));
			mPub.attachListener(rec);
			
			if(i == 5) mPub.detachListener(rec);
		}
		
		mPub.setState("100");
		mPub.setState("200");
	}

}
