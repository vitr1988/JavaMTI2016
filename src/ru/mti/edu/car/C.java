package ru.mti.edu.car;

public class C implements A, B {

	public void m() {
		B b = (B) this;
		b.m();
	}
}
