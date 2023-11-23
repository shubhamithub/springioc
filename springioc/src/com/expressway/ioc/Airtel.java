package com.expressway.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("calling using airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("data using airtel sim");
		
	}

}
