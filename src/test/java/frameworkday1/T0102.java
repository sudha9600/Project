package frameworkday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T0102 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");
WebElement email=driver.findElement(By.name("email"));
email.sendKeys("velmurugansitgtomr");
WebElement passWord=driver.findElement(By.name("pass"));
passWord.sendKeys("Greens@123");
	}

}
