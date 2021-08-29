package example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

public class JsonParser2 {
	
	public static void main(String[] ranjan) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(new FileReader("C:/Users/Admin/Documents/test1.json"));
		
		JSONObject pageinfo = (JSONObject) obj.get("pageInfo");
		String pagename = (String) pageinfo.get("pageName");
		System.out.println(pagename);
		Assert.assertTrue(pagename.contains("abc"));
		
	}

}
