package ru.mti.edu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ru.mti.edu.car.Car;
import ru.mti.edu.car.FlyCar;

public class SerializationTest {

	public static void main(String[] args) {
		Car car = new Car();
		FlyCar flycar = new FlyCar();
		int index = 1;
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(System.getProperty("user.dir") + "\\src\\ru\\mti\\edu\\io\\serialization.ser"))) {
			oos.writeObject(car);
			oos.writeObject(flycar);
			oos.writeInt(index);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(System.getProperty("user.dir") + "\\src\\ru\\mti\\edu\\io\\serialization.ser"))) {
			
			Object obj = ois.readObject(); 
			if (obj instanceof Car){
				Car car1 = (Car) obj;
				System.out.println(car1.passengerCount);
			}
			System.out.println((FlyCar) ois.readObject());
			System.out.println(ois.readInt());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
