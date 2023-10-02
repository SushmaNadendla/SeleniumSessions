package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		By countryoption=By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> countrylist=driver.findElements(countryoption);
		System.out.println(countrylist.size());
		long  StartTime=System.currentTimeMillis();
		//1.Sequential Stream:// Time taken in milli seconds -3531
		countrylist.stream().forEach(ele -> System.out.println(ele.getText()));
		
		//2.Parallel Stream: // Time taken in milli seconds -4922
		//countrylist.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		long EndTime=System.currentTimeMillis();
		System.out.println("total time taken: " +(EndTime-StartTime));
	
	}

}
