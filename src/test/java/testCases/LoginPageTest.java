package testCases;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.TestBase;
import page.LoginPage;





public class LoginPageTest extends TestBase {
	LoginPage loginpageObj;
	

  @BeforeTest
	public void setUp() {
		initializeDriver();
		loginpageObj = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test
	public void loginTest() throws Throwable {
		loginpageObj.clickSignInButton();
		Thread.sleep(2000);
		
	//	Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
	//	System.out.println("true"); 
	}
		

	@AfterTest
	public void tearDown() {		
		driver.close();
		driver.quit();
	}

}
