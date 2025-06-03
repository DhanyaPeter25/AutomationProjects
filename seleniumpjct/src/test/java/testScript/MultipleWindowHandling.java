package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base

//getWindowHandle()...>handles main window/parent only
//getWindowHandles()...>returns all the handles/id's of all open windows/tabs
{
	public void multipleWindowHandle()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact = driver.findElement(By.xpath("//h1[text()=\"CONTACT US\"]"));
		contact.click();
		WebElement login = driver.findElement(By.xpath("//h1[text()=\"LOGIN PORTAL\"]"));
		login.click();
		String parenthandle =driver.getWindowHandle();
		System.out.println(parenthandle);                     //output ...>parent windows handle id
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		Set<String> childhandle = driver.getWindowHandles();
		for(String set:childhandle)
		{
			System.out.println(" Handle "+set);
			driver.switchTo().window(set);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("* * * * * * * * * * * * * * * * * * * *");
		}
		
		
	}

	public static void main(String[] args) 
	{
		
		MultipleWindowHandling mwhandle = new MultipleWindowHandling();
		mwhandle.browserInitialize();
		mwhandle.multipleWindowHandle();

	}

}
