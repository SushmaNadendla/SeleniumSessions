package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	WebDriver driver;
	public WebDriver init_driver(String browsername) {
		System.out.println("browser name is :" + browsername);
	
	if (browsername.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (browsername.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("Safari")) {
		
		driver=new SafariDriver();
	}
	
	
	else {
		System.out.println("please pass the correct browser name " +browsername);
	}
	
	return driver;
	}

	public void launchurl(String url) {
		driver.get(url);
	}
	public String doGetPagetitle() {
		return driver.getTitle();
	}
	public String doGetPageurl() {
		return driver.getCurrentUrl();
	}
	public void CloseBrowser() {
		 driver.close();;
	}
	public void QuitBrowser() {
		 driver.quit();;
	}
}
