package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {

		//System.setProperty--> which browser we are going to use and where it's location
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// To Launch the browser
		driver.get("https://leafground.com/"); //The respected URL we needs to go

		WebElement ElementMenuIcon = 	driver.findElement(By.id("menuform:j_idt40"));
		ElementMenuIcon.click();

		WebElement DropDownMenuIcon =  driver.findElement(By.id("menuform:m_dropdown"));
		DropDownMenuIcon.click();

		//AIM:TO SELECT FAVOURITE AUTOMATION TOOL USING INDEX
		// TODO: 1. Inspect the dropdown box and click

		WebElement FavAutomationTooldropdown = 	driver.findElement(By.className("ui-selectonemenu"));
		FavAutomationTooldropdown.click();

		//Select CLASS IS A SPECIAL CASE IN DROPDOWN TO choose an option from the dropdown.
		//Object has created for Select class and selenium asking which webelement to select
		//Mention the dropdown name in the Select method, from which we have to choose the options
		//All values get's stored in selectfromdropdown

		Select selectfromdropdown = new Select(FavAutomationTooldropdown);

		//To take a value from the dropdown,selenium gives 3 options.
		//SelectByIndex(), SelectByValue(), SelectByVisibleText()
		//WHY THESE 3 OPTIONS NEEDED? While Working for a multilingual project, we can't read their language so it's easy to identify the options using SelectByindex&SelectByvalue.
		//By default index starts with 0.

		selectfromdropdown.selectByIndex(2);
		
		//AIM: TO CHOOSE YOUR PREFEREED COUNTRY
		
		WebElement PrefCountryDropDown = driver.findElement(By.id("j_idt87:country"));
		PrefCountryDropDown.click();
		
		
		
		//LIST: COLLECTIONS FROM JAVA. To select an option in dropdown using getoptions
		
		//Select PrefCountry = new Select(PrefCountryDropDown);
		//List<WebElement> countries = PrefCountry.getOptions();
		//countries.get(3);

		
		
		
		
		
		
		











































	}

}
