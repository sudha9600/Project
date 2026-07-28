package com.omrbranchJunit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.latest.io.IO;

public class T0101 {
	static WebDriver driver;
@BeforeClass 
	public static void browserSetup() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	@Before
	 public  void beforeScreen() throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File s= screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("C:\\Users\\Admin\\Pictures\\Screenshots\\java\\shiya.png"));
		}
	@Test
	public void logIn() {
		WebElement txtEmail=driver.findElement(By.name("email"));
		txtEmail.sendKeys("sudhashiya2019@gmail.com");
		WebElement txtPassWord=driver.findElement(By.name("pass"));
		txtPassWord.sendKeys("Sudha@2019");
		WebElement btnLogIn=driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1']"));
		btnLogIn.click();
		}
	@After
	
	public void after() throws IOException {
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		File a=screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a,new File("C:\\Users\\Admin\\Pictures\\Screenshots\\java\\sudha.png"));
	}
	@AfterClass
	public static void close() {
		driver.quit();
	}
	
}

