package pagePkgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import basepkgProject.Baseclass_2;

public class Page3 extends Baseclass_2 {
	
	WebDriver driver;
	
	By createAccnt= By.xpath("//*[contains(text(),'Create new account')]");
	
	public Page3(WebDriver driver)
	{
		this.driver= driver;		
	}
	
//	public void setup()
//	{
//		driver= new ChromeDriver();
//		driver.get("https://www.facebook.com");
//	}
	
	public void Action2() throws InterruptedException
	{
		driver.findElement(createAccnt).click();
		Thread.sleep(5000);
	}
	
}
