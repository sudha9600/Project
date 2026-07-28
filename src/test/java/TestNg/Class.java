package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.omrbranch.page.LoginPage;

import frameworkday2.Baseclass;

public class Class extends Baseclass {
	@Test
	public void setup() {
		browserLaunch();
		enterApplicationsUrl("https://www.omrbranch.com/");
		maximizeWindow();
		WebElement email=findLocatedById("email");sendKeysData(email, "sudha@gmail");
		
		()
		
		//boolean title=getTitle().contains()
		
	}
}