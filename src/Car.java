
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
		result.setColor(new Color(source.getColor()));
		result.setSpeed(source.getSpeed());
		return result;
	}
	
	public void move() {
		System.out.println("Передвигаемся на колесах");
	}
}
