package frameworkday3grocery;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class orderNuts {
public void   placeOrderNuts()throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.omrbranch.com/");
	driver.manage().window().maximize();
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("sudhashiya2019@gmail.com");
	WebElement passWord=driver.findElement(By.id("pass"));
	passWord.sendKeys("Sudha@2019");
	WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Login']"));
	loginBtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement nuts = driver.findElement(By.xpath("//input[@id='search']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(nuts);
	nuts.sendKeys("nuts");
	WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	WebElement add=driver.findElement(By.xpath("//a[text()='Add'][1]"));
	//driver.switchTo().frame(add);
	add.click();
    WebElement add2=driver.findElement(By.id("cart-24"));
	add2.click();
	WebElement cart=driver.findElement(By.className("cart_dropdown"));
	Actions actions2=new Actions(driver);
	actions.moveToElement(cart);
	WebElement goCart=driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
	JavascriptExecutor js=(JavascriptExecutor)(driver);
	js.executeScript("arguments[0].click()",goCart);
	Thread.sleep(3000);
	WebElement scrollDown=driver.findElement(By.xpath("//div[@data-toggle='modal']"));
	scrollDown.click();
  WebElement addressType=driver.findElement(By.id("address_type"));
  addressType.click();
  WebElement dropDown=driver.findElement(By.xpath("//option[@value='Home']"));
  dropDown.click();
	WebElement firstName=driver.findElement(By.name("first_name"));
	firstName.sendKeys("sudha");
	WebElement lastName=driver.findElement(By.name("last_name"));
	lastName.sendKeys("s");
	WebElement mobileNo=driver.findElement(By.name("mobile"));
	mobileNo.sendKeys("7010126876");
	WebElement houseNo=driver.findElement(By.name("apartment"));
	houseNo.sendKeys("plot No:31");
	WebElement address=driver.findElement(By.name("address"));
	address.sendKeys("Thuraippakkam");
	WebElement country=driver.findElement(By.name("country"));
	country.sendKeys("India");
	WebElement state=driver.findElement(By.xpath("//option[@value='35']"));
	state.click();
	WebElement city=driver.findElement(By.xpath("//option[@value='3659']"));
	city.click();
	WebElement zipCode=driver.findElement(By.name("zipcode"));
	zipCode.sendKeys("600097");
	Thread.sleep(2000);
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	WebElement btnClick=driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	js2.executeScript("arguments[0].click();", btnClick);
	Thread.sleep(3000);
	//Add payment method
	
	WebElement ddnPayment = driver.findElement(By.id("payment_type"));
	Select dropdownPayment = new Select(ddnPayment);
	dropdownPayment.selectByValue("debit_card");
	WebElement rdoVisa = driver.findElement(By.xpath("//label[@for='visa_card']"));
	rdoVisa.click();
	
	WebElement txtCardNumber = driver.findElement(By.name("card_no"));
	txtCardNumber.sendKeys("5555555555552222");
	WebElement ddnMonth = driver.findElement(By.id("month"));
	Select dropDownMonth = new Select(ddnMonth);
	dropDownMonth.selectByValue("March");
	
	WebElement ddnYear = driver.findElement(By.id("year"));
	Select dropDownYear = new Select(ddnYear);
	dropDownYear.selectByIndex(4);
	WebElement txtCvv = driver.findElement(By.name("cvv"));
	txtCvv.sendKeys("1510");
	WebElement btnPlaceOrder = driver.findElement(By.id("placeOrder"));
	btnPlaceOrder.click();
	Thread.sleep(2000);
	
	driver.close();
	WebDriver driver1 = new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.get("https://www.omrbranch.com/");
	//Again login
	login(driver1);
	Thread.sleep(2000);
	WebElement btnWelcome = driver1.findElement(By.xpath("//a[contains(text(),'Welcome ')]"));
	btnWelcome.click();
	WebElement btnMyAccount = driver1.findElement(By.xpath("//a[text()='My Account']"));
	btnMyAccount.click();
	WebElement btnOrders = driver1.findElement(By.xpath("//a[text()='orders']"));
	btnOrders.click();
	Thread.sleep(2000);
	WebElement txtOrderNo = driver1.findElement(By.xpath("(//span[@class='font16 ml-2'])[1]"));
	System.out.println("OrderId is "+txtOrderNo.getText());
	}

public void login(WebDriver driver) {
	
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("sudhashiya2019@gmail.com");
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Sudha@2019");
	WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
	btnLogin.click();
}



public static void main(String[] args) throws InterruptedException {
	orderNuts orderNuts= new orderNuts  ();
	orderNuts.placeOrderNuts();



}
}
