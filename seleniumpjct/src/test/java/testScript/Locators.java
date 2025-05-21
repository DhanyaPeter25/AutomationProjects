package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{

	public void id()//method to illustrate locator id
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//WebElement elementname = driver.findElement(By.locator("locatorvalue")); Syx
		
		WebElement element = driver.findElement(By.id("single-input-field"));
		element.sendKeys("Test");
		WebElement btnname = driver.findElement(By.id("button-one"));
		btnname.click();
		
	}
	public void className()//method to illustrate locator classname
	{
		WebElement enterdate = driver.findElement(By.className("form-control datepicker"));
		WebElement conscentcheck = driver.findElement(By.className("form-check-input"));
		WebElement tablesort = driver.findElement(By.className("form-control form-control-sm"));//table..>Table Sort And Search Demo
		WebElement tablefiltersearch = driver.findElement(By.className("placeholder"));
		
	}
	
	public void name()//method to illustrate locator name
	
	{
		WebElement daterange = driver.findElement(By.name("daterange"));
		
		
		
				
	}
	public void linkText()
	{
		WebElement radiobutton = driver.findElement(By.partialLinkText("Radio Buttons Demo"));
		WebElement bootstrap = driver.findElement(By.partialLinkText("Bootstrap List Box"));
		WebElement dynamicdata = driver.findElement(By.partialLinkText("Dynamic Data Loading"));
		WebElement windowpop= driver.findElement(By.partialLinkText("Window Popup"));
		WebElement rangeslider = driver.findElement(By.partialLinkText("Range Sliders"));
		
	}
	public void partialLinkText()
	{
		WebElement partial = driver.findElement(By.partialLinkText("Radio Button"));
		WebElement simpleform = driver.findElement(By.partialLinkText("Demo"));
		WebElement formsubmit = driver.findElement(By.partialLinkText("Form Submit"));
		WebElement autoclosable = driver.findElement(By.partialLinkText("Autoclosable"));
		WebElement listboxmenu = driver.findElement(By.partialLinkText("List Box"));
	}
	public static void main(String[] args)
	{
		Locators locators = new Locators();
		locators.browserInitialize();
		locators.id();

	}

}
