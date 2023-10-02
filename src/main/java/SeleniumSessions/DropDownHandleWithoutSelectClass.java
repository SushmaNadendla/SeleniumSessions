package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
	
		By email=By.name("Email");
		By tryit=By.id("Form_getForm_action_submitForm");
//		Country=driver.findElement(By.xpath("")));
		By industryoption=By.xpath("//select[@id='Form_getForm_action_submitForm']/option");
	
	}
	public static void selecDropdownvalue(By locator,String value){
		List <WebElement> optionlist=driver.findElements(locator);
		
		System.out.println(optionlist.size());	
		for (WebElement e: optionlist) {
			
			String text=e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
