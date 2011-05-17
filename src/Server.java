import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 */

/**
 * @author Francisco Soares (francisco.soares@mobmidia.com)
 * 
 */
public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket s = new ServerSocket(9000);
			Socket openSocket = s.accept();

			System.out.println(openSocket.getPort() + " is the remote port.");
			System.out.println(openSocket.getRemoteSocketAddress().toString() + " is the remote address");
			
			openSocket.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
