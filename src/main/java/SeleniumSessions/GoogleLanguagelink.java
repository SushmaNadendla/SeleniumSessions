package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguagelink {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List <WebElement> langlist=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langlist.size());
		
		for(WebElement e:langlist) {
			System.out.println(e.getText());
		}
		
	
//function :which will return the list of links text

//		public void langlinktext() {
			List <WebElement> langlinktext=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<langlinktext.size();i++) {
			String hrefval=langlinktext.get(i).getAttribute("href");
			System.out.println(hrefval);
	}
	
//function :which will return the static array of links
		}
}

