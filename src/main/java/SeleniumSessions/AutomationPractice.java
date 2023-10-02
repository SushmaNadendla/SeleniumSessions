package SeleniumSessions;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		By search=By.name("q");
		By Suggestionlist=By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");
		driver.findElement(search).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		List <WebElement> resultlist=driver.findElements(Suggestionlist);
		
		System.out.println(resultlist.size());

	}

}
