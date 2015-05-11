package sistem.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import budzet.Budzet;
import troskovi.Troskovi;

public class UtilsTroskovi {

	public static void konvertujTroskove(Object o, String path){
		Budzet budzet = null;
		double iznos2 = 0;
		if(o instanceof Troskovi){
			FileInputStream in;
			ObjectInputStream inObj;
			double trosak = ((Troskovi) o).getIznos();
			try {
				in = new FileInputStream("data/limiti.data");
				inObj = new ObjectInputStream(in);
				budzet = (Budzet) inObj.readObject();
				iznos2 = budzet.getIznos();
				double ukupno = iznos2 - trosak;
				in.close();
				inObj.close();
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
					JOptionPane.showConfirmDialog(
							new JPanel(), "Prekoracili ste iznos budzeta");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		UtilsBudzet.postaviLimite(budzet);
	}
}
