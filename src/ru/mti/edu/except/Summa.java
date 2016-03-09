package ru.mti.edu.except;

public class Summa {

	int a, b;
	
	public Summa(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int result() throws CustomException {
		if (a == 0 && b == 0){
			throw new CustomException(new IllegalArgumentException("Arguments can't be zero!"));
		}
		int result = a + b; 
		System.out.println(result);
		return result;
	}
}
