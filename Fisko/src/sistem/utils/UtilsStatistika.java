package sistem.utils;

/**
 * klasa pomocnih metoda za klasu Statistika
 * @author marcus
 *
 */
public class UtilsStatistika {

	/**
	 * metoda koja poziva metodu za ucitavanje limita i troskova
	 * spaja ucitane iznose u jedan string i
	 * prosledjuje ga gui klasi
	 * @return text kao string iznosa u vidu izvestaja
	 */
	public static String prikaziIzvestaj(){
		/**
		 * iznos budzeta kao double
		 */
		double budzet = UtilsBudzet.ucitajLimite();
		
		/**
		 * iznos troskova brige o sebi kao double
		 */
		String bos = UtilsTroskovi.ucitajTroskove("data/bos.data");
		
		/**
		 * iznos troskova edukacije kao double
		 */
		String edu = UtilsTroskovi.ucitajTroskove("data/edu.data");
		
		/**
		 * iznos troskova hrane i pica kao double
		 */
		String hip = UtilsTroskovi.ucitajTroskove("data/hip.data");
		
		/**
		 * iznos troskova mesecnih racuna kao double
		 */
		String mr = UtilsTroskovi.ucitajTroskove("data/mr.data");
		
		/**
		 * iznos troskova odece i obuce kao double
		 */
		String oio = UtilsTroskovi.ucitajTroskove("data/oio.data");
		
		/**
		 * iznos troskova prevoza kao double
		 */
		String pr = UtilsTroskovi.ucitajTroskove("data/pr.data");
		
		/**
		 * iznos troskova sporta i rekreacije kao double
		 */
		String sir = UtilsTroskovi.ucitajTroskove("data/sir.data");
		
		/**
		 * iznos troskova stanovanja kao double
		 */
		String ts = UtilsTroskovi.ucitajTroskove("data/ts.data");
		
		/**
		 * string iznosa
		 */
		
		String text = "Dnevni budzet: "+budzet+"\n"+"Trosak brige o sebi: "+
		bos+"\n"+"Trosak edukacije: "+edu+"\n"+"Trosak hrane i pica: "+hip+"\n"+
		"Trosak mesecnih racuna: "+mr+"\n"+"Trosak odece i obuce: "+oio+"\n"+
		"Trosak prevoza: "+pr+"\n"+"Trosak sporta i rekreacije: "+sir+"\n"+
		"Trosak stanovanja: "+ts+"\n";
		
		return text;
	}
}
