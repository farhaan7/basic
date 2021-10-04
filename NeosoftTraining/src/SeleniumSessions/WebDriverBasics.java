package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverBasics
{

	public static void main(String[] args)
	
	{
		
		// 	1.firefox browser:gecko driver
		
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		 WebDriver farhaan = new FirefoxDriver();
		
		 farhaan.get("https://www.google.com");
		
		 farhaan.quit();
		
		
		// 2. chrome browser
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver farhaan1 = new ChromeDriver(); //launch chrome
		
		farhaan1.get("https://www.google.com");//enter url
		
		String title = farhaan1.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google")) //validation point
		{
			System.out.println("correct title");
		}
		
		else 
		{
			System.out.println("incorrect title");
		}
		
		System.out.println(farhaan.getCurrentUrl());
		
		// System.out.println(farhaan.getPageSource());
		
		farhaan1.quit();
		
	}
	

}
