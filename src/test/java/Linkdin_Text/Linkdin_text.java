package Linkdin_Text;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Calss_Linkdin.Base_Calss_Linkdin;
import Likdin_Classes.Pom1;
import Likdin_Classes.Pom2;
import Utility_Class_Linkdin.Utility_Claass_Linkdin;

public final class Linkdin_text extends Base_Calss_Linkdin {

	//Globally members
	Pom1 login1;
	Pom2 home;
	
	@BeforeClass
	public void openBrowser() {
		intializeBrowser();
		
		//Create object
		 login1=new Pom1(driver);
		 home =new Pom2(driver);
		
		}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		
		//enter un
		login1.enterUn(Utility_Claass_Linkdin.getTD(0,0));
		
		//enter passs
		login1.enterPWD(Utility_Claass_Linkdin.getTD(0, 2));
		
		//clic login
		login1.clickLogin();
		
		
	}
	@Test
	public void verifyusserID() throws Throwable {
		Reporter.log("Running VerifyuserID",true);
		String actID = home.verifyuserID();
		String exptID = Utility_Claass_Linkdin.getTD(1, 0);
		Assert.assertEquals(actID,exptID);
	}
	@AfterMethod
	public void logoutAPP() {
		Reporter.log("Logout Application",true);
	}
	@AfterClass
	public void CloseApp() {
		Reporter.log("Close Application",true);
	}
}
