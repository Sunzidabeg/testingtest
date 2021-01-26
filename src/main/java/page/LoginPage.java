package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.TestBase;

public class LoginPage extends TestBase {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}

	// Element Library
	//@FindBy(how = How.ID, using = "username")
	//WebElement UserName;
	//@FindBy(how = How.ID, using = "password")
	//WebElement Password;
	//@FindBy(how = How.NAME, using = "login")
	//WebElement SignInButton;

	// Methods to interact with the elements
	//public void enterUserName(String userName) {
	//	UserName.sendKeys(userName);
	//}
	//public void enterPassword(String password) {
	//	Password.sendKeys(password);
	//}
	
    @FindBy(how = How.XPATH, using = "allbox")
	WebElement clickSignInButton;
    
   
	public void clickSignInButton() {
		
		driver.findElement(By.xpath("//input[@name='allbox']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		System.out.println("true!!!!!"); 
	
//	public void login(String userName, String password) {
//		UserName.sendKeys(userName);
//		Password.sendKeys(password);
//		SignInButton.click();
//	}
	//public String getPageTitle(){
		
	//	return driver.getTitle();
	//}

}


	


	
}
