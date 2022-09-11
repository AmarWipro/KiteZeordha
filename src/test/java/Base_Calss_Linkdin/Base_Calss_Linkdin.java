package Base_Calss_Linkdin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Calss_Linkdin {

	
	public WebDriver driver;
	public void intializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/sign.in");
		
		//maximize page
		driver.manage().window().maximize();
		
		//implicitly waait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
