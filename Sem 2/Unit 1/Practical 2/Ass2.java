// Q2. WAP to get all IP Addresses of a particular host using InetAddress class.

import java.net.*;

class Ass2{
	public static void main(String arg[]) throws UnknownHostException{
		InetAddress inet[] = InetAddress.getAllByName("www.google.com");
		for(int i=0; i<inet.length;i++){
			System.out.println("Host Name is : "+inet[i].getHostName());
			System.out.println("IP Address is : "+inet[i].getHostAddress());
		}
	}
}