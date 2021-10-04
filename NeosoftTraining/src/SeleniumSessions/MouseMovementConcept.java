package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//used to disable notifications like block and allow

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");//to disable popup notifications
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.bewakoof.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("MEN"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Full Sleeve T-Shirts']")).click();
		
		driver.findElement(By.xpath("//img[@title=\"Men's Full Sleeve T-shirt Pack of 2(Black & Grey )-Front Bewakoof\"]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='M']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='ADD TO BAG']")).click();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@hreflang='en-us']//span//i[@class='icon_bag']")).click();
	}

}
