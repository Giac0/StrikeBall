
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Client {
	
       public static void main(String[] args) {
		Socket connessione;
		while(true){
			try {
			   String server = "localhost";
				int porta=3500;
               connessione=new Socket(server,porta);
               System.out.println("connessione aperta");
				connessione.close();
				System.out.println("connessione chiusa");
		
           } 
		catch(UnknownHostException e1){
            System.err.println("Errore DNS!");
			break;
        }  catch (IOException ex) {
               System.err.println("Errore anco");
			   break;
           }
		}
           
		
	}
	
}
