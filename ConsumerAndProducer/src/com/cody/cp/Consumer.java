package com.cody.cp;

public abstract class Consumer<T> extends Worker<T> {

	public Consumer(Basket<T> b) {
		super(b);
	}
	
	public void consumer() throws Exception
	{
		work("消费者");
	}

}
