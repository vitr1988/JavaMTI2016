package ru.mti.edu.multithread;

public class CustomThread extends Thread {

	@Override
	public void run(){
		System.out.println("Custom thread prints now!");
	}
}
