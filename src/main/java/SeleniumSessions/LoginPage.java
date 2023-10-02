package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		String browsername="Chrome";
		By username= By.id("email");
		By password=By.id("pass");
		By login=By.id("loginbutton");
		 DriverFactory df=new  DriverFactory ();
		 WebDriver driver=df.init_driver(browsername);
		 df.launchurl("https://www.facebook.com/");
		 String title=df.doGetPagetitle();
		 System.out.println("Page title is :" +title);
		 
		 if (title.contains("Facebook")){
			 System.out.println("Correct page title ");
		 }
		 
		ElementUtil elementutil=new ElementUtil(driver);
		elementutil.dosendkeys(username, "sushma.nadendla@gmail.com");
		elementutil.dosendkeys(password, "Sravan$12");
		elementutil.doClick(login);
	}

}
