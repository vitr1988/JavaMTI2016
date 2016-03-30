package ru.mti.edu.multithread;

public class DepositTest {

	private Object mock;
	private volatile int rest;
	
	public static void main(String[] args) {
		Deposit clientDeposit = new Deposit("456456456456");
		int rest;
		
		modifyRestAccount(clientDeposit);
		
		// 2 транзакция
		rest = clientDeposit.getRest();
		rest += 15000;
		clientDeposit.setRest(rest);
	}

	private static void modifyRestAccount(Deposit clientDeposit) {
		synchronized(DepositTest.class) {
			// 1 транзакция
			int rest = clientDeposit.getRest();
			rest += -500;
			clientDeposit.setRest(rest);
		}
	}
	
	private void updateRestAccount(Deposit clientDeposit) {
		synchronized(mock) {
			// 1 транзакция
			int rest = clientDeposit.getRest();
			rest += -500;
			clientDeposit.setRest(rest);
		}
	}
}
