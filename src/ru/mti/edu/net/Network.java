package ru.mti.edu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Network {

	public static void main(String[] args) {
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			URL url = new URL("http://www.mti.edu.ru");
			System.out.println(url.getProtocol());
			URLConnection connection = url.openConnection();
			connection.setUseCaches(false);
			InputStream is = connection.getInputStream();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))){
				String line;
				while ((line = reader.readLine()) != null){
					System.out.println(line);
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
