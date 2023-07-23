package designPattern.momento;

public final class ArticleMomento {
	private final String id;
	private final String content;
	
	private final ArticleMomento am;

	public ArticleMomento(String id, String content, ArticleMomento am) {
		super();
		this.id = id;
		this.content = content;
		this.am = am;
	}
	
	
	
	
	public String getId() {
		return id;
	}




	public String getContent() {
		return content;
	}




	public ArticleMomento getAm() {
		return am;
	}

	
	
	
	
	
}
