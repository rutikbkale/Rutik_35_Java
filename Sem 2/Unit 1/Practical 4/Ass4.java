// Q4. WAP for URLConnection class which display the modified date, contentType and contentLength of given argument in URL constructor.

import java.net.*;
import java.util.*;
import java.io.*;

class Ass4{
	public static void main(String arg[]) throws MalformedURLException, IOException{
		URL url = new URL("http://pc23/E:/Rutik_35/Practical 1/Ass4.java");
		URLConnection con = url.openConnection();
		System.out.println("Date is : "+new Date(con.getDate()));
		System.out.println("Content type is : "+con.getContentType());
		System.out.println("Content length is : "+con.getContentLength());
	}
}