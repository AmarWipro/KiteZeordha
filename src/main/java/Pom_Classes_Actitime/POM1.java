package Pom_Classes_Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {

	//Declration
	@FindBy(xpath="//input[@id='username']")private WebElement Un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement Login;
	
	//Intialization
	public POM1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Implimentation
	public void enterUn(String username) {
		Un.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLogin() {
		Login.click();
	}
}
