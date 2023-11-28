package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy(xpath = "/html/body/section/div/div/div/h2")
    private WebElement profileText;

	private WebDriver driver;

	public ProfilePage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	public String getProfileText() {
	    return profileText.getText();
    }

}
