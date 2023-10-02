package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinksFiltersWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		System.out.println(linksList);
//		List<String> linkAmazonList= linksList.stream()
//				.filter(ele ->!ele.getText().isEmpty())
//				.filter(ele -> ele.getText().contains("Amazon"))
//				.map(ele ->ele.gettext().trim())
//				.collect(Collectors.toList());

	}

}
