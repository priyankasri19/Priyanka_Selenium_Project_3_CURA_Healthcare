package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AppointmentConfirmationPage {
	
	@FindBy(xpath = "/html/body/section/div/div/div[1]/h2")
    private WebElement appointmentConfirmationText;

	private WebDriver driver;

	public AppointmentConfirmationPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	public String getAppointmentConfirmationText() {
	    return appointmentConfirmationText.getText();
    }

}
