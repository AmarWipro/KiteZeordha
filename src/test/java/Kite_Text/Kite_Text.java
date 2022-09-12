package Kite_Text;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class_Kite.Base_Class;
import Pom_Classes_Kite.Pom1;
import Pom_Classes_Kite.Pom2;
import Pom_Classes_Kite.Pom3;
import Utility_Class_Kite.Utility_Class_Kite;

public class Kite_Text extends Base_Class{

	
	//members globally
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	
	
	@BeforeClass
	public void openBrowser() {
		intializeBrowser();
		
		//create object
		 login1=new Pom1(driver);
		 login2=new Pom2(driver);
		 home=new Pom3(driver);
		
	}
	@BeforeMethod
	public void loginApp() throws Throwable {
		
		
		//enter un
		login1.enterUN(Utility_Class_Kite.getTD(0, 0));
		
		//enter pass
		login1.enterPWD(Utility_Class_Kite.getTD(1, 0));
		
		//clicl login
		login1.clickLogin();
		
		//enterpin
		login2.enterPIN(Utility_Class_Kite.getTD(0, 2));
		
		//click continue
		login2.clickCntBtn();
		
	}
	@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("Running verifyuserID",true);
		
		String actID = home.verifyuserID();
		String exptID = (Utility_Class_Kite.getTD(0,0));
				
		Assert.assertEquals(actID,exptID);
				
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("Logout Application",true);
	}
	@AfterClass
	public void CloseApp() {
		Reporter.log("Close Application",true);
		System.out.println(CloseApp);
	}
	
	
	
}
