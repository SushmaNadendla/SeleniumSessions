package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptaAlert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		 driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			Thread.sleep(5000);
			Alert JSAlert=driver.switchTo().alert();
			String Message=JSAlert.getText();
			System.out.println(Message);
			JSAlert.accept();//click on Ok button
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
			Thread.sleep(5000);
			Alert JSConfirm=driver.switchTo().alert();
			String Message1=JSConfirm.getText();
			System.out.println(Message1);
			JSAlert.accept();//click on Ok button
			//JSAlert.dismiss();
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
			Thread.sleep(5000);
			Alert JSPrompt=driver.switchTo().alert();
			String Message2=JSConfirm.getText();
			System.out.println(Message2);
			Thread.sleep(5000);
			JSPrompt.sendKeys("Test");
			JSPrompt.accept();//click on Ok button
			//JSAlert.dismiss();
			driver.switchTo().defaultContent();
	}

}
