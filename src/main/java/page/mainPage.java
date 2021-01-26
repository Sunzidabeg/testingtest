package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class mainPage {
	
	WebDriver driver;
	public mainPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
		WebElement mainPage_Validation_locator;

	 	public String getPageTitle() {
	 		return driver.getTitle();
			
	 		
	 	}
}
