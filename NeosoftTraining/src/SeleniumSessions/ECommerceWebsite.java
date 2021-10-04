package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ECommerceWebsite 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all cookies
		
		
		// Go to : https://www.hopscotch.in/
		driver.get("https://www.hopscotch.in/");
		
		//Click Discover tab 
		driver.findElement(By.linkText("Discover")).click();
		
		// Select for category Boy
		driver.findElement(By.xpath("//span[normalize-space()='Boy']")).click();//select gender
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		// Select Age
		driver.findElement(By.xpath("//div[@class='sort-scroll'][1]//div[text()='6+ years']")).click();//select age
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		
		//Click Search icon >> Enter track
		driver.findElement(By.xpath("(//a[contains(@class,'search')])[4]")).click();//clicking on search icon
		driver.findElement(By.xpath("(//input[contains(@id,'search')])[2]")).sendKeys("trackpants");//enter value
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Use Auto suggestive method to click on trackpants option
		driver.findElement(By.xpath("(//a[@class=\"hs-suggest margin-0px-p-tag ng-binding\"])[1]")).click();//select option
		
		// Click on Lowest price sorting
		driver.findElement(By.xpath("//*[@id=\"plp-container\"]/div/section/sort-by/div/span/span[3]/span[1]")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Select any one Filter radio button ( Shop For : Girls/ Boys)
		driver.findElement(By.xpath("//div[@class=\"ng-filters-v2-wrapper\"]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Print the 3rd product name and click on it (Open product description page )
		driver.findElement(By.xpath("//*[@id=\"995400\"]/a/div/div[1]/div[1]/img")).click();
		
		// Select size
		driver.findElement(By.xpath("//*[@id=\"995400\"]/div[2]/div/quick-shop/div[3]/div/div[1]/span")).click();
		
		//add to cart
		driver.findElement(By.xpath("//*[@id=\"995400\"]/div[2]/div/quick-shop/button/div")).click();
		
		//click on cart
		driver.findElement(By.xpath("//span[@ng-click='vm.showCartIfLoggedInForSmall()']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();//get title
		String title1 = driver.getCurrentUrl();//get url
		System.out.println(title);
		System.out.println(title1);
		
		driver.quit();
	}

}
