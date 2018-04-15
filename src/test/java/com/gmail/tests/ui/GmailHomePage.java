package com.gmail.tests.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GmailHomePage extends PageObject {

	@FindBy(xpath="//h1[text()=Sign in]")
	WebElement a;
	@FindBy(id="identifierId")
	WebElement userName;
	@FindBy(xpath="//span[text()=Next]")
	WebElement next;
	@FindBy(name="//password")
	WebElement password;
	
	@SuppressWarnings("deprecation")
		public void verifyTitle(String title){
		//withTimeoutOf(30, TimeUnit.SECONDS).waitFor(a); 
		Assert.assertTrue("Title does not match,Test failed", getDriver().getTitle().equals(title));
		//Assert.assertEquals(expected, actual);
		
		
	
	}

	public void sendUserId(String username2) {
		waitFor(userName);
		userName.sendKeys(username2);
		next.click();
		}

	public void sendPassword(String string) {
		// TODO Auto-generated method stub
		waitFor(password);
		password.sendKeys(string);
		next.click();
	}
}
