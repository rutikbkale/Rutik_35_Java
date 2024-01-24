// Q3. WAP for URL class which display the protocol, host, port, filename and externalFormof given argument in URL constructor.

import java.net.*;

class Ass3{
	public static void main(String arg[]) throws MalformedURLException{
		URL url = new URL("http://localhost:8080/index.html");
		System.out.println("Protocol is : "+url.getProtocol());
		System.out.println("Host Name is : "+url.getHost());
		System.out.println("Port is : "+url.getPort());
		System.out.println("File name is : "+url.getFile());
		System.out.println("Description : "+url.toExternalForm());
	}
}