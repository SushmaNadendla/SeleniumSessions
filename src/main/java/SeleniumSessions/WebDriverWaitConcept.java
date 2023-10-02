package SeleniumSessions;

import java.time.Clock;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	private static long DEFAULT_SLEEP_TIMEOUT;
	
	public static void main(String[] args) {
		//Explicit wait: WebDriver wait extends Fluent wait cl
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		System.out.println(driver.getTitle());
		//WebDriverWait wait= new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.titleContains("My Shop"));
	}
	  public WebDriverWaitConcept(WebDriver driver, Duration timeout) {
		    this(
		        driver,
		        timeout,
		        Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT),
		        Clock.systemDefaultZone(),
		        Sleeper.SYSTEM_SLEEPER);
		  }

	public WebDriverWaitConcept(WebDriver driver2, Duration timeout, Duration ofMillis, Clock systemDefaultZone,
			Sleeper systemSleeper) {
		// TODO Auto-generated constructor stub
	}
	public static String waitForPageTitle(String title,Duration timeout) {
		//WebDriverWait wait= new WebDriverWait(driver,timeout);
	//	wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
}
