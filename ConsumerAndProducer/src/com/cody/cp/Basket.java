package com.cody.cp;

import java.util.LinkedList;

public class Basket<T> {

	private LinkedList<T> list = new LinkedList<T>();
	private int capacity = 0;
	private Object locker = new Object();
	public Basket(int c){
		this.capacity = c;
	}
	
	public void put(T obj){
		synchronized (locker) {
			try{
			if(list.size() >= capacity)
				locker.wait();
			list.add(obj);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				locker.notify();
			}
		}
	}
	
	public T get(){
		T obj = null;
		synchronized (locker) {
			try{
				if(list.size() <= 0)
					locker.wait();
				obj = list.poll();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				locker.notify();
			}
		}
		return obj;
	}
	
}






