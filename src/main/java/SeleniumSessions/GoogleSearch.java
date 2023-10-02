package SeleniumSessions;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		By search=By.name("q");
		By Suggestionlist=By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");
		
		driver.findElement(search).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		
		selectFromSuggestList(Suggestionlist,"naveen automation labs cucumber");
	}
	
	public static void selectFromSuggestList(By Suggestionlist,String value){
		List <WebElement> resultlist=driver.findElements(Suggestionlist);
		
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
	}


