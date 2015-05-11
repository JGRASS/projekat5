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
		double bos = UtilsTroskovi.ucitajTroskove("data/bos.data");
		
		/**
		 * iznos troskova edukacije kao double
		 */
		double edu = UtilsTroskovi.ucitajTroskove("data/edu.data");
		
		/**
		 * iznos troskova hrane i pica kao double
		 */
		double hip = UtilsTroskovi.ucitajTroskove("data/hip.data");
		
		/**
		 * iznos troskova mesecnih racuna kao double
		 */
		double mr = UtilsTroskovi.ucitajTroskove("data/mr.data");
		
		/**
		 * iznos troskova odece i obuce kao double
		 */
		double oio = UtilsTroskovi.ucitajTroskove("data/oio.data");
		
		/**
		 * iznos troskova prevoza kao double
		 */
		double pr = UtilsTroskovi.ucitajTroskove("data/pr.data");
		
		/**
		 * iznos troskova sporta i rekreacije kao double
		 */
		double sir = UtilsTroskovi.ucitajTroskove("data/sir.data");
		
		/**
		 * iznos troskova stanovanja kao double
		 */
		double ts = UtilsTroskovi.ucitajTroskove("data/ts.data");
		
		/**
		 * string iznosa
		 */
		String text = "Dnevni budzet: "+budzet+"Trosak brige o sebi: "+
		bos+". Trosak edukacije: "+edu+". Trosak hrane i pica: "+hip+
		". Trosak mesecnih racuna: "+mr+". Trosak odece i obuce: "+oio+
		". Trosak prevoza: "+pr+". Trosak sporta i rekreacije: "+sir+
		". Trosak stanovanja: "+ts;
		
		return text;
	}
}
