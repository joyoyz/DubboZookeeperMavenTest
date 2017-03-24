package org.yz;

public class TestRegistryServiceImpl implements TestRegistryService{

	public String hello(String name) {
		System.out.println("-------------test hello-----------");
		return "hello "+name;
	}

}
