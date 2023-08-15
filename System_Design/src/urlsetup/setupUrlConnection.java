package urlsetup;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class setupUrlConnection {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{    
			URL url=new URL("http://www.javatpoint.com/java-tutorial");    
			HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
			
			InputStream inputStream = urlConnection.getInputStream();
			while(true) {
				int a = inputStream.read();
				if(a == -1) break;
				System.out.println((char)a);
			}
			urlConnection.disconnect();
			
		}catch(Exception e){throw e;}    
		
	}

}
