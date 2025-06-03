package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base

//findElements returns empty list
//but for findElement no elements found ....>no such element exception
{
	public void tablePrinting()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(element.getText());
		
	}
	public void row()
	{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	System.out.println(element.getText());
	}
	public void cell()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
		System.out.println(element.getText());
		
	}
	public void column()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> colm=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
		for(WebElement list:colm) 
		{
		System.out.println(list.getText());
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TableHandling table = new TableHandling();
		table.browserInitialize();
		//table.tablePrinting();
		//table.row();
		//table.cell();
		table.column();

	}

}
