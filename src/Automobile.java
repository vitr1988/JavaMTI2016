
public abstract class Automobile {

	private int speed;
	private int kilometrage;
	private String color = "red", brand = "lada";
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int newSpeed){
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
	
	abstract void move();
	
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
}
