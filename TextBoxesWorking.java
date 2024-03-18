package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxesWorking {

	public static void main(String[] args) {
		
		//1. First Initial step System.setProperty("name","location")
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		//2. To Launch ChromeDriver
		WebDriver driver = new ChromeDriver();
		//3. To goto the respective page
		driver.get("https://leafground.com/");
		//4. Click the Element menu icon
		driver.findElement(By.id("menuform:j_idt40")).click();
		//5. Click the Textbox menu icon
		driver.findElement(By.id("menuform:m_input")).click();
		
		//6. Type name in the Textbox
		//WebElement is the returntype for the method findElement if we hover the method. 
		//We should save the variable in the WebElement returntype
			WebElement nametxt = 	driver.findElement(By.id("j_idt88:name"));
			nametxt.sendKeys("S.SANDHYA");
	
		//7. Append a Text: Append Country To This City
		WebElement appendtxt = driver.findElement(By.id("j_idt88:j_idt91"));
		appendtxt.sendKeys(" INDIA");
		
		//8. Clear the Typed Text
		WebElement clrtxtbox = driver.findElement(By.id("j_idt88:j_idt95"));
		clrtxtbox.clear();
		
		//9. AIM: Retrieve the Typed Text--> We should get the value(is the attribute) of the text to be retrieved
		// store the text in the string with the variable value
		// TODO: 1: Inspect the textbox to be retrieved, WebElement is the return type, assigned
		//to the variable retrievetxtbox.
		
		WebElement retrievetxtbox  = driver.findElement(By.id("j_idt88:j_idt97"));
		//// We should get the value(is the attribute) of the text to be retrieved, store it in the String datatype with value as a variable
		
		String value = retrievetxtbox.getAttribute("value");  
		
		 //Print the respective text stored it in the variable value
		 System.out.println(value);
		 // 10.Type the email and press tab
		WebElement mailid =  driver.findElement(By.id("j_idt88:j_idt99"));
		mailid.sendKeys("vsandhya.vsm@gmail.com" +Keys.TAB);
		
		//11. AIM: Verify if textbox is disabled. Logic: True means - disabled. False means - NotDisabled
		//TODO: 1. Inspect the disabled box and assign to disabledtxtbox
		WebElement disabledtxtbox = 	driver.findElement(By.id("j_idt88:j_idt93"));
		// Built-in methods are available in selenium to verify if the textbox is enable or not. 
		//it's return type is boolean, assign to enable variable and print it. 
		boolean enable = 	disabledtxtbox.isEnabled();
		System.out.println(enable);
	
//NOTE: INTERVIEW QUESTION OF APPEND. I am having textbox with text present already, if I give sendkeys
		//selenium will not override the text, it will APPEND the text.
		
		
		
		 
		 
		 
	
	
		
		
		
	}

}
