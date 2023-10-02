package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassicCrmLoginPage {

	public static void main(String[] args) {
		By username=By.name("username");
		By password=By.name("password");
		By loginbutton=By.xpath("//*[@id=\"loginForm\"]/input[3]");
		
		DriverFactory df=new DriverFactory();
		WebDriver driver=df.init_driver("Chrome");
		df.launchurl("https://classic.freecrm.com/");
		
		ElementUtil elementutil=new ElementUtil(driver);
		elementutil.dosendkeys(username, "BatchTest");
		elementutil.dosendkeys(password, "123");
		elementutil.doClick(loginbutton);
		
		df.QuitBrowser();
	}

}
