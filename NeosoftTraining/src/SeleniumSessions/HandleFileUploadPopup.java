package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//here an windows popup gets displayed which cannot be automated by selenium so we directly
		//give the xpath or id of the text box without passing click method,which can complete the task :)
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\user\\Desktop\\fk.html");
		
	}

}
