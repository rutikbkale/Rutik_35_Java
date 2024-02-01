//Q6. WAP UDP IP protocol.

import java.net.*;
import java.io.*;
import java.util.*;

class UDPClient{
	public static void main(String arg[]) throws Exception{
		DatagramSocket ds = new DatagramSocket(9000);
		String s = "Hello Server";		
		byte b[] = s.getBytes();
		DatagramPacket dp = new DatagramPacket(b, b.length, InetAddress.getLocalHost(),8000);
		ds.send(dp);
	}
} 