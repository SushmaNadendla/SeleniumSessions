package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Page title is :" +title);
		
		//driver.quit();
		driver.close();
		System.out.println(driver.getTitle());

	}

}
