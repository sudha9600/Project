package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkday2.Baseclass;

public class MyCartPage extends Baseclass{ 
	public  MyCartPage() {
		PageFactory.initElements(driver, this);
		}
@FindBy(xpath=("//div[@data-target='#addressModal']"))
private WebElement clkaddress;
@FindBy(id="address_type")
private WebElement addressType;
@FindBy(name="first_name")
private WebElement firstName;
@FindBy(name="last_name")
private WebElement lastName;
@FindBy(name="mobile")
private WebElement mobileNumber;
@FindBy(name="apartment")
private WebElement house;
@FindBy(name="address")
private WebElement address;
@FindBy(name="country")
private WebElement country;
@FindBy(name="state")
private WebElement state;
@FindBy(name="city")
private WebElement city;
@FindBy(name="zipcode")
private WebElement code;
@FindBy (xpath=("(//button[text()='Save'])[3]"))
private WebElement btnSave;
@FindBy(id="payment_type")
private WebElement card;
@FindBy(id="visa_card")
private WebElement visa;
@FindBy(name="card_no")
private WebElement cardNumber;
@FindBy(name="month")
private WebElement month;
@FindBy(id="year")
private WebElement year;
@FindBy(name="cvv")
private WebElement cvv;
@FindBy(id="placeOrder")
private WebElement order;
public WebElement getCard() {
	return card;
}
public WebElement getVisa() {
	return visa;
}
public WebElement getCardNumber() {
	return cardNumber;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getOrder() {
	return order;
}

public WebElement getClkaddress() {
	return clkaddress;
}
public WebElement getAddressType() {
	return addressType;
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getMobileNumber() {
	return mobileNumber;
}
public WebElement getHouse() {
	return house;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCountry() {
	return country;
}
public WebElement getState() {
	return state;
}
public WebElement getCity() {
	return city;
}
public WebElement getCode() {
	return code;
}
public WebElement getBtnSave() {
	return btnSave;
}
public void txtAddress( String  Type,String  firstName,String lastName,String mobileNumber,String house,String address,String country,String  state,String city,String code) {
	clickElement(clkaddress);
	selectOptionByIndex(addressType,3);
	sendKeysData(getFirstName(), firstName);
	sendKeysData(getLastName(), lastName);
	sendKeysData(getMobileNumber(), mobileNumber);
	sendKeysData(getHouse(), house);
	sendKeysData(getAddress(), address);
	sendKeysData(getCountry(), country);
	sendKeysData(getState(), state);
	sendKeysData(getCity(), city);
	sendKeysData(getCode(), code);
	clickElement(btnSave);
}
public void addPayment(String payment,String cardNumber,String month,int year,String cvv) {
	selectOptionByIndex(card, year);
	clickElement(visa);
	selectOptionByValue(getMonth(), 3);
	selectOptionByIndex(getYear(), 3);
	sendKeysData(getCvv(), cvv);
	clickElement(order);
	
	
	
	

}

}