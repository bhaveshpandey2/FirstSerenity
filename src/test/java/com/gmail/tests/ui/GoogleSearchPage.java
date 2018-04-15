package com.gmail.tests.ui;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleSearchPage extends PageObject {
	
	@FindBy(xpath = "//a[@class='gb_P']")
    WebElement b;
	
	public void clickOnGmail(){
		withTimeoutOf(30, TimeUnit.SECONDS).waitFor(b);
	b.click();
}
}

