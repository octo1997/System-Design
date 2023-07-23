package designPattern.proxya;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sbj = new Proxy();
		
		sbj.operation();
	}

}
