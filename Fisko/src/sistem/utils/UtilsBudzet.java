package sistem.utils;

import java.io.*;

import budzet.Budzet;

/**
 * klasa koja predstavlja
 * osnovne operacije sa objektima 
 * klase Budzet
 * @author marcus
 *
 */
public class UtilsBudzet implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * javna metoda koja upisuje iznos budzeta
	 * kao limit
	 * @param budzet, kao objekat klase Budzet
	 */
	public static void postaviLimite(Budzet budzet){
		try {
				PrintWriter out = new PrintWriter("data/limiti.data");
				out.print(budzet.getIznos());
				out.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
	
	/**
	 * javna metoda koja ucitava budzet iz fajla
	 * @return iznos budzeta kao double vrednost
	 */
	public static double ucitajLimite(){
		double iznos = 0;
		try {
			BufferedReader  in = new BufferedReader(new FileReader("data/limiti.data"));
			iznos = in.read();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return iznos;
	}
}
