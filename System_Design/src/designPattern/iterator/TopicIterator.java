package designPattern.iterator;

public class TopicIterator implements Iterator<Topic> {
	
	private Topic[] Topics;
	private int iter = 0;
	
	

	public TopicIterator(Topic[] topics) {
		super();
		Topics = topics;
	}

	@Override
	public Topic next() {
		// TODO Auto-generated method stub
		return iter < Topics.length ? Topics[iter++] : null;
	}

	@Override
	public Topic getCurrentItem() {
		// TODO Auto-generated method stub
		return Topics[iter];
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iter + 1 < Topics.length;
	}
	
}
