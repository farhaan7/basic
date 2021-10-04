package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		clickOn(driver,driver.findElement(By.xpath("")),20);//enter the element for which xpath is given
		clickOn(driver,driver.findElement(By.xpath("")),10);////enter the element for which xpath is given	
	}
	
	
	public static void clickOn(WebDriver driver,WebElement locator, int timeout)
	{
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
