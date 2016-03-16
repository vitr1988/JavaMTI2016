package ru.mti.edu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Util {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>(10);
		Collections.addAll(intList, 17, 17, 18, 23, 79, 456, 79, 452);
		Set<Integer> intSet = new HashSet<>(intList);
		System.out.println(intSet + " ");
		List<Integer> list = Arrays.asList(17, 17, 18, 23, 79, 456, 79, 452);
		int[] in1 = new int[]{1, 2, 3},
			in2 = new int[]{1, 2, 3};
		System.out.println(Arrays.equals(in1, in2));
		List<Integer> bufferList = new ArrayList<>();
		for (Integer el : list){
			if (el % 2 == 0){
				bufferList.add(el);
			}
		}
		System.out.println(bufferList.size());
		System.out.println(list.stream().filter(e -> e.intValue() % 2 == 0).count());
		
		List<Integer> unmod = Collections.unmodifiableList(list);
		unmod.set(5, 2001); // remove -> add
		unmod.add(1);
		unmod.remove(1);
		
//		print(new String[] {"123", "12"} );
//		print("123", "12");
//		print("123", "12", "gfsgfs", "gsfgsgsf");
//		print();
	}

//	public static void print(Object[] obj){
//		for (Object o : obj)
//			System.out.println(o);
//	}
//	
//	public static void print(Object obj){
//		System.out.println(obj);
//	}
//	
//	public static void print(){
//	}
	
	public static void print(int index, TabNumber tab, Object... objects){
		for (Object o : objects)
			System.out.println(o);
	}
}
