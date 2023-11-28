package testCases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MakeAppointmentPage;
import setup.TestSetup;

public class ProfileTestCase extends TestSetup{

	@Test	
	private void viewProfile() throws IOException, ParseException
	{
		UserLoginTestCase.verifyUserLogin();		
		String profileText = 
				new MakeAppointmentPage(getDriver())
						.clickMenu()
						.clickProfile()
						.getProfileText();	
		Assert.assertEquals(profileText, "Profile");
	}
	
}