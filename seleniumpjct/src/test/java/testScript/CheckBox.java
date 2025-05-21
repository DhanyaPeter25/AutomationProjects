package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base
{
	public void checkBoxTest()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		checkbox.click();
		
	}

	public static void main(String[] args) 
	{
		CheckBox checkbox = new CheckBox();
		checkbox.browserInitialize();
		checkbox.checkBoxTest();
		

	}

}
