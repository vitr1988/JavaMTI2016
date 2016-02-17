
public class AutomobileTest {

	public static void main(String[] args) {
		Automobile car = new Cargo();
//		car.speed = 120;
		car.setBrand("Kia");
//		car.setColor( "white");
		car.setKilometrage(1000);
		car.setSpeed(120);
		
		Automobile ladaVesta = new Car();
		System.out.println(car == ladaVesta);
		
		Car niva = new Car();
		
		Cargo volvoTruck = new Cargo();
		
		System.out.println(niva.getCount());
		System.out.println(volvoTruck.isAdditionalVehicleAvailable());
		
		System.out.println(car.getBrand());
		
		car.move();
		Automobile nlo = new FlyCar();
		nlo.move(); //fly
		
		Color color = new Color("green");
		car.setColor(color);
		System.out.println(color.getName());
		
		Car lada = new Car();
		lada.setBrand("Lada");
		lada.setKilometrage(15000);
		
		Car ladaClone = Car.createClone(lada);
		
		System.out.println(ladaClone.equals(lada));
//		System.out.println(ladaClone == lada);
		
		System.out.println(new Car().equals(new Car()));
		System.out.println(new Car() == new Car());
	}

}
