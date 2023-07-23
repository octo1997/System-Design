/**
 * 
 */
package designPattern.prototype;

/**
 * 
 */
public class Art implements Prototypeable {
	
	private String artName;
	
	
	public Art clone() throws CloneNotSupportedException{
		return (Art)super.clone();
	}


	public String getArtName() {
		return artName;
	}


	public void setArtName(String artName) {
		this.artName = artName;
	}
}
