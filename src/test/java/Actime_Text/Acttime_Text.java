package Actime_Text;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class_Actitime.Base_Class_Actime;
import Pom_Classes_Actitime.POM1;
import Pom_Classes_Actitime.POM2;
import Utility_Class_Actitime.Utility_Class_Actime;

public class Acttime_Text extends Base_Class_Actime {

	//globaly add members
	POM1 login1;
	POM2 home;
	
	@BeforeClass
	public void openBrowser() {
		intializeBrowser();
		
		//create object
		 login1=new POM1(driver);
		 home=new POM2(driver);
		
		
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		
		//enter username
		login1.enterUn(Utility_Class_Actime.getTD(0, 0));
		
		//enter password
		login1.enterPWD(Utility_Class_Actime.getTD(1, 0));
		
		//click
		login1.clickLogin();
	}
	@Test
	public void verifyuserID() throws Throwable {
		String actID = home.verifyuserID();
		String exptID = Utility_Class_Actime.getTD(0,1);
		Assert.assertEquals(actID,exptID);
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout application",true);
	}
	@AfterClass
	public void closeApp() {
		Reporter.log("Close the Application",true);
	}
}
