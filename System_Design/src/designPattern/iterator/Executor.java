package designPattern.iterator;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic[] tp = new Topic[10];
		int i = 10;
		while(i-- > 0) {
			tp[i] = new Topic(i);
		}
		
		ListItf<Topic> lst = new TopicList(tp);
		
		Iterator<Topic> lstIt = lst.getIterator();
		
		while(lstIt.hasNext()) {
			System.out.println(lstIt.next().getVal());
		}

	}

}
