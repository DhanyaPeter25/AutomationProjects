package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptE extends Base
{
	@Test
public void javaScriptExecutor()
{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		js.executeScript("arguments[0].value='hey';", entermsg);  // Syx ...> js.executeScript("arguments[0].value='value';", element);
		//entermsg.sendKeys("hey");
		WebElement showmsg = driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();", showmsg);
		//showmsg.click();
}
	@Test
	public void scroll()
	{
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,150)","");//.....>  0 x axis, 150 y axis
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
}
