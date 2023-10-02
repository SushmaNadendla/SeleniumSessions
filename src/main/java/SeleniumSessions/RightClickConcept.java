package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver =new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightclick=By.xpath("//span[text()='right click me']");
		By rightclickoptions=By.xpath("//ul/li[contains(@class,'context-menu-icon')]");
		//WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		List<String> optionsList=getRightClickMenuList(rightclick,rightclickoptions);
		System.out.println("Count is: "+optionsList.size());
		System.out.println(optionsList);
		RightClickOption(rightclick,rightclickoptions,"Paste");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List <String>  getRightClickMenuList(By rightClickLocator,By listlocator) {
		Actions act=new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		List <String> rightClickList=new ArrayList<String>();
		List <WebElement> menulist=driver.findElements(listlocator);
		System.out.println(menulist.size());
		
		for (WebElement e:menulist) {
			String text=e.getText();
			rightClickList.add(text);
		}
		return rightClickList;
	}
	public static void RightClickOption(By rightClickLocator,By listlocator,String value) {
		Actions act=new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		List <WebElement> menulist=driver.findElements(listlocator);
		System.out.println(menulist.size());
		
		for (WebElement e:menulist) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}
}