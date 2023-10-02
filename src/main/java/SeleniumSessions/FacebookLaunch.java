package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println("Page title is :" +title);
		
		
		if(title.equals("Facebook")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		driver.close();
		System.out.println(driver.getTitle());
	
	
	}

}
