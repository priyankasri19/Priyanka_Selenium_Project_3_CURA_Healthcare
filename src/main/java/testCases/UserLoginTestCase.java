package testCases;


import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import setup.TestDataReader;
import setup.TestSetup;

public class UserLoginTestCase extends TestSetup{
	
	@Test
	public static void verifyUserLogin() throws IOException, ParseException
	{
		
		JSONObject userLoginDetails = TestDataReader.loginDetails();
		String name=(String) userLoginDetails.get("name");
		String password=(String) userLoginDetails.get("password");
		String appointmentPageTitle = 
				new LoginPage(getDriver())
					.fillLoginData(name,password)
					.makeAppointmentPageTitle();
		
		Assert.assertEquals(appointmentPageTitle, "CURA Healthcare Service");
	}

}
