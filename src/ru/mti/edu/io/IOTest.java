package ru.mti.edu.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class IOTest {

	public static void main(String[] args){
//		readFile();
		appendFile();
		
		File file = new File(System.getProperty("user.dir") + 
				"\\src\\ru\\mti\\edu\\io\\IOTest.java");
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		List<String> strList = new ArrayList<>();
		strList.add("Добавлено из программы");
		strList.add("54236356");
		try {
			Files.write(Paths.get(System.getProperty("user.dir"), "\\src\\ru\\mti\\edu\\io\\files.txt"), strList, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile() {
		try(BufferedReader fis = new BufferedReader(new FileReader(
				System.getProperty("user.dir") + 
				"\\src\\ru\\mti\\edu\\io\\iotest.txt"))) {
			String line = "";
			while ((line = fis.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void writeFile() {
		try(PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(
				System.getProperty("user.dir") + 
					"\\src\\ru\\mti\\edu\\io\\outputresult.properties"), "Cp1251"), true)) {
			writer.println("Добавлено из программы");
			writer.println("4545");
			
			System.out.println("Printing was successful");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} 
	}
	
	private static void appendFile() {
		try(FileWriter writer = new FileWriter(
				System.getProperty("user.dir") + 
					"\\src\\ru\\mti\\edu\\io\\outputresult.properties", true)) {
			writer.append("\nДобавлено из программы\n");
			writer.append("4545\n");
			
			System.out.println("Printing was successful");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} 
	}

}
