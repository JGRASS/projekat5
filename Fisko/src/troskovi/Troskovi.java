package troskovi;

import java.util.GregorianCalendar;

public abstract class Troskovi {
	
	private String naziv;
	private GregorianCalendar datum;
	private double iznos;
	
	public String getNaziv() {
		return naziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public double getIznos() {
		return iznos;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

}
