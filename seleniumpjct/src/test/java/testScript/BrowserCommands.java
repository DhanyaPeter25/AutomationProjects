package testScript;

public class BrowserCommands extends Base
{
	public void browserCommands()//to interact with browser
	{
		//driver.getTitle();  //to get the title of current web page
		//String title = driver.getTitle();
		//System.out.println("Title of web page is " +title);
		//String url =driver.getCurrentUrl();
		//System.out.println(url);
		String pagesource = driver.getPageSource();//to get the html code of web page
		System.out.println(pagesource);
	}

	public static void main(String[] args)
	{
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.browserInitialize();
		browsercommands.browserCommands();
		browsercommands.driverClose();

	}

}
