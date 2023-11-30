package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPage {
	
	@FindBy(id = "menu-toggle")
    private WebElement menus;
	
	@FindBy(xpath = "/html/body/nav/ul/li[3]/a")
    private WebElement history;
	
	@FindBy(xpath = "/html/body/nav/ul/li[4]/a")
	private WebElement profile;
	
	
	@FindBy(xpath = "/html/body/nav/ul/li[5]/a")
    private WebElement logout;
	
	@FindBy(id = "combo_facility")
    private WebElement combo_facility;
	
	@FindBy(id= "chk_hospotal_readmission")
    private WebElement hospital_readmission;
	
	@FindBy(id = "radio_program_medicare")
    private WebElement radio_program_medicare;
	
	@FindBy(id = "radio_program_medicaid")
    private WebElement radio_program_medicaid;
	
	@FindBy(id = "radio_program_none")
    private WebElement radio_program_none;
	
	@FindBy(id= "txt_visit_date")
    private WebElement txt_visit_date;
	
	@FindBy(id= "txt_comment")
    private WebElement txt_comment;
	
	@FindBy(id= "btn-book-appointment")
    private WebElement appointmentBookingButton;
	
	
	private WebDriver driver;
	

    public MakeAppointmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String makeAppointmentPageTitle() {
    	return driver.getTitle();
    }
    
    public MakeAppointmentPage clickMenu() {
    	menus.click();
    	return this;
    }
    
    public LogoutPage clickLogout() {
    	logout.click();
    	return new LogoutPage(driver);
    }
    
    public HistoryPage clickHistory() {
    	history.click();
    	return new HistoryPage(driver);
    }

	public ProfilePage clickProfile() {
		profile.click();
		return new ProfilePage(driver);
	}
	
	public AppointmentConfirmationPage fillAppointmentDetails(String facilityName, String hospitalReadmissionChk,
										String programName, String visitDate,String comments) {
		
		Select select = new Select(combo_facility);
		select.selectByVisibleText(facilityName);
		
		hospital_readmission.sendKeys(hospitalReadmissionChk);
		
		switch(programName) {
		
		case "Medicare" :
			radio_program_medicare.click();
			break;
		
		case "Medicaid" :
			radio_program_medicaid.click();
			break;
		case "None" :
			radio_program_none.click();
			break;
		}
		
		txt_visit_date.sendKeys(visitDate);
		txt_comment.sendKeys(comments);
		
		appointmentBookingButton.click();
		
		return new AppointmentConfirmationPage(driver); 
		 		 
	 }
}
