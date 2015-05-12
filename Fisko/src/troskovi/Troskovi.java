package troskovi;

import java.util.GregorianCalendar;

/**
 * Klasa koja predstavlja dnevni trosak koji korisnik unosi
 * 
 * @author Ana
 *
 */
public class Troskovi {
	
	/**
	 * Predstavlja datum unosa troska
	 */
	private GregorianCalendar datum;
	/**
	 * Predstavlja iznos troska
	 */
	private double iznos;
	
	/**
	 * Metoda vraca datum unosa troska, tj. vrednost atributa datum
	 * @return datum unosa troska kao GregorianCalendar
	 */
	public GregorianCalendar getDatum() {
		return datum;
	}
	/**
	 * Metoda vraca iznos troska, tj. vrednost atributa iznos
	 * @return iznos troska kao double
	 */
	public double getIznos() {
		return iznos;
	}
	
	/**
	 * Metoda postavlja datum unosa troska na unetu vrednost
	 * @param datum novi datum unosa troska
	 */
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	/**
	 * Metoda postavlja iznos troska na unetu vrednost
	 * @param iznos novi iznos troska
	 */
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

}
