package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkday2.Baseclass;

public class OrderConfirmationPage  extends Baseclass{
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Welcome ')]")
	WebElement btnWelcome;
	
	
	@FindBy(xpath = "//a[text()='My Account']")
	WebElement btnMyAccount;
	
	
	@FindBy(xpath = "//a[text()='orders']")
	WebElement btnOrders;
	
	@FindBy(xpath = "(//span[@class='font16 ml-2'])[1]")
	WebElement txtOrderNo;

	public WebElement getBtnWelcome() {
		return btnWelcome;
	}

	public WebElement getBtnMyAccount() {
		return btnMyAccount;
	}

	public WebElement getBtnOrders() {
		return btnOrders;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	
	public String printOrderId() {
		clickElement(btnWelcome);
		clickElement(btnMyAccount);
		clickElement(btnOrders);
		
		return gettextElement(txtOrderNo);
	}
	}


