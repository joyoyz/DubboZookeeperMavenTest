package org.yz;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	
	 static{  
		 PropertyConfigurator.configure("src/main/resources/log4j.properties");  
	 }  
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext(new String[]{"classpath*:applicationContext.xml"});
		context.start();
		System.in.read();*/
		
		com.alibaba.dubbo.container.Main.main(args);

	}

}
