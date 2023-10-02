package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List <WebElement> footerlist=driver.findElements(By.xpath("//ul[@class='sc-ace17a57-0 sc-4ae80653-0 kTjuIu eQNriT']/li/a"));
		System.out.println(footerlist.size());
		for(WebElement e:footerlist) {
			System.out.println(e.getText());
			String hrefval=e.getAttribute("href");
			System.out.println(hrefval);
		}
	}

}
