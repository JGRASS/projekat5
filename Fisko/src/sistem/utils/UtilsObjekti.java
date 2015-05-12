package sistem.utils;

import gui.troskovi.TroskoviGUI;
import troskovi.Troskovi;
import javax.swing.JTextField;

/**
 * klasa koja pravi objekte troskova
 * @author marcus
 *
 */
public class UtilsObjekti {

	/**
	 * javna metoda koja upisuje trosak brige o sebi
	 * @param textFieldIznosBrigaOSebi iz gui klase
	 */
	public static void napraviObjekatBOS(JTextField textFieldIznosBrigaOSebi) {
		double iznos = Double.parseDouble(textFieldIznosBrigaOSebi.getText());
		Troskovi brigos = new Troskovi();
		brigos.setIznos(iznos);
		brigos.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(brigos, "data/bos.data");
		
	}

	/**
	 * javna metoda koja upisuje trosak edukacije
	 * @param textFieldIznosEdu iz gui klase
	 */
	public static void napraviObjekatEdu(JTextField textFieldIznosEdu) {
		double iznos = Double.parseDouble(textFieldIznosEdu.getText());
		Troskovi edu = new Troskovi();
		edu.setIznos(iznos);
		edu.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(edu, "data/edu.data");
	}

	/**
	 * javna metoda koja upisuje trosak hrane i pica
	 * @param textFieldHranaIznos iz gui klase
	 */
	public static void napraviObjekatHr(JTextField textFieldHranaIznos) {
		double iznos = Double.parseDouble(textFieldHranaIznos.getText());
		Troskovi hrip = new Troskovi();
		hrip.setIznos(iznos);
		hrip.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(hrip, "data/hip.data");
		
	}

	/**
	 * javna metoda koja upisuje iznos mesecnih racuna
	 * @param textFieldIznosMesRacuni iz gui klase
	 */
	public static void napraviObjekatMesRacuni(JTextField textFieldIznosMesRacuni) {
		double iznos = Double.parseDouble(textFieldIznosMesRacuni.getText());
		Troskovi mes = new Troskovi();
		mes.setIznos(iznos);
		mes.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(mes, "data/mr.data");
		
	}

	/**
	 * jana metoda koja upisuje trosak odece i obuce
	 * @param textFieldIznosOdIObuca iz gui klase
	 */
	public static void napraviObjekatOdIObuca(JTextField textFieldIznosOdIObuca) {
		double iznos = Double.parseDouble(textFieldIznosOdIObuca.getText());
		Troskovi odiob = new Troskovi();
		odiob.setIznos(iznos);
		odiob.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(odiob, "data/oio.data");
		
	}

	/**
	 * javna metoda koja upisuje trosak prevoza
	 * @param textFieldIznosPrevoz iz gui klase
	 */
	public static void napraviObjekatPrevoz(JTextField textFieldIznosPrevoz) {
		double iznos = Double.parseDouble(textFieldIznosPrevoz.getText());
		Troskovi prevoz = new Troskovi();
		prevoz.setIznos(iznos);
		prevoz.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(prevoz, "data/pr.data");
		
	}

	/**
	 * javna metoda koja upisuje trosak sporta i rekreacije
	 * @param textFieldIznosSpIRekr iz gui klase
	 */
	public static void napraviObjekatSportIRekr(JTextField textFieldIznosSpIRekr) {
		Troskovi spir = new Troskovi();
		double iznos = Double.parseDouble(textFieldIznosSpIRekr.getText());
		spir.setIznos(iznos);
		spir.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(spir, "data/sir.data");
	}
 
	/**
	 * javna metoda upisuje trosak stanovanja
	 * @param textFieldIznosStanovanje iz gui klase
	 */
	public static void napraviObjekatStanovanje(JTextField textFieldIznosStanovanje) {
		Troskovi stan = new Troskovi();
		double iznos = Double.parseDouble(textFieldIznosStanovanje.getText());
		stan.setIznos(iznos);
		stan.setDatum(TroskoviGUI.date);
		UtilsTroskovi.konvertujTroskove(stan, "data/ts.data");
	}

}
