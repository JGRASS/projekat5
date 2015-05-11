package sistem.utils;

import java.io.*;

import budzet.Budzet;

public class UtilsBudzet {

	public static void postaviLimite(Budzet budzet){
			try {
				FileOutputStream out = new FileOutputStream("data/limiti.data");
				ObjectOutputStream obj = new ObjectOutputStream(out);
				obj.writeObject(budzet);
				obj.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
