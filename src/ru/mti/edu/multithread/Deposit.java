package ru.mti.edu.multithread;

public class Deposit {

	private String accountNumber;
	private volatile int rest;
	
//	int conter = 0;
	ThreadLocal<Integer> count = new ThreadLocal<Integer>(){
		@Override
		public Integer initialValue(){
			return 0;
		}
	};
	
	public Deposit(String number){
		this.accountNumber = number;
		this.rest = 0;
	}
	
	public int getRest() {
		return rest;
	}
	public void setRest(int rest) {
		count.set(count.get() + 1);
		this.rest = rest;
	}
	
	public int getCount(){
		return count.get();
	}
}
