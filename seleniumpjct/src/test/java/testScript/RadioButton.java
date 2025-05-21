package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base
{

	public void radiobuttonTest()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiomale = driver.findElement(By.xpath("//input[@name='inlineRadioOptions' and @value='Male']"));
		radiomale.click();
		WebElement show = driver.findElement(By.id("button-one"));
		show.click();
		
	}
	public static void main(String[] args)
	{
		RadioButton radio = new RadioButton();
		radio.browserInitialize();
		radio.radiobuttonTest();

	}

}
