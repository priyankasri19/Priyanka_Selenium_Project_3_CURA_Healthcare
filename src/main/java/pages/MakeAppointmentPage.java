package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeAppointmentPage {
	
	@FindBy(id = "menu-toggle")
    private WebElement menus;
	
	@FindBy(xpath = "/html/body/nav/ul/li[3]/a")
    private WebElement history;
	
	@FindBy(xpath = "/html/body/nav/ul/li[4]/a")
	private WebElement profile;
	
	
	@FindBy(xpath = "/html/body/nav/ul/li[5]/a")
    private WebElement logout;
	
	
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
}
