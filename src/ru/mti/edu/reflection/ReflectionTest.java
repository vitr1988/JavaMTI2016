package ru.mti.edu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//import ru.mti.edu.collection.TabNumber;

public class ReflectionTest {

	public static void main(String[] args) {
//		TabNumber tabNumber = new TabNumber(10, 10);
//		Class tabNumberClass = TabNumber.class;
//		Class tabNumberClass2 = tabNumber.getClass();
		try {
			Class tabNumberClass3 = Class.forName("ru.mti.edu.collection.TabNumber");
//			Object obj = tabNumberClass3.newInstance();
			Object obj = null, obj2 = null;
			Constructor[] constructors = tabNumberClass3.getConstructors();
			Constructor constructor = tabNumberClass3.getConstructor(Integer.class, Integer.class);
			if (constructor != null){
				obj2 = constructor.newInstance(20, 20);
			}
			for (Constructor cons : constructors){
				if (cons.getParameterTypes().length == 2){
					obj = cons.newInstance(10, 10);
					break;
				}
			}
			Field valueField = tabNumberClass3.getDeclaredField("value");
			valueField.setAccessible(true);
			
			System.out.println(obj);
			System.out.println(obj2);
			System.out.println(valueField.get(obj));
			System.out.println(valueField.get(obj2));
//			Class tabNumberClass4 = ClassLoader.getSystemClassLoader().loadClass("ru.mti.edu.collection.TabNumber");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

}
