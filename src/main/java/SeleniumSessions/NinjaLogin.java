package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NinjaLogin {

	public static void main(String[] args) {
		
			By firstname=By.name("firstname");
			By lastname=By.name("lastname");
			By email=By.name("email");
			By telephone=By.name("telephone");
			By Password=By.name("password");
			By confirmpassword=By.id("input-confirm");
			By Newsletter=By.name("newsletter");
			
			DriverFactory df=new DriverFactory();
			WebDriver driver=df.init_driver("Chrome");
			df.launchurl("http://tutorialsninja.com/demo/index.php?route=account/register");
			
			ElementUtil elementutil=new ElementUtil(driver);
			elementutil.dosendkeys(firstname, "Sushma");
			elementutil.dosendkeys(lastname, "Nadendla");
			elementutil.dosendkeys(email, "sushma.nadendla@gmail.com");
			//ElementUtil.dosendkeys(telephone, "9620165089");
			elementutil.dosendkeys(Password, "sushma123");
			elementutil.dosendkeys(confirmpassword, "sushma123");
			elementutil.doClick(Newsletter);
			
			
		}
	}


