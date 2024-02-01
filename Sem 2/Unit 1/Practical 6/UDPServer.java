//Q6. WAP UDP IP protocol.

import java.net.*;
import java.io.*;
import java.util.*;

class UDPServer{
	public static void main(String arg[]) throws Exception{
		DatagramSocket ds = new DatagramSocket(8000);
		byte arr[] = new byte[100];
		DatagramPacket dp = new DatagramPacket(arr,100);
		System.out.println("Before recieve ...");
		ds.receive(dp);
		System.out.println("After recieve ...");
		byte a[] = dp.getData();
		String s = new String(a);
		System.out.println("Message : "+s);
	}
} 