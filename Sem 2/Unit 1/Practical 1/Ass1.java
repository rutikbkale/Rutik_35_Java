// Q1. WAP for InetAddress class along with all methods.

import java.net.*;

class Ass1{
	public static void main(String arg[]) throws UnknownHostException{
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println("Host Name is : "+inet.getHostName());
		System.out.println("Host Address is : "+inet.getHostAddress());
		System.out.println("Description : "+inet.toString());
		System.out.println("Is Multicast Address : "+inet.isMulticastAddress());
	}
}