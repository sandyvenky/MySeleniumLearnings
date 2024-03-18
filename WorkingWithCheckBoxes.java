package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBoxes {

	public static void main(String[] args) {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		driver.manage().window().maximize();
		
		WebElement remember = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		boolean status = 	remember.isSelected();
	
	System.out.println(status);*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		
		WebElement Elementmenuicon = driver.findElement(By.id("menuform:j_idt40"));
		Elementmenuicon.click();
		
		WebElement checkboxmenuicon = driver.findElement(By.id("menuform:m_checkbox"));
		checkboxmenuicon.click();
		
		//TO SELECT BASIC CHECKBOX
		WebElement basiccheckbox = driver.findElement(By.id("j_idt87:j_idt89"));
		basiccheckbox.click();
		
		//TO SELECT NOTIFICATION CHECKBOX
		WebElement notify = driver.findElement(By.id("j_idt87:j_idt91"));
		notify.click();
		
		//TO CHOOSE YOUR FAVOURITE LANGUAGE
		WebElement favchkbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]"));
		favchkbox.click();
		
		//TO VERIFY IF CHECK BOX IS DISABLED
	WebElement disabledckbox = 	driver.findElement(By.id("j_idt87:j_idt102"));
	boolean status = disabledckbox.isDisplayed();
	
	System.out.println(status);
	
		
		
		
		

	}

}
