package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkday2.Baseclass;

public class LoginPage extends Baseclass {
	@FindBy(id = "email")
	private WebElement txtEmailId;
	@FindBy(id = "pass")
	private WebElement txtPassWord;
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
    
	public void login(String emailId, String passWord) {
		sendKeysData(txtEmailId, emailId);
		sendKeysData(txtPassWord, passWord);
		clearTxtBox(btnLogin);

	}

}
