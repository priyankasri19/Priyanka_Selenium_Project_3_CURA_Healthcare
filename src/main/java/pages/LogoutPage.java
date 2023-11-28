package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	private WebDriver driver;

	public LogoutPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	public String logoutPageTitle() {
	    return driver.getTitle();
    }

}
