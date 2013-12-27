package com.cody.cp;

public abstract class Producer<T> extends Worker<T> {

	public Producer(Basket<T> b) {
		super(b);
	}
	
	public void produce() throws Exception
	{
		work("生产者");
	}

}
