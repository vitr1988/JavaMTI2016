package ru.mti.edu.car;

public enum SphetaphorColor {
	RED("red"), YELLOW("yellow"), GREEN("green");
	
	private String color;
	
	SphetaphorColor(String col){
		this.color = col;
	}
	
	public boolean goAvailalble(){
		return "green".equals(color);
	}
}
