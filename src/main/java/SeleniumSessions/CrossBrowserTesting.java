package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		String Browser="Firefox";
		WebDriver driver=null;
		
		if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		else if (Browser.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Firefox.exe");
		    driver=new FirefoxDriver();
		}
		else if (Browser.equals("Safari")) {
		    driver=new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct Broser :" + Browser);
		}

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
