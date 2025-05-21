package testScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
	WebDriver driver;
	public void browserInitialize()
	{
		 driver = new ChromeDriver();
		//webdriver ...>interface provided by selenium
		//chromedriver...>class provided by selenium
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
	}
	public void driverClose()
	{
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) 
	{
		Base base = new Base();
		base.browserInitialize();

	}

}
