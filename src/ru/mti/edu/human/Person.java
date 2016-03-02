package ru.mti.edu.human;

public class Person {

	FIO fio = new FIO();
	protected int age = 0;
	static int count = 0;
	
	public static final String DEFAULT_FIO = "Ivanov Ivan Ivanych";
	
	static int[] massive;
	
	static {
		massive = new int[25];
		for (int i = 0 ; i < massive.length; i++){
			massive[i] = i * i;
		}
	}
	
	Person(){
		this(DEFAULT_FIO);
	}
	
	public Person(String fullName){
		this(fullName, 18); 
	}
	
	public Person(String fullName, int age){
		this.fio.firstName = fullName;
		this.age = age;
		inc();
	}
	
	public void beOlder(){
		age++;
	}
	public String getFullName() {
		return this.fio.firstName;
	}
	
	public void inc(){
		count++;
	}
	
	public static void printAge(Person person){
		System.out.println("Person is "  + person.age + "yeas old");
	}
	
	class FIO {
		String firstName, lastName;
	}
}
