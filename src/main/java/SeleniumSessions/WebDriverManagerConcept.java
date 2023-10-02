package SeleniumSessions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println("Page title is :" +title);
		
		
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
