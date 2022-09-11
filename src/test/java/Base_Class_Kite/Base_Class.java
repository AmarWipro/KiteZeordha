package Base_Class_Kite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public WebDriver driver;
	public void intializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		
		//maximize page
		driver.manage().window().maximize();
		
		//implcitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
