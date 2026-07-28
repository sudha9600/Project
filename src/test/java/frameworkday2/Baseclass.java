package frameworkday2;

import java.awt.Desktop.Action;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass extends ExcelUtils {
	public static WebDriver driver;
	Select select;
	JavascriptExecutor executor;
	Action action;
	WebElement element;
	TakesScreenshot screenshot;

	public void browserLaunch() {
		driver = new ChromeDriver();
	}

	public void enterApplicationsUrl(String Url) {
		driver.get(Url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void sendKeysData(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void sendKeysEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);
	}

	public void clickElement(WebElement element) {
		element.click();
	}

	public String getApplicationTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findLocatedById(String attributeValue) {
		 WebElement element=driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatedByName(String attributeValue) {
		 WebElement element=driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatedByClassName(String attributeValue) {
		 WebElement element=driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findLocatedByXpath(String attributeValue) {
		 WebElement element=driver.findElement(By.xpath(attributeValue));
		return element;
	}

	public String getApplicationUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String gettextElement(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getDomPropertyValue(WebElement element) {
		String domProperty = element.getDomProperty("value");
		return domProperty;
	}

	public String getDomPropertyValue(WebElement element, String attributeName) {
		String domProperty = element.getDomProperty("value");
		return domProperty;
	}

	public void closeWindow() {
	driver.close();
	}

	public void closeAllWindow() {
		driver.quit();
	}

	public boolean isDisplayedElement(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean isEnabledElement(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean isSelectedElement(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public void pageScrollDownOrUp(boolean upOrDown, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + upOrDown + ")", element);
	}

	public void selectDropDown(WebElement element, int index) {
		Select dropDown = new Select(element);
		dropDown.selectByIndex(2);
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void switchToChildWindow() {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String eachWindowId : windowHandles) {
			driver.switchTo().window(eachWindowId);
			break;
		}
	}

	public void clearTxtBox(WebElement element) {
		element.clear();
	}

	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void screenShot(File destFile, WebElement element) {
		File sourceFile = element.getScreenshotAs(OutputType.FILE);
	}

	public void screenshot(File destFile) {
		screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void sendKeysElementJs(WebElement element, String data) {
		executor.executeScript("arguments[0].setAttribute('value'," + data + ")", element);
	}

	public List<String> getAllOptionsText(WebElement element) {
		List<String> allOptionsText = new ArrayList<String>();
		select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			allOptionsText.add(text);
		}
		return allOptionsText;
	}

	public void selectOptionByIndex(WebElement element, int i) {
		Select select = new Select(element);
		select.selectByIndex(3);
	}

	public void selectOptionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectOptionsByText(WebElement element, String Text) {
		Select select = new Select(element);
		select.selectByVisibleText(Text);
		;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickElementWithJavascriptExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(0);
	}

	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
	}

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public String firstSelectedOption(WebElement element) {

		Select dropDown = new Select(element);
		String selectedText = dropDown.getFirstSelectedOption().getText();
		return selectedText;

	}

	public boolean isMultipleDropDown(WebElement element) {
		select = new Select(element);
		return select.isMultiple();

	}

	public void implicitWaitForElement(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public void deselectAllOption(WebElement element) {
		select = new Select(element);
		select.deselectAll();
	}

}
