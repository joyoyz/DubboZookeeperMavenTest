package org.yz;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRegistryConsumerMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml"});
		
		org.yz.TestRegistryService trs = (TestRegistryService)context.getBean("testRegistryService");
		trs.hello("dubboZk");
		
		context.start();
		System.in.read();
		
		//com.alibaba.dubbo.container.Main.main(args);

	}

}
