package testPkgProject;

import org.testng.annotations.Test;

import basepkgProject.Baseclass_2;
import pagePkgProject.Page3;
import pagePkgProject.projectPage2Class;

public class TestPkg2 extends Baseclass_2{

	@Test
	public void sauceDemo() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		projectPage2Class p1= new projectPage2Class(driver);
		p1.Action1();
	}
	
	@Test
	public void faceBook() throws InterruptedException
	{
		driver.get("https://www.facebook.com");
		Page3 p2= new Page3(driver);
		p2.Action2();
		driver.close();
	}
}
