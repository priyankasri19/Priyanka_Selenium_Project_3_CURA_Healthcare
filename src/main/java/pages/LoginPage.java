package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 @FindBy(id = "txt-username")
	 private WebElement userName;

	 @FindBy(id = "txt-password")
	 private WebElement password;

	 @FindBy(id = "btn-login")
     private WebElement loginButton;
	    
	 private WebDriver driver;

	 public LoginPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	   
	 public MakeAppointmentPage fillLoginData(String uName, String pass) {
		 userName.sendKeys(uName);
		 password.sendKeys(pass);
		 loginButton.click();
		 return new MakeAppointmentPage(driver);
		 		 
	 }
	 
}
