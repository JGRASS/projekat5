package sistem.utils;

import java.io.IOException;
import java.io.PrintWriter;

public class UtilsBudzet {

	public static void postaviLimite(double iznos){
			try {
				PrintWriter out = new PrintWriter("data/limiti.data");
				out.print(iznos);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
