package Likdin_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {

	
	//Declration
	@FindBy(xpath="//input[@id='username']")private WebElement userID;
	
	
	
	//Intialization
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Implimenatation
	public String verifyuserID() {
		String actID = userID.getText();
		return actID;
	}
}
