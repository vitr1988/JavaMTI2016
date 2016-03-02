package ru.mti.edu.car;

public interface B {
	default void m(){
		System.out.println("B.m()");
	}
}
