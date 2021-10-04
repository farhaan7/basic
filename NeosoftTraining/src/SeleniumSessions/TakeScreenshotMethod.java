package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotMethod {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		//Take screenshot and store as a file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to the desiredfile location using copyfile method
		
		//FileUtils.copyFile(src, new File("C:\\Users\\user\\eclipse-workspace\\NeosoftTraining\\src\\SeleniumSessions\\fb.png"));
	}

}
