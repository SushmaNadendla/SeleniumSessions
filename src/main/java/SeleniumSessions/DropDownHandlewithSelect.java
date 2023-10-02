package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlewithSelect {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		
//		WebElement Industry=driver.findElement(By.id("Form_getForm_Country"));
		
//		Select select= new Select(Industry);
	
//		select.selectByIndex(5);
//		select.selectByVisibleText("Maldives");
//		select.selectByValue("Malaysia");
	
		By Country=By.id("Form_getForm_Country");
		doselectFromDropDownVisibleText(Country,"India");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doselectFromDropDownVisibleText(By locator,String value) {
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public void doselectFromDropDownIndex(By locator,int value) {
		Select select= new Select(getElement(locator));
		select.selectByIndex(value);;
	}

	public void doselectFromDropDownByvalue(By locator,String value) {
		Select select= new Select(getElement(locator));
		select.selectByValue(value);
	}
}
