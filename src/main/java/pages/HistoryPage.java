package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {
	
	@FindBy(xpath = "/html/body/section/div/div[1]/div/h2")
    private WebElement historyText;

	private WebDriver driver;

	public HistoryPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	public String getHistoryText() {
	    return historyText.getText();
    }

}
