package com.omrbranch.utility;

public class OrderExcel 

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderExcel extends BaseClass{
	
	
	public void placeOrderForNuts() throws InterruptedException, IOException {
	
		login();
		
		//3. Search Product
		
		WebElement txtSearch = findLocatorById(getCellData("NutsLogin ",2,2));
		sendKeysElement(txtSearch,getCellData("NutsLogin ",1,3));
		WebElement btnSearchProduct = findLocatorByXpath(getCellData("Data",3,2));
		clickElement(btnSearchProduct);
		
		//4. Add Product Into cart
		
		WebElement btnAddProduct = findLocatorByXpath(getCellData("NutsLogin ", 4, 2));
		clickElement(btnAddProduct);
		WebElement btnAddVariant = findLocatorById(getCellData("NutsLogin ",5,2));
		clickElement(btnAddVariant);
		Thread.sleep(2000);
		WebElement btnGotoCart = findLocatorByXpath(getCellData("NutsLogin ",6,2));
		clickElement(btnGotoCart);
		//5. Add the Delivery Address
		
		WebElement btnAddAddress = findLocatorByXpath(getCellData("Data", 7, 2));
		clickElement(btnAddAddress);
		WebElement ddnAddressType = findLocatorById(getCellData("Data", 8, 2));
		selectOptionByIndex(ddnAddressType,2);
		WebElement txtFirstName = findLocatorByName(getCellData("Data", 9, 2));
		sendKeysElement(txtFirstName, getCellData("Data", 2, 3));
		WebElement txtLastName = findLocatorByName(getCellData("Data", 10, 2));
		sendKeysElement(txtLastName,getCellData("Data", 3, 3));
		WebElement txtContact = findLocatorByName(getCellData("Data", 11, 2));
		sendKeysElement(txtContact, getCellData("Data", 4, 3));
		WebElement txtHouseNo = findLocatorByName(getCellData("Data", 12, 2));
		sendKeysElement(txtHouseNo, getCellData("Data", 5, 3));
		WebElement txtAddress =findLocatorByName(getCellData("Data", 13, 2));
		sendKeysElement(txtAddress, getCellData("Data", 6, 3));
		WebElement ddnState = findLocatorByXpath(getCellData("Data", 14, 2));
		selectOptionByText(ddnState, getCellData("Data", 7, 3));
		WebElement ddnCity = findLocatorByXpath(getCellData("Data", 15, 2));
		selectOptionByText(ddnCity, getCellData("Data", 8, 3));
		WebElement txtZipCode = findLocatorByName(getCellData("Data", 16, 2));
		sendKeysElement(txtZipCode, getCellData("Data", 9, 3));
		WebElement btnSave = findLocatorByXpath(getCellData("Data", 17, 2));
		clickElement(btnSave);
		Thread.sleep(3000);
		//6. Add the Payment
		WebElement ddnPayment = findLocatorById(getCellData("Data", 18, 2));
		selectOptionByValue(ddnPayment, getCellData("Data", 10, 3));
		WebElement rdoVisa  = findLocatorByXpath(getCellData("Data", 19, 2));
		clickElement(rdoVisa);
		WebElement txtCardNumber = findLocatorByName(getCellData("Data", 20, 2));
		sendKeysElement(txtCardNumber, getCellData("Data", 11, 3));
		WebElement ddnMonth = findLocatorById(getCellData("Data", 21, 2));
		selectOptionByValue(ddnMonth, getCellData("Data", 12, 3));
		WebElement ddnYear = findLocatorById(getCellData("Data", 22, 2));
		//doubt
		selectOptionByIndex(ddnYear,4 );
		WebElement txtCvv = findLocatorByName(getCellData("Data", 23, 2));
		sendKeysElement(txtCvv, getCellData("Data", 14, 3));
		WebElement btnPlaceOrder = findLocatorById(getCellData("Data", 24, 2));
		clickElement(btnPlaceOrder);
		closeAllWindow();
		
		//7. Get the Order Id and Write in cell
		
		login();
		Thread.sleep(2000);
		
		
		
		WebElement btnWelcome = findLocatorByXpath(getCellData("Data", 25, 2));
		clickElement(btnWelcome);
		WebElement btnMyAccount = findLocatorByXpath(getCellData("Data", 26, 2));
		clickElement(btnMyAccount);
		WebElement btnOrders = findLocatorByXpath(getCellData("Data", 27, 2));
		clickElement(btnOrders);
		Thread.sleep(2000);
		WebElement txtOrderNo = findLocatorByXpath(getCellData("Data", 28, 2));
		createCellData("Data", 1, 7,getTextElement(txtOrderNo));
		
		
		

//		driver.quit();
	
		
		
		
	}
	
	public void login() throws IOException {
		browserLaunch();

		enterApplicationUrl(getCellData("Data",1,0));

		maximizeWindow();

		implicitWait();

		WebElement txtEmailId = findLocatorById("email");

		sendKeysElement(txtEmailId, getCellData("Data", 2, 0));

		WebElement txtPassword = findLocatorById("pass");

		sendKeysElement(txtPassword, getCellData("Data",3 , 0));

		WebElement btnLogin = findLocatorByXpath(getCellData("Data",1,2));

		clickElement(btnLogin);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PlaceOrderExcel placeOrder = new PlaceOrderExcel();
		placeOrder.placeOrderForNuts();
		
	}

}


