package testScript;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUpload extends Base
{
	@Test
 public void fileUploadUsingSendKeys()
 {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement choosefile = driver.findElement(By.id("file-upload"));
		choosefile.sendKeys("C:\\Users\\admin\\Downloads\\document-1.pdf");
		WebElement upload = driver.findElement(By.id("file-submit"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		upload.click();
	 
 }
	@Test
 public void fileUploadUsingRobotClass() throws AWTException
 {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadfile = driver.findElement(By.xpath("//span[text()=\"Select PDF file\"]"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.elementToBeClickable(uploadfile));
		uploadfile.click();
		StringSelection stringselection = new StringSelection("C:\\Users\\admin\\Downloads\\document-1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);//copy the file to clipboard bcz we cannot interact directly with file explorer
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_CONTROL);//VK-Virtual Key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
 }
}
