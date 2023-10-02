package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private static WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
			}
	
	public static  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
			}
	public  void dosendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	public  void doActionsClick(By locator) {
		getElement(locator);
		Actions action=new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	public void doActionsSendKeys(By locator,String value) {
		Actions action=new Actions(driver);
		action.sendKeys(getElement(locator),value).perform();
		
	}
	
//	*********************Drop Down utils ******************
	public  void doselectFromDropDownVisibleText(By locator,String value) {
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
	
	public  void selecDropdownvalue(By locator,String value){
		List <WebElement> optionlist=getElements( locator);
		
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


	public void selectFromSuggestList(By Suggestionlist,String value){
		List <WebElement> resultlist=getElements(Suggestionlist);
		
		System.out.println(resultlist.size());	
		for (WebElement e: resultlist) {
			
			String text=e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
//********************Action utils**********************************


	public List <String>  getRightClickMenuList(By rightClickLocator,By listlocator) {
		Actions act=new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		List <String> rightClickList=new ArrayList<String>();
		List <WebElement> menulist=getElements(listlocator);
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
		List <WebElement> menulist=getElements(listlocator);
		System.out.println(menulist.size());
		
		for (WebElement e:menulist) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	
	//*********************Wait Utils***********************************
	
	public static String waitForPageTitle(String title,Duration timeout) {
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public static String waitForPageTitleToBe(String title,Duration timeout) {
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	public static String waitForPageURL(String Urlvalue,Duration timeout) {
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.urlContains(Urlvalue));
		return driver.getCurrentUrl();
	}
}
