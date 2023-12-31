package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
//		go to amAZON.IN
//		get the total images with image tag
//		print the src(url) prop for each link

		
	WebDriverManager.chromedriver().setup();

	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	List<WebElement> imgList=driver.findElements(By.tagName("img"));
	System.out.println("Total images:" 	+imgList.size());
	
	for(int i=0;i<imgList.size();i++) {
		String srcurl=imgList.get(i).getAttribute("src");
		String altval=imgList.get(i).getAttribute("alt");
		
		System.out.println(srcurl);
		System.out.println(altval);
	}
	
	}
}
