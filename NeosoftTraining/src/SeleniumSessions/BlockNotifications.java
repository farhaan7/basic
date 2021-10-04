package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BlockNotifications {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//used to disable notifications like block and allow

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");//to disable popup notifications
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("English (UK)")).click();
		
		
		
		
		
		
		
		driver.findElement(By.name("email")).sendKeys("farhaankapade@yahoo.com");
		
		driver.findElement(By.name("pass")).sendKeys("");
		
		driver.findElement(By.name("login")).click();
	
		
	//	driver.findElement(By.name("global_typeahead")).sendKeys("search your friends name");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select select = new Select(driver.findElement(By.className("hu5pjgllop6gxeva")));
		
		select.selectByVisibleText("Settings & privacy");
	}
}