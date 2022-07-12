package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class Card implements Payment {

	Payment cash = new Cash();
	
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		System.out.println(amount +"신용카드");
		stopWatch.stop();
		System.out.println("Time:"+stopWatch.prettyPrint());
	}

}
