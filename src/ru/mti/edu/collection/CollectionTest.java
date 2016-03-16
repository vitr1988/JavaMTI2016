package ru.mti.edu.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JSpinner.ListEditor;

public class CollectionTest {

	public static void main(String[] args) {
		long initTime = System.currentTimeMillis();
//		GenericExample<Integer, String> example = new GenericExample<>();
//		example.setName("Ivanov Ivan");
//		example.setOrder(1);
//		
//		GenericExample<Double, FIO> ex = new GenericExample<>();
//		FIO fio = new FIO();
//		fio.firstName = "Ivan";
//		fio.secondName = "Ivanov";
//		ex.setName(fio);
//		example.setOrder(1);
		
		List list = new ArrayList<>();
		list.add(1);
		list.add("Test");
		list.add(2.5);
		list.add(new FIO());
		
		List<String> strList = new ArrayList<>();
		strList.add("Ivanov");
		strList.add("Petrov");
		strList.add("Sidrov");
		
		List<String> linkedList = new LinkedList<>();
		
		for (int i = 0; i < 50 * 1000; i++){
			strList.add(i + "Ivanov");
		}
		
//		for (String str : strList){
//			
//		}
		for (Iterator<String> iter = strList.iterator(); iter.hasNext();){
			String str = iter.next();
//			iter.remove();
		}
//		for (int i = 0; i < strList.size(); i++){
//			String str = strList.get(i);
//		}
		strList.remove(2);
		
		for (int i = 0; i < strList.size(); i++){
			if (i % 2 == 0){
				strList.remove(i);
			}
		}
		
		System.out.println(strList);
		
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 200; i >= 100; i--){
			set.add(i);
		}
		set.add(105);
		set.add(110);
		set.add(199);
		
		System.out.println(set);
		
//		Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>(){
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -o1.compareTo(o2);
//			}
//		});
		Set<Integer> treeSet = new TreeSet<Integer>(
			(o1, o2) -> -o1.compareTo(o2)
		);
		
		treeSet.add(12);
		treeSet.add(15);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(100);
		treeSet.add(0);
		
		System.out.println(treeSet);
		
		Queue<Double> queue = new PriorityQueue<>();
//		queue.
		
		Map<TabNumber, String> employeeInfo = new LinkedHashMap<>(5);
		employeeInfo.put(new TabNumber(10000, 10), "Ivanov");
		employeeInfo.put(new TabNumber(10004, 14), "Zhuravlev");
		employeeInfo.put(new TabNumber(10001, 11), "Petrov");
		employeeInfo.put(new TabNumber(10002, 12), "Sidorov");
		employeeInfo.put(new TabNumber(10003, 13), "Starovoitov");
		
		for (Entry<TabNumber, String> entry : employeeInfo.entrySet()){
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		String lastName = employeeInfo.get(new TabNumber(10000, 10));
		System.out.println(lastName);
		
		
		Iterator<Integer> iterator = treeSet.iterator();
		for (; iterator.hasNext();){
			Integer element = iterator.next();
			System.out.println(element);
		}
		
		for (ListIterator<String> listIteror =  strList.listIterator(); listIteror.hasNext(); ){
			String el = listIteror.next();
			if ("Petrov".equalsIgnoreCase(el)){
				String previousEl = listIteror.previous();
				System.out.println(previousEl);
				el = listIteror.next();
			}
		}
		long finishTime = System.currentTimeMillis();
		
		System.out.println("Duration execution : " + (finishTime - initTime));
	}
}

