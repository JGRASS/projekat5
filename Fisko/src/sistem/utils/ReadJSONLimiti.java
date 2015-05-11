package sistem.utils;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class ReadJSONLimiti {

	public static JsonObject ucitajLimite(){ 
		JsonObject obj = null;		
		try {		
			FileReader in = new FileReader("data/limiti.data");
			Gson gson = new GsonBuilder().create();
			boolean end = false;
			while(!end){
				obj = gson.fromJson(in, JsonObject.class);
				System.out.println(obj);
				end = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
