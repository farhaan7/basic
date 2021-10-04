package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("English (UK)")).click(); //changing page language
		
		driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		
		driver.findElement(By.name("firstname")).sendKeys("farhaan");
		
		driver.findElement(By.name("lastname")).sendKeys("kapde");
		
		//driver.findElement(By.cssSelector("#u_3_d_iN")).sendKeys("kapde");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9689623427");
		
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("12345678");
		
		Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByValue("2");
		
		Select dropdown1 = new Select(driver.findElement(By.name("birthday_month")));
		dropdown1.selectByVisibleText("Apr");
		
	Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	dropdown2.selectByVisibleText("1995");
	
	//driver.findElement(By.xpath("//input[@id='u_2_3_yI']")).click();
	driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	
	driver.findElement(By.name("websubmit")).click();
	
	}
}