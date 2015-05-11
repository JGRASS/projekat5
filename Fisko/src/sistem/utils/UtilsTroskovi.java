package sistem.utils;

import gui.troskovi.Troskovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class UtilsTroskovi {

	public static void napraviObjekatBOS(JTextField textFieldIznosBrigaOSebi) {
		double iznos = Double.parseDouble(textFieldIznosBrigaOSebi.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/bos.data");
		
	}

	public static void napraviObjekatEdu(JTextField textFieldIznosEdu) {
		double iznos = Double.parseDouble(textFieldIznosEdu.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/edu.data");
	}

	public static void napraviObjekatHr(JTextField textFieldHranaIznos) {
		double iznos = Double.parseDouble(textFieldHranaIznos.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/hip.data");
		
	}

	public static void napraviObjekatMesRacuni(JTextField textFieldIznosMesRacuni) {
		double iznos = Double.parseDouble(textFieldIznosMesRacuni.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/mr.data");
		
	}

	public static void napraviObjekatOdIObuca(JTextField textFieldIznosOdIObuca) {
		double iznos = Double.parseDouble(textFieldIznosOdIObuca.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/oio.data");
		
	}

	public static void napraviObjekatPrevoz(JTextField textFieldIznosPrevoz) {
		double iznos = Double.parseDouble(textFieldIznosPrevoz.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/pr.data");
		
	}

	public static void napraviObjekatSportIRekr(JTextField textFieldIznosSpIRekr) {
		double iznos = Double.parseDouble(textFieldIznosSpIRekr.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/sir.data");
	}

	public static void napraviObjekatStanovanje(JTextField textFieldIznosStanovanje) {
		double iznos = Double.parseDouble(textFieldIznosStanovanje.getText());
		GregorianCalendar datum = Troskovi.date;
		konvertujTroskove(datum, iznos, "data/ts.data");
	}

	
	public static void konvertujTroskove(GregorianCalendar datum, double trosak, String path){
		double iznos2 = 0;
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("data/limiti.data"));
			iznos2 = Double.parseDouble(in.readLine());
			double ukupno = iznos2 - trosak;
			if(ukupno>=0){ iznos2 = iznos2-trosak;
			try {
				PrintWriter out = new PrintWriter(path);
				out.println(trosak+":"+datum.get(GregorianCalendar.DAY_OF_MONTH)+"."+
						datum.get(GregorianCalendar.MONTH+1)+"."+
						datum.get(GregorianCalendar.YEAR)+".");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}}
			else new JFrame();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		UtilsBudzet.postaviLimite(iznos2);
	}
}
