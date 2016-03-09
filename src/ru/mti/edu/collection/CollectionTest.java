package ru.mti.edu.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
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
		
		Set<Integer> set = new HashSet<>();
		for (int i = 100; i <= 200; i++){
			set.add(i);
		}
		set.add(105);
		set.add(110);
		set.add(199);
		
		System.out.println(set);
		
		Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		
		treeSet.add(12);
		treeSet.add(15);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(100);
		treeSet.add(0);
		
		System.out.println(treeSet);
		
//		Queue<Double> queue
		
		Map<Integer, String> employeeInfo = new HashMap<>(5);
		employeeInfo.put(10, "Ivanov");
		employeeInfo.put(11, "Petrov");
		employeeInfo.put(12, "Sidorov");
		employeeInfo.put(13, "Starovoitov");
		employeeInfo.put(14, "Zhuravlev");
		
		String lastName = employeeInfo.get(10);
		System.out.println(lastName);
	}
}

