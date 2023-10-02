package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//get element (by using locators)+ action(Send keys,click,get text)
		//1.id :
//		driver.findElement(By.id("email")).sendKeys("sushma.nadendla@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("sushma123");
		//	2.	
		//WebElement domain=driver.findElement(By.id("email"));
		//domain.sendKeys("sushma.nadendla@gmail.com");
		//domain.sendKeys("sushma123");
		
		//3.By locators: 
		
		By domain= By.id("email");
		By password=By.id("pass");
		
//		driver.findElement(domain).sendKeys("sushma.nadendla@gmail.com");
//		driver.findElement(password).sendKeys("sushma123");
		
		//4.
//		WebElement username=driver.findElement(domain);
//		WebElement password1=driver.findElement(password);
//	
//		username.sendKeys("sushma.nadendla@gmail.com");
//		username.sendKeys("sushma123");
//		5. using functions for getElement	
//		getElement(domain).sendKeys("sushma.nadendla@gmail.com");
//		getElement(password).sendKeys("Pass");
//	6.  using functions for both getElement and send keys
		
		dosendkeys(domain,"sushma.nadendla@gmail.com");
		dosendkeys(password,"Password123");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
			}
	
	public static void dosendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
