package sistem.utils;

import gui.troskovi.Troskovi;
import javax.swing.JTextField;

import troskovi.BrigaOSebi;
import troskovi.Edukacija;
import troskovi.HranaIPice;
import troskovi.MesecniRacuni;
import troskovi.OdecaIObuca;
import troskovi.Prevoz;
import troskovi.SportIRekreacija;
import troskovi.TroskoviStanovanja;

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
		BrigaOSebi brigos = new BrigaOSebi();
		brigos.setIznos(iznos);
		brigos.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(brigos, "data/bos.data");
		
	}

	/**
	 * javna metoda koja upisuje trosak edukacije
	 * @param textFieldIznosEdu iz gui klase
	 */
	public static void napraviObjekatEdu(JTextField textFieldIznosEdu) {
		double iznos = Double.parseDouble(textFieldIznosEdu.getText());
		Edukacija edu = new Edukacija();
		edu.setIznos(iznos);
		edu.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(edu, "data/edu.data");
	}

	/**
	 * javna metoda koja upisuje trosak hrane i pica
	 * @param textFieldHranaIznos iz gui klase
	 */
	public static void napraviObjekatHr(JTextField textFieldHranaIznos) {
		double iznos = Double.parseDouble(textFieldHranaIznos.getText());
		HranaIPice hrip = new HranaIPice();
		hrip.setIznos(iznos);
		hrip.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(hrip, "data/hip.data");
		
	}

	/**
	 * javna metoda koja upisuje iznos mesecnih racuna
	 * @param textFieldIznosMesRacuni iz gui klase
	 */
	public static void napraviObjekatMesRacuni(JTextField textFieldIznosMesRacuni) {
		double iznos = Double.parseDouble(textFieldIznosMesRacuni.getText());
		MesecniRacuni mes = new MesecniRacuni();
		mes.setIznos(iznos);
		mes.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(mes, "data/mr.data");
		
	}

	/**
	 * jana metoda koja upisuje trosak odece i obuce
	 * @param textFieldIznosOdIObuca iz gui klase
	 */
	public static void napraviObjekatOdIObuca(JTextField textFieldIznosOdIObuca) {
		double iznos = Double.parseDouble(textFieldIznosOdIObuca.getText());
		OdecaIObuca odiob = new OdecaIObuca();
		odiob.setIznos(iznos);
		odiob.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(odiob, "data/oio.data");
		
	}

	/**
	 * javna metoda koja upisuje trosak prevoza
	 * @param textFieldIznosPrevoz iz gui klase
	 */
	public static void napraviObjekatPrevoz(JTextField textFieldIznosPrevoz) {
		double iznos = Double.parseDouble(textFieldIznosPrevoz.getText());
		Prevoz prevoz = new Prevoz();
		prevoz.setIznos(iznos);
		prevoz.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(prevoz, "data/pr.data");
		
	}

	/**
	 * javna metoda koja upisuje trosak sporta i rekreacije
	 * @param textFieldIznosSpIRekr iz gui klase
	 */
	public static void napraviObjekatSportIRekr(JTextField textFieldIznosSpIRekr) {
		SportIRekreacija spir = new SportIRekreacija();
		double iznos = Double.parseDouble(textFieldIznosSpIRekr.getText());
		spir.setIznos(iznos);
		spir.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(spir, "data/sir.data");
	}

	/**
	 * javna metoda upisuje trosak stanovanja
	 * @param textFieldIznosStanovanje iz gui klase
	 */
	public static void napraviObjekatStanovanje(JTextField textFieldIznosStanovanje) {
		TroskoviStanovanja stan = new TroskoviStanovanja();
		double iznos = Double.parseDouble(textFieldIznosStanovanje.getText());
		stan.setIznos(iznos);
		stan.setDatum(Troskovi.date);
		UtilsTroskovi.konvertujTroskove(stan, "data/ts.data");
	}

}
