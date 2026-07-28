package cucumber;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectHotel {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.omrbranch.com/");
	driver.manage().window().maximize();
	 Thread.sleep(5000);
	WebElement txtEmail=driver.findElement(By.id("email"));
	txtEmail.sendKeys("sudhashiya2019@gmail.com");
	WebElement txtPass=driver.findElement(By.id("pass"));
	txtPass.sendKeys("Sudha@2019");
    WebElement btnLogin=driver.findElement(By.xpath("//button[@value='login']"));
    btnLogin.click();
    Thread.sleep(3000);
    WebElement txtWelcome=driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
    String wlcome = txtWelcome.getText();
    System.out.println(wlcome);
    WebElement txtExplore=driver.findElement(By.xpath("//h5[text()='Explore Hotels']"));
    String hotel=txtExplore.getText();
    System.out.println(hotel);
   WebElement ddnState=driver.findElement(By.id("state"));
   Select select=new Select(ddnState);
   select.selectByVisibleText("Tamil Nadu");
   Thread.sleep(3000);
   WebElement ddnCity=driver.findElement(By.xpath("//span[@id='select2-city-container']"));
   ddnCity.click();
   Thread.sleep(3000);
   WebElement city1=driver.findElement(By.xpath("//span[text()='Select City *']"));
  WebElement city=driver.findElement(By.xpath("//li[@aria-selected='true']"));
   city.click();
   WebElement roomType=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
   roomType.click();
 WebElement room1=driver.findElement(By.xpath("//li[text()='Standard']"));
   room1.click();
   WebElement roomType1=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
   roomType1.click();
   WebElement room2=driver.findElement(By.xpath("//li[text()='Deluxe']"));
  room2.click();
  WebElement roomType2=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
  roomType2.click();
   WebElement room3=driver.findElement(By.xpath("//li[text()='Suite']"));
   room3.click();
   WebElement roomType3=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
   roomType3.click();
   WebElement room4=driver.findElement(By.xpath("//li[text()='Luxury']"));
   room4.click();
   WebElement roomType4=driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
   roomType4.click();
   WebElement room5=driver.findElement(By.xpath("//li[text()='Studio']"));
   room5.click();
   WebElement checkIn=driver.findElement(By.name("check_in"));
   checkIn.click();
   WebElement inDate=driver.findElement(By.xpath("//a[text()='23']"));
   inDate.click();
   WebElement checkOut=driver.findElement(By.name("check_out"));
   checkOut.click();
   WebElement outDate=driver.findElement(By.xpath("//a[text()='26']"));
   outDate.click();
   WebElement rooms=driver.findElement(By.id("no_rooms"));
   Select select1=new Select(rooms);
   select1.selectByVisibleText("2-Two");
   WebElement noOfAdult=driver.findElement(By.id("no_adults"));
   Select select0=new Select(noOfAdult);
   select0.selectByVisibleText("2-Two");
   WebElement adults=driver.findElement(By.id("no_adults"));
   Select select2=new Select(rooms);
   select2.selectByIndex(2);
   WebElement children=driver.findElement(By.id("no_child"));
  children.sendKeys("2");
  Thread.sleep(7000);
  driver.switchTo().frame("hotelsearch_iframe");
  WebElement btnSearch=driver.findElement(By.xpath("//button[text()='Search']"));
  btnSearch.click();
  driver.switchTo().defaultContent();
  // print hotel Name
  WebElement selectHotel=driver.findElement(By.xpath("//a[text()='Continue']"));
  selectHotel.click();
  Alert a1=driver.switchTo().alert();
  a1.accept();
   WebElement radioBtn=driver.findElement(By.id("own"));
   radioBtn.click();
   WebElement salutation=driver.findElement(By.name("title"));
   Select select3=new Select(salutation);
  select3.selectByValue("Ms");
  WebElement firstName=driver.findElement(By.id("first_name"));
  firstName.sendKeys("sudha");
  WebElement lastName=driver.findElement(By.id("last_name"));
  lastName.sendKeys("s");
  WebElement phoneNo=driver.findElement(By.id("user_phone"));
  phoneNo.sendKeys("0997876543");
  WebElement email=driver.findElement(By.name("email"));
  email.sendKeys("sudhashiya@gmail.com");
  WebElement gst=driver.findElement(By.id("gst"));
  gst.click();
  WebElement regisNo=driver.findElement(By.name("registration"));
  regisNo.sendKeys("9043592058");
  WebElement companyName=driver.findElement(By.id("company_name"));
  companyName.sendKeys("Greens Tech OMR Branch");
  WebElement companyAddress=driver.findElement(By.id("company_address"));
  companyAddress.sendKeys("Thoraipakkam");
  WebElement txtHotelName=driver.findElement(By.xpath("//h2[text()='Book Hotel - Hyatt Regency Chennai Studio']"));
  String text = txtHotelName.getText();
  System.out.println(text);
  WebElement btnNext=driver.findElement(By.id("step1next"));
  btnNext.click();
  Thread.sleep(4000);
  WebElement smoke=driver.findElement(By.xpath("//input[@id='smoking']"));
  JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("arguments[0].click();", smoke);
  //smoke.click();
  //WebElement late=driver.findElement(By.id("late"));
 // late.click();
  //WebElement early=driver.findElement(By.id("early"));
  //early.click();
  //WebElement bed=driver.findElement(By.id("bed"));
 // bed.click();
  WebElement btnNext1=driver.findElement(By.id("step2next"));
  btnNext1.click();
  WebElement creditcard = driver.findElement(By.xpath("//h5[text()='Credit/Debit/ATM Card']"));
  //creditcard.click();
  JavascriptExecutor js1=(JavascriptExecutor)driver;
  js1.executeScript("arguments[0].click();", creditcard);
  WebElement cardtype = driver.findElement(By.xpath("//option[text()='Debit Card']"));
  cardtype.click();
  WebElement card = driver.findElement(By.xpath("//option[@value='visa']"));
  card.click();
  WebElement cardno = driver.findElement(By.xpath("//input[@id='card_no']"));
  cardno.sendKeys("5555555555552222");
  WebElement cardname = driver.findElement(By.xpath("//input[@id='card_name']"));
  cardname.sendKeys("Sudha");
  WebElement month = driver.findElement(By.xpath("//option[@value='10']"));
  month.click();
  WebElement cvvno = driver.findElement(By.xpath("//input[@id='cvv']"));
  cvvno.sendKeys("234");
  WebElement submt = driver.findElement(By.xpath("//button[@id='submitBtn']"));
  submt.click();
  WebElement txtPrint=driver.findElement(By.xpath("//h2[text()=' Booking is Confirmed ']"));
  String print=txtPrint.getText();
  System.out.println(print);
  WebElement txtHotel=driver.findElement(By.xpath("//strong[text()='Hyatt Regency Chennai']"));
  String txtName = txtHotel.getText();
  System.out.println(txtName);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
   
   
   
   
   
   
   
   
   
   
   
   
   
	}
}
