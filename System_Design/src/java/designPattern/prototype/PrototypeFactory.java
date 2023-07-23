package designPattern.prototype;
import java.util.*;

public class PrototypeFactory {
	public static class types{
		public static String movie = "Movie";
		public static String Art = "Art";
		public static String Drama = "Drama";
	}
	
	public static Map<String, Prototypeable> protoMap = new HashMap<String, Prototypeable>(); 
	
	static {
		protoMap.put(types.movie, new Movie());
		protoMap.put(types.Drama, new Drama());
		protoMap.put(types.Art, new Art());
	}
	
	public static Prototypeable getInstance(String type) {
		Prototypeable ret = null;
		try {
			ret = protoMap.get(type).clone();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return ret;
		
	}
	
	
}
