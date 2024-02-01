// Q7. WAP for Serverchat.

import java.util.*;
import java.net.*;
import java.io.*;

class Server{
	public static void main(String arg[]) throws Exception{
		ServerSocket ss = new ServerSocket(888);
		Socket s =ss.accept();
		System.out.println("Connection established ...");
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = new PrintStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		while(true){
			String str1,str2;
			while((str1=br.readLine())!=null){
				System.out.println(str1);
				str2=kb.readLine();
				ps.println(str2);
			}
			kb.close();
			br.close();
			s.close();
			ss.close();
			ps.close();
			System.exit(0);
		}
	}
}