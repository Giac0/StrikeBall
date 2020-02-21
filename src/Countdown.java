/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author informatica
 */

public class Countdown extends Thread {
	int tempo;
	Countdown(int tempo){
	this.tempo=tempo;	
	
	}
	
	
	

	@Override
	public void run(){




while(tempo>0){


System.out.println("Time out tra:"+(tempo/1000)+"secondi");
tempo = tempo-1000;




}
}
}

	