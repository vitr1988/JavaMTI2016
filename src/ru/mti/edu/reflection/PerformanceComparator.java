package ru.mti.edu.reflection;

public class PerformanceComparator implements Measurable {

	public static void main(String[] args) {
//		Class<?> analyzedClass = PerformanceComparator.class;
//		Object obj;
//		try {
//			obj = analyzedClass.newInstance();
//			for (Method method : analyzedClass.getMethods()){
//				if (method.isAnnotationPresent(PerformanceMeasurement.class)){
//					PerformanceMeasurement value = method.getAnnotation(PerformanceMeasurement.class);
//					if (value.measureItself()){
//						long start = System.currentTimeMillis();
//						method.invoke(obj);
//						System.out.println(method.getName() + "-" + Long.toString(System.currentTimeMillis() - start));
//					}
//				}
//			}
//		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			e.printStackTrace();
//		}
		
		Measurable testExample = new PerformanceComparator();
		testExample = (Measurable) PerformanceHandler.createProxy((PerformanceComparator) testExample);
		testExample.compareArraysVsMap();
		testExample.compareArraysVsList();
		testExample.compareArraysVsQueue();
		testExample.compareArraysVsSet();
	}
	
	@PerformanceMeasurement(
			name="compareArraysVsList",
			measureItself = true)
	public void compareArraysVsList(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	@PerformanceMeasurement(measureItself = true)
	public void compareArraysVsSet(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	@PerformanceMeasurement(measureItself = true)
	public void compareArraysVsQueue(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	@PerformanceMeasurement(measureItself = true)
	public void compareArraysVsMap(){
		try {
			Thread.sleep(00);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
}
