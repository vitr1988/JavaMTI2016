package ru.mti.edu.except;

public class CustomException extends Exception {
	
	private Class causedClass;
	private Exception e;
	
	public CustomException(Class cl){
		this.causedClass = cl;
	}
	
	public CustomException(Exception e){
		this.e = e;
	}
	
	public String toString(){
		return "Custom Exception was caused " + 
			(this.causedClass == null ? e.getMessage(): this.causedClass.getName()); 
	}
}
