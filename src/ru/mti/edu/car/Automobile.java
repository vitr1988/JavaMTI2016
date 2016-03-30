package ru.mti.edu.car;

import java.io.Serializable;

public abstract class Automobile implements Moveable, Printable, Serializable {
	private static final long serialVersionUID = -3154435596618019582L;
	
	private int speed;
	private int kilometrage;
	private String color = "red", brand = "lada";
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int newSpeed){
		if (newSpeed > MAX_SPEED){
			System.out.println("Вы - нарушитель закона!");
		}
		if (speed < 0 || getSpeed() == newSpeed) return;
		this.speed = newSpeed;
	}
	
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(Color co) {
		this.color = co.getName();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
//	public abstract void move();
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Automobile)){
			return false;
		}
		Automobile a = (Automobile) obj;
		return (this.getBrand().equals(a.getBrand())
				&& this.getColor().equals(a.getColor())
					&& this.getSpeed() == a.getSpeed()
						&& this.getKilometrage() == a.getKilometrage());
	}
	
	public void print(){
		class Printer {
			public void printInConsole(){
			}
			
			public void printInFile(){
			}
		}
		Printer print = new Printer();
		if (true){
			print.printInConsole();
		}
		else {
			print.printInFile();
		}
	}
}
