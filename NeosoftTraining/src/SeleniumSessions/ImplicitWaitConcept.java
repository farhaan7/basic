package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://www.ebay.com/"); //enter url
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete cookies
		
		//dynamic wait : if the webpage or elements are loaded before the time then it wont wait for the 
		//complete time
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//used to wait until all elements are displayed
		

	}

}
