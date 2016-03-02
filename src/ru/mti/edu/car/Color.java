package ru.mti.edu.car;

public class Color {
//public class Color extends Object {
	private final String name;
	private final SphetaphorColor color;

	public Color(String col){
		this.name = col;
		/*switch(col){
			case "red" :  color = SphetaphorColor.RED; break;
			case "yellow" :  color = SphetaphorColor.YELLOW; break;
			case "green" :
			default : color = SphetaphorColor.GREEN; break;
		}*/
		color = Enum.valueOf(SphetaphorColor.class, col);
	}
	
	public final String getName() {
		return name;
	}
	
	public final SphetaphorColor getColor(){
		return color;
	}
}
