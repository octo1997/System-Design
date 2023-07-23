package designPattern.iterator;

public class TopicList implements ListItf<Topic> {
	private Topic[] topics;

	public TopicList(Topic[] topics) {
		super();
		this.topics = topics;
	}

	@Override
	public Iterator<Topic> getIterator() {
		return new TopicIterator(topics);
	}
	
	
	
}
