package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fACEBOOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		email.sendKeys("vinay.ch@gmail.com");
		password.sendKeys("Vinay123");
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
	}

}
