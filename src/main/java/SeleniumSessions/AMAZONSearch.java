package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AMAZONSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement Input=driver.findElement(By.id("twotabsearchtextbox"));
		Input.sendKeys("Iphone 14");
	}

}
