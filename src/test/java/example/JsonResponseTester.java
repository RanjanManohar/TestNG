package example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JsonResponseTester {
	JSONObject obj;

	@Test
	public void pageName() {

		JSONObject pageinfo = (JSONObject) obj.get("pageInfo");
		String pagename = (String) pageinfo.get("pageName");
		System.out.println(pagename);
		Assert.assertTrue(pagename.contains("abc"));

	}
	@Test
	public void PersonWhoPosted() {

		JSONArray posts = (JSONArray) obj.get("posts");
		JSONObject postObj = (JSONObject) posts.get(0);
		String PersonWhoPosted = (String) postObj.get("nameOfPersonWhoPosted");
		System.out.println(PersonWhoPosted);
		Assert.assertTrue(PersonWhoPosted.contains("Jane Doe"));

	}
	

	@BeforeTest
	public void beforeTest() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		obj = (JSONObject) parser.parse(new FileReader("C:/Users/Admin/Documents/test1.json"));
	}
}
