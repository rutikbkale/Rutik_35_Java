// Q4. WAP for URLConnection class which display the modified date, contentType and contentLength of given argument in URL constructor.

import java.net.*;
import java.util.*;
import java.io.*;

class Ass4{
	public static void main(String arg[]) throws Exception{
		URL url = new URL("http://localhost:80/index.html");
		URLConnection con = url.openConnection();
		System.out.println("Date is : "+new Date(con.getDate()));
		System.out.println("Content type is : "+con.getContentType());
		System.out.println("Content length is : "+con.getContentLength());
	}
}