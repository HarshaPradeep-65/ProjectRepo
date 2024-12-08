package pagePkgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import basepkgProject.Baseclass_2;

public class projectPage2Class extends Baseclass_2 {
	WebDriver driver;	
	
	By username= By.id("user-name");
	By password=By.id("password");
	By login= By.id("login-button");
	

		
		public projectPage2Class(WebDriver driver)
		{
			this.driver= driver;		
		}
		
		public void Action1() throws InterruptedException
		{
			driver.findElement(username).sendKeys("standard_user");
			driver.findElement(password).sendKeys("secret_sauce");
			driver.findElement(login).click();
			Thread.sleep(5000);
		}
}
