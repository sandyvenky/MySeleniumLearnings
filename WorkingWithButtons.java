package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya\\Desktop\\QA-SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		
	WebElement Elementmenuicon = 	driver.findElement(By.id("menuform:j_idt40"));
	Elementmenuicon.click();
	
	WebElement Buttonmenuicon = driver.findElement(By.id("menuform:m_button"));
	Buttonmenuicon.click();
	
	WebElement dashbrdbutton = 	driver.findElement(By.id("j_idt88:j_idt90"));
	dashbrdbutton.click();
	String title = driver.getTitle();
	System.out.println("The title of the page is: "+title);
	
	WebElement Elementmenuicon1 = 	driver.findElement(By.id("menuform:j_idt40"));
	Elementmenuicon1.click();
	
	WebElement Buttonmenuicon1 = driver.findElement(By.id("menuform:m_button"));
	Buttonmenuicon1.click();
	
	WebElement disablebutton = 	driver.findElement(By.id("j_idt88:j_idt92"));
	boolean enable = disablebutton.isEnabled();
	System.out.println(enable);
	
	//AIM 1. To Find the Position of the Button-->getLocation() method and it's return type is point.
	//TODO:1. Inspect the button and assign it to a variable
	
	WebElement submitbutton = driver.findElement(By.id("j_idt88:j_idt94"));
	
	//Use getLocation() method and assign to a variable submitbtnposition with the retruntype Point
	
	Point xycoordsubmitbtnposition = submitbutton.getLocation();
	
	//Usually Point return types of the getlocation() deals with numbers,position means we need x,y co-ordinates
	//For Points return types selenium has inbuilt getx() & gety() methods.
	//getX() & getY() return type is int data type. So assign it to a variable and print.
	
	int xvalue = xycoordsubmitbtnposition.getX();
	int yvalue = xycoordsubmitbtnposition.getY();
	System.out.println("Position Of The X-Cor-Ordinates Submit Button is" + xvalue);
	System.out.println("Position Of The Y-Cor-Ordinates Submit Button is" + yvalue);
	
	
	//AIM 2. To Find the button colour.-->getCSSvalue().
	//TODO: 1. Inspect the button and assign it to a variable
	WebElement savebutton = driver.findElement(By.id("j_idt88:j_idt96"));
	String btncolor = savebutton.getCssValue("color");
	System.out.println("The Save Button color is" + btncolor);
	
	//AIM 3. To find the height & width of the button
	//TODO: 1. Inspect the button and assign it to a variable
	
	WebElement hgtwdthsubmitbtn = driver.findElement(By.id("j_idt88:j_idt98"));
	Dimension hgtwdthbtn = hgtwdthsubmitbtn.getSize();
	
	int height = hgtwdthbtn.getHeight();
	int width = hgtwdthbtn.getWidth();
	System.out.println("Height Of The Submit Button is" + height);
	System.out.println("Width Of The Submit Button is"  + width);
	
	//Click Image Button
	WebElement imgbtn = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
	imgbtn.click();
	
	
	
	
	
	
	

 
	
	
 
	
		
	}

}
