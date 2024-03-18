package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WorkingWithDropDowns {

	public static void main(String[] args) {
		
		//Telling the selenium how to set browser and which browser, it's name and location
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Launching Chrome Browser
		driver.get("https://letcode.in/dropdowns");// Navigating to the respective page to automate
		
		//To Maximize the windows
		driver.manage().window().maximize(); 
		
		//TO SELECT THE DROPDOWN ITEM USING VISIBLE TEXT. Selenium offering select class for dropdown to choose a value
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		fruits.click();//Fruits dropdown being clicked
		
		Select mangofruit = new Select(fruits);
		mangofruit.selectByVisibleText("Mango");
		
		//By Using Select Class to confirm whether the dropdown is multiplekindtype. 
		//In the DOM itself inside the select class there will be mentioned as multiple
		//1. Inspect the Element
		WebElement superheroes = driver.findElement(By.id("superheros"));
		//2. Invoking the Select class, to identify whether the dropdown is multiple kind
		
		Select Myheroes = new Select(superheroes);//Pass the webelement superheroes for which we have inspected
		boolean multiplesuperheroes = Myheroes.isMultiple();
		System.out.println("Is Multiple SuperHeroes Available in the DropDown:" + multiplesuperheroes);
		
		//TO CHOOSE MULTIPLEVALUES IN THE MULTIPLEDROPDOWNTYPE
		Myheroes.selectByIndex(3);
		Myheroes.selectByValue("im");
		
		//SELECT LAST PROGRAMMING LANGUAGE AND PRINT ALL THE OPTIONS
		
		WebElement proglang = driver.findElement(By.id("lang"));
		Select lastproglang = new Select(proglang);
		lastproglang.selectByIndex(4);//Last Programming Language got selected
		
		//To Print all the options in the dropdown, use foreach loop and print the items in the dropdown
		List<WebElement> allproglang = lastproglang.getOptions();
		allproglang.forEach(i-> System.out.println(i.getText()));
		
		//SELECT INDIA USING VALUE AND PRINT THE SELECTED VALUE
		WebElement country = driver.findElement(By.id("country"));
		Select CountrySelect = new Select(country);
		CountrySelect.selectByValue("India");//India is being selected
		
		// Selenium offers a method getfirstselectedoption() to print the selected value.
		WebElement printvalue = CountrySelect.getFirstSelectedOption();
		System.out.println(printvalue.getText());//getText returns a string so we can insert this inside the printout statement
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
