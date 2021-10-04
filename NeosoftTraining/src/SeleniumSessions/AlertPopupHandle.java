package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?mobilelogin=1");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(7000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		
		else
		{
			System.out.println("incorrect alert message");
		}
		alert.accept(); //click on  ok button
		//alert.dismiss();//click on cancel button
		Thread.sleep(2000);
		driver.quit();
	}
}
