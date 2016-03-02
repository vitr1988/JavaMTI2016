package ru.mti.edu.car;

public interface Printable {

	void print();
	
	default void print(String str){
		System.out.println(str);
	}
}
