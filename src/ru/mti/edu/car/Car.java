package ru.mti.edu.car;

public class Car extends Automobile {
	int passengerCount;
	
	void goToDacha(){
		System.out.println("Мы приехали на дачу!");
	}
	
	int getCount(){
		return passengerCount;
	}
	
	public static Car createClone(Car source){
		Car result = new Car();
		result.setBrand(source.getBrand());
		result.setKilometrage(source.getKilometrage());
		Color color = new Color(source.getColor());
		result.setColor(color);
		if (color.getColor().goAvailalble()){
			//
		}
		result.setSpeed(source.getSpeed());
		return result;
	}
	
	public void move() {
		System.out.println("Передвигаемся на колесах");
	}
}
