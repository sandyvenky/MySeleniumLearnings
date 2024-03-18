package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// AIM: 1. TO LAUNCH FIREFOX BROWSER
		//2. TO OPEN GOOGLE HOME PAGE
		// We need to tell which browser we are going to use, and where is it's location
		//System.setProperty("name", "location")
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\geckodriver.exe");
		
		//To Open Firefox Browser
		//New Firefox browser get's launched
		
		WebDriver driver = new FirefoxDriver();
		
		//To Fetch Google Homepage
		driver.get("https://www.google.co.in/");
		
		//TO CLOSE THE BROWSER
		driver.quit();
		

	}

}
