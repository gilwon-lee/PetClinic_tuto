package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class Card implements Payment {

	Payment cash = new Cash();
	
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		System.out.println(amount +"์ ์ฉ์นด๋");
		stopWatch.stop();
		System.out.println("Time:"+stopWatch.prettyPrint());
	}

}
