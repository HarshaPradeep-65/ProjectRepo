package testPkgProject;

import org.testng.annotations.Test;

import basepkgProject.BaseClassProject;
import pagePkgProject.Page3;
import pagePkgProject.ProjectClassFacebook;
import pagePkgProject.projectPage2Class;
import pagePkgProject.projectPageClass;
import utiltiesProject.Excelutils;

public class ProjectTestClass extends BaseClassProject {
	
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		projectPageClass p1= new projectPageClass(driver);

	
	String xl="E:\\testData\\Credentials_1.xlsx";
	String Sheet="Sheet1";
	
	int rowCount= Excelutils.getRowCount(xl, Sheet);  
	
	for(int i=1;i<=rowCount;i++)
	{
		
		String UserName=Excelutils.getCellValue(xl,Sheet,i,0);
		String Pwd= Excelutils.getCellValue(xl,Sheet,i,1);
	
		p1.setvalues(UserName, Pwd);

		p1.clickLoginBtn();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
}
		p1.addToCart();
		Thread.sleep(3000);
		driver.navigate().refresh();
		p1.checkout();		
	}

	
	
	@Test
	public void faceBook() throws InterruptedException
	{
		driver.get("https://www.facebook.com");
		ProjectClassFacebook p2= new ProjectClassFacebook(driver);
		p2.fblogin();
		p2.dropdowncheck();
	}
	
}
