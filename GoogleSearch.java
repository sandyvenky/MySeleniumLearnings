package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		//AIM: 1. To Launch Chrome Browser
		// 2. Open google home page
		//3. Enter the search item
		//4. Click the first link to explore the content
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//TO ENTER THE SEARCH TERM IN THE TEXTBOX and press enter
		// CLICK THE WIKIPEDIA LINK
		
		// by having driver we are going to do all actions. Driver is the object
		// with driver as an object we need to identify the element. 1st priority is id(unique)
		//To type word in a textbox we use sendkeys. To give key strokes we are using keys.ENTER 
		
		driver.findElement(By.name("q")).sendKeys("Murugan Pics" +Keys.ENTER);
		
		
		
		
		
		
		

	}

}
