/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//SERVER
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Server {

	
	public static void main(String[] args)  {
		ServerSocket sSocket;
		int connected = 1;
		int porta=3500;
		
		while(true){
			try {
                        sSocket = new ServerSocket(porta);
						Countdown cd = new Countdown(5000);
                        Socket connessione;
			System.out.println("in attesa di connessioni...");
  			connessione=sSocket.accept();
			System.out.println("connessione stabilita");
			sSocket.close();
			System.out.println("connessione chiusa");
				connected = 1;
                    } catch (IOException ex) {
                        System.err.println("Errore!");
						break;
                    }
			
		}
	}
	
}