package ru.mti.edu.car;

public interface A {
	default void m(){
		System.out.println("A.m()");
	}
}
