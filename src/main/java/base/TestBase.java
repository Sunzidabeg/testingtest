package base;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static WebDriver driver;
	 
	public static WebDriver initializeDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\ProjectProject\\driver86\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		

	}

}

	
