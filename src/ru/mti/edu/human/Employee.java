package ru.mti.edu.human;

public class Employee extends Person {

	private double salary = 0;
	private int staj;
	private String name = null;
	
	public Employee (){
		super("Ivanov");
	}
	
	public Employee (double sal){
		super("Ivanov Ivan", 25);
//		this();
		this.salary = sal;
	}
	
	public void printName(){
		System.out.println(this.name);
		System.out.println(super.fio.firstName);
	}
	
	public void printAge(){
		System.out.println(super.age);
	}
}
