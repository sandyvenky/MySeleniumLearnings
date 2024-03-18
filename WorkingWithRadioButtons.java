package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		
		
		
		WebElement barradiobutton = driver.findElement(By.id("notfoo"));
		boolean status = 	barradiobutton.isSelected();
		System.out.println(status);
	
		

				
		

	}

}
