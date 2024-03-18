package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		
		//1. First Initial step System.setProperty("name","location")
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		//2. To Launch ChromeDriver
		WebDriver driver = new ChromeDriver();
		//3. To goto the respective page
		driver.get("https://leafground.com/");
		
		//4. To go to Hyperlink icon and to click Go To Dashboard
		
		driver.findElement(By.id("menuform:j_idt40")).click();
		driver.findElement(By.id("menuform:m_link")).click();
		driver.findElement(By.linkText("Go to Dashboard")).click();
		
		
	 	
	 
	 	
		
		
		
		
	}

}
