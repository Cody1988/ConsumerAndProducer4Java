package com.cody.cp;

import java.util.Random;

public class ConsumerImpl extends Consumer<Integer> {

	public ConsumerImpl(Basket<Integer> b) {
		super(b);
	}

	@Override
	protected void doWork() {
		Integer i = basket.get();
		System.out.println("````````````````````````ConsumerImpl " + i);
		try {
			Thread.sleep(new Random().nextInt(5) * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
