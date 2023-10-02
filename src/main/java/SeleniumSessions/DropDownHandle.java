package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Country=By.id("Form_getForm_Country");

//		Select select1=new Select(driver.findElement(Country));
//		select1.selectByVisibleText("India");
		
		doSelectByVisibleText(Country,"Germany");
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByVisibleText(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
}
