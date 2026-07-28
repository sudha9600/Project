package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkday2.Baseclass;

public class ProductSearchPage extends Baseclass {
@FindBy(xpath="//a[@data-testid='username']")
private WebElement welcomTextMssage;
@FindBy(id="search")
private WebElement txtSearch;
public WebElement getWelcomTextMssage() {
	return welcomTextMssage;
}
public WebElement getTxtSearch() {
	return txtSearch;
}
public String getWelcomeMassage(){
	String text=gettextElement(welcomTextMssage);
		return text;
	}
public void  ProductSearchPage (String keyWord, String keyword) {
	sendKeysEnter(txtSearch,  keyword);
}


}
