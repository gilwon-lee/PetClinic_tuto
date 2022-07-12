package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+"현금 결제");
		
	}

}
