import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket();
		System.out.println("Before Accepting ... ");
		Socket s = ss.accept();
		System.out.println("After Accepting ... ");
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String msg = br.readLine();
		System.out.println("Message from client : "+msg);
		s.close();
	}
}
