// Q7. WAP for Serverchat.

import java.util.*;
import java.net.*;
import java.io.*;

class Client{
	public static void main(String arg[]) throws Exception{
		Socket s = new Socket("localhost", 7878);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str1,str2;
		
		while(!(str1=kb.readLine()).equals("exit")){
			dos.writeBytes(str1+"\n");
			str2=br.readLine();
			System.out.println(str2);
		
		dos.close();
		kb.close();
		br.close();
		s.close();
		}
	}
}