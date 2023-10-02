package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		//1.id than use #id
		//driver.findElement(By.cssSelector("#input-email")).click();
		//2. class than use .class
		
		By loginpageElement=By.cssSelector("input#input-email,a[href*=forgotten],div#cart");
		List<WebElement> eleList=driver.findElements(loginpageElement);
		
		if(eleList.size()==4) {
			System.out.println("Login PAge has 4 mandatory feilds ");
		}
	}

}
