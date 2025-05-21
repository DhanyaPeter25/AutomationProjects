package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends Base
{
	//Action class is used to perform advanced user interactions like drag nd drop,click,double click etc
	//right click....>contextClick()
	//mousehover....>moveToElement()
	//drag and drop....>dragAndDrop()
	public void actionMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		//actions.dragAndDrop(drag1, drop).build().perform();
		//actions.contextClick(drag1).build().perform();
		//actions.moveToElement(drag1).build().perform();
		//actions.doubleClick(drag1).build().perform();
		actions.click(drag1).build().perform();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Action action = new Action();
		action.browserInitialize();
		action.actionMethod();

	}

}
