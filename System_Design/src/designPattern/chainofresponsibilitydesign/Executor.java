package designPattern.chainofresponsibilitydesign;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
		
		ServiceRequest sr = new ServiceRequest(Levels.SEV2);
		
		SupportServiceItf service = (SupportService)factory.getBean("SupportService");
		
		service.handleRequest(sr);

	}

}
