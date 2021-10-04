package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxlaunch {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		 WebDriver farhaan = new FirefoxDriver();
		
		 farhaan.get("https://www.google.com");
			String title = farhaan.getTitle();
			
			System.out.println(title);
			
			if(title.equals("Google")) //validation point
			{
				System.out.println("correct title");
			}
			
			else 
			{
				System.out.println("incorrect title");
			}
			
			System.out.println(farhaan.getCurrentUrl());
		
		 farhaan.close();
	}

}
