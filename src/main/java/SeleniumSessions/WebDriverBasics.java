package SeleniumSessions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	//Web driver is an interface
	//new chromeDriver is a object(RHS) 
	//Driver is a object reference name
	//Top Casting is child class object can be referred by parent interface reference variable
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
	//Automation steps +Verification point==> Automation Testing
	//Selenium + (Java+TestNG+Assertions)
		
		WebDriver driver =new ChromeDriver();//Launch the browser
		driver.get("https://www.google.com/");//Enter the url
		
		String title=driver.getTitle();//Get the title
		System.out.println("Page title is :" +title);
		
		//verification /checkpoint Actual vs Expected Result
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();//close the browser
		driver.close();
		System.out.println(driver.getTitle());
		//quit-NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	    //close-NoSuchSessionException: invalid session id
	}

}
