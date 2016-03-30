package ru.mti.edu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import ru.mti.edu.collection.TabNumber;

@Deprecated
public class ReflectionTest {
	
	
	@Deprecated
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
			
			System.out.println("-----------------");
			for (Method method : tabNumberClass3.getDeclaredMethods()){
//				System.out.println(method.getName() + "-" + method.getModifiers() + "-" + method.getParameters());
				if ("equals".equalsIgnoreCase(method.getName())){
					System.out.println(method.invoke(obj, obj2));
				}
				else {
					System.out.println(method.invoke(obj));
				}
			}
			
			System.out.println(tabNumberClass3.getSuperclass());
			
			ClassLoader cl = tabNumberClass3.getClassLoader();
			
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
