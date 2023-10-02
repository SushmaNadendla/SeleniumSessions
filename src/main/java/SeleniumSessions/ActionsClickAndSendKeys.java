package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By email=By.id("input-email");
		By loginlink=By.linkText("Login");
		
		Actions action=new Actions(driver);
//		action.sendKeys(driver.findElement(firstname), "Sushma").perform();
//		action.sendKeys(driver.findElement(lastname), "Nadendla").perform();
//		action.click(driver.findElement(loginlink)).perform();
		doActionsSendKeys(firstname,"Sushma");
		doActionsSendKeys(lastname,"Nadendla");
		doActionsClick(loginlink);
	}public static void doActionsClick(By locator) {
		getElement(locator);
		Actions action=new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	public static void doActionsSendKeys(By locator,String value) {
		Actions action=new Actions(driver);
		action.sendKeys(getElement(locator),value).perform();
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
			}
	
}
