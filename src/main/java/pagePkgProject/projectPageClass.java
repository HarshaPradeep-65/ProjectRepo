package pagePkgProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class projectPageClass {
	
WebDriver driver;
	
	By username= By.id("user-name");	
	By password= By.id("password");	
	By loginbutton= By.id("login-button");
	
	By cart= By.xpath("//a[@class='shopping_cart_link']");
	By checkout= By.xpath("//button[contains(text(),'Checkout')]");
	By f_name= By.id("first-name");
	By l_name= By.id("last-name");
	By zip =By.id("postal-code");
	By contiue= By.id("continue");
	By finish =By.id("finish");
	By rem1= By.xpath("(//button[contains(text(),'Remove')])[1]");
	By rem2= By.xpath("(//button[contains(text(),'Remove')])[2]");
	By rem3= By.xpath("(//button[contains(text(),'Remove')])[3]");
	By rem4= By.xpath("(//button[contains(text(),'Remove')])[4]");

	
	public projectPageClass(WebDriver driver)
	{
		this.driver= driver;		
	}
	

	public void clickLoginBtn()
	{
		driver.findElement(loginbutton).click();
	}
	

	public void setvalues(String UN, String PWD)
	{
		driver.findElement(username).sendKeys(UN);
		driver.findElement(password).sendKeys(PWD);
	}

	
	public void addToCart()
	{
		List<WebElement> addtocart= driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/button"));
		for(WebElement d1: addtocart)
		{
			d1.click();

		}
	}
	
	public void checkout() throws InterruptedException
	{
		driver.findElement(cart).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Thread.sleep(3000);
		driver.findElement(checkout).click();
		Thread.sleep(3000);
		driver.findElement(f_name).sendKeys("Harsha");
		driver.findElement(l_name).sendKeys("Pradeep");
		driver.findElement(zip).sendKeys("123651");
		Thread.sleep(3000);
		driver.findElement(contiue).click();
		Thread.sleep(3000);
		driver.findElement(finish).click();
		Thread.sleep(3000);
		


}
}
