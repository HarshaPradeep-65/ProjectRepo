package basepkgProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass_2 {

public WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
}
