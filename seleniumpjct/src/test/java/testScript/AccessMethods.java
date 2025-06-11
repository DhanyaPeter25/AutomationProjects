package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethods extends Base
{

	public void parent()//weak parent & strong child attributes
	{
		WebElement element = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void child()
	{
		WebElement element = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	
	public void followingSibling()
	{
		WebElement element = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
	}
	
	public void following()
	{
		WebElement element = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));

	}
	public void  preceeding()
	{
		WebElement element = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class=\"header-top\"]"));
	}
	
	public void ancestor()
	{
		WebElement element = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='example my-3']"));
	}
	
	public void descendant()
	{
		WebElement element = driver.findElement(By.xpath("//div[@id=\"collapsibleNavbar\"]//descendant::li)[3]"));
	}
	
	public void indexing()
	{
		WebElement element = driver.findElement(By.xpath("//div[@id=\"collapsibleNavbar\"]//descendant::li)[3]"));
	}
	
	public static void main(String[] args)
	{
		

	}

}
