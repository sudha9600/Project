package frameworkday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T0101 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
	WebElement firstName=driver.findElement(By.id("first_name"));
	firstName.sendKeys("GreensTech");
	WebElement lastName=driver.findElement(By.id("last_name"));
	lastName.sendKeys("OMR");
} 
	public void nextpage{
	}
}
