package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base
{
	
	public void relativeXPath()
	{
		//tag[@attribute='value']
		WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement entera = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement enterb = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement check1 = driver.findElement(By.xpath("//input[@class='form-check-input']"));
		WebElement check2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
	}
	public void text()
	{
		//tag[text()='message']
		WebElement showmsg = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement btn = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement age = driver.findElement(By.xpath("//label[text()='1 to 18']"));
		WebElement showvaluebtn = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		WebElement getresults = driver.findElement(By.xpath("//button[text()='Get Results']"));

		
		
	}
	public void contains()
	{
		 //tag[contains(@attribute,'value')]
		WebElement entrmsg = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement msga = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	}
	
	public void startsWith()
	{
		
		//tag[starts-with(@attribute,'value')]
		WebElement entrmsg = driver.findElement(By.xpath("//input[starts-with(@id,'single-in')]"));
		WebElement check = driver.findElement(By.xpath("//input[starts-with(@class,'form-check-input')]"));
		WebElement check1 = driver.findElement(By.xpath("//input[starts-with(@id,'check-box-one')]"));
		
	}
	public void and()
	{
		//tag[@attribute='value' and @attribute='value']
		WebElement entermsg = driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));
		WebElement entera = driver.findElement(By.xpath("//input[@class='form-control' and @id='value-a']"));
		WebElement datepckr = driver.findElement(By.xpath("//input[@class='form-control datepicker' and @type='text']"));
		
	}
	
	public void or()
	{
		//tag[@attribute='value' or @attribute='value']

	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
