package setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
	
	public static String loadProperty(String propertyName) throws IOException {

        InputStream inputStream = new FileInputStream("./src/main/java/setup/config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(propertyName);
    }
	
}
