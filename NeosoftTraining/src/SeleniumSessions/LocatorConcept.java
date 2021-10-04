package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dogecoin = new ChromeDriver();
		
		//1.By xpath : dont use heirarchy based xpath because it changes
		//2nd priority
		//absoulte xpath should not be used :eg./html[1]/body[1]/div[1]/div[1]/div[2]
		//only relative xpath should be used :eg. //input[@id='firstName']
		
		dogecoin.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		//dogecoin.findElement(By.xpath("//input[@id='firstName']")).sendKeys("farhaan");
		//dogecoin.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kapde");
		//dogecoin.findElement(By.xpath("//input[@id='username']")).sendKeys("farkaanup");
		
		//2.By id : first priority
		//dogecoin.findElement(By.id("firstName")).sendKeys("Tom");
		//dogecoin.findElement(By.id("lastName")).sendKeys("Jerry");
		
		//3.By name : 3rd prio
		
		//dogecoin.findElement(By.name("firstName")).sendKeys("rida");
		//dogecoin.findElement(By.name("lastName")).sendKeys("kapde");
		
		//4.By linktext : this is only for links
		
		//dogecoin.findElement(By.linkText("Sign in instead")).click();
		
		//5.partial link text : not useful
		
		//dogecoin.findElement(By.partialLinkText("Sign")).click();
		
		//6.Css selector 2nd priority
		//if id is there---#id
		//if class is there--- .{classname}
		
		dogecoin.findElement(By.cssSelector("#firstName")).sendKeys("elon");
		
		//7.By class name :not useful 4th priority
		//dogecoin.findElement(By.className("whsOnd zHQkBf")).sendKeys("farrhaaan");
		
	}


}
