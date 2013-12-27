package com.cody.cp;

public abstract class Worker<T> {
	
	protected Basket<T> basket = null;
	
	private Thread workThread = null;
	private volatile boolean isWorking = false;
	public Worker(Basket<T> b){
		this.basket = b;
	}
	
	public void work() throws Exception{
		work("");
	}
	
	protected void work(String name) throws Exception{
		
		if(isWorking){
			throw new Exception(this.getClass().getName() + " is working !");
		}
		
		isWorking = true;
		workThread = new Thread(runnable);
		workThread.setName(name);
		workThread.start();
	}
	
	public Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			while(isWorking)
				doWork();
		}
	};
	
	protected abstract void doWork();
	
}





