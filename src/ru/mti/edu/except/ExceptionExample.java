package ru.mti.edu.except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {

	public static void main(String[] args) throws CustomException {
		System.out.println("BEGIN!");
		try {
			int argument1 = Integer.valueOf(args[0]),
				argument2 = Integer.valueOf(args[1]);
//			Car car = null;
//			System.out.println(car.getBrand());
			System.out.println("Result : " + argument1/argument2);
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Args error!");
//		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
			throw new CustomException(ExceptionExample.class);
//			System.out.println("No valid data!");
//			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println("Divided by 0!");
		}
		catch(Exception e){
			/*if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Args error!");
			}
			else if (e instanceof NumberFormatException) {
				System.out.println("No valid data!");
			}
			else if (e instanceof ArithmeticException) {
				System.out.println("Divided by 0!");
			}
			else if (e instanceof NullPointerException) {
				System.out.println("NULL!");
			}*/
			throw new CustomException(e);
		}
		finally {
			System.out.println("END!");
		}
		
		try {
			
		}
		finally {
			
		}
		System.out.println(summa(2, 3));
		
		readC();
	}
	
	public static int summa (int a, int b){
		int result;
		try {
			result = a + b;
			return result;
		}
		catch(ArithmeticException e){
			result = -1;
		}
		finally {
			
		}
		return result;
	}
	
	public void readConsole() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String fullInfo = "";
		try {
			while ((str = reader.readLine()) != "q"){
				fullInfo += str;
			}
			System.out.println(fullInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readC() {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			String str;
			String fullInfo = "";
			while (!(str = reader.readLine()).equalsIgnoreCase("q")){
				fullInfo += str;
			}
			System.out.println(fullInfo);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
