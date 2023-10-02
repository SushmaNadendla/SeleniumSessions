package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDragConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement srcele=driver.findElement(By.id("draggable"));
		WebElement targetele=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		
		Actions Act=new Actions(driver);//Actions class
		Act.clickAndHold(srcele).moveToElement(targetele).release().build().perform();
//		Act.dragAndDrop(srcele, targetele).perform();
		//Three actions than need to use .build and .perform need to use both
		
		
	}

}
