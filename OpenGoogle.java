package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AIM:1.Open Chrome browser. //---> Single Line Comments
		//2. Goto Google Home Page.
		// We need to tell which browser we are going to use, and where is it's location
		
		//System.setProperty("name", "location")
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		
		//TO OPEN THE BROWSER
		
		//New Chrome browser get's launched
		WebDriver driver = new ChromeDriver();
		
		//To Fetch Google homepage
		driver.get("https://www.google.co.in/");
		
		
		
		 
		
		

		
		
	}

}
