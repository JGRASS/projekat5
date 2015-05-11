package sistem.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

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
