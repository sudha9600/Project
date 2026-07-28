package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkday2.Baseclass;

public class ProductlistingPage extends Baseclass{
	@FindBy(xpath="(//a[text()='Add'])[1]")
	private WebElement txtadd;
    @FindBy(id="cart-24")
   private WebElement addCart;
    @FindBy(className="hover1")
   private WebElement gotoCart;
	public WebElement getTxtadd() {
		return txtadd;
	}
	public WebElement getAddCart() {
		return addCart;
	}
	public WebElement getGotoCart() {
		return gotoCart;
	}
	public void listingPage(WebElement txtadd,WebElement addCart,WebElement  gotoCart) {
		clickElement(txtadd);
		clickElement(addCart);
		clickElement(gotoCart);
	}
}
