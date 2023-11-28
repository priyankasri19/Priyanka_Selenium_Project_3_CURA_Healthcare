package testCases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MakeAppointmentPage;
import setup.TestSetup;

public class HistoryTestCase extends TestSetup{

	@Test	
	private void viewHistory() throws IOException, ParseException
	{
		UserLoginTestCase.verifyUserLogin();		
		String historyText = 
				new MakeAppointmentPage(getDriver())
						.clickMenu()
						.clickHistory()
						.getHistoryText();	
		Assert.assertEquals(historyText, "History");
	}
	
}