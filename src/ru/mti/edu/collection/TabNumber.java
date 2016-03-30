package ru.mti.edu.collection;

import ru.mti.edu.reflection.ReflectionTest;

public class TabNumber {

	private Integer value;
	private int departmentEmployeeId;
	
	@SuppressWarnings({ "deprecation", "static-access" })
	public TabNumber(Integer value, Integer depa) {
		this.value = value;
		this.departmentEmployeeId = depa;
		new ReflectionTest().main(new String[]{});
	}
	
	@Override
	public String toString(){
		return "Tab Number : " + value + "\n" +
					"Dep Employee ID: " + departmentEmployeeId;
	}
	
	@Override
	public int hashCode(){
		int prime = 31;
		int result = prime * 1;
		result += (value == null ? 0 : value.hashCode());
		result += Integer.valueOf(departmentEmployeeId).hashCode();		
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof TabNumber)) return false;
		
		TabNumber tabNumber = (TabNumber) obj;
		return this.value.equals(tabNumber.value) && 
				this.departmentEmployeeId == tabNumber.departmentEmployeeId;
	}
}
