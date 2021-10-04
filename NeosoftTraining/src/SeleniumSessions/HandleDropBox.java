package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandleDropBox {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dogecoin = new ChromeDriver();
		dogecoin.get("https://www.facebook.com/");
		dogecoin.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		
		dogecoin.manage().window().maximize();
		//handle drop box :
		Select select1 = new Select(dogecoin.findElement(By.id("month")));//not working
		select1.selectByIndex(1);
		
		
	}

}
