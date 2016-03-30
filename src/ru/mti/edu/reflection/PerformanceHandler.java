package ru.mti.edu.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PerformanceHandler implements InvocationHandler {
	
	PerformanceComparator comparator;
	
	public PerformanceHandler(PerformanceComparator c){
		this.comparator = c;
	}

	public static Object createProxy(PerformanceComparator obj){
		return Proxy.newProxyInstance(PerformanceHandler.class.getClassLoader(), 
				obj.getClass().getInterfaces(), new PerformanceHandler(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (!(proxy instanceof Measurable)) return null; 
		
		for (Method m : comparator.getClass().getMethods()){
			if (m.getName().equals(method.getName())){
				method = m;
				break;
			}
		}
		
		PerformanceMeasurement measure = method.getAnnotation(PerformanceMeasurement.class);
		long start = -1;
		Object result = null;
		if(measure != null && measure.measureItself()){
			start = System.currentTimeMillis();
			result = method.invoke(comparator, args);
		}
		System.out.println(System.currentTimeMillis() - start);
		return result;
	}
}
