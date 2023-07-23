package designPattern.momento;

public class Article {
	private String id;
	private String content;
	private ArticleMomento am = null;
	
	public Article(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		saveMomento();
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		saveMomento();
		this.content = content;
	}
	
	private void saveMomento() {
		this.am = new ArticleMomento(id, content, this.am);
	}
	
	private void retrieveMomento() {
		if(am != null) {
			this.id = am.getId();
			this.content = am.getContent();
			am = am.getAm();
		}
		
	}
	
	public String undo() {
		retrieveMomento();
		
		return this.toString();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + content;
	}
	
	
	
}
