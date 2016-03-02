package ru.mti.edu.human;

import static ru.mti.edu.human.Person.count;
import static ru.mti.edu.human.Person.printAge;

import ru.mti.edu.car.Car;

public class ContructorTest {

	public static void main(String[] args) {
		Person unknownPerson = new Person();
		unknownPerson.beOlder();
		
		Person petya = new Person("Petya Ivanov");
		petya.beOlder();
		
		Person vasya25 = new Person("Vasya Petrov", 25);
		vasya25.beOlder();
		
		Employee anonymousEmployee = new Employee();
		System.out.println(anonymousEmployee.getFullName());
		
		System.out.println(count);
		
		printAge(unknownPerson);
		
		String str = new String();
		
		Car car = new Car();
	}

}
