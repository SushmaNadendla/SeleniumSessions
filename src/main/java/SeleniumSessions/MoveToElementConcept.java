package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("http://mrbool.com/search/");
		Thread.sleep(3000);
		WebElement Content=driver.findElement(By.className("menulink"));
		
		Actions Act=new Actions(driver);
		
		Act.moveToElement(Content).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
//		Thread.sleep(3000);
//		Act.moveToElement(Content).perform();
//		driver.findElement(By.linkText("ARTICLES")).click();
	}

	

}
