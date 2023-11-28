package testCases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MakeAppointmentPage;
import setup.TestSetup;

public class UserLogoutTestCase extends TestSetup{

	@Test	
	private void verifyUserLogout() throws IOException, ParseException
	{
		UserLoginTestCase.verifyUserLogin();
		String tiltle = 
					new MakeAppointmentPage(getDriver())
							.clickMenu()
							.clickLogout()
							.logoutPageTitle();
		Assert.assertEquals(tiltle, "CURA Healthcare Service");
		
	}
	
}
