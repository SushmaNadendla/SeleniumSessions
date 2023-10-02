package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.freshworks.com/");
//		1. id: is always unique
//		2. name: is not unique 
//		3. classname: is not unique 
//		4. linktext: only for links
		driver.findElement(By.linkText("Support")).click();
//		5. partial link text:only for links for long link texts
		driver.findElement(By.partialLinkText("Supp")).click();
//		6. xpath: is not an attribute but is a locator,address of the element inside DOM
//	    inspect>right click >Copy  xpath
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
//		7.css selector: is not an attribute but is a locator
//		Cypress only support css selector locators 
		driver.findElement(By.cssSelector("#input-firstname"));
//		8. tag name
		String h2=driver.findElement(By.tagName("h2")).getText();
		System.out.println(h2);
	
	}

}
