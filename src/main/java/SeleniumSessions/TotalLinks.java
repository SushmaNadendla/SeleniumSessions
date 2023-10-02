package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
//		go to amAZON.IN
//		get the total links 
//		print the text of each link but ignore the blank text
//		print the href(url) prop for each link
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://amazon.in/");
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println("total links:" +linkslist.size());
		
//		for(WebElement e:linkslist ) {
//			String linktext=e.getText();
//			System.out.println(linktext);
//		}
		
		for(int i=0;i<linkslist.size();i++) {
			String linktext=linkslist.get(i).getText();
			
			if(!linktext.isEmpty()) {
				System.out.println(i+ ":-->" +linktext);
				String hrefval=linkslist.get(i).getAttribute("href");
				System.out.println(hrefval);
			}
		}
	}

}
