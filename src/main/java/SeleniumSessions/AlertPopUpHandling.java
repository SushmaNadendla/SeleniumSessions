package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
//		JS Alert
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert refer=driver.switchTo().alert();
		String Text=refer.getText();
		System.out.println(Text);
		refer.accept();//click on Ok button
		driver.switchTo().defaultContent();
		//refer.dismiss();//will cancel the alert
		
	}

}
