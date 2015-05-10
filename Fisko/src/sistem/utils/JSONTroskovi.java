package sistem.utils;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import troskovi.*;

public class JSONTroskovi {

	public static void konvertujTroskove(Object o, String path){
		JsonObject novi = null;
		if(o instanceof Troskovi){
			novi = new JsonObject();
			novi.addProperty("naziv", ((Troskovi) o).getNaziv());
			novi.addProperty("iznos", ((Troskovi) o).getIznos());
			novi.addProperty("datum", ((Troskovi) o).getDatum().toString());
		}
		Gson gson = new GsonBuilder().create();
		try {
			FileWriter out = new FileWriter(path);
			out.write(gson.toJson(novi));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
