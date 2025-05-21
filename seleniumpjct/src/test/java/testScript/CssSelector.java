package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base
{
	//1.Tag and ID(tag#id)
			//2.Tag and class(tag.class)
			//3.Tag and Attribute(tag[attribute=value]  .........>tag with any attribute value
			//4.Tag,class,and Attribute(tag.classname[attribute=value]
	public void tagAndId()
	{
		WebElement entermsg = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement showmsg = driver.findElement(By.cssSelector("button#button-one"));
		WebElement valuea = driver.findElement(By.cssSelector("input#value-a"));
		WebElement  checkbox = driver.findElement(By.cssSelector("input#gridCheck"));
		WebElement check1 = driver.findElement(By.cssSelector("input#check-box-one"));
		
	}
	public void tagAndClass()
	{
	WebElement check = driver.findElement(By.cssSelector("input.form-check-input"));
	WebElement validationcheck = driver.findElement(By.cssSelector("input.form-check-input"));
	WebElement dtpick = driver.findElement(By.cssSelector("span.input-group-text"));
	WebElement desc = driver.findElement(By.cssSelector("textarea.form-control"));
	}
	public void tagAndAttribute()
	{
	WebElement shwmsg = driver.findElement(By.cssSelector("button[id='button-one']"));
	WebElement singlecheck = driver.findElement(By.cssSelector("input[class='form-check-input']"));
	WebElement entermsg = driver.findElement(By.cssSelector("input[id='single-input-field']"));
	WebElement entermsga = driver.findElement(By.cssSelector("input[id='value-a']"));
	WebElement entermsgb = driver.findElement(By.cssSelector("input[id='value-b']"));
	}

	public void tagClassAndAttribute()
	{
	WebElement entrmsg = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
	WebElement entera = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	WebElement enterb = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	WebElement singleinput = driver.findElement(By.cssSelector("select.form-control[id='single-input-field']"));
	WebElement check = driver.findElement(By.cssSelector("input.check-box-list[id='check-box-one']"));
	WebElement check2 = driver.findElement(By.cssSelector("input.check-box-list[id='check-box-two']"));
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
