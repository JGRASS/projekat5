package sistem.utils;

import java.io.*;

/**
 * klasa koja sadrzi metode
 * koje postavljaju i ucitavaju budzet
 * @author marcus
 *
 */
public class UtilsBudzet {

	/**
	 * javna metoda koja upisuje iznos budzeta
	 * kao limit
	 * @param iznos, kao double
	 */
	public static void postaviLimit(double iznos){
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
	public static double ucitajLimit(){
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
