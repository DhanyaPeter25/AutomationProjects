package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base
{
	public void addition()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valuea = driver.findElement(By.id("value-a"));
		valuea.sendKeys("15");
		WebElement valueb = driver.findElement(By.id("value-b"));
		valueb.sendKeys("15");
		WebElement btnTotal = driver.findElement(By.id("button-two"));
		btnTotal.click();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestSample testsample = new TestSample();
		testsample.browserInitialize();
		testsample.addition();
	}

}
