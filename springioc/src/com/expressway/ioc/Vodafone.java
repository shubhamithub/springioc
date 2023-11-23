package com.expressway.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling using vodafone sim");
		
	}

	@Override
	public void data() {
		System.out.println("data using vodafone sim");
		
	}

}
