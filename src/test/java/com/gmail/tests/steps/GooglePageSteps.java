package com.gmail.tests.steps;

import com.gmail.tests.ui.GoogleSearchPage;

import net.thucydides.core.annotations.Step;

public class GooglePageSteps {
GoogleSearchPage googleSearchPage;
@Step
	public void onGooglePage() {
		// TODO Auto-generated method stub
		googleSearchPage.open();
	}
@Step
	public void clickGmail() {
		// TODO Auto-generated method stub
		googleSearchPage.clickOnGmail();
	}

	
}
