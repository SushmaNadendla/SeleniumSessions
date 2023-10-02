package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricket_Scorecard {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/women-s-ashes-2023-1336063/england-women-vs-australia-women-1st-t20i-1336074/full-scorecard");
//		String Wicketkeeper=driver.findElement(By.xpath("//span[text()='Amy Jones']")).getText();
//		System.out.println(Wicketkeeper);
		Thread.sleep(2000);
		System.out.println(getWicketTakerName("Amy Jones"));
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String getWicketTakerName(String playerName) {
		return driver.findElement(By.xpath("\"//span[text()='"+playerName+"']")).getText();
		
	}

}
