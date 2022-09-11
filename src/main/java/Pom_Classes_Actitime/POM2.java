package Pom_Classes_Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {

	//Declaration
	@FindBy(xpath="//a[@class='userProfileLink username ']")private WebElement userID;
	
	//Intializtion
	public POM2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Implimentation
	public String verifyuserID() {
		String actID = userID.getText();
		return actID;
	}
}
