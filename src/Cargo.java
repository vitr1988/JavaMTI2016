
public class Cargo extends Automobile {
	double weight;
	
	boolean isAdditionalVehicleAvailable(){
		return true;
	}
	
	public void move() {
		System.out.println("Передвигаемся на колесах");
	}
}
