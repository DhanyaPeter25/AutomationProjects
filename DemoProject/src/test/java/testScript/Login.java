package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base
{
@Test
	public void loginPage()
	{
		String usr = "admin";
		String pwd = "admin";
		WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usrname.sendKeys(usr);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys(pwd);
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement dboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean display = dboard.isDisplayed();
		Assert.assertTrue(display, "Home page not loaded");
	}
//Assertion ....>>>String actualTitle = driver.getTitle(); String expectedTitle = "obsqurazone"; Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
@Test
public void InvalidUsername()
{
	String usr = "dhanya";
	String pwd = "admin";
	WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	usrname.sendKeys(usr);
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys(pwd);
	WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();
	WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean display = alert.isDisplayed();
	Assert.assertTrue(display, "Validation failed...Its Home page ");
	//WebElement dboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
	//Assert.assertTrue(display, "Home page not loaded");
}
@Test
public void InvalidPwd()
{
	String usr = "admin";
	String pwd = "Password";
	WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	usrname.sendKeys(usr);
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys(pwd);
	WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();
	WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean display = alert.isDisplayed();
	Assert.assertTrue(display, "Validation failed...Its Home page ");
}
@Test
public void invalidUsrPwd()
{
	String usr = "Dhanya";
	String pwd = "Password";
	WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	usrname.sendKeys(usr);
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys(pwd);
	WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
	signin.click();
	WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean display = alert.isDisplayed();
	Assert.assertTrue(display, "Validation failed...Its Home page ");
}

}
