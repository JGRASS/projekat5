package sistem.utils;

import java.io.*;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sistem.troskovi.Troskovi;

/**
 * klasa pomocnih metoda za klasu Troskovi
 * @author marcus
 *
 */
public class UtilsTroskovi {

	/**
	 * metoda koja prima objekat troska i 
	 * putanju za cuvanje troska
	 * @param t kao objekat klase Troskovi
	 * @param path kao string
	 */
	public static void konvertujTroskove(Troskovi t, String path){
		double budzet = UtilsBudzet.ucitajLimit();
		double trosak = t.getIznos();
		double ukupno;
		ukupno = budzet - trosak;
		if(ukupno<0){ 
			new JOptionPane();
			JOptionPane.showMessageDialog(
				new JPanel(), "Prekoracili ste iznos budzeta");
		} 
		else {
			budzet = budzet - trosak;
			try {
				FileWriter file = new FileWriter(path, true);
				PrintWriter out = new PrintWriter(file);
				out.println(t.getIznos()+":"+
						t.getDatum().get(GregorianCalendar.DAY_OF_MONTH)+"."+(
						t.getDatum().get(GregorianCalendar.MONTH)+1)+"."+
						t.getDatum().get(GregorianCalendar.YEAR)+".");
				out.close();
				UtilsBudzet.postaviLimit(budzet);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}	
		}
		
	}
	
	/**
	 * metoda koja ucitava troskove
	 * @param path kao string putanje ka fajlu
	 * @return ucitan iznos kao String
	 */
	public static String ucitajTroskove(String path){
		BufferedReader in;
		String txt = "";
		try {
			in = new BufferedReader(new FileReader(path));
			txt = in.readLine();
			in.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return txt;
	}
	
	/**
	 * metoda koja kreira fajlove za upisivanje troskova
	 */
	public static void kreirajFajlove(){
		
		try {
			File ts = new File("data/ts.data");
			ts.createNewFile();
			File sir = new File("data/sir.data");
			sir.createNewFile();
			File pr = new File("data/pr.data"); 
			pr.createNewFile();
			File oio = new File("data/oio.data");
			oio.createNewFile();
			File mr = new File("data/mr.data");
			mr.createNewFile();
			File hip = new File("data/hip.data");
			hip.createNewFile();
			File edu = new File("data/edu.data");
			edu.createNewFile();
			File bos = new File("data/bos.data");
			bos.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
