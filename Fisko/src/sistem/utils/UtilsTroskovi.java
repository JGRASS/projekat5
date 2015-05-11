package sistem.utils;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import budzet.Budzet;
import troskovi.Troskovi;

/**
 * klasa pomocnih metoda za klasu Troskovi
 * @author marcus
 *
 */
public class UtilsTroskovi {

	/**
	 * metoda koja prima objekat troska i 
	 * putanju za cuvanje troska
	 * @param o kao objekat
	 * @param path kao string
	 */
	public static void konvertujTroskove(Object o, String path){
		Budzet budzet = null;
		double iznos2 = 0;
		if(o instanceof Troskovi){
			BufferedReader in;
			double trosak = ((Troskovi) o).getIznos();
			try {
				in = new BufferedReader(new FileReader("data/limiti.data"));
				iznos2 = Double.parseDouble(in.readLine());
				double ukupno = iznos2 - trosak;
				in.close();
				if(ukupno>=0){ 
					iznos2 = iznos2-trosak;
					try {
						FileOutputStream out = new FileOutputStream(path);
						ObjectOutputStream objOut = 
								new ObjectOutputStream(out);
						objOut.writeObject(o);
						objOut.close();
						out.close();
					} catch (Exception e) {
						e.printStackTrace();
					}} else {
					new JOptionPane();
					JOptionPane.showMessageDialog(
							new JPanel(), "Prekoracili ste iznos budzeta");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	
		UtilsBudzet.postaviLimite(budzet);
	}
	
	/**
	 * metoda koja ucitava troskove
	 * @param path kaos tring putanje ka fajlu
	 * @return ucitan iznos kao double
	 */
	public static double ucitajTroskove(String path){
		BufferedReader in;
		double iznos = 0;
		try {
			in = new BufferedReader(new FileReader(path));
			iznos = in.read();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iznos;
	}
}
