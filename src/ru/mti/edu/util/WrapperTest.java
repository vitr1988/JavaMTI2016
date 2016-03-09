package ru.mti.edu.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class WrapperTest {

	public static void main(String[] args) {
		int i = 0;
		Integer iObj = 0;
//		iObj = null;
		System.out.println(i == iObj);
		
		Boolean flag = true;
		Double a = 2.5;
		Double b = new Double(2.5);
		
		double c = a;
		String obj;
		if (i % 2 == 0){
			obj = "red";
		}
		else if (a > 0) {
			obj = "green";
		}
		else {
			obj = "yellow";
		}
		obj.equals("");
		
		System.out.println(new Integer(1024) == new Integer(1024));
		System.out.println(124 == new Integer(124));
		
		int arg1 = Integer.valueOf(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		
		System.out.println("Result : " + (arg1 + arg2));
		
		Integer exc1 = 15;
		System.out.println(exc1.compareTo(14));
		
		BigInteger bigInt = new BigInteger("454564564564564565645445645645645544887444441");
		bigInt = bigInt.add(BigInteger.valueOf(1000));
		System.out.println(bigInt);
		
		BigDecimal bigDecimal = new BigDecimal(0.1);
		BigDecimal bigDecimal2 = new BigDecimal("0.1");
		System.out.println(bigDecimal);
		System.out.println(bigDecimal2);
		
		System.out.println(bigDecimal2.add(BigDecimal.valueOf(1)));
	}
}
