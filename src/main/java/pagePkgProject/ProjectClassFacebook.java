package pagePkgProject;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basepkgProject.BaseClassProject;

public class ProjectClassFacebook extends BaseClassProject{
	
	WebDriver driver;

	By createAccnt= By.xpath("//*[contains(text(),'Create new account')]");
	
	By day= By.id("day");
	By month= By.id("month");
	By year= By.id("year");
	By gender= By.xpath("//label[contains(text(),'Female')]");
	
	public ProjectClassFacebook(WebDriver driver)
	{
		this.driver= driver;		
	}
	
	public void fblogin() throws InterruptedException
	{
		List<WebElement> li= driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+li.size());

		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
		Thread.sleep(20000);
		driver.findElement(createAccnt).click();
		
		Thread.sleep(3000);
		
	}

	public void verify(String link)
	{
		try
		{
		URI ob= new URI(link);
		HttpURLConnection con= (HttpURLConnection)ob.toURL().openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("Success response code is 200-----"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Broken link response code is 404-----"+link);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	
	
	
	public void dropdowncheck()
	{
		WebElement day= driver.findElement(By.id("day"));
		Select ob=new Select(day);
		ob.selectByValue("02");
		
		WebElement Month= driver.findElement(By.id("month"));
		Select ob1= new Select(Month);
		ob1.selectByValue("FEB");
		
		WebElement year= driver.findElement(By.id("year"));
		Select ob2= new Select(year);
		ob2.selectByValue("2010");
		
		driver.findElement(gender).click();
		
		
	}
}
