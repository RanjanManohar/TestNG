package example;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser = new JSONParser();

		JSONArray a = (JSONArray) parser.parse(new FileReader("C:/Users/Admin/Documents/test.json"));

		for (Object o : a) {
			JSONObject person = (JSONObject) o;

			String name = (String) person.get("name");
			System.out.println(name);

			String city = (String) person.get("city");
			System.out.println(city);

			String job = (String) person.get("job");
			System.out.println(job);

			JSONArray cars = (JSONArray) person.get("cars");

			for (Object c : cars) {
				System.out.println(c + "");
			}
		}

	}

}
