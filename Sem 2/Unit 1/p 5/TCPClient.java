import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost", 100);
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println("This is local server Host name is : pc23");
		pw.flush();
		pw.close();
	}

}
