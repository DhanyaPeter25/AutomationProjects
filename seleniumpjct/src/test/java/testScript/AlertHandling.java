package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{

	//alert is not an html element. so we cant interact alert directly...3 types
	//simple....msg and a single button only
	
	//confirmation.....msg with ok and cancel btn
		//prompt....confirmation with a user propmt
	public void simple()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		button1.click();
		driver.switchTo().alert().accept();//to click ok...
	}
	public void confirmation()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		button2.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void prompt()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		button3.click();
		driver.switchTo().alert().sendKeys("Its a trial");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) 
	{
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.browserInitialize();
		//alerthandling.simple();
		//alerthandling.confirmation();
		alerthandling.prompt();
		

	}

}
