package com.cody.cp;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basket<Integer> basket = new Basket<Integer>(8);
		Consumer<Integer> consumer = new ConsumerImpl(basket);
		Producer<Integer> producer = new ProducerImpl(basket);
		try {
			consumer.consumer();
			producer.produce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
