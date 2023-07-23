package designPattern.prototype;

public class Movie implements Prototypeable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Movie clone() throws CloneNotSupportedException{
		return (Movie) super.clone();
	}
	
	
}
