package testCases;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MakeAppointmentPage;
import setup.TestDataReader;
import setup.TestSetup;

public class MakeAppointmentTestCase extends TestSetup{
	
	@Test
	private void makeAppointment() throws IOException, ParseException {
		UserLoginTestCase.verifyUserLogin();
		JSONObject appointmentData = TestDataReader.appointmentDetails();
		String facility=(String) appointmentData.get("facility");
		String hospital_readmission=(String) appointmentData.get("hospital_readmission");
		String healthcare_program=(String) appointmentData.get("healthcare_program");
		String visit_date=(String) appointmentData.get("visit_date");
		String comment=(String) appointmentData.get("comment");
		
		String appointmentConfirmationText = 
				new MakeAppointmentPage(getDriver())
				.fillAppointmentDetails(facility, hospital_readmission, healthcare_program, visit_date, comment)
				.getAppointmentConfirmationText();	
		Assert.assertEquals(appointmentConfirmationText, "Appointment Confirmation");
	}
}

