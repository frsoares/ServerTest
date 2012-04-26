import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 */

/**
 * @author Francisco Soares (francisco.soares@mobmidia.com)
 *
 */
public class Client {
	
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.1.1",9001);
			
			
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
