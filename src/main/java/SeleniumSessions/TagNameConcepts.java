package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcepts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
//		String header3 = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header3);
		
	
		List<WebElement> h3list=driver.findElements(By.tagName("h3"));
		System.out.println("size of h3 list is:" +h3list.size());
//		1. normal for loop
		for(int i=0;i<h3list.size();i++) {
			String list= h3list.get(i).getText();
			System.out.println(list);
		}
		System.out.println("-----------------");
//		2. for each loop
		for (WebElement e: h3list) {
			System.out.println(e.getText());
		}
	}

}
