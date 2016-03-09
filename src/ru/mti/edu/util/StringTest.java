package ru.mti.edu.util;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello, " + "World!";
		str = new StringBuilder("Hello, ").append("World!").toString();
		str.intern();
		String test = "Test";
		test = test.intern();
		System.out.println("Test" == test);
		System.out.println(str.equals("Hello, World!")); 
//		test.substring(beginIndex)
		
		String values = "1;2;3;4;5.6;7;8;9;10";
//		String[] array = values.split(";");
//		for (String arr : array){
//			System.out.println(Integer.decode(arr));
//		}
		
		StringTokenizer sToken = new StringTokenizer(values, ";. ");
		while(sToken.hasMoreTokens()){
			String token = sToken.nextToken();
			System.out.println(Integer.decode(token));
		}
		
		System.out.println(values.replaceAll("1", "PI"));
		
		Pattern patt = Pattern.compile("([\\d+;])*");
		Matcher matcher = patt.matcher(values);
		if (matcher.find()){
			for (int i = 0; i < matcher.groupCount(); i++){
				System.out.println(matcher.group(i));
			}
		}
		
		
	}

}
