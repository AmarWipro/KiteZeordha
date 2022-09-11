package Likdin_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	
	//Declaration
	@FindBy(xpath="//input[@id='username']")private WebElement Un;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Sign in']")private WebElement Login;
	
	//Intialization
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Implimenataion
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
