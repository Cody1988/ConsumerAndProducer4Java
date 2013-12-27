package com.cody.cp;

import java.util.Random;

public class ProducerImpl extends Producer<Integer> {

	public ProducerImpl(Basket<Integer> b) {
		super(b);
	}

	private Integer i = 0;
	@Override
	protected void doWork() {
		i = i + 1;
		System.out.println("ProducerImpl " + i);
		basket.put(i);
		try {
			Thread.sleep(new Random().nextInt(5) * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
