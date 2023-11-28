package setup;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestDataReader {

	public static JSONObject loginDetails() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("./test-data/LoginData.json");
		Object obj = jsonParser.parse(fileReader);
		JSONObject loginObject = (JSONObject) obj; 
		return loginObject;
		
	}
}
