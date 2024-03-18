package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlertsExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();

		//To Click Browser Menu Icon
		WebElement browsermenuicon = 	driver.findElement(By.id("menuform:j_idt39"));
		browsermenuicon.click();

		//To Click Alert Menu Icon
		WebElement alertmenuicon = driver.findElement(By.id("menuform:m_overlay"));
		alertmenuicon.click();

		//Simple Alert Dialog Box

		WebElement simplealertbutton = 	driver.findElement(By.id("j_idt88:j_idt91"));
		simplealertbutton.click();

		//To Click ok button in Alert dialog box.Selenium uses Alert interface.
		//After clicking ok button in alert box we can do any other operations in the webpage.
		//The whole browser driver control is taken over by the alert dialog box.

		Alert alert = driver.switchTo().alert();
		alert.accept();//accept() is the method used in simple alert dialog box to click ok

		//Confirm Alert Dialog Box

		WebElement showbutton = driver.findElement(By.id("j_idt88:j_idt93"));
		showbutton.click();

		Alert cancelalert = driver.switchTo().alert();
		cancelalert.dismiss(); //dismiss() is the method used in the confirm alert dialog box to click cancel
		
		//Prompt Alert Dialog Box
		
		WebElement promptdialogbox = driver.findElement(By.id("j_idt88:j_idt104"));
		promptdialogbox.click();
		
		//In Order to Type the name in the text box, we need to switch control from driver to alert dialog box
		
		Alert promptalert = driver.switchTo().alert();
		//promptalert.sendKeys("S.SANDHYA VENKAT");
		//promptalert.accept();
		
		promptalert.dismiss();
		
		








	}

}
