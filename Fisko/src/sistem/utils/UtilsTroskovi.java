package sistem.utils;

import gui.troskovi.Troskovi;

import java.util.GregorianCalendar;

import javax.swing.JTextField;

import troskovi.*;

public class UtilsTroskovi {

	public static void napraviObjekatBOS(JTextField textFieldNazivBrigaOSebi, JTextField textFieldIznosBrigaOSebi) {
		BrigaOSebi bos = new BrigaOSebi();
		bos.setNaziv(textFieldNazivBrigaOSebi.getText());
		bos.setIznos(Double.parseDouble(textFieldIznosBrigaOSebi.getText()));
		bos.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(bos, "data/bos.data");
		
	}

	public static void napraviObjekatEdu(JTextField textFieldNazivEdu, JTextField textFieldIznosEdu) {
		Edukacija edu = new Edukacija();
		edu.setNaziv(textFieldNazivEdu.getText());
		edu.setIznos(Double.parseDouble(textFieldIznosEdu.getText()));
		edu.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(edu, "data/edu.data");
	}

	public static void napraviObjekatHr(JTextField textFieldHranaNaziv, JTextField textFieldHranaIznos) {
		HranaIPice hip = new HranaIPice();
		hip.setNaziv(textFieldHranaNaziv.getText());
		hip.setIznos(Double.parseDouble(textFieldHranaIznos.getText()));
		hip.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(hip, "data/hip.data");
		
	}

	public static void napraviObjekatMesRacuni(JTextField textFieldNazivMesRacuni, JTextField textFieldIznosMesRacuni) {
		MesecniRacuni mr = new MesecniRacuni();
		mr.setNaziv(textFieldNazivMesRacuni.getText());
		mr.setIznos(Double.parseDouble(textFieldIznosMesRacuni.getText()));
		mr.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(mr, "data/mr.data");
		
	}

	public static void napraviObjekatOdIObuca(JTextField textFieldNazivOdIObuca, JTextField textFieldIznosOdIObuca) {
		OdecaIObuca oio = new OdecaIObuca();
		oio.setNaziv(textFieldNazivOdIObuca.getText());
		oio.setIznos(Double.parseDouble(textFieldIznosOdIObuca.getText()));
		oio.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(oio, "data/oio.data");
		
	}

	public static void napraviObjekatPrevoz(JTextField textFieldNazivPrevoz, JTextField textFieldIznosPrevoz) {
		Prevoz pr = new Prevoz();
		pr.setNaziv(textFieldNazivPrevoz.getText());
		pr.setIznos(Double.parseDouble(textFieldIznosPrevoz.getText()));
		pr.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(pr, "data/pr.data");
		
	}

	public static void napraviObjekatSportIRekr(JTextField textFieldNazivSpIRekr, JTextField textFieldIznosSpIRekr) {
		SportIRekreacija sir = new SportIRekreacija();
		sir.setNaziv(textFieldNazivSpIRekr.getText());
		sir.setIznos(Double.parseDouble(textFieldIznosSpIRekr.getText()));
		sir.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(sir, "data/sir.data");
	}

	public static void napraviObjekatStanovanje(JTextField textFieldNazivStanovanje, JTextField textFieldIznosStanovanje) {
		TroskoviStanovanja ts = new TroskoviStanovanja();
		ts.setNaziv(textFieldNazivStanovanje.getText());
		ts.setIznos(Double.parseDouble(textFieldIznosStanovanje.getText()));
		ts.setDatum(Troskovi.date);
		JSONTroskovi.konvertujTroskove(ts, "data/ts.data");
	}

	

}
