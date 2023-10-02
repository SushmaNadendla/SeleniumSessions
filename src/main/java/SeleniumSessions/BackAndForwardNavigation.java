package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackAndForwardNavigation {

	public static void main(String[] args) {
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
	}

}
