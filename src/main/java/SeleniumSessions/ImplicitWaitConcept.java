package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// Two types of wait
		//1.Static Wait: Thread.Sleep(2000);
		//2.Dynamic Wait 
		//  a.ImplicitWait
		//  b.ExplicitWait
		      //b.1 . Webdriver Wait
		 	  //b.2 . Fluent Wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/login.cfm#intro");
		By username=By.name("username");
		By password=By.name("password");
		By login=By.xpath("//input[@value='Login']");
		
		WebElement Username= driver.findElement(username);
		Username.sendKeys("Sushma.nadendla");
		WebElement Password= driver.findElement(password);
		Password.sendKeys("Sushma123");
		WebElement Login= driver.findElement(login);
		Login.click();
		
		//homepage
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//deals page
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//reg page

	}

}
