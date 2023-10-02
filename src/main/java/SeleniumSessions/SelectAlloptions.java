package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAlloptions {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://sushmanadendla-trials77.orangehrmlive.com/client/#/pim/employees/13/personal_details");

	}
	//function that takes the By locator and returns the list of text of each option in the list:
	//option in the list:
	public static List<String> getOptionsTextList(By locator) {
		List<String> optionsTextList=new ArrayList<>();
		Select select=new Select(driver.findElement(locator));
		List<WebElement> options_list=select.getOptions();
		
		for(WebElement e:options_list ) {
			String text=e.getText();
			System.out.println(text);
			
			 optionsTextList.add(text);
			}
		return optionsTextList;
	}

}
