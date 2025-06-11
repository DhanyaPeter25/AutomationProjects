package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	WebDriver driver;
	@BeforeMethod
	public void browserInitialize()
	{
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	//@AfterMethod
	public void closeMethods()
	{
		driver.close();
	}
}
