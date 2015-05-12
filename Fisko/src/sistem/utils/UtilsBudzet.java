package sistem.utils;

import java.io.*;

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
	public static void postaviLimite(double iznos){
		try {
				FileWriter file = new FileWriter("data/limiti.data");
				PrintWriter out = new PrintWriter(file);
				out.print(iznos);
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
			BufferedReader  in = new BufferedReader(
					new FileReader("data/limiti.data"));
			String s = in.readLine(); 
			iznos = Double.parseDouble(s);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iznos;
	}
}
