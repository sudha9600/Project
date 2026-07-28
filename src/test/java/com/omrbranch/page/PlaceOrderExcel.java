package com.omrbranch.page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import frameworkday2.Baseclass;
 
public class PlaceOrderExcel  extends Baseclass{
	public void OrderNuts() throws Exception {
	//browser launch
	browserLaunch();
	enterApplicationsUrl(getCellData("NutsLogin ", 1, 0));
	maximizeWindow();
	WebElement emailId=findLocatedById("email");
	 sendKeysData(emailId, getCellData("NutsLogin ", 2, 0));
    WebElement passWord=findLocatedById("pass");
    sendKeysData(passWord, getCellData("NutsLogin ", 3,0));
    WebElement loginbtn=findLocatedByXpath(getCellData("NutsLogin ", 1, 2));
    loginbtn.click();
    //search product
    Thread.sleep(7000);
    WebElement txtsearch=findLocatedById(getCellData("NutsLogin ", 2, 2));
    sendKeysData(txtsearch, getCellData("NutsLogin ", 1, 3));
    WebElement searchbtn=findLocatedByXpath(getCellData("NutsLogin ", 3, 2));
    searchbtn.click();
    //add product
    
    WebElement addbtn=findLocatedByXpath(getCellData("NutsLogin ", 4, 2));
    clickElement(addbtn);
   Thread.sleep(3000);
    WebElement addvarient=findLocatedById(getCellData("NutsLogin ", 5, 2));
    clickElement(addvarient);
    Thread.sleep(6000);
    WebElement goCart=findLocatedByXpath(getCellData("NutsLogin ", 6, 2));
    goCart.click();
    //delivery address
    Thread.sleep(3000);
    WebElement addressBox=findLocatedByXpath(getCellData("NutsLogin ", 7, 2));
    addressBox.click();
   
    WebElement addressType=findLocatedByName(getCellData("NutsLogin ", 8, 2));
    selectOptionByIndex(addressType, 2);
    
     WebElement firstName=findLocatedByXpath(getCellData("NutsLogin ", 9, 2)); 
     Thread.sleep(3000);
     sendKeysData(firstName, getCellData("NutsLogin ", 9, 3));
     Thread.sleep(9000);
    WebElement lastName=findLocatedByXpath(getCellData("NutsLogin ", 10, 2));
    sendKeysData(lastName, getCellData("NutsLogin ", 10, 3));
    WebElement contact=findLocatedByName(getCellData("NutsLogin ", 11, 2));
    sendKeysData(contact, getCellData("NutsLogin ", 11, 3));
    WebElement house=findLocatedByName(getCellData("NutsLogin ", 12, 2));
    sendKeysData(house, getCellData("NutsLogin ", 12,3 ));
    WebElement address=findLocatedByName(getCellData("NutsLogin ", 13, 2));
    sendKeysData(address, getCellData("NutsLogin ", 13, 3));
    WebElement country=findLocatedByXpath(getCellData("NutsLogin ", 14, 2));
     WebElement state=findLocatedByXpath(getCellData("NutsLogin ", 15, 2));
     Thread.sleep(7000);
     System.out.println("state:"+ getCellData("NutsLogin ", 15, 4));
    
    selectOptionsByText(state, getCellData("NutsLogin ", 15, 4));
    WebElement city=findLocatedByXpath(getCellData("NutsLogin ", 16, 2));
    System.out.println("city:"+getCellData("NutsLogin ", 16, 4));
    Thread.sleep(7000);
    selectOptionsByText(city, getCellData("NutsLogin ", 16, 4));
    WebElement zipCode=findLocatedByName(getCellData("NutsLogin ", 17, 2));
    sendKeysData(zipCode, getCellData("NutsLogin ", 17, 3));
    WebElement saveBtn=findLocatedByXpath(getCellData("NutsLogin ",18 ,2));
    clickElement(saveBtn);
    Thread.sleep(7000);
    //payment
    WebElement payment=findLocatedById(getCellData("NutsLogin ", 19, 2));
    selectOptionsByText(payment, getCellData("NutsLogin ", 19, 3));
    WebElement card=findLocatedByXpath(getCellData("NutsLogin ", 20, 2));
    Thread.sleep(3000);
  //  System.out.println(card.getText());
  clickElement(card);
    WebElement cardno=findLocatedByName(getCellData("NutsLogin ", 21, 2));
    sendKeysData(cardno, getCellData("NutsLogin ", 20, 3));
    WebElement month=findLocatedByName(getCellData("NutsLogin ", 22, 2));
    selectOptionByValue(month, getCellData("NutsLogin ", 22, 3));
    WebElement year=findLocatedById(getCellData("NutsLogin ", 23, 2));
    selectOptionByValue(year, getCellData("NutsLogin ", 23, 3));
    WebElement cvv=findLocatedByName(getCellData("NutsLogin ", 24, 2));
    sendKeysData(cvv, getCellData("NutsLogin ",24, 3));
    WebElement ordrBtn=findLocatedById(getCellData("NutsLogin ", 25, 2));
    clickElement(ordrBtn);
    closeAllWindow();
    //get Text
    WebElement txtWelcome=findLocatedByXpath(getCellData("NutsLogin ", 26, 2));
    
    clickElement(txtWelcome);
    WebElement myAccount=findLocatedByXpath(getCellData("NutsLogin ", 27, 2));
    clickElement(myAccount);
    WebElement txtOrder=findLocatedByXpath(getCellData("NutsLogin ", 28, 2));
    clickElement(txtOrder);
    }

public static void main(String[] args) throws Exception {
	PlaceOrderExcel excel=new PlaceOrderExcel();
	excel.OrderNuts();
}
		
	
}

